package com.example.healtheye.Repository;

import android.util.Pair;
import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.Model.Entity.User;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;
import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

@Dao
public interface ProfileDao {

    @Insert
    Completable insert(Profile profile);

    @Update
    Completable update(Profile profile);

    @Delete
    Completable delete(Profile profile);

    @Query("SELECT * FROM profile_table WHERE Email == :inputEmail ORDER BY date DESC Limit 1")
    LiveData<Profile> get_health(String inputEmail);

    @Query("Select * From profile_table WHERE Email == :inputEmail")
    Single<Profile> checkProfile(String inputEmail);
}
