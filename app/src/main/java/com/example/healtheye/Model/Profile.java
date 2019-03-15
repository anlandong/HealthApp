package com.example.healtheye.Model;

import java.util.Date;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "profile_table")
public class Profile {

    @PrimaryKey
    private String uEmail;

    private Date updateDate;

    private int weight;

    private int height;

    public Profile(String uEmail, Date updateDate, int weight, int height) {
        this.uEmail = uEmail;
        this.updateDate = updateDate;
        this.weight = weight;
        this.height = height;
    }

    public String getuEmail() {
        return uEmail;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public int getWeight() {
        return weight;
    }

    public int getHeight() {
        return height;
    }
}
