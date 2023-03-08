package com.sakibxhossain.gridlayout_practice.helper;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import androidx.cardview.widget.CardView;

import com.sakibxhossain.gridlayout_practice.R;

import java.util.Objects;

public class Tree_Adapter extends BaseAdapter {
    Context context;
    String[] sorting_algo_title;
    String[] sorting_algo_difficulty;
    Tree_ClickListener tree_clickListener;

    public Tree_Adapter(Context context, String[] sorting_algo_title, String[] sorting_algo_difficulty, Tree_ClickListener tree_clickListener) {
        this.context = context;
        this.sorting_algo_title = sorting_algo_title;
        this.sorting_algo_difficulty = sorting_algo_difficulty;
        this.tree_clickListener = tree_clickListener;
    }


    @Override
    public int getCount() {
        return sorting_algo_difficulty.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {

        if(view == null){
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.sorting_algorithm_items,null);
        }

        TextView algo_title_container = view.findViewById(R.id.sorting_algo_Title);
        TextView algo_difficulty_container = view.findViewById(R.id.sorting_algo_difficulty);
        CardView sorting_algo_cardView_container = view.findViewById(R.id.sorting_section_cardView);

        algo_title_container.setText(sorting_algo_title[position]);
        algo_difficulty_container.setText(sorting_algo_difficulty[position]);


        if (Objects.equals(sorting_algo_difficulty[position], "Hard")) {
            algo_difficulty_container.setTextColor(Color.parseColor("#E91E63"));
        }else if(Objects.equals(sorting_algo_difficulty[position], "Medium")){
            algo_difficulty_container.setTextColor(Color.parseColor("#AA00FF"));
        }

        sorting_algo_cardView_container.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tree_clickListener.onItemClicked(position);
            }
        });

        return view;
    }
}
