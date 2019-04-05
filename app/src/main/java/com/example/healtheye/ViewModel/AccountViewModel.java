package com.example.healtheye.ViewModel;

import android.app.Application;

import com.example.healtheye.Model.User;
import com.example.healtheye.Repository.UserRepository;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

public class AccountViewModel extends AndroidViewModel {
    private UserRepository repository;
    public AccountViewModel(@NonNull Application application) {
        super(application);
        repository = new UserRepository(application);

    }

    public void insert(User user){ repository.insert(user);}
    public void update(User user){ repository.update(user);}
    public void delete(User user){ repository.delete(user);}
    public String get_password(String inputEmail){ return repository.get_Password(inputEmail);}
}
