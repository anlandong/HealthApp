package com.example.healtheye.Repository;

import android.app.Application;
import android.os.AsyncTask;

import com.example.healtheye.Model.User;
import com.example.healtheye.ROOMDatabase.UserDatabase;

public class UserRepository {
    private UserDao userDao;
    private String passwordGot;

    public UserRepository(Application application){
        UserDatabase database = UserDatabase.getInstance(application);
        userDao = database.userDao();
        passwordGot = userDao.get_password("test1@nyu.edu"); //have to figure out how and where to pass in the input email
    }

    public void insert(User user){
        new InsertUserAsyncTask(userDao).execute(user);
    }

    public void update(User user){
        new UpdateUserAsyncTask(userDao).execute(user);
    }

    public void delete(User user){
        new DeleteUserAsyncTask(userDao).execute(user);
    }
    public String get_Password(String inputEmail){
        return passwordGot;
    }
    private static class InsertUserAsyncTask extends AsyncTask<User, Void,Void> {
        private UserDao userDao;

        private InsertUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.insert(users[0]);
            return null;
        }
    }

    private static class UpdateUserAsyncTask extends AsyncTask<User, Void,Void> {
        private UserDao userDao;

        private UpdateUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.update(users[0]);
            return null;
        }
    }

    private static class DeleteUserAsyncTask extends AsyncTask<User, Void,Void> {
        private UserDao userDao;

        private DeleteUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }
        @Override
        protected Void doInBackground(User... users) {
            userDao.delete(users[0]);
            return null;
        }
    }

}
