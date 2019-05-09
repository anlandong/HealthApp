package com.example.healtheye.Repository;

import android.app.Application;

import androidx.lifecycle.LiveData;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.ROOMDatabase.UserDatabase;

import java.util.List;

import io.reactivex.Completable;

public class DietRepository {
    private DietDao dietDao;
    private LiveData<Diet> dietGot;

    public DietRepository(Application application){
        UserDatabase userDatabase = UserDatabase.getInstance(application);
        dietDao = userDatabase.dietDao();
    }

    public Completable insert(Diet diet){
        return dietDao.insert(diet);
    }
    public Completable update(Diet diet){
        return dietDao.update(diet);
    }
    public Completable delete(Diet diet){
        return dietDao.delete(diet);
    }
    public LiveData<List<Diet>> getDiet(String inputEmail){
        return dietDao.getDiet(inputEmail);
    }
}
