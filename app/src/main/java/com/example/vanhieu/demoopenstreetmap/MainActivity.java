package com.example.vanhieu.demoopenstreetmap;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.util.GeoPoint;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;

public class MainActivity extends AppCompatActivity {
    private MapView osm;
    private MapController controller;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        osm = findViewById(R.id.osm);
        osm.setTileSource(TileSourceFactory.MAPNIK);
        osm.setBuiltInZoomControls(true);
        osm.setMultiTouchControls(true);

        controller = (MapController) osm.getController();
        controller.setZoom(12);

        GeoPoint center = new GeoPoint(21.0369,105.7902);
        controller.animateTo(center);
    }
}
