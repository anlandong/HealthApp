package com.example.healtheye.View;

import android.content.Intent;
import android.os.Bundle;

import com.example.healtheye.Repository.USDAFoodAPI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.util.Log;
import android.view.View;

import com.example.healtheye.R;

public class displayFoodActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private String ndb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //Pass in ndb
        Intent intent = getIntent();
        ndb = intent.getStringExtra("ndb");
        Log.d("Intent", "ndb number is: "+ndb);
        setContentView(R.layout.activity_display_food);
        toolbar = findViewById(R.id.toolbar_activityDisplayFood);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrowback);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(displayFoodActivity.this,
                        SearchFoodActivity.class);
                startActivity(backIntent);
            }
        });
        //Setup Retrofit2
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.nal.usda.gov/ndb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final USDAFoodAPI usdaFoodReportApi = retrofit.create(USDAFoodAPI.class);
        //TODO set up RecyclerView
        //fetchFoodReport();




        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

}
