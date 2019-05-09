package com.example.healtheye.View.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.R;
import com.example.healtheye.ViewModel.ProfileViewModel;


import java.util.ArrayList;
import java.util.Date;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.observers.DisposableCompletableObserver;
import io.reactivex.observers.DisposableSingleObserver;
import io.reactivex.schedulers.Schedulers;

public class addProfileActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText weightEnter, heightEnter, ageEnter;
    private Button submitButton;
    private ProfileViewModel profileViewModel;
    private String email;
    private Spinner genderSpinner;
    private String gender = "Male";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_add_profile);
        Log.d("Activity", "addProfileActivity");
        //get the User Email from LoginFragment
        Intent intent = getIntent();
        email = intent.getStringExtra("userEmail");
        Intent userIntent = new Intent(addProfileActivity.this, UserMainActivity.class);
        userIntent.putExtra("userEmail", email);
        //Check if User has existing profile already
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        profileViewModel.checkProfile(email)
                        .subscribeOn(Schedulers.io())
                        .observeOn(AndroidSchedulers.mainThread())
                        .subscribe(new DisposableSingleObserver<Profile>() {
                            @Override
                            public void onSuccess(Profile profile) {
                               startActivity(userIntent);
                            }

                            @Override
                            public void onError(Throwable e) {
                                setContentView(R.layout.activity_add_profile);
                                toolbar = findViewById(R.id.toolbar_addProfile);
                                setSupportActionBar(toolbar);
                                genderSpinner = findViewById(R.id.spinner_gender_addProfileActivity);
                                SpinnerAdapter spinnerAdapter = ArrayAdapter.createFromResource(addProfileActivity.this,
                                        R.array.gender,android.R.layout.simple_spinner_item);
                                genderSpinner.setAdapter(spinnerAdapter);
                                genderSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                                    @Override
                                    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                                        gender = parent.getItemAtPosition(position).toString();
                                        Log.d("Spinner", "Gender got is: " + gender);
                                    }

                                    @Override
                                    public void onNothingSelected(AdapterView<?> parent) {

                                    }
                                });
                                weightEnter = findViewById(R.id.editText_weight_addProfile);
                                heightEnter = findViewById(R.id.editText_height_addProfile);
                                ageEnter = findViewById(R.id.editText_Age_addProfile);
                                submitButton = findViewById(R.id.button_submit_addProfile);
                                submitButton.setOnClickListener(new View.OnClickListener() {
                                    @Override
                                    public void onClick(View v) {

                                        Float weightFloat = new Float(weightEnter.getText().toString());
                                        Float heightFloat = new Float(heightEnter.getText().toString());
                                        Integer ageInt  = new Integer(ageEnter.getText().toString());
                                        Profile newProfile = new Profile(email,weightFloat
                                                ,heightFloat, ageInt, gender);
                                        Date date = newProfile.getDate();
                                        profileViewModel.insert(newProfile).subscribe(new DisposableCompletableObserver() {
                                            @Override
                                            public void onComplete() {
                                                Toast.makeText(addProfileActivity.this,
                                                        "SQLite Insert Done!", Toast.LENGTH_SHORT);
                                            }
                                            @Override
                                            public void onError(Throwable e) {
                                                Toast.makeText(addProfileActivity.this,
                                                        "SQLite Insert Failed!", Toast.LENGTH_SHORT);
                                            }
                                        });
                                        Log.d("SQLite Action", "profile added");
                                        startActivity(userIntent);
                                    }
                                });
                            }
                        });

    }
}
