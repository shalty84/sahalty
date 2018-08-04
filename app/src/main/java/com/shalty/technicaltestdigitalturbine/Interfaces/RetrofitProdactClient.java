package com.shalty.technicaltestdigitalturbine.Interfaces;

import com.shalty.technicaltestdigitalturbine.types.Ad;
import com.shalty.technicaltestdigitalturbine.types.Ads;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitProdactClient {

//    /getAds?id=236&password=OVUJ1DJN&siteId=10777&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10


    @GET("getAds?id=236&password=OVUJ1DJN&siteId=10777&deviceId=4230&sessionId=techtestsession&totalCampaignsRequested=10")
    Call<List<Ads>> getProdact(
//            @Query("id") String id,
//            @Query("password") String password,
//            @Query("siteId") String siteId,
//            @Query("deviceId") String deviceId,
//            @Query("sessionId") String sessionId,
//            @Query("totalCampaignsRequested") String totalCampaignsRequested,
//            @Query("lname") String lname

    );
}
