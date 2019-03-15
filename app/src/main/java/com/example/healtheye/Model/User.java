package com.example.healtheye.Model;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "user_table")
public class User {

    @PrimaryKey
    @NonNull
    private String Email;
    @NonNull
    private String Password;
    private String Name;

    public String getName() {
        return Name;
    }
    @NonNull
    public String getEmail() {
        return Email;
    }
    @NonNull
    public String getPassword() {
        return Password;
    }



    public User(@NonNull String uEmail, String uName, @NonNull String uPassword) {
        this.Email = uEmail;
        this.Name = uName;
        this.Password = uPassword;
    }




}
