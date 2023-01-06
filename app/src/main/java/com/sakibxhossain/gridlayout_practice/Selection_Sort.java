package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.opengl.Visibility;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
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
    TextView selection_27 ,selection_28
            , selection_03, selection_29
            , selection_04, selection_05
            , selection_06, selection_07
            , selection_08,selection_09
            , selection_10, selection_11
            , selection_12, selection_13
            , selection_14, selection_15
            , selection_16, selection_17
            , selection_18, selection_19
            , selection_20,selection_30
            , selection_24, selection_25
            , selection_26, selection_31
            , selection_32, selection_33
            , selection_34;
    //Code section textViews

    //main method
       LinearLayout layoutMainExecuted, layoutMainVariable, arrayMainExecuted;
       TextView arr_index_0, arr_index_1, arr_index_2, arr_index_3, arr_index_4;
    //main method

    //sort method
      LinearLayout sortMethodExecuted, sortMethodVariable, sortMethodSwapOperation;
      TextView sortMethodVariable_n, sortMethodVariable_n_value
              , sortMethodVariable_i, sortMethodVariable_i_value
              , sortMethodVariable_minIdx, sortMethodVariable_minIdx_value
              , sortMethodVariable_j, sortMethodVariable_j_value;
      //swap
      TextView sortMethodVariable_Temp_value, sortMethodVariable_Temp
              , sortMethodVariable_arr_minIdx, sortMethodVariable_arr_minIdx_value
              , sortMethodVariable_arr_i, sortMethodVariable_arr_i_value;
    //sort method

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

        //main method variable hooks
         //layout
           layoutMainExecuted = findViewById(R.id.layout_main_executed);
           layoutMainVariable = findViewById(R.id.layout_main_variables);
           arrayMainExecuted = findViewById(R.id.array_main_executed);
         //layout

         //TextView
           arr_index_0 = findViewById(R.id.index_0);
           arr_index_1 = findViewById(R.id.index_1);
           arr_index_2 = findViewById(R.id.index_2);
           arr_index_3 = findViewById(R.id.index_3);
           arr_index_4 = findViewById(R.id.index_4);
         //TextView
        //main method variable hooks

        //sort method variable hooks
          //layout
          sortMethodExecuted = findViewById(R.id.sort_method_executed);
          sortMethodVariable = findViewById(R.id.sort_method_variables);
          sortMethodSwapOperation = findViewById(R.id.sort_method_swap_operation);
          //layout

          //TextView
          sortMethodVariable_n = findViewById(R.id.sort_method_variable_n);
          sortMethodVariable_n_value = findViewById(R.id.sort_method_variable_n_value);
          sortMethodVariable_i = findViewById(R.id.sort_method_variable_i);
          sortMethodVariable_i_value = findViewById(R.id.sort_method_variable_i_value);
          sortMethodVariable_minIdx = findViewById(R.id.sort_method_variable_minIndex);
          sortMethodVariable_minIdx_value = findViewById(R.id.sort_method_variable_minIndex_value);
          sortMethodVariable_j = findViewById(R.id.sort_method_variable_j);
          sortMethodVariable_j_value = findViewById(R.id.sort_method_variable_j_value);
            //swap operations variables
          sortMethodVariable_Temp = findViewById(R.id.sort_method_variable_temp);
          sortMethodVariable_Temp_value = findViewById(R.id.sort_method_variable_temp_value);
          sortMethodVariable_arr_minIdx = findViewById(R.id.sort_method_variable_arr_minIdx);
          sortMethodVariable_arr_minIdx_value = findViewById(R.id.sort_method_variable_arr_minIdx_value);
          sortMethodVariable_arr_i_value = findViewById(R.id.sort_method_variable_arr_i_value);
          sortMethodVariable_arr_i = findViewById(R.id.sort_method_variable_arr_i);
          //TextView

          //
        //sort method variable hooks

        //Array will be displayed
        print_sorted_array = findViewById(R.id.print_sorted_array);

        //code section TextViews
        selection_27 = findViewById(R.id.Selection_line_27);
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
        selection_34 = findViewById(R.id.Selection_line_34);
        //code section Textviews

        TextView[] list_of_views = {
                  selection_27,
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
                , selection_34
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
                        if(count == 77){
                            print_sorted_array.setVisibility(View.INVISIBLE);
                        }else if(count == 0){
                            layoutMainExecuted.setVisibility(View.INVISIBLE);
                            layoutMainVariable.setVisibility(View.INVISIBLE);
                        }else if(count == 1){
                            arrayMainExecuted.setVisibility(View.INVISIBLE);
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
                             if(count == 78){
                                 print_sorted_array.setVisibility(View.VISIBLE);
                             }else if(count == 79){
                                 Toast.makeText(Selection_Sort.this,"Program Terminated", Toast.LENGTH_SHORT).show();
                             }else if(count == 1){
                                 layoutMainExecuted.setVisibility(View.VISIBLE);
                                 layoutMainVariable.setVisibility(View.VISIBLE);
                             }else if(count == 2){
                                 arr_index_0.setText(String.valueOf(4));
                                 arr_index_1.setText(String.valueOf(8));
                                 arr_index_2.setText(String.valueOf(2));
                                 arr_index_3.setText(String.valueOf(9));
                                 arr_index_4.setText(String.valueOf(5));
                                 arrayMainExecuted.setVisibility(View.VISIBLE);
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