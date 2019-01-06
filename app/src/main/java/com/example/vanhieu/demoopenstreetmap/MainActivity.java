package com.example.vanhieu.demoopenstreetmap;

import android.graphics.Color;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.Marker;
import org.osmdroid.views.overlay.Polygon;
import org.osmdroid.views.overlay.Polyline;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MapView osm;
    private Button btnSearch;
    private EditText edtStart, edtEnd;
    private MapController controller;
    private ArrayList<GeoPoint> listPoint = new ArrayList<>();

    private Point pointStart, pointEnd;
    private Polyline line;
    private Marker startMarker;
    private Marker endMarker;
    private GetDataService service = RetrofitInstance.getRetrofitInstance().create(GetDataService.class);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        osm = findViewById(R.id.osm);
        btnSearch = findViewById(R.id.bt_search);
        edtStart = findViewById(R.id.edt_start);
        edtEnd = findViewById(R.id.edt_end);

        osm.setTileSource(TileSourceFactory.MAPNIK);
        osm.setBuiltInZoomControls(true);
        osm.setMultiTouchControls(true);

        controller = (MapController) osm.getController();
        controller.setZoom(13);

        GeoPoint center = new GeoPoint(21.0369,105.7902);
        controller.animateTo(center);

        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String start = edtStart.getText().toString();
                final String end = edtEnd.getText().toString();
                Call<List<SearchPlace>> callEnd = service.getPlace(end, "json", 1, 1);

                callEnd.enqueue(new Callback<List<SearchPlace>>() {
                    @Override
                    public void onResponse(Call<List<SearchPlace>> call, Response<List<SearchPlace>> response) {
                        final List<SearchPlace> searchPlace1 = response.body();
                        if(searchPlace1.size()>0){
                            pointEnd = new Point(searchPlace1.get(0).getLat(), searchPlace1.get(0).getLon());
                            Call<List<SearchPlace>> callStart = service.getPlace(start, "json", 1, 1);
                            callStart.enqueue(new Callback<List<SearchPlace>>() {
                                @Override
                                public void onResponse(Call<List<SearchPlace>> call, Response<List<SearchPlace>> response) {
                                    List<SearchPlace> searchPlace = response.body();
                                    if(searchPlace.size()>0){
                                        pointStart = new Point(searchPlace.get(0).getLat(), searchPlace.get(0).getLon());

                                        List<String> points = new ArrayList<>();
                                        points.add(pointStart.getLat()+","+pointStart.getLng());
                                        points.add(pointEnd.getLat()+","+pointEnd.getLng());

                                        Call<Routing> routingCall = service.getDirections(points);
                                        routingCall.enqueue(new Callback<Routing>() {
                                            @Override
                                            public void onResponse(Call<Routing> call, Response<Routing> response) {
                                                Routing routing = response.body();
                                                if(routing!=null){
                                                    Log.d("MainActivity", "onClick,....." + routing.getPaths().get(0).getDistance());
                                                    GeoPoint startPoint =
                                                            new GeoPoint(Double.parseDouble(pointStart.getLat()),
                                                                    Double.parseDouble(pointStart.getLng()));

                                                    GeoPoint endPoint =
                                                            new GeoPoint(Double.parseDouble(pointEnd.getLat()),
                                                                    Double.parseDouble(pointEnd.getLng()));
                                                    listPoint.add(startPoint);
                                                    decodePolyline(routing.getPaths().get(0).getPoints());
                                                    listPoint.add(endPoint);
                                                    directions(listPoint);
                                                }else{
                                                    Toast.makeText(MainActivity.this, "Not found data", Toast.LENGTH_LONG).show();
                                                }
                                            }

                                            @Override
                                            public void onFailure(Call<Routing> call, Throwable t) {
                                                t.printStackTrace();
                                            }
                                        });
                                    }else{
                                        Toast.makeText(MainActivity.this, "Not found data", Toast.LENGTH_LONG).show();
                                    }
                                }

                                @Override
                                public void onFailure(Call<List<SearchPlace>> call, Throwable t) {
                                    t.printStackTrace();
                                }
                            });
                        }else{
                            Toast.makeText(MainActivity.this, "Not found data", Toast.LENGTH_LONG).show();
                        }
                    }

                    @Override
                    public void onFailure(Call<List<SearchPlace>> call, Throwable t) {
                        t.printStackTrace();
                    }
                });
//                as
//                asyncTask = new PointAsyncTask();
//                asyncTask.execute(start, end);
               // Log.d("MainActivity", "onClick " + pointEnd.getLat() + " " + pointEnd.getLng());
            }
        });
    }

    private void decodePolyline(String encoded){

        int index = 0;
        int len = encoded.length();
        int lat = 0, lng = 0, ele = 0;
        while (index < len)
        {
            // latitude
            int b, shift = 0, result = 0;
            do
            {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int deltaLatitude = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lat += deltaLatitude;

            // longitute
            shift = 0;
            result = 0;
            do
            {
                b = encoded.charAt(index++) - 63;
                result |= (b & 0x1f) << shift;
                shift += 5;
            } while (b >= 0x20);
            int deltaLongitude = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
            lng += deltaLongitude;

//            if (is3D)
//            {
//                // elevation
//                shift = 0;
//                result = 0;
//                do
//                {
//                    b = encoded.charAt(index++) - 63;
//                    result |= (b & 0x1f) << shift;
//                    shift += 5;
//                } while (b >= 0x20);
//                int deltaElevation = ((result & 1) != 0 ? ~(result >> 1) : (result >> 1));
//                ele += deltaElevation;
//                poly.add((double) lat / 1e5, (double) lng / 1e5, (double) ele / 100);
//            } else
//                poly.add((double) lat / 1e5, (double) lng / 1e5);
            GeoPoint gp = new GeoPoint((double) lat / 1e5, (double) lng / 1e5);
            listPoint.add(gp);
        }
    }

    private void directions(ArrayList<GeoPoint> points){
//        //List<GeoPoint> geoPoints = new ArrayList<>();
////add your points here
//        Polygon polygon = new Polygon();    //see note below
//        polygon.setFillColor(Color.argb(75, 255,0,0));
//        points.add(points.get(0));    //forces the loop to close
//        polygon.setPoints(points);
//        polygon.setTitle("A sample polygon");
//
////polygons supports holes too, points should be in a counter-clockwise order
//        List<List<GeoPoint>> holes = new ArrayList<>();
//        holes.add(points);
//        polygon.setHoles(holes);
//
//        osm.getOverlayManager().add(polygon);

        GeoPoint startPoint = new GeoPoint(points.get(0));
        int size = points.size();
        GeoPoint endPoint = new GeoPoint(points.get(size-1));
//add your points here
        if(line== null){
            line = new Polyline();   //see note below!
            line.setPoints(points);
            line.setOnClickListener(new Polyline.OnClickListener() {
                @Override
                public boolean onClick(Polyline polyline, MapView mapView, GeoPoint eventPos) {
                    Toast.makeText(mapView.getContext(), "polyline with " + polyline.getPoints().size() + "pts was tapped", Toast.LENGTH_LONG).show();
                    return false;
                }
            });
            line.setColor(Color.argb(75, 255,0,0));
            line.setWidth(6);
        }else {
            line.setPoints(points);
        }

        if(startMarker==null) startMarker = new Marker(osm);

        startMarker.setPosition(startPoint);
        startMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);

        if (endMarker==null) endMarker = new Marker(osm);
        endMarker.setPosition(endPoint);
        endMarker.setAnchor(Marker.ANCHOR_CENTER, Marker.ANCHOR_BOTTOM);

        osm.getOverlayManager().add(line);
        osm.getOverlays().add(startMarker);
        osm.getOverlays().add(endMarker);

        controller.setZoom(15);
        controller.animateTo(points.get(0));
    }
}
