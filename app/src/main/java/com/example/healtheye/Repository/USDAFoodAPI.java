package com.example.healtheye.Repository;

import com.example.healtheye.Model.Retrofit2Model.FoodReport;
import com.example.healtheye.Model.Retrofit2Model.FoodSearch;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface USDAFoodAPI {
    String my_api_key = "f5lCyD2qbPcqB5qAtJWrD3ThpoFNKrRnRTRcAViO";
    @GET("search")
    Call<FoodSearch> getFood(@Query("q") String foodName
                            ,@Query("api_key") String my_api_key
                            ,@Query("ds") String dataSource);
    @GET("V2/reports")
    Call<FoodReport> getReport(@Query("ndbno") String ndb,
                               @Query("api_key") String my_api_key);


}
