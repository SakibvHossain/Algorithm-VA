package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Searching_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Searching_ClickListener;

public class Searching extends AppCompatActivity {

    String[] algo_title = {
            "Linear Search", "Binary Search", "Ternary Search"
    };

    String[] algo_difficulty = {
            "Easy", "Easy", "Medium"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Searching_Adapter searching_adapter;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);

        text_ber_back_button = findViewById(R.id.searching_bar_button);
        sorting_gridview = findViewById(R.id.searching_Section_gridView);

        searching_adapter = new Searching_Adapter(this, algo_title, algo_difficulty, new Searching_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent linear = new Intent(Searching.this, Linear_Search_Description.class);
                        startActivity(linear);
                        break;
                    case 1:
                        Intent binary = new Intent(Searching.this, Binary_Search_Description.class);
                        startActivity(binary);
                        break;
                    case 2:
                        Intent ternary = new Intent(Searching.this, Ternary_Search_Description.class);
                        startActivity(ternary);
                        break;
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        sorting_gridview.setAdapter(searching_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Searching.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}