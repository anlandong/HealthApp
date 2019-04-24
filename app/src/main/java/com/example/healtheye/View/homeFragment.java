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

public class homeFragment extends Fragment {

    private AccountViewModel mViewModel;

    //public static final int Login_Request = 1;

    public static homeFragment newInstance() {
        return new homeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_user_main_home, container, false);

        return v;


    }
}