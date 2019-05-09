package com.example.healtheye.Model.Entity;

import androidx.annotation.NonNull;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.example.healtheye.Model.Retrofit2Model.FoodReport;

import java.util.Date;
import java.util.List;


@Entity(primaryKeys = {"email", "date"}, tableName = "diet_table")
public class Diet{
    @NonNull
    private String email;
    @NonNull
    private Date date;
    private String udb;
    private String name;;
    private Float quantity;
    private List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutrientsList;

    public Float getQuantity() {
        return quantity;
    }

    public void setQuantity(Float quantity) {
        this.quantity = quantity;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getUdb() {
        return udb;
    }

    public void setUdb(String udb) {
        this.udb = udb;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @NonNull
    public String getEmail() {
        return email;
    }

    public void setEmail(@NonNull String email) {
        this.email = email;
    }

    public List<FoodReport.FoodsBean.FoodBean.NutrientsBean> getNutrientsList() {
        return nutrientsList;
    }

    public void setNutrientsList(List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutrientsList) {
        this.nutrientsList = nutrientsList;
    }

    public Diet(String email, String udb, String name, Float quantity
                , List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutrientsList){
        this.email = email;
        this.date = new Date(System.currentTimeMillis());
        this.name = name;
        this.quantity = quantity;
        this.nutrientsList = nutrientsList;
    }

}
