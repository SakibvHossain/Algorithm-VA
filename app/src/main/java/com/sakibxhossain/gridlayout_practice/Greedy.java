package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Greedy_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Tree_Adapter;

public class Greedy extends AppCompatActivity {

    String[] algo_title = {
            "Longest Common Subsequence"
    };

    String[] algo_difficulty = {
            "hard"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Greedy_Adapter greedy_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greedy);


    }
}