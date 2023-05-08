package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Greedy_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Greedy_ClickListener;

public class Greedy extends AppCompatActivity {

    String[] algo_title = {
            "Huffman Coding"
    };

    String[] algo_difficulty = {
            "Hard"
    };

    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Greedy_Adapter greedy_adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_greedy);

        text_ber_back_button = findViewById(R.id.greedy_bar_button);
        sorting_gridview = findViewById(R.id.greedy_Section_gridView);


        greedy_adapter = new Greedy_Adapter(this, algo_title, algo_difficulty, new Greedy_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent btt = new Intent(Greedy.this, Huffman_Coding_Description.class);
                        startActivity(btt);
                        break;
                    case 1:
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        sorting_gridview.setAdapter(greedy_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Greedy.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }
}