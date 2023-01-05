package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Selection_Sort extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count;

    //Code section textViews
    TextView selection_28, selection_03, selection_29, selection_04, selection_05, selection_06, selection_07, selection_08
            ,selection_09, selection_10, selection_11, selection_12, selection_13, selection_14, selection_15, selection_16,
            selection_17, selection_18, selection_19, selection_20,selection_30, selection_24, selection_25, selection_26, selection_31
            , selection_32, selection_33;
    //Code section textViews

    //
     TextView print_sorted_array;
    //

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


        //Array will be displayed
        print_sorted_array = findViewById(R.id.print_sorted_array);

        //code section TextViews
        selection_28 = findViewById(R.id.Selection_line_28);
        selection_29 = findViewById(R.id.Selection_line_29);
        selection_03 = findViewById(R.id.Selection_line_03);
        selection_04 = findViewById(R.id.Selection_line_04);
        selection_05 = findViewById(R.id.Selection_line_05);
        selection_06 = findViewById(R.id.Selection_line_06);
        selection_07 = findViewById(R.id.Selection_line_07);
        selection_08 = findViewById(R.id.Selection_line_08);
        selection_09 = findViewById(R.id.Selection_line_09);
        selection_10 = findViewById(R.id.Selection_line_10);
        selection_11 = findViewById(R.id.Selection_line_11);
        selection_12 = findViewById(R.id.Selection_line_12);
        selection_13 = findViewById(R.id.Selection_line_13);
        selection_14 = findViewById(R.id.Selection_line_14);
        selection_15 = findViewById(R.id.Selection_line_15);
        selection_16 = findViewById(R.id.Selection_line_16);
        selection_30 = findViewById(R.id.Selection_line_30);
        selection_17 = findViewById(R.id.Selection_line_17);
        selection_18 = findViewById(R.id.Selection_line_18);
        selection_19 = findViewById(R.id.Selection_line_19);
        selection_20 = findViewById(R.id.Selection_line_20);
        selection_24 = findViewById(R.id.Selection_line_24);
        selection_25 = findViewById(R.id.Selection_line_25);
        selection_26 = findViewById(R.id.Selection_line_26);
        selection_31 = findViewById(R.id.Selection_line_31);
        selection_32 = findViewById(R.id.Selection_line_32);
        selection_33 = findViewById(R.id.Selection_line_33);
        //code section Textviews

        TextView[] list_of_views = {
                  selection_28, selection_29, selection_03
                , selection_04, selection_05, selection_06
                , selection_07, selection_08, selection_07
                , selection_08, selection_09, selection_10
                , selection_07, selection_08, selection_07
                , selection_08, selection_11, selection_12
                , selection_13, selection_14, selection_05
                , selection_06, selection_07, selection_08
                , selection_09, selection_10, selection_07
                , selection_08, selection_07, selection_08
                , selection_11, selection_12, selection_13
                , selection_14, selection_05, selection_06
                , selection_07, selection_08, selection_07
                , selection_08, selection_09, selection_10
                , selection_11, selection_12, selection_13
                , selection_14, selection_05, selection_06
                , selection_07, selection_08, selection_09
                , selection_10, selection_11, selection_12
                , selection_13, selection_14, selection_15
                , selection_16, selection_30, selection_17
                , selection_18, selection_19, selection_20
                , selection_24, selection_19, selection_20
                , selection_24, selection_19, selection_20
                , selection_24, selection_19, selection_20
                , selection_24, selection_25, selection_26
                , selection_31, selection_32, selection_33
        };

        final_Count.setText(String.valueOf(list_of_views.length));
        //list_of_views[count].setBackgroundColor(getColor(R.color.completeTransparent));

        //Analysis operations
          //back operations
            back_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if(count > 0){
                        count--;
                        back_track = count + 1;
                        if(count == 75){
                            print_sorted_array.setVisibility(View.INVISIBLE);
                        }
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
                             if(count == 76){
                                 print_sorted_array.setVisibility(View.VISIBLE);
                             }else if(count == 77){
                                 Toast.makeText(Selection_Sort.this,"Program Terminated", Toast.LENGTH_SHORT).show();
                             }
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