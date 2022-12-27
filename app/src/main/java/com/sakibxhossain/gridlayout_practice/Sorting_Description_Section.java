package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Sorting_Description_Section extends AppCompatActivity {

    Button analysis_btn, visualization_btn;
    ImageView selection_Sort_BackBtn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorting_description_section);

        analysis_btn = findViewById(R.id.analysis);
        visualization_btn = findViewById(R.id.visualization);
        selection_Sort_BackBtn = findViewById(R.id.sorting_description_back_btn);

        selection_Sort_BackBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goto_sorting_section = new Intent(Sorting_Description_Section.this, Sorting.class);
                startActivity(goto_sorting_section);
            }
        });

        analysis_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selection_visual = new Intent(Sorting_Description_Section.this, Selection_Sort_Visualizer_Analysis.class);
                startActivity(selection_visual);
            }
        });

        visualization_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent selection_visual = new Intent(Sorting_Description_Section.this, Selection_Sort_Visualizer_Analysis.class);
                startActivity(selection_visual);
            }
        });
    }
}