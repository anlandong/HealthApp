package com.example.healtheye.ROOMDatabase;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.AsyncTask;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.Model.Entity.User;
import com.example.healtheye.Model.dateTypeConverter;
import com.example.healtheye.Model.nutrientsListConverter;
import com.example.healtheye.Repository.DietDao;
import com.example.healtheye.Repository.ProfileDao;
import com.example.healtheye.Repository.UserDao;
import com.example.healtheye.View.Activities.MainActivity;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverter;
import androidx.room.TypeConverters;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {User.class, Profile.class, Diet.class}, version = 6)
@TypeConverters({dateTypeConverter.class, nutrientsListConverter.class})
public abstract class UserDatabase extends RoomDatabase {

    private static UserDatabase instance;
    public abstract UserDao userDao();
    public abstract ProfileDao profileDao();
    public abstract DietDao dietDao();
    public static synchronized UserDatabase  getInstance(Context context){
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    UserDatabase.class, "user_database")
                    .fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .allowMainThreadQueries()
                    .build();

        }
        return instance;
    }
    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private UserDao userDao;

        private PopulateDbAsyncTask(UserDatabase db){
            userDao = db.userDao();
        }
        @Override
        protected Void doInBackground(Void... voids) {
            userDao.insert( new User("test1@nyu.edu","Test1", "12345"));
            userDao.insert( new User("test2@nyu.edu","Test2", "12345"));
            userDao.insert( new User("test3@nyu.edu","Test3", "12345"));
            userDao.insert( new User("test4@nyu.edu","Test4", "12345"));
            return null;
        }
    }

}
