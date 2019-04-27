package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SearchView;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import com.example.healtheye.Model.FoodReport;
import com.example.healtheye.Model.FoodSearch;
import com.example.healtheye.R;
import com.example.healtheye.Repository.USDAFoodAPI;
import com.example.healtheye.View.Adapters.searchFoodRecycAdapter;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Toast;

import java.util.List;

public class SearchFoodActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static SearchView searchView;
    private Toolbar toolbar;
    private String my_api_key = "f5lCyD2qbPcqB5qAtJWrD3ThpoFNKrRnRTRcAViO";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("Tag","OnCreate");
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_search_food);
        toolbar = findViewById(R.id.toolbar_searchFood);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_arrowback);
        toolbar.setNavigationOnClickListener(new Toolbar.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent backIntent = new Intent(SearchFoodActivity.this,
                        MainActivity.class);
                startActivity(backIntent);
            }
        });
        //Setup Retrofit2
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.nal.usda.gov/ndb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final USDAFoodAPI usdaFoodSearchApi = retrofit.create(USDAFoodAPI.class);
        //setup searchView
        searchView = findViewById(R.id.searchView_food);
        searchView.setQueryHint("Enter Food");
        searchView.onActionViewExpanded();
        searchView.setIconified(true);
        //Setup RecyclerView + Adapter
        recyclerView = findViewById(R.id.recyclerView_foodsearch);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setHasFixedSize(true);
        //Setup searchView textChangeListener:
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("TextSubmit", "Text Submitted");
                fetchFood(usdaFoodSearchApi, query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("TextChanged", "Text Changed");
                fetchFood(usdaFoodSearchApi, newText);
                return false;
            }
        });
    }

    public void fetchFood(USDAFoodAPI api, final String queryFoodName){
        Call<FoodSearch> searchFood = api.getFood(queryFoodName, my_api_key);
        searchFood.enqueue(new Callback<FoodSearch>() {
            @Override
            public void onResponse(Call<FoodSearch> call, Response<FoodSearch> response) {
                if (! response.isSuccessful()){
                    Toast.makeText(SearchFoodActivity.this, "Code" + response.code(),
                            Toast.LENGTH_SHORT).show();
                }

                FoodSearch searchResult= response.body();
                searchFoodRecycAdapter adapter =
                        new searchFoodRecycAdapter(searchResult, SearchFoodActivity.this,
                                new searchFoodRecycAdapter.onItemClickListener() {
                                    @Override
                                    public void onItemClick(FoodSearch.ListBean.ItemBean item) {
                                        Log.d("Listener","Search Result Item clicked");
                                        Intent displayFoodIntent = new Intent(
                                                SearchFoodActivity.this,
                                                displayFoodActivity.class);
                                        displayFoodIntent.putExtra("ndb", item.getNdbno());
                                        startActivity(displayFoodIntent);
                                    }
                                });
                if (null != adapter){
                    Log.d("adapter", "adapter setting");
                    recyclerView.setAdapter(adapter);
                }
                Log.d("TAG", "FoodSearch is successful");
                Log.d("SearchCritera", "Search Name is:" + queryFoodName);
                //ToDo:food found. display to RecyclerView.
                adapter.setFoodSearch(searchResult);
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onFailure(Call<FoodSearch> call, Throwable t) {
                Toast.makeText(SearchFoodActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
            }
        });

    }
}
