package com.example.healtheye.Repository;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.Model.Entity.Profile;

import java.util.List;

import io.reactivex.Completable;

@Dao
public interface DietDao {

    @Insert
    Completable insert(Diet diet);

    @Update
    Completable update(Diet diet);

    @Delete
    Completable delete(Diet diet);

    @Query("SELECT * FROM diet_table WHERE Email == :inputEmail")
    LiveData<List<Diet>> getDiet(String inputEmail);


}
