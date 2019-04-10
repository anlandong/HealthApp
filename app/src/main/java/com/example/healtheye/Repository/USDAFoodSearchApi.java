package com.example.healtheye.Repository;

import com.example.healtheye.Model.FoodSearch;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface USDAFoodSearchApi {

    @GET("search")
    Call<List<FoodSearch>> getFood(String foodName);



}
