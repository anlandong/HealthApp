package com.example.healtheye.Repository;

import com.example.healtheye.Model.User;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface UserDao {

    @Insert
    void insert(User user);

    @Update
    void update(User user);

    @Delete
    void delete(User user);

    @Query("SELECT Password FROM user_table WHERE Email == :inputEmail")
    String get_password(String inputEmail);

}
