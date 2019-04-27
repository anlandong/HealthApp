package com.example.healtheye.View;

import android.content.Intent;
import android.os.Bundle;

import com.example.healtheye.Model.Food;
import com.example.healtheye.Model.FoodReport;
import com.example.healtheye.Repository.USDAFoodAPI;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.example.healtheye.R;

import java.util.List;

public class displayFoodActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private String ndb;
    private String my_api_key = "f5lCyD2qbPcqB5qAtJWrD3ThpoFNKrRnRTRcAViO";
    private FoodReport FoodResultReport;
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
        toolbar.setTitle("Food Information");
        toolbar.setTitleMarginEnd(10);
        toolbar.setNavigationIcon(R.drawable.ic_arrowback);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(displayFoodActivity.this,
                        SearchFoodActivity.class);
                startActivity(backIntent);
            }
        });
        FloatingActionButton fab = findViewById(R.id.fab_displayFood);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //Setup Retrofit2
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.nal.usda.gov/ndb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final USDAFoodAPI usdaFoodReportApi = retrofit.create(USDAFoodAPI.class);
        fetchFoodReport(usdaFoodReportApi, ndb);
        Log.d("USDA", "fetchFOodReport Executed");

    }

    public void fetchFoodReport(USDAFoodAPI api, final String myndb){
        Call<FoodReport> foodReport = api.getReport(myndb, my_api_key);
        foodReport.enqueue(new Callback<FoodReport>() {
            @Override
            public void onResponse(Call<FoodReport> call, Response<FoodReport> response) {
                //TODO Complete onResponse
                if (! response.isSuccessful()){
                    Toast.makeText(displayFoodActivity.this, "Code" + response.code(),
                            Toast.LENGTH_SHORT).show();
                }
                displayFoodActivity.this.FoodResultReport = response.body();
                Log.d("USDA Report","FoodResultReport Set");
                Log.d("USDA Report", "Report Contains" + FoodResultReport.getCount());
                //Attach Fragement;
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                piechartFragment piechartFragment = new piechartFragment();
                fragmentTransaction.add(R.id.linearlayout_displayfood, piechartFragment);
                fragmentTransaction.commit();
            }

            @Override
            public void onFailure(Call<FoodReport> call, Throwable t) {
                Toast.makeText(displayFoodActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
                Log.d("Retrofit", "Food Report Search Failed");
            }
        });
    }

    public FoodReport getFoodResultReport(){
        return FoodResultReport;
    }
}
