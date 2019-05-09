package com.example.healtheye.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.Repository.ProfileRepository;

import java.util.List;

import io.reactivex.Completable;
import io.reactivex.Flowable;
import io.reactivex.Single;

public class ProfileViewModel extends AndroidViewModel {
    private ProfileRepository repository;
    public ProfileViewModel(@NonNull Application application){
        super(application);
        repository = new ProfileRepository(application);
    }
    public Completable insert(Profile profile){ return repository.insert(profile);}
    public Completable updtate(Profile profile){ return repository.update(profile);}
    public Completable delete(Profile profile){ return repository.delete(profile);}
    public LiveData<Profile> get_health(String inputEmail){
        return repository.get_health(inputEmail);
    }
    public Single<Profile> checkProfile(String inputEmail){
        return repository.checkProfile(inputEmail);
    }
}
