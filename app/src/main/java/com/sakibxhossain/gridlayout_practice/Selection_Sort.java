package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Selection_Sort extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count;

    //Code section textViews
    TextView selection_25,selection_26,selection_27,selection_28,selection_29,selection_30,selection_31;
    //Code section textViews

    //track array operations
      int count = -1;
    //track array operations

    //Tracking operations
      int back_track = 0;
      int forward_track = 0;
    //Tracking operations

    //counting algo operations
      int algo_operations = 1;
    //counting algo operations

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sort);
        //Handler Hooks
           //Button
             back_btn = findViewById(R.id.handler_back_button);
             forward_btn = findViewById(R.id.handler_forward_button);
           //Button
           //TextView
             initial_Count = findViewById(R.id.initial_step);
             final_Count = findViewById(R.id.maximum_step);
           //TextView
        //Handler Hooks


        //code section TextViews
        selection_25 = findViewById(R.id.Selection_line_25);
        selection_26 = findViewById(R.id.Selection_line_26);
        selection_27 = findViewById(R.id.Selection_line_27);
        selection_28 = findViewById(R.id.Selection_line_28);
        selection_29 = findViewById(R.id.Selection_line_29);
        selection_30 = findViewById(R.id.Selection_line_30);
        selection_31 = findViewById(R.id.Selection_line_31);
        //code section Textviews

        TextView[] list_of_views = {selection_25,selection_26,selection_27,selection_28,selection_29,selection_30,selection_31};

        //list_of_views[count].setBackgroundColor(getColor(R.color.completeTransparent));

        //Analysis operations
          //back operations
            back_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(count > 0){
                        count--;
                        back_track = count + 1;
                        initial_Count.setText(String.valueOf(count+algo_operations));
                        list_of_views[count].setBackgroundColor(getColor(R.color.transparentWhite));
                        list_of_views[back_track].setBackgroundColor(getColor(R.color.completeTransparent));
                    }else if(count==0){
                        list_of_views[back_track].setBackgroundColor(getColor(R.color.completeTransparent));
                    }
                }
            });
          //back operations

          //forward operations
             forward_btn.setOnClickListener(new View.OnClickListener() {
                 @Override
                 public void onClick(View view) {
                     //list_of_views[count].setBackgroundColor(getColor(R.color.completeTransparent));

                     if(count < list_of_views.length - 1){
                         count++;
                         if(count==0){
                             list_of_views[count].setBackgroundColor(getColor(R.color.transparentWhite));
                         }else {
                             forward_track = count - 1;
                             //initial_Count.setText(String.valueOf(count));
                             list_of_views[forward_track].setBackgroundColor(getColor(R.color.completeTransparent));
                             list_of_views[count].setBackgroundColor(getColor(R.color.transparentWhite));
                         }
                         initial_Count.setText(String.valueOf(count+algo_operations));
                     }
                 }
             });
          //forward operations
        //Analysis operations

        analysis_back_btn = findViewById(R.id.selection_sort_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack = new Intent(Selection_Sort.this, Sorting_Description_Section.class);
                startActivity(goBack);
            }
        });
    }
}