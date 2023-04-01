package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Marge_Sort_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView marge_3, marge_4
            , marge_5, marge_6
            , marge_7, marge_8
            , marge_9, marge_10
            , marge_13, marge_14
            , marge_16, marge_17
            , marge_19, marge_20
            , marge_21, marge_22
            , marge_24, marge_25
            , marge_26, marge_27
            , marge_28, marge_30
            , marge_31, marge_32
            , marge_33, marge_34;

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

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marge_sort_visualization);

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
        analysis_back_btn = findViewById(R.id.marge_sort_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Marge_Sort_Visualization.this,Marge_Sort_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        marge_3 = findViewById(R.id.marge_line_03);
        marge_4 = findViewById(R.id.marge_line_04);
        marge_5 = findViewById(R.id.marge_line_05);
        marge_6 = findViewById(R.id.marge_line_06);
        marge_7 = findViewById(R.id.marge_line_07);
        marge_8 = findViewById(R.id.marge_line_08);
        marge_9 = findViewById(R.id.marge_line_09);
        marge_10 = findViewById(R.id.marge_line_10);
        marge_13 = findViewById(R.id.marge_line_13);
        marge_14 = findViewById(R.id.marge_line_14);
        marge_16 = findViewById(R.id.marge_line_16);
        marge_17 = findViewById(R.id.marge_line_17);
        marge_19 = findViewById(R.id.marge_line_19);
        marge_20 = findViewById(R.id.marge_line_20);
        marge_21 = findViewById(R.id.marge_line_21);
        marge_24 = findViewById(R.id.marge_line_24);
        marge_25 = findViewById(R.id.marge_line_25);
        marge_26 = findViewById(R.id.marge_line_26);
        marge_27 = findViewById(R.id.marge_line_27);
        marge_28 = findViewById(R.id.marge_line_28);
        marge_30 = findViewById(R.id.marge_line_30);
        marge_31 = findViewById(R.id.marge_line_31);
        marge_32 = findViewById(R.id.marge_line_32);
        marge_33 = findViewById(R.id.marge_line_33);
        marge_34 = findViewById(R.id.marge_line_34);

        TextView[] list_of_views = {
                marge_30, marge_31
                , marge_32, marge_20
                , marge_21, marge_24
                , marge_25, marge_21
                , marge_24, marge_25
                , marge_21, marge_22
                , marge_26, marge_21
                , marge_22, marge_27
                , marge_3, marge_4
                , marge_5, marge_6
                , marge_9, marge_10
                , marge_5, marge_13
                , marge_14, marge_13
                , marge_16, marge_17
                , marge_16, marge_17
                , marge_16, marge_19
                , marge_26, marge_21
                ,marge_24, marge_25
                , marge_21, marge_22
                , marge_26, marge_21
                , marge_22, marge_27
                , marge_3, marge_4
                , marge_5, marge_6
                , marge_7, marge_8
                , marge_5, marge_13
                , marge_16, marge_17
                , marge_16, marge_17
                , marge_16, marge_19
                , marge_27, marge_3
                , marge_4, marge_5
                , marge_6, marge_9
                , marge_10, marge_5
                , marge_6, marge_7
                , marge_8, marge_5
                , marge_6, marge_7
                , marge_8, marge_5
                , marge_13, marge_16
                , marge_17, marge_16
                , marge_17, marge_16
                , marge_17, marge_16
                , marge_17, marge_16
                , marge_19, marge_28
                , marge_33, marge_34
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