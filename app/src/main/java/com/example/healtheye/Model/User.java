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

    public User(@NonNull String Email, String Name, @NonNull String Password) {
        this.Email = Email;
        this.Name = Name;
        this.Password = Password;
    }

    public String getName() {
        return Name;
    }
    public String getEmail() {
        return Email;
    }
    public String getPassword() {
        return Password;
    }









}
