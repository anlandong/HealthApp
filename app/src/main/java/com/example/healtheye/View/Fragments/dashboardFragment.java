package com.example.healtheye.View.Fragments;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.R;
import com.example.healtheye.View.Activities.addProfileActivity;
import com.example.healtheye.View.Activities.updateProfileActivity;
import com.example.healtheye.ViewModel.AccountViewModel;
import com.example.healtheye.ViewModel.ProfileViewModel;

import java.util.List;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class dashboardFragment extends Fragment {

    private AccountViewModel mViewModel;
    private ProfileViewModel profileViewModel;
    private SharedPreferences sp;
    private String email;
    private TextView weightTextView;
    private TextView heightTextView;
    private TextView updateDateTextView;
    private TextView BMITextView, BMIActionTextView;
    private Button updateProfileButton;

    public static dashboardFragment newInstance() {
        return new dashboardFragment();
    }
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_user_main_dashboard, container, false);

        weightTextView = v.findViewById(R.id.textView_weight_dashboard);
        heightTextView = v.findViewById(R.id.textView_height_dashboard);
        updateDateTextView = v.findViewById(R.id.textView_updateTime_dashboard);
        BMIActionTextView = v.findViewById(R.id.textView_BMIAction_dashboard);
        BMITextView = v.findViewById(R.id.textView_BMI_dashboard);
        updateProfileButton = v.findViewById(R.id.button_updateProfile_dashBoardFrag);
        profileViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        sp = getActivity().getSharedPreferences("setting", Context.MODE_PRIVATE);
        email = sp.getString("email", null);
        Log.d("Fragment Dashboard","Dashboard Fragment Got Email:" + email);
        updateProfileButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), updateProfileActivity.class);
                startActivity(intent);
            }
        });
        if (email != null){
            profileViewModel.get_health(email).observe(this, new Observer<Profile>(){
                @SuppressLint("SetTextI18n")
                @Override
                public void onChanged(Profile profile) {
                    float BMI = getBMI(profile) * 10000;
                    weightTextView.setText("Your Current Weight is: " + profile.getWeight().toString()
                            + " KG");
                    heightTextView.setText("Your Current Height is "+profile.getHeight().toString()
                            + " CM");
                    updateDateTextView.setText("Last Updated at: " + profile.getDate().toString());
                    BMITextView.setText(String.format("Your current BMI is: %f", BMI));
                    if (BMI <= 18.5){
                        BMIActionTextView.setText("Based on your BMI, your body is Underweight.");
                    }
                    else if ( BMI <= 24.9 && BMI > 18.5 ){
                        BMIActionTextView.setText("Based on your BMI, your body is Normal.");
                    }
                    else if ( BMI <= 29.9 && BMI > 25.0 ){
                        BMIActionTextView.setText("Based on your BMI, your body is Overweight.");
                    }
                    else if ( BMI > 30.0){
                        BMIActionTextView.setText("Based on your BMI, your body is Obese.");
                    }
                }
            });
        }
        return v;
    }


    private float getBMI(Profile profile){
        return profile.getWeight()/(profile.getHeight() * profile.getHeight());
    }
}