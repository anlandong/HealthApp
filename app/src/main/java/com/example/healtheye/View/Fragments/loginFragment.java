package com.example.healtheye.View.Fragments;

import androidx.lifecycle.ViewModelProviders;

import com.example.healtheye.Model.Entity.Profile;
import com.example.healtheye.R;
import com.example.healtheye.View.Activities.UserMainActivity;
import com.example.healtheye.View.Activities.addProfileActivity;
import com.example.healtheye.View.Activities.registrationActivity;
import com.example.healtheye.ViewModel.AccountViewModel;
import com.example.healtheye.ViewModel.ProfileViewModel;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.widget.Switch;
import android.widget.Toast;
import android.util.Log;

public class loginFragment extends Fragment {

    private AccountViewModel mViewModel;
    private EditText editEmail;
    private EditText editPassword;
    private Button loginButton;
    private Button registerButton;
    private Switch rememberSwtich;
    private Button forgotButton; //ToDO: Implement A Forgot Password Activity
    private SharedPreferences sp;
    public static loginFragment newInstance() {
        return new loginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        editEmail = v.findViewById(R.id.edit_text_email);
        editPassword = v.findViewById(R.id.edit_text_password);
        loginButton = v.findViewById(R.id.login_button);
        //forgotButton = v.findViewById(R.id.forgotpw_button);
        rememberSwtich = v.findViewById(R.id.switch_login);
        rememberSwtich.setChecked(true);
        registerButton = v.findViewById(R.id.register_button);
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(editEmail.getText().toString(),"Email Entered");
                final String passwordGot = mViewModel.get_password(editEmail.getText().toString());
                Log.d("LoginFrag","Password Got is: " + passwordGot);
                if (editPassword.getText().toString().equals(passwordGot)) {
                    Intent intent = new Intent(getContext(), addProfileActivity.class);
                    intent.putExtra("userEmail", editEmail.getText().toString());
                    if (rememberSwtich.isChecked()){
                        sp = getActivity().getSharedPreferences("setting", Context.MODE_PRIVATE);
                        sp.edit().putBoolean("isLoggedin", true).apply();
                        sp.edit().putString("email", editEmail.getText().toString()).apply();
                        sp.edit().putString("password", editPassword.getText().toString()).apply();
                        Toast.makeText(getActivity(), "SP edit committed",Toast.LENGTH_LONG).show();
                    }
                    else{
                        sp = getActivity().getSharedPreferences("setting", Context.MODE_PRIVATE);
                        sp.edit().putBoolean("isLoggedin",false).apply();
                    }
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(), passwordGot + " Incorrect"
                            , Toast.LENGTH_LONG).show();
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), registrationActivity.class);
                startActivity(intent);
            }
        });

    }
}