package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Insertion_Sort_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView insertion_15 ,insertion_16
            , insertion_17, insertion_03
            , selection_04, insertion_05
            , insertion_06, insertion_07
            , insertion_08, insertion_12
            , insertion_10, insertion_13
            , insertion_14, insertion_18
            , insertion_19, insertion_09;

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

    // array elements to be visualize
    ImageView img1, img2, img3, img4, img5;
    // array elements to be visualize


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort_visualization);

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

        //Print array
        print_array = findViewById(R.id.print_sorted_array);
        //Print array

        //back btn
        analysis_back_btn = findViewById(R.id.insertion_sort_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Insertion_Sort_Visualization.this,Insertion_Sort_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        insertion_15 = findViewById(R.id.insertion_line_15);
        insertion_16 = findViewById(R.id.insertion_line_16);
        insertion_17 = findViewById(R.id.insertion_line_17);
        insertion_03 = findViewById(R.id.insertion_line_03);
        selection_04 = findViewById(R.id.insertion_line_04);
        insertion_05 = findViewById(R.id.insertion_line_05);
        insertion_06 = findViewById(R.id.insertion_line_06);
        insertion_07 = findViewById(R.id.insertion_line_07);
        insertion_08 = findViewById(R.id.insertion_line_08);
        insertion_12 = findViewById(R.id.insertion_line_12);
        insertion_10 = findViewById(R.id.insertion_line_10);
        insertion_13 = findViewById(R.id.insertion_line_13);
        insertion_14 = findViewById(R.id.insertion_line_14);
        insertion_18 = findViewById(R.id.insertion_line_18);
        insertion_19 = findViewById(R.id.insertion_line_19);
        insertion_09 = findViewById(R.id.insertion_line_09);

        TextView[] list_of_views = {
                insertion_15 ,insertion_16
                , insertion_17, insertion_03
                , selection_04, insertion_05
                , insertion_06, insertion_07
                , insertion_08, insertion_12
                , insertion_05, insertion_06
                , insertion_07, insertion_08
                , insertion_09, insertion_10
                , insertion_08, insertion_12
                , insertion_05, insertion_06
                , insertion_07, insertion_08
                , insertion_12, insertion_05
                , insertion_06, insertion_07
                , insertion_08, insertion_09
                , insertion_10, insertion_08
                , insertion_09, insertion_10
                , insertion_08, insertion_09
                , insertion_10, insertion_08
                , insertion_09, insertion_10
                , insertion_08, insertion_12
                , insertion_05, insertion_14
                , insertion_18, insertion_19
        };

        final_Count.setText(String.valueOf(list_of_views.length));
        //list_of_views[count].setBackgroundColor(getColor(R.color.completeTransparent));

        //Visualization operations
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
        //Visualization operations
    }
}