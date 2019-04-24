package com.example.healtheye.View.Adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.healtheye.Model.Food;
import com.example.healtheye.Model.FoodSearch;
import com.example.healtheye.R;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class searchFoodRecycAdapter extends RecyclerView.Adapter<searchFoodRecycAdapter.FoodItemHolder> {

    public interface onItemClickListener{
        void onItemClick(FoodSearch.ListBean.ItemBean item);
    }

    private static Context context;
    private static FoodSearch foodSearch;
    private final onItemClickListener listner;
    private static List<FoodSearch.ListBean.ItemBean> foodItemList = new ArrayList<>();
    public searchFoodRecycAdapter(FoodSearch foodSearch,
                                  Context context, onItemClickListener listner){
        this.foodSearch = foodSearch;
        this.context = context;
        this.listner = listner;
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
        holder.bind(foodItemList.get(position), listner);
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

        public void bind(final FoodSearch.ListBean.ItemBean item, final onItemClickListener listener){
            textViewFoodName.setText(item.getName());
            textViewBrand.setText((item.getManu()));
            itemView.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}
