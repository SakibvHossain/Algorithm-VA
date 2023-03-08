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
import com.sakibxhossain.gridlayout_practice.helper.Strings_Algo_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Strings_Algo_ClickListener;

public class Strings_Algo extends AppCompatActivity {

    String[] algo_title = {
            "Knuth Morris Pratt", "Boyer Moore"
    };

    String[] algo_difficulty = {
            "Hard", "Hard"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Strings_Algo_Adapter strings_algo_adapter;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strings_algo);

        text_ber_back_button = findViewById(R.id.strings_bar_button);
        sorting_gridview = findViewById(R.id.strings_Section_gridView);


        strings_algo_adapter = new Strings_Algo_Adapter(this, algo_title, algo_difficulty, new Strings_Algo_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent btt = new Intent(Strings_Algo.this, KMP_Description.class);
                        startActivity(btt);
                        break;
                    case 1:
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        sorting_gridview.setAdapter(strings_algo_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Strings_Algo.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}