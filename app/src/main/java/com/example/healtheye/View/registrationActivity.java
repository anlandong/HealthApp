package com.example.healtheye.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.example.healtheye.Model.User;
import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class registrationActivity extends AppCompatActivity {
    private EditText editEmail;
    private EditText editPassword;
    private EditText editName;
    private Button registerButton;
    private Button loginButton;
    private AccountViewModel accountViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

        editEmail = findViewById(R.id.edit_text_emailR);
        editPassword = findViewById(R.id.edit_text_passwordR);
        editName = findViewById(R.id.edit_text_nameR);
        registerButton = findViewById(R.id.register_buttonR);
        loginButton = findViewById(R.id.login_buttonR);
        accountViewModel = ViewModelProviders.of(this).get(AccountViewModel.class);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(registrationActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                User newUser = new
                        User(editEmail.getText().toString(), editName.getText().toString(), editPassword.getText().toString());
                accountViewModel.insert(newUser);
                Toast.makeText(registrationActivity.this, "Account Created!", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
