package com.example.healtheye.View.Fragments;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.Model.Entity.User;
import com.example.healtheye.Model.Retrofit2Model.FoodReport;
import com.example.healtheye.R;
import com.example.healtheye.View.Activities.UserMainActivity;
import com.example.healtheye.ViewModel.AccountViewModel;
import com.example.healtheye.ViewModel.DietViewModel;
import com.example.healtheye.ViewModel.ProfileViewModel;
import com.mikhaellopez.circularprogressbar.CircularProgressBar;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import java.math.*;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class homeFragment extends Fragment  {
    public final static String ARG_EMAIL = "userEmail";
    private AccountViewModel accountViewModel;
    private ProfileViewModel profileViewModel;
    private LiveData<Profile> profile;
    private DietViewModel dietViewModel;
    private TextView userNameTextView, totalCalorieTextView, calorieLeftTextView,
                        TDEETextView;
    private String email;
    private User user;
    private CircularProgressBar circularProgressBar;
    private float totalCalorie;
    private int TDEE;

    public static homeFragment newInstance() {
        return new homeFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_user_main_home, container, false);

        //Get Email Stored in SharedPreference
        SharedPreferences sp = getActivity().getSharedPreferences("setting", Context.MODE_PRIVATE);

        email = sp.getString("email", "null");
        //Setting up ViewModels
        accountViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        dietViewModel = ViewModelProviders.of(this).get(DietViewModel.class);
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        profileViewModel.get_health(email).observe(this, new Observer<Profile>() {
            @Override
            public void onChanged(Profile profile) {
                setTDEE(profile);
                Log.d("TDEE", "TDEE calculated to be: " + TDEE);
            }
        });

        //Finding components:
        circularProgressBar = v.findViewById(R.id.circularProgressBar_homeFrag);
        userNameTextView = v.findViewById(R.id.text_user_name);
        totalCalorieTextView = v.findViewById(R.id.textView_totalCalorie_homeFragment);
        calorieLeftTextView = v.findViewById(R.id.textView_calorieLeft_homeFrag);
        TDEETextView = v.findViewById(R.id.textView_numTDEE_homeFragment);
        Log.d("Fragment","HomeFragment Got Email:" + email);
        //Setting up progress bar:
        circularProgressBar.setProgressWithAnimation(65);
        circularProgressBar.setBackgroundProgressBarWidth(circularProgressBar.getProgressBarWidth());
        user = accountViewModel.getUser(email);
        if (user != null){
            userNameTextView.setText(user.getName());
        }
        //Observe and Set Total Calorie
        dietViewModel.getDiet(email).observe(this, new Observer<List<Diet>>() {
            @Override
            public void onChanged(List<Diet> diets) {
                if(diets.isEmpty() != true ){
                    updateTotal(diets);
                    totalCalorieTextView.setText(String.format(" %d kCal", Math.round(totalCalorie)));
                    circularProgressBar.setProgressWithAnimation(totalCalorie/TDEE*100);
                    TDEETextView.setText(String.format(" %d kCal", TDEE));
                    calorieLeftTextView.setText(String.format("Calorie Intake Left: %d kCal", (int) (TDEE - totalCalorie)));
                }
                else{
                    totalCalorieTextView.setText("No Diet Added");
                    circularProgressBar.setProgressWithAnimation(0);
                    TDEETextView.setText(String.format(" %d kCal", TDEE));
                    calorieLeftTextView.setText(String.format("Calorie Intake Left: %d kCal", (int) (TDEE)));
                }
            }
        });
        return v;
    }

    private float updateTotal(List<Diet> dietList){
        for ( Diet diet : dietList){
            Log.d("Frag Home", "Diet Got has name:" + diet.getName());
            float quantity = diet.getQuantity();
            float normalizedQuantity = quantity/100;
            for (FoodReport.FoodsBean.FoodBean.NutrientsBean nutrientsBean : diet.getNutrientsList()){
                Log.d("Frag Home", "Nutrient Name is:" + nutrientsBean.getName());
                if (nutrientsBean.getName().trim().equals("Energy")){
                    Log.d("Frag Home", "Energy Value is: " + nutrientsBean.getValue()
                    + "Of class: " + nutrientsBean.getValue().getClass());
                    String valueString = nutrientsBean.getValue();
                    float valueFloat = Float.parseFloat(valueString);
                    totalCalorie += valueFloat * normalizedQuantity;
                }
            }
        }
        return totalCalorie;
    }

    private void setTDEE(Profile profile){
        int age = profile.getAge();
        float weight = profile.getWeight();
        float height = profile.getHeight();
        String gender = profile.getGender();
        if (gender.equals("Male")){
            TDEE = (int) Math.round(66 + (13.7*weight) + (5*height) - (6.8* age));
        }
        else{
            TDEE = (int) Math.round(655 + (9.6*weight) + (1.8*height) - (4.7*age));
        }
    }

}