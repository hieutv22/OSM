package com.example.vanhieu.demoopenstreetmap;

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

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MapView osm;
    private Button btnSearch;
    private EditText edtStart, edtEnd;
    private MapController controller;

    private Point pointStart, pointEnd;
    private GetDataService service = RetrofitInstance.getRetrofitInstance().create(GetDataService.class);

    private PointAsyncTask asyncTask;
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
        controller.setZoom(12);

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
//                                        getLatLog(searchPlace1.get(0));
//                                        getLatLog(searchPlace.get(0));

                                        List<String> point1 = new ArrayList<>();
                                        List<String> point2 = new ArrayList<>();
                                        point1.add(pointStart.getLat());
                                        point1.add(pointStart.getLng());
                                        point2.add(pointEnd.getLat());
                                        point2.add(pointEnd.getLng());

                                        Call<Routing> routingCall = service.getDirections(point1, point2);
                                        routingCall.enqueue(new Callback<Routing>() {
                                            @Override
                                            public void onResponse(Call<Routing> call, Response<Routing> response) {
                                                Routing routing = response.body();
                                                if(routing!=null){
                                                    Log.d("MainActivity", "onClick,....." + routing.getPaths().get(0).getDistance());
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

    private void getLatLog(SearchPlace searchPlace){
        Toast.makeText(MainActivity.this,"onClick " +searchPlace.getLat()  + " " + searchPlace.getLon() , Toast.LENGTH_LONG).show();
    }

    class PointAsyncTask extends AsyncTask<String, Point, Point>{

        @Override
        protected Point doInBackground(String... strings) {

//              Call<SearchPlace> callEnd = service.getPlace(strings[1], "json", 1, 1);
//            callEnd.enqueue(new Callback<SearchPlace>() {
//                @Override
//                public void onResponse(Call<SearchPlace> call, Response<SearchPlace> response) {
//                    SearchPlace searchPlace = response.body();
//                    publishProgress(new Point(Double.valueOf(searchPlace.getLat()), Double.valueOf(searchPlace.getLon())));
//                }
//
//                @Override
//                public void onFailure(Call<SearchPlace> call, Throwable t) {
//
//                }
//            });
            return null;
        }

        @Override
        protected void onProgressUpdate(Point... values) {
            pointStart = values[0];
            //pointEnd = values[1];
            //Log.d("MainActivity", "onClick " + pointEnd.getLat() + " " + pointEnd.getLng());
            Log.d("MainActivity", "onClick " + pointStart.getLat() + " " + pointStart.getLng());
        }
    }
}
