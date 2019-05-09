package com.example.healtheye.View.Activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;

import com.example.healtheye.Model.Entity.Diet;
import com.example.healtheye.Model.Retrofit2Model.FoodReport;
import com.example.healtheye.Repository.USDAFoodAPI;
import com.example.healtheye.View.Fragments.piechartFragment;
import com.example.healtheye.ViewModel.DietViewModel;
import com.google.android.material.bottomsheet.BottomSheetBehavior;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProviders;

import io.reactivex.observers.DisposableCompletableObserver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.example.healtheye.R;
import com.ramotion.fluidslider.FluidSlider;

import java.util.List;

public class displayFoodActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private String ndb;
    private String my_api_key = "f5lCyD2qbPcqB5qAtJWrD3ThpoFNKrRnRTRcAViO";
    private FoodReport FoodResultReport;
    private SharedPreferences sp;
    private String email;
    private LinearLayout bottomSheetLayout;
    private LinearLayout gestureLayout;
    private BottomSheetBehavior bottomSheetBehavior;
    private ImageView bottomSheetArrowImageView;
    private Button submitButton, cancelButton;
    private FluidSlider quantitySlider;
    private String quantity;
    private DietViewModel dietViewModel;
    private int totalCalorie = 0;
    private TextView calorieTextView;
    private boolean isHighFat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sp = getSharedPreferences("setting",MODE_PRIVATE);
        email = sp.getString("email", null);
        dietViewModel = ViewModelProviders.of(this).get(DietViewModel.class);
        //Pass in ndb
        Intent intent = getIntent();
        ndb = intent.getStringExtra("ndb");
        Log.d("Intent", "ndb number is: "+ndb);
        setContentView(R.layout.activity_display_food);
        //Set up Retrofit;
        Retrofit retrofit = new Retrofit.Builder().
                baseUrl("https://api.nal.usda.gov/ndb/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        final USDAFoodAPI usdaFoodReportApi = retrofit.create(USDAFoodAPI.class);
        //fetch Food Report;
        fetchFoodReport(usdaFoodReportApi, ndb);
        Log.d("USDA", "fetchFOodReport Executed");
        //Find Components:
        bottomSheetLayout = findViewById(R.id.bottomSheet_displayFoodActivity_layout);
        bottomSheetBehavior = BottomSheetBehavior.from(bottomSheetLayout);
        gestureLayout = findViewById(R.id.gesture_layout_displayFood);
        bottomSheetArrowImageView = findViewById(R.id.bottom_sheet_arrow_displayFood);
        cancelButton = findViewById(R.id.button_cancel_bottonSheet_displayFood);
        submitButton = findViewById(R.id.button_submit_bottonSheet_displayFood);
        quantitySlider = findViewById(R.id.fluidSlider_displayFood);
        calorieTextView = findViewById(R.id.textView_totalCalorie_bottomSheetDisplayFood);

        //BottomSheet Properties:
        ViewTreeObserver vto = gestureLayout.getViewTreeObserver();
        vto.addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT < Build.VERSION_CODES.JELLY_BEAN) {
                    gestureLayout.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                } else {
                    gestureLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                //                int width = bottomSheetLayout.getMeasuredWidth();
                int height = gestureLayout.getMeasuredHeight();

                bottomSheetBehavior.setPeekHeight(height);
            }
        });
        bottomSheetBehavior.setHideable(false);
        bottomSheetBehavior.setBottomSheetCallback(
                new BottomSheetBehavior.BottomSheetCallback() {
                    @Override
                    public void onStateChanged(@NonNull View bottomSheet, int newState) {
                        switch (newState) {
                            case BottomSheetBehavior.STATE_HIDDEN:
                                break;
                            case BottomSheetBehavior.STATE_EXPANDED:
                            {
                                bottomSheetArrowImageView.setImageResource(R.drawable.icn_chevron_down);
                            }
                            break;
                            case BottomSheetBehavior.STATE_COLLAPSED:
                            {
                                bottomSheetArrowImageView.setImageResource(R.drawable.icn_chevron_up);
                            }
                            break;
                            case BottomSheetBehavior.STATE_DRAGGING:
                                break;
                            case BottomSheetBehavior.STATE_SETTLING:
                                bottomSheetArrowImageView.setImageResource(R.drawable.icn_chevron_up);
                                break;
                        }
                    }
                    @Override
                    public void onSlide(@NonNull View bottomSheet, float slideOffset) {}
                });

        //Set up Fluid Slider:
        quantitySlider.setEndText("500");
        quantitySlider.setBubbleText("250");
        quantity = quantitySlider.getBubbleText();
        //calculateTotalCalorie();

        quantitySlider.setPositionListener(pos -> {
            final String value = String.valueOf( (int) (pos * 500));
            Log.d("BubbleText", "pos is: " + pos.toString());
            Log.d("BubbleText", "value is " + value);
            quantitySlider.setBubbleText(value);
            return Unit.INSTANCE;
        });
        quantitySlider.setEndTrackingListener(new Function0<Unit>() {
            @Override
            public Unit invoke() {
                quantity = String.valueOf((int) (quantitySlider.getPosition() * 500));
                calculateTotalCalorie();
                calorieTextView.setText( String.format(" %d kCal", totalCalorie));
                Log.d("quantity", "quantity: " + quantity);
                return null;
            }
        });
        //Set up Button onClick Listeners:
        if (quantity != null){
            submitButton.setOnClickListener(v -> {
                String foodName = FoodResultReport.getFoods().get(0)
                        .getFood().getDesc().getName();
                Float foodQuantity = Float.parseFloat(quantity);
                List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutrientList = FoodResultReport.getFoods()
                        .get(0).getFood().getNutrients();
                Diet newDiet = new Diet(email, ndb, foodName,foodQuantity,nutrientList);
                dietViewModel.insert(newDiet).subscribe(new DisposableCompletableObserver() {
                    @Override
                    public void onComplete() {
                        Log.d("SQLite diet", "new Diet inserted in SQLite");
                        Toast.makeText(displayFoodActivity.this, "new Diet Inserted", Toast.LENGTH_SHORT).show();
                        Intent backUserMainIntentSumbit = new Intent(displayFoodActivity.this, UserMainActivity.class);
                        startActivity(backUserMainIntentSumbit);
                    }

                    @Override
                    public void onError(Throwable e) {
                        Log.d("SQLite diet", "new Diet insertion failed");
                    }
                });
            });
        }
        cancelButton.setOnClickListener(v -> {
            Intent backUserMainIntentCancel = new Intent(displayFoodActivity.this, UserMainActivity.class);
            startActivity(backUserMainIntentCancel);
        });

    }

    public void fetchFoodReport(USDAFoodAPI api, final String myndb){
        Call<FoodReport> foodReport = api.getReport(myndb, my_api_key);
        foodReport.enqueue(new Callback<FoodReport>() {
            @Override
            public void onResponse(Call<FoodReport> call, Response<FoodReport> response) {
                //TODO Complete onResponse
                if (! response.isSuccessful()){
                    Toast.makeText(displayFoodActivity.this, "Code" + response.code(),
                            Toast.LENGTH_SHORT).show();
                }
                displayFoodActivity.this.FoodResultReport = response.body();
                Log.d("USDA Report","FoodResultReport Set");
                Log.d("USDA Report", "Report Contains" + FoodResultReport.getCount());
                //Attach Fragement;
                FragmentManager fragmentManager = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                piechartFragment piechartFragment = new piechartFragment();
                fragmentTransaction.add(R.id.linearLayout_CPFpiechart_displayFood, piechartFragment);
                fragmentTransaction.commit();
                Log.d("Frag Piechart", "Piechart added");
            }

            @Override
            public void onFailure(Call<FoodReport> call, Throwable t) {
                Toast.makeText(displayFoodActivity.this, t.getMessage(),
                        Toast.LENGTH_SHORT).show();
                Log.d("Retrofit", "Food Report Search Failed");
            }
        });
    }

    public FoodReport getFoodResultReport(){
        return FoodResultReport;
    }

    public void setWarning(){
        isHighFat = true;
    }
    public void calculateTotalCalorie(){
        float quantityFloat = Float.parseFloat(quantity);
        float quantityFloatNormalied = quantityFloat/100;
        for (FoodReport.FoodsBean.FoodBean.NutrientsBean bean : FoodResultReport
                .getFoods().get(0).getFood().getNutrients()){
            if (bean.getName().trim().equals("Energy")){
                float valueFloat = Float.parseFloat(bean.getValue());
                totalCalorie = Math.round(quantityFloatNormalied * valueFloat);
            }
            else{
            }
        }
    }

}
