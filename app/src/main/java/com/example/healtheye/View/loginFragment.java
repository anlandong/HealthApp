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

public class loginFragment extends Fragment {

    private AccountViewModel mViewModel;
    private EditText editEmail;
    private EditText editPassword;
    private Button loginButton;
    private Button registerButton;
    private Button forgotButton;
    public static final int Login_Request = 1;

    public static loginFragment newInstance() {
        return new loginFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.login_fragment, container, false);


    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);
        editEmail = getView().findViewById(R.id.edit_text_email);
        editPassword = getView().findViewById(R.id.edit_text_password);
        loginButton = getView().findViewById(R.id.login_button);
        forgotButton = getView().findViewById(R.id.forgotpw_button);
        final String passwordGot = mViewModel.get_password(editEmail.getText().toString());
        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editPassword.toString() == passwordGot) {
                    Intent intent = new Intent(getContext(), UserMainActivity.class);
                    startActivity(intent);
                }
            }
        });
    }
}