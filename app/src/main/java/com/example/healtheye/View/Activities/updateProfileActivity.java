package com.example.healtheye.View.Activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.ViewModelProviders;

import android.content.Intent;
import android.content.SharedPreferences;
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

import java.util.Date;

import io.reactivex.observers.DisposableCompletableObserver;


public class updateProfileActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private EditText weightEnter, heightEnter, ageEnter;
    private Button submitButton;
    private ProfileViewModel profileViewModel;
    private String email;
    private Spinner genderSpinner;
    private String gender = "Male";
    private SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_profile);
        sp = getSharedPreferences("setting", MODE_PRIVATE);
        email = sp.getString("email", null);
        Intent userIntent = new Intent(updateProfileActivity.this, UserMainActivity.class);
        userIntent.putExtra("userEmail", email);
        toolbar = findViewById(R.id.toolbar_addProfile);
        setSupportActionBar(toolbar);

        genderSpinner = findViewById(R.id.spinner_gender_updateProfileActivity);
        weightEnter = findViewById(R.id.editText_weight_updateProfile);
        heightEnter = findViewById(R.id.editText_height_updateProfile);
        ageEnter = findViewById(R.id.editText_Age_updateProfile);
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        SpinnerAdapter spinnerAdapter = ArrayAdapter.createFromResource(updateProfileActivity.this,
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

        submitButton = findViewById(R.id.button_submit_updateProfile);
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
                        Toast.makeText(updateProfileActivity.this,
                                "SQLite Insert Done!", Toast.LENGTH_SHORT);
                    }
                    @Override
                    public void onError(Throwable e) {
                        Toast.makeText(updateProfileActivity.this,
                                "SQLite Insert Failed!", Toast.LENGTH_SHORT);
                    }
                });
                Log.d("SQLite Action", "profile added");
                startActivity(userIntent);
            }
        });
    }
}
