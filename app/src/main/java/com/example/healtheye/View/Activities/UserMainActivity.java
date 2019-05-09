package com.example.healtheye.View.Activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;

import androidx.annotation.NonNull;

import com.example.healtheye.R;
import com.example.healtheye.View.Fragments.dashboardFragment;
import com.example.healtheye.View.Fragments.homeFragment;
import com.example.healtheye.View.Fragments.notificationFragment;
import com.example.healtheye.ViewModel.AccountViewModel;
import com.example.healtheye.ViewModel.ProfileViewModel;
import com.example.healtheye.liteClassifier.ClassifierActivity;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.Toast;

public class UserMainActivity extends AppCompatActivity {
    private AccountViewModel accountViewModel;
    private ProfileViewModel profileViewModel;
    private String userEmail;
    private FloatingActionButton searchButton, cameraButton, expandButton;
    private Context mContext;
    private homeFragment homeFragment;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {


            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    selectedFragment = new homeFragment();
                    break;
                case R.id.navigation_dashboard:
                    selectedFragment = new dashboardFragment();
                    break;
                case R.id.navigation_notifications:
                    selectedFragment = new notificationFragment();
                    break;
            }

            getSupportFragmentManager().beginTransaction().replace(
                    R.id.frameLayout_forFragment_usermain,selectedFragment).commit();
            return true;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = UserMainActivity.this;
        Log.d("Activity", "UserMainActivity");
        Intent intent = getIntent();
        userEmail = intent.getStringExtra("userEmail");
        setContentView(R.layout.activity_user_main);
        getSupportFragmentManager().beginTransaction().add(R.id.frameLayout_forFragment_usermain, new homeFragment()).commit();
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation_usermain);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        //Set up Expand button
        expandButton = findViewById(R.id.floatingActionButton_expand_usermain);
        expandButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initPopWindow(v);
            }
        });
    }

    protected void getBMI(){

    }

    private void initPopWindow(View v){
        View view = LayoutInflater.from(mContext)
                .inflate(R.layout.layout_popup_usermain, null, false);
        FloatingActionButton popSearchButton = view.findViewById(R.id.fab_searchFood_popup);
        FloatingActionButton popCameraButton = view.findViewById(R.id.fab_cameraFood_popup);
        FloatingActionButton popLogoutButton = view.findViewById(R.id.fab_logout_popup);
        final PopupWindow popupWindow = new PopupWindow(view, ViewGroup.LayoutParams.WRAP_CONTENT
                                            , ViewGroup.LayoutParams.WRAP_CONTENT, true);
        popupWindow.setAnimationStyle(R.anim.anim_pop);
        popupWindow.setTouchable(true);
        popupWindow.setTouchInterceptor(new View.OnTouchListener(){
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
        popupWindow.setBackgroundDrawable(new ColorDrawable(0x00000000));
        int offsetY = - ( 2 * popupWindow.getContentView().getMeasuredHeight());
        popupWindow.showAsDropDown(v,0,-670, Gravity.CENTER);
        //Set Onclicklisenters
        popCameraButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(UserMainActivity.this,
                        ClassifierActivity.class);
                startActivity(cameraIntent);
            }
        });
        popSearchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent searchIntent = new Intent(UserMainActivity.this,
                        SearchFoodActivity.class);
                startActivity(searchIntent);
            }
        });
        popLogoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences sp = getSharedPreferences("setting", MODE_PRIVATE);
                sp.edit().putBoolean("isLoggedin", false).apply();
                Intent mainActivityIntent = new Intent(UserMainActivity.this, MainActivity.class);
                startActivity(mainActivityIntent);
            }
        });

    }

}
