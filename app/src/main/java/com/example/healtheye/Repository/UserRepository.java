package com.example.healtheye.Repository;

import android.app.Application;
import android.os.AsyncTask;
import android.util.Log;
import android.widget.Toast;

import com.example.healtheye.Model.Entity.User;
import com.example.healtheye.ROOMDatabase.UserDatabase;

public class UserRepository {
    private UserDao userDao;
    private static String passwordGot;
    private static User userGot;
    public UserRepository(Application application){
        UserDatabase database = UserDatabase.getInstance(application);
        userDao = database.userDao();
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
        passwordGot = userDao.get_password(inputEmail);
        Log.d("UserRepo", "Password Got is " + passwordGot);
        //new getPasswordAsyncTask(userDao).execute(inputEmail);
        return passwordGot;
    }

    public User getUser(String inputEmail){
        Log.d("UserRepo", "Getting User");
        //new getUserAsyncTask(userDao).execute(inputEmail);
        userGot = userDao.getUser(inputEmail);
        return userGot;
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

    private static class getPasswordAsyncTask extends AsyncTask<String, Void, String> {
        private UserDao userDao;

        private getPasswordAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }
        @Override
        protected String doInBackground(String... params) {
            String input = params[0];
            Log.d("AsnycTask","in getPasswordAsyncTask");
            Log.d("AsyncTask","inputEmail is " + input);
            return passwordGot = userDao.get_password(input);
        }
    }
    private static class getUserAsyncTask extends AsyncTask<String, Void, User> {
        private UserDao userDao;

        private getUserAsyncTask(UserDao userDao){
            this.userDao = userDao;
        }
        @Override
        protected User doInBackground(String... params) {
            String input = params[0];
            Log.d("AsnycTask","in getUserAsyncTask");
            return userGot = userDao.getUser(input);
        }
    }

}
