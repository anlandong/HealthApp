package com.example.healtheye.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {

    @PrimaryKey
    @NonNull
    private String Email;

    private String Name;

    @NonNull
    private String Password;

    public User(String uEmail, String uName, String uPassword) {
        this.Email = uEmail;
        this.Name = uName;
        this.Password = uPassword;
    }

    public String getEmail() {
        return Email;
    }

    public String getUserName() {
        return Name;
    }
}
