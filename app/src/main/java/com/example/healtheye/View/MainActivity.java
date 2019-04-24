package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
        cameraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MainActivity.this, ClassifierActivity.class);
                startActivity(cameraIntent);
                Log.d("Camera", "Camera Clicked");

            }
        });

    }
}
