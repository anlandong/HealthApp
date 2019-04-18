package com.example.healtheye.View.Adapters;

import android.content.Context;
import android.util.Log;
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
    private static Context context;
    private static FoodSearch foodSearch;
    private static List<FoodSearch.ListBean.ItemBean> foodItemList = new ArrayList<>();
    public searchFoodRecycAdapter(FoodSearch foodSearch, Context context){
        this.foodSearch = foodSearch;
        this.context = context;
    }

    @NonNull
    @Override
    public FoodItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.searchfood_item,parent,false);
        return new FoodItemHolder(itemView);
    }
    //ToDo Fix the Method with newly updated Java Converter;
    @Override
    public void onBindViewHolder(@NonNull FoodItemHolder holder, int position) {
        holder.textViewFoodName.setText(foodItemList.get(position).getName());
        holder.textViewBrand.setText(foodItemList.get(position).getManu());
        //ToDo Set Image Via Database;
    }

    @Override
    public int getItemCount() {
        if (foodItemList != null){
            return foodItemList.size();
        }
        else {
            return 0;
        }
    }

    public void setFoodSearch(FoodSearch searchResult){
        if (null != searchResult.getList()){
            Log.d("adapter", "length is: " + searchResult.getList().getItem().size());
            this.foodItemList.clear();
            this.foodItemList.addAll(searchResult.getList().getItem());
            Log.d("foodItemList", "FoodItemList length is: "+foodItemList.size());
            Log.d("Response", "Response is: "+searchResult.getList().getItem().getClass());
        }


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
