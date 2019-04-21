package com.example.healtheye.View;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.healtheye.R;
import com.example.healtheye.ViewModel.AccountViewModel;

public class dashboardFragment extends Fragment {

    private AccountViewModel mViewModel;

    //public static final int Login_Request = 1;

    public static dashboardFragment newInstance() {
        return new dashboardFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.activity_user_main_dashboard, container, false);

        return v;


    }
}