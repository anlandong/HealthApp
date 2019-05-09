package com.example.healtheye.Model;

import androidx.room.TypeConverter;
import androidx.room.TypeConverters;

import com.example.healtheye.Model.Retrofit2Model.FoodReport;
import com.google.gson.*;
import com.example.healtheye.Model.Entity.Diet;
import com.google.gson.reflect.TypeToken;

import org.json.JSONException;

import java.lang.reflect.Type;
import java.util.List;

public class nutrientsListConverter {

    @TypeConverter
    public static List<FoodReport.FoodsBean.FoodBean.NutrientsBean> stringToList(String nutrientListStr) throws JSONException {
        Gson gson = new Gson();
        Type type = new TypeToken<List<FoodReport.FoodsBean.FoodBean.NutrientsBean>>(){}.getType();
        return gson.fromJson(nutrientListStr, type);
    }

    @TypeConverter
    public static String listToString(List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutrientsList){
        return new Gson().toJson(nutrientsList);
    }
}
