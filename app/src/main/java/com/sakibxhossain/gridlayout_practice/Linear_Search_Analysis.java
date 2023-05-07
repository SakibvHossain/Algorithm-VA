package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Linear_Search_Analysis extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView linear_3, linear_4
            , linear_5, linear_6
            , linear_7, linear_12
            , linear_13, linear_14
            , linear_15, linear_17
            , linear_18, linear_19;

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


    //main method

    LinearLayout layout_main_executed, layout_main_variables;
    // array section
    LinearLayout array_main_executed;
    TextView index_0, index_1, index_2, index_3, index_4;
    // main x
    LinearLayout main_method_variable_x_executed;
    TextView main_method_variable_x_executed_value;
    // main result
    LinearLayout main_method_variable_result_executed;
    TextView main_method_variable_result_value;
    //main method

    //search
    LinearLayout search_method_executed, search_method_variables_executed;

    // search i
    LinearLayout search_method_variable_i;
        TextView search_method_variable_i_value;
    // search N
    LinearLayout search_method_variable_n;
    TextView search_method_variable_n_value;

    int[] arr = { 8, 2, 5, 9, 1 };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search_analysis);


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
        print_array = findViewById(R.id.print_insertion_sorted_array);
        //Print array

        //main section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);

        array_main_executed = findViewById(R.id.array_main_executed);
        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);

        main_method_variable_x_executed = findViewById(R.id.main_method_variable_x_executed);
        main_method_variable_x_executed_value = findViewById(R.id.sort_method_variable_x_value);

        main_method_variable_result_executed = findViewById(R.id.main_method_variable_result_executed);
        main_method_variable_result_value = findViewById(R.id.main_method_variable_result_value);

        search_method_executed = findViewById(R.id.search_method_executed);
        search_method_variables_executed = findViewById(R.id.search_method_variables_executed);

        search_method_variable_i = findViewById(R.id.search_method_variable_i);
        search_method_variable_i_value = findViewById(R.id.search_method_variable_i_value);

        search_method_variable_n = findViewById(R.id.search_method_variable_n);
        search_method_variable_n_value = findViewById(R.id.search_method_variable_n_value);



        //back btn
        analysis_back_btn = findViewById(R.id.linear_search_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Linear_Search_Analysis.this,Linear_Search_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        linear_3 = findViewById(R.id.linear_03);
        linear_4 = findViewById(R.id.linear_04);
        linear_5 = findViewById(R.id.linear_05);
        linear_6 = findViewById(R.id.linear_06);
        linear_7 = findViewById(R.id.linear_07);
        linear_12 = findViewById(R.id.linear_12);
        linear_13 = findViewById(R.id.linear_13);
        linear_14 = findViewById(R.id.linear_14);
        linear_15 = findViewById(R.id.linear_15);
        linear_17 = findViewById(R.id.linear_17);
        linear_18 = findViewById(R.id.linear_18);
        linear_19 = findViewById(R.id.linear_19);

        TextView[] list_of_views = {
                linear_12, linear_13
                , linear_14, linear_3
                , linear_4, linear_5
                , linear_6, linear_5
                , linear_6, linear_5
                , linear_6, linear_5
                , linear_6, linear_7
                , linear_14, linear_15
                , linear_17, linear_18
                , linear_19
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

                    if(count == 0){
                        layout_main_executed.setVisibility(View.GONE);
                        layout_main_variables.setVisibility(View.GONE);
                        array_main_executed.setVisibility(View.GONE);
                    }else if(count == 1){
                        main_method_variable_x_executed.setVisibility(View.GONE);
                    }else if(count == 3){
                        search_method_executed.setVisibility(View.GONE);
                        search_method_variables_executed.setVisibility(View.GONE);
                    }else if(count == 4){
                        search_method_variable_n.setVisibility(View.GONE);
                    }else if(count == 5){
                        search_method_variable_i.setVisibility(View.GONE);
                    }else if(count == 7){
                        search_method_variable_i_value.setText("0");
                    }else if(count == 9){
                        search_method_variable_i_value.setText("1");
                    }else if(count == 11){
                        search_method_variable_i_value.setText("2");
                    }else if(count == 13){
                        search_method_executed.setVisibility(View.VISIBLE);
                        search_method_variables_executed.setVisibility(View.VISIBLE);
                    }else if(count == 14){
                        main_method_variable_result_executed.setVisibility(View.GONE);
                    }else if(count == 17){
                        print_array.setVisibility(View.GONE);
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
                        if(count == 1){
                            layout_main_executed.setVisibility(View.VISIBLE);
                            layout_main_variables.setVisibility(View.VISIBLE);
                            array_main_executed.setVisibility(View.VISIBLE);
                            index_0.setText(String.valueOf(arr[0]));
                            index_1.setText(String.valueOf(arr[1]));
                            index_2.setText(String.valueOf(arr[2]));
                            index_3.setText(String.valueOf(arr[3]));
                            index_4.setText(String.valueOf(arr[4]));
                        }else if(count == 2){
                            main_method_variable_x_executed.setVisibility(View.VISIBLE);
                            main_method_variable_x_executed_value.setText(String.valueOf(9));
                        }else if(count == 4){
                            search_method_executed.setVisibility(View.VISIBLE);
                            search_method_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 5){
                            search_method_variable_n.setVisibility(View.VISIBLE);
                            search_method_variable_n_value.setText(String.valueOf(arr.length));
                        }else if(count == 6){
                            search_method_variable_i.setVisibility(View.VISIBLE);
                            search_method_variable_i_value.setText("0");
                        }else if(count == 8){
                            search_method_variable_i_value.setText("1");
                        }else if(count == 10){
                            search_method_variable_i_value.setText("2");
                        }else if(count == 12){
                            search_method_variable_i_value.setText("3");
                        }else if(count == 14){
                            search_method_executed.setVisibility(View.GONE);
                            search_method_variables_executed.setVisibility(View.GONE);
                        }else if(count == 15){
                            main_method_variable_result_executed.setVisibility(View.VISIBLE);
                            main_method_variable_result_value.setText("3");
                        }else if(count == 18){
                            print_array.setVisibility(View.VISIBLE);
                            print_array.setText(R.string.found);
                        }
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