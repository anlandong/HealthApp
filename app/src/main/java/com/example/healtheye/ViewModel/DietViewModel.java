package com.example.healtheye.ViewModel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.Repository.DietRepository;

import java.util.List;

import io.reactivex.Completable;

public class DietViewModel extends AndroidViewModel {
    private DietRepository  repository;

    public DietViewModel(@NonNull Application application) {
        super(application);
        repository = new DietRepository(application);
    }

    public Completable insert(Diet diet){ return repository.insert(diet); }
    public Completable update(Diet diet){ return repository.update(diet); }
    public Completable delete(Diet diet){ return repository.delete(diet); }
    public LiveData<List<Diet>> getDiet(String inputEmail) {
        return repository.getDiet(inputEmail);
    }

}
