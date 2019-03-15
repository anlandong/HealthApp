package com.example.healtheye;

import androidx.lifecycle.ViewModelProviders;
import com.example.healtheye.ViewModel.AccountViewModel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;

public class loginFragment extends Fragment {

    private AccountViewModel mViewModel;
    private EditText editEmail;
    private EditText editPassword;

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
        // TODO: Use the ViewModel
    }

}
