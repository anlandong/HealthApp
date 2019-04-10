package com.example.healtheye.View.Adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healtheye.Model.FoodSearch;
import com.example.healtheye.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class searchFoodRecycAdapter extends RecyclerView.Adapter<searchFoodRecycAdapter.FoodItemHolder> {
    private List<FoodSearch> foodSearchList = new ArrayList<>();


    @NonNull
    @Override
    public FoodItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.searchfood_item,parent,false);
        return new FoodItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemHolder holder, int position) {
        FoodSearch currentFood = foodSearchList.get(position);
        holder.textViewFoodName.setText(currentFood.getName());
        holder.textViewBrand.setText(currentFood.getManu());
        //ToDo Set Image Via Database;
    }

    @Override
    public int getItemCount() {
        return foodSearchList.size();
    }

    class FoodItemHolder extends RecyclerView.ViewHolder{
        private TextView textViewFoodName;
        private TextView textViewBrand;
        private ImageView imageViewImage;

        public FoodItemHolder(@NonNull View itemView) {
            super(itemView);
            this.textViewFoodName = itemView.findViewById(R.id.textView_foodname);
            this.textViewBrand = itemView.findViewById(R.id.textView_Brand);
            this.imageViewImage = itemView.findViewById(R.id.imageView_foodimage);
        }
    }
}
