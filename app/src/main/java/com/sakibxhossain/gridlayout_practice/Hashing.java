package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Hashing_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Hashing_ClickListener;


public class Hashing extends AppCompatActivity {

    String[] algo_title = {
            "Separate Chaining"
    };

    String[] algo_difficulty = {
            "Hard"
    };


    ImageView text_ber_back_button;
    GridView hashing_gridview;
    Hashing_Adapter hashing_adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hashing);

        text_ber_back_button = findViewById(R.id.hashing_bar_button);
        hashing_gridview = findViewById(R.id.hashing_Section_gridView);


        hashing_adapter = new Hashing_Adapter(this, algo_title, algo_difficulty, new Hashing_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent btt = new Intent(Hashing.this, Separate_Chaining_Description.class);
                        startActivity(btt);
                        break;
                    case 1:
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });

        hashing_gridview.setAdapter(hashing_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Hashing.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

    }
}