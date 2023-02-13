package com.sakibxhossain.gridlayout_practice.helper;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.sakibxhossain.gridlayout_practice.R;

import java.util.Objects;

public class Main_Adapter extends BaseAdapter {
    Context context;
    int[] item_image;
    String[] item_Title;
    String[] item_Difficulty;
    private ClickListener clickListener;

    public Main_Adapter(Context context, int[] item_image, String[] item_Title, String[] item_Difficulty, ClickListener clickListener) {
        this.context = context;
        this.item_image = item_image;
        this.item_Title = item_Title;
        this.item_Difficulty = item_Difficulty;
        this.clickListener = clickListener;
    }

    @Override
    public int getCount() {
        return item_Difficulty.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @SuppressLint("InflateParams")
    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.item,null);
        }

        ImageView item_image_assign = view.findViewById(R.id.item_image);
        TextView item_Title_assign = view.findViewById(R.id.item_name);
        TextView item_difficulty_assign = view.findViewById(R.id.item_difficulty_name);
        CardView cardView = view.findViewById(R.id.cardView);

        item_image_assign.setImageResource(item_image[position]);
        item_Title_assign.setText(item_Title[position]);
        item_difficulty_assign.setText(item_Difficulty[position]);

        if (Objects.equals(item_Difficulty[position], "Hard")) {
            item_difficulty_assign.setTextColor(Color.parseColor("#E91E63"));
        }else if(Objects.equals(item_Difficulty[position], "Medium")){
            item_difficulty_assign.setTextColor(Color.parseColor("#AA00FF"));
        }else{
            item_difficulty_assign.setTextColor(Color.parseColor("#2E7D32"));
        }

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clickListener.onItemClicked(position);
            }
        });

        return view;
    }
}
