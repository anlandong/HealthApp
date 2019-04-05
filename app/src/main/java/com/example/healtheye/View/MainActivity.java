package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Button;

import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;

public class MainActivity extends AppCompatActivity {
    private AccountViewModel accountViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //accountViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);

    }
}
