package com.example.healtheye.View;

import androidx.lifecycle.ViewModelProviders;
import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;
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
import android.widget.Toast;
import android.util.Log;

public class loginFragment extends Fragment {

    private AccountViewModel mViewModel;
    private EditText editEmail;
    private EditText editPassword;
    private Button loginButton;
    private Button registerButton;
    private Button forgotButton; //ToDO: Implement A Forgot Password Activity (Priority 3)
    //public static final int Login_Request = 1;

    public static loginFragment newInstance() {
        return new loginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.login_fragment, container, false);
        editEmail = v.findViewById(R.id.edit_text_email);
        editPassword = v.findViewById(R.id.edit_text_password);
        loginButton = v.findViewById(R.id.login_button);
        forgotButton = v.findViewById(R.id.forgotpw_button);
        registerButton = v.findViewById(R.id.register_button);
        return v;


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        final String passwordGot = mViewModel.get_password(editEmail.getText().toString());
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(editEmail.getText().toString(),"Email Entered");
                if (editPassword.getText().toString() == passwordGot) {
                    Intent intent = new Intent(getContext(), UserMainActivity.class);
                    startActivity(intent);
                }
                else{
                    Toast.makeText(getContext(), passwordGot + "Incorrect", Toast.LENGTH_LONG).show();
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