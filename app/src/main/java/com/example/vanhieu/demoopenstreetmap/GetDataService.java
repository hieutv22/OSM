package com.example.vanhieu.demoopenstreetmap;

import org.osmdroid.views.overlay.gridlines.LatLonGridlineOverlay2;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GetDataService {
    @GET("/geocode/search")
    Call<List<SearchPlace>> getPlace(
            @Query(value = "q") String q,
            @Query(value= "format") String format,
            @Query(value = "polygon") int polygon,
            @Query(value = "addressdetails") int addressdetails);

    @GET("/routing/route")
    Call<Routing> getDirections(
            @Query(value = "point") List<String> points
    );
}
