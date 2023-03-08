package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Dynamic_ClickListener;
import com.sakibxhossain.gridlayout_practice.helper.Greedy_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Greedy_ClickListener;

public class Dynamic extends AppCompatActivity {

    String[] algo_title = {
            "Longest Common Subsequence"
    };

    String[] algo_difficulty = {
            "Medium"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Dynamic_Adapter dynamic_adapter;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);

        text_ber_back_button = findViewById(R.id.dynamic_bar_button);
        sorting_gridview = findViewById(R.id.dynamic_Section_gridView);


        dynamic_adapter = new Dynamic_Adapter(this, algo_title, algo_difficulty, new Dynamic_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent btt = new Intent(Dynamic.this, Longest_Common_Subsequence_Description.class);
                        startActivity(btt);
                        break;
                    case 1:
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        sorting_gridview.setAdapter(dynamic_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Dynamic.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}