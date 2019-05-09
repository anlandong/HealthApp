package com.example.healtheye.View.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.example.healtheye.liteClassifier.*;


public class MainActivity extends AppCompatActivity {
    private AccountViewModel accountViewModel;
    private FloatingActionButton cameraButton;
    private FloatingActionButton searchButton;
    private SharedPreferences sp;
    private String savedEmail;
    private Boolean isLoggedin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = this.getSharedPreferences("setting", MODE_PRIVATE);
        isLoggedin = sp.getBoolean("isLoggedin", false);
        savedEmail = sp.getString("email", null);
        if (isLoggedin != false) {
            Intent loginIntent = new Intent(MainActivity.this, addProfileActivity.class);
            loginIntent.putExtra("userEmail", savedEmail);
            startActivity(loginIntent);
        }

        setContentView(R.layout.activity_main);
        //accountViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        searchButton = findViewById(R.id.button_activityMain_SearchFood);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this,
                        SearchFoodActivity.class);
                startActivity(searchIntent);
            }
        });
        cameraButton = findViewById(R.id.button_activityMain_Camera);
        cameraButton.setOnClickListener(v -> {
            Intent cameraIntent = new Intent(MainActivity.this, ClassifierActivity.class);
            startActivity(cameraIntent);
        });

    }
}

