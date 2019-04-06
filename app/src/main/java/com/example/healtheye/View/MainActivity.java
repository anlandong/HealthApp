package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;

public class MainActivity extends AppCompatActivity {
    private AccountViewModel accountViewModel;
    private Button searchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //accountViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        searchButton = findViewById(R.id.button_searchFoodMain);
        searchButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(MainActivity.this,
                        SearchFoodActivity.class);
                startActivity(searchIntent);
            }
        });
    }
}
