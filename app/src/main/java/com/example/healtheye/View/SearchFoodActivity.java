package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.healtheye.Model.FoodSearch;
import com.example.healtheye.R;
import com.example.healtheye.Repository.USDAFoodSearchApi;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

public class SearchFoodActivity extends AppCompatActivity {
    private static SearchView searchView;
    private Toolbar toolbar;
    private String searchName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search_food);
        toolbar = findViewById(R.id.toolbar_searchFood);
        setSupportActionBar(toolbar);
        searchView = findViewById(R.id.searchView_food);
        searchName = searchView.getQuery().toString();
        searchView.setQueryHint("Enter Food");
        searchView.onActionViewExpanded();
        searchView.setIconified(true);
        //Setup Retrofit
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.nal.usda.gov/ndb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        USDAFoodSearchApi usdaFoodSearchApi = retrofit.create(USDAFoodSearchApi.class);

        Call<List<FoodSearch>> searchFood = usdaFoodSearchApi.getFood(searchName);
        searchFood.enqueue(new Callback<List<FoodSearch>>() {
            @Override
            public void onResponse(Call<List<FoodSearch>> call, Response<List<FoodSearch>> response) {
                if (! response.isSuccessful()){
                    Toast.makeText(SearchFoodActivity.this, "Code" + response.code(),
                            Toast.LENGTH_SHORT).show();
                }

                List<FoodSearch> searchResult= response.body();
                //ToDo:food found. display to searchViewItem. Set
            }

            @Override
            public void onFailure(Call<List<FoodSearch>> call, Throwable t) {
                Toast.makeText(SearchFoodActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
