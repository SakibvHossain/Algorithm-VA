package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Insertion_Sort_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView insertion_27 ,insertion_28
            , insertion_03, insertion_29
            , selection_04, insertion_05
            , insertion_06, insertion_07
            , insertion_08,insertion_09
            , insertion_10, insertion_11
            , insertion_12, insertion_13
            , insertion_14, insertion_15
            , insertion_16, insertion_17
            , selection_18, selection_19
            , selection_20,selection_30
            , selection_24, selection_25
            , selection_26, selection_31
            , selection_32, selection_33
            , selection_34;
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
    }
}