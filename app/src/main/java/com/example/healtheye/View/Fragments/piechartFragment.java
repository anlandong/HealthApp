package com.example.healtheye.View.Fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.healtheye.Model.Retrofit2Model.FoodReport;
import com.example.healtheye.R;
import com.example.healtheye.View.Activities.displayFoodActivity;
import com.github.mikephil.charting.charts.PieChart;
import com.github.mikephil.charting.components.Legend;
import com.github.mikephil.charting.data.PieData;
import com.github.mikephil.charting.data.PieDataSet;
import com.github.mikephil.charting.data.PieEntry;
import com.github.mikephil.charting.formatter.PercentFormatter;
import com.github.mikephil.charting.utils.ColorTemplate;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class piechartFragment extends Fragment {
    private TextView textViewTop;
    private PieChart pieChart;
    private FoodReport foodReport;
    private List<FoodReport.FoodsBean.FoodBean.NutrientsBean> nutritionList = new ArrayList<>();
    private FoodReport.FoodsBean.FoodBean foodItem;
    public static piechartFragment newInstance(){ return new piechartFragment();}


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        Log.d("PieChart", "OnCreateView");
        View v = inflater.inflate(R.layout.fragment_piechart,container,false);
        pieChart = v.findViewById(R.id.chart_pieFragment);
        pieChart.setCenterText("Nutrition Info Per 100g");
        pieChart.setCenterTextColor(getResources().getColor(R.color.colorPrimaryDark));
        pieChart.setCenterTextSize(20);
        pieChart.setEntryLabelColor(Color.DKGRAY);
        pieChart.setUsePercentValues(true);
        Legend pieLegend = pieChart.getLegend();
        pieLegend.setWordWrapEnabled(true);
        pieLegend.setFormSize(12f);
        pieLegend.setXEntrySpace(2f);
        pieLegend.setYEntrySpace(2f);
        displayFoodActivity displayFoodActivity = (displayFoodActivity) getActivity();
        if (displayFoodActivity.getFoodResultReport() != null){
            foodReport = displayFoodActivity.getFoodResultReport();
            List<FoodReport.FoodsBean> foodsBeansList =  foodReport.getFoods();
            foodItem = foodsBeansList.get(0).getFood();
            nutritionList = foodItem.getNutrients();
        }
        Log.d("USDAReport","NutritionList size:" + nutritionList.size());
        return v;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        setCPFPieChart();

    }
    // set the pie chart for Protein Carbohydrate Fat
    public void setCPFPieChart(){
        //Prepare for PieEntry List
        Log.d("setChart","In setCPFPieChart");
        float total = new Float(0);
        float cpfTotal = new Float(0);
        List<PieEntry> entryList = new ArrayList<>();
        for ( FoodReport.FoodsBean.FoodBean.NutrientsBean bean : nutritionList){
            Log.d("1st loop", "Bean name is: " + bean.getName());
            if ( (bean.getName().trim().equals("Protein"))
                || bean.getName().trim().equals("Total lipid (fat)")
                    ||  bean.getName().trim().equals("Carbohydrate, by difference")) {
                entryList.add(new PieEntry(Float.parseFloat(bean.getValue()), bean.getName()));
                total += Float.parseFloat(bean.getValue());
                Log.d("setChart", "in 1st for loop and Name is: " + bean.getName() +
                        " And Total is: " + total);
            }
        }
        Log.d("setChart","CPFEntry List now has " + entryList.size());

        for ( PieEntry entry : entryList){
            entry.setY(entry.getValue()/total);
        }

        for (PieEntry entry : entryList){
            Log.d("set warning", "Label is " + entry.getLabel() + " value is " + entry.getValue());
            if (entry.getLabel().equals("Total lipid (fat)")){
                if (entry.getValue() > 0.3f){
                    Log.d("set warning", "Fat > 30");
                    displayFoodActivity mdisplayFoodActivity = (displayFoodActivity) getActivity();
                    mdisplayFoodActivity.setWarning();
                }
            }
        }


        //Prepare for dataSet
        PieDataSet dataSet = new PieDataSet(entryList, "CPF PieChart");
        dataSet.setSliceSpace(2f);
        dataSet.setSelectionShift(5f);
        List<Integer> colors = new ArrayList<>();
        for (int c : ColorTemplate.VORDIPLOM_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.JOYFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.COLORFUL_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.LIBERTY_COLORS)
            colors.add(c);
        for (int c : ColorTemplate.PASTEL_COLORS)
            colors.add(c);
        colors.add(ColorTemplate.getHoloBlue());
        dataSet.setColors(colors);
        dataSet.setValueLinePart1OffsetPercentage(80.f);
        dataSet.setValueLinePart1Length(0.2f);
        dataSet.setValueLinePart2Length(0.4f);
        dataSet.setYValuePosition(PieDataSet.ValuePosition.OUTSIDE_SLICE);

        PieData data = new PieData(dataSet);
        data.setValueFormatter(new PercentFormatter());
        data.setValueTextSize(11f);
        data.setValueTextColor(Color.BLACK);
        pieChart.setData(data);
        pieChart.highlightValues(null);
        pieChart.invalidate();
    }
}

