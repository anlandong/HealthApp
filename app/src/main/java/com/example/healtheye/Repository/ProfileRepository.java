package com.example.healtheye.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.ROOMDatabase.UserDatabase;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

public class ProfileRepository {
    private ProfileDao profileDao;
    private LiveData<Profile> profileGot;

    public ProfileRepository(Application application){
        UserDatabase database = UserDatabase.getInstance(application);
        profileDao = database.profileDao();
    }

    public Completable insert(Profile profile){
        return profileDao.insert(profile);
    }
    public Completable update(Profile profile){
        return profileDao.update(profile);
    }
    public Completable delete(Profile profile){
        return profileDao.delete(profile);
    }
    public LiveData<Profile> get_health(String inputEmail) {
        profileGot = profileDao.get_health(inputEmail);
        return profileGot;
    }
    public Single<Profile> checkProfile(String inputEmail){
        return profileDao.checkProfile(inputEmail);
    }
}
