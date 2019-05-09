package com.example.healtheye.Model.Entity;

import java.util.Date;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(primaryKeys ={"Email", "date"}, tableName = "profile_table")
public class Profile {

    @NonNull
    private String Email;
    private Float weight;
    private Float height;
    private Integer age;
    private String gender;
    @NonNull
    private Date date;

    public Profile(String Email, Float weight, Float height, Integer age, String gender) {
        this.Email = Email;
        this.weight = weight;
        this.height = height;
        this.age = age;
        this.gender = gender;
        this.date = new Date(System.currentTimeMillis());
    }

    public String getEmail() {
        return Email;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getHeight() {
        return height;
    }

    public Integer getAge() { return age; }

    public Date getDate(){ return date;}

    public void setEmail(@NonNull String email) {
        Email = email;
    }

    public void setWeight(Float weight) {
        this.weight = weight;
    }

    public void setHeight(Float height) {
        this.height = height;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getGender() { return gender; }

    public void setGender(String gender) { this.gender = gender; }
}

