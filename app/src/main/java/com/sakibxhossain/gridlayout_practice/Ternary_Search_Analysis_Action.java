package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Ternary_Search_Analysis_Action extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView ternary_3, ternary_4
            , ternary_5, ternary_6
            , ternary_7, ternary_8
            , ternary_10, ternary_13
            , ternary_16, ternary_19
            , ternary_20, ternary_26
            , ternary_27, ternary_28
            , ternary_29, ternary_30;

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

    //Printing result
    TextView print_ternary_sorted_array;
    //main section
    LinearLayout layout_main_variables;
    LinearLayout layout_main_executed;

    LinearLayout array_main_executed;
    TextView index_0,index_1,index_2,index_3,index_4;
    LinearLayout main_method_variable_starting_index_executed;
    TextView sort_method_variable_starting_index_value;
    LinearLayout main_method_variable_ar_length_executed;
    TextView sort_method_variable_ar_length_value;
    LinearLayout main_method_variable_search_for_executed;
    TextView sort_method_variable_search_for_value;
    LinearLayout main_method_variable_result_executed;
    TextView main_method_variable_result_value;

    //Search section
    LinearLayout search_method_executed;
    LinearLayout search_method_variables_executed;

    LinearLayout search_method_variable_mid1;
    TextView search_method_variable_mid1_value;
    LinearLayout search_method_variable_mid2;
    TextView search_method_variable_mid2_value;

    public int arr[] = { 8, 2, 5, 9, 1 };


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternary_search_analysis_action);


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

        //printing result
        print_ternary_sorted_array = findViewById(R.id.print_ternary_sorted_array);

        //main section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);

        array_main_executed = findViewById(R.id.array_main_executed);
        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);

        main_method_variable_starting_index_executed = findViewById(R.id.main_method_variable_starting_index_executed);
        sort_method_variable_starting_index_value = findViewById(R.id.sort_method_variable_starting_index_value);

        main_method_variable_ar_length_executed = findViewById(R.id.main_method_variable_ar_length_executed);
        sort_method_variable_ar_length_value = findViewById(R.id.sort_method_variable_ar_length_value);

        main_method_variable_search_for_executed = findViewById(R.id.main_method_variable_search_for_executed);
        sort_method_variable_search_for_value = findViewById(R.id.sort_method_variable_search_for_value);

        main_method_variable_result_executed = findViewById(R.id.main_method_variable_result_executed);
        main_method_variable_result_value = findViewById(R.id.main_method_variable_result_value);

        //Search section

        search_method_executed = findViewById(R.id.ternary_search_method_executed);
        search_method_variables_executed = findViewById(R.id.ternary_search_method_variables_executed);

        search_method_variable_mid1 = findViewById(R.id.search_method_variable_mid1);
        search_method_variable_mid1_value = findViewById(R.id.search_method_variable_mid1_value);

        search_method_variable_mid2 = findViewById(R.id.search_method_variable_mid2);
        search_method_variable_mid2_value = findViewById(R.id.search_method_variable_mid2_value);

        //back btn
        analysis_back_btn = findViewById(R.id.ternary_search_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Ternary_Search_Analysis_Action.this,Ternary_Search_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        ternary_3 = findViewById(R.id.ternary_03);
        ternary_4 = findViewById(R.id.ternary_04);
        ternary_5 = findViewById(R.id.ternary_05);
        ternary_6 = findViewById(R.id.ternary_06);
        ternary_7 = findViewById(R.id.ternary_07);
        ternary_8 = findViewById(R.id.ternary_08);
        ternary_10 = findViewById(R.id.ternary_10);
        ternary_13 = findViewById(R.id.ternary_13);
        ternary_16 = findViewById(R.id.ternary_16);
        ternary_19 = findViewById(R.id.ternary_19);
        ternary_20 = findViewById(R.id.ternary_20);
        ternary_26 = findViewById(R.id.ternary_26);
        ternary_27 = findViewById(R.id.ternary_27);
        ternary_28 = findViewById(R.id.ternary_28);
        ternary_29 = findViewById(R.id.ternary_29);
        ternary_30 = findViewById(R.id.ternary_30);


        TextView[] list_of_views = {
                ternary_26, ternary_27
                , ternary_28, ternary_3
                , ternary_4, ternary_5
                , ternary_6, ternary_7
                , ternary_10, ternary_13
                , ternary_16, ternary_19
                , ternary_20, ternary_4
                , ternary_5, ternary_6
                , ternary_7, ternary_8
                , ternary_20, ternary_28
                , ternary_29, ternary_30
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
                        layout_main_variables.setVisibility(View.GONE);
                        layout_main_executed.setVisibility(View.GONE);
                        array_main_executed.setVisibility(View.GONE);
                    }else if(count == 1){
                        main_method_variable_starting_index_executed.setVisibility(View.GONE);
                        main_method_variable_ar_length_executed.setVisibility(View.GONE);
                        main_method_variable_search_for_executed.setVisibility(View.GONE);
                    }else if(count == 3){
                        search_method_executed.setVisibility(View.GONE);
                        search_method_variables_executed.setVisibility(View.GONE);
                    }else if(count == 5){
                        search_method_variable_mid1.setVisibility(View.GONE);
                    }else if(count == 6){
                        search_method_variable_mid2.setVisibility(View.GONE);
                    }else if(count == 12){
                        sort_method_variable_ar_length_value.setText(String.valueOf(arr.length - 1));
                        sort_method_variable_starting_index_value.setText("0");
                    }else if(count == 14){
                        search_method_variable_mid1_value.setText("2");
                    }else if(count == 15){
                        search_method_variable_mid2_value.setText("4");
                    }else if(count == 19){
                        main_method_variable_result_executed.setVisibility(View.GONE);
                    }else if(count == 20){
                        print_ternary_sorted_array.setVisibility(View.GONE);
                    }else if(count == 18){
                        search_method_executed.setVisibility(View.VISIBLE);
                        search_method_variables_executed.setVisibility(View.VISIBLE);
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
                        if(count == 1){
                            layout_main_variables.setVisibility(View.VISIBLE);
                            layout_main_executed.setVisibility(View.VISIBLE);
                            array_main_executed.setVisibility(View.VISIBLE);
                            index_0.setText(String.valueOf(arr[0]));
                            index_1.setText(String.valueOf(arr[1]));
                            index_2.setText(String.valueOf(arr[2]));
                            index_3.setText(String.valueOf(arr[3]));
                            index_4.setText(String.valueOf(arr[4]));
                        }else if(count == 2){
                            main_method_variable_starting_index_executed.setVisibility(View.VISIBLE);
                            sort_method_variable_starting_index_value.setText("0");

                            main_method_variable_ar_length_executed.setVisibility(View.VISIBLE);
                            sort_method_variable_ar_length_value.setText(String.valueOf(arr.length - 1));

                            main_method_variable_search_for_executed.setVisibility(View.VISIBLE);
                            sort_method_variable_search_for_value.setText("4");
                        }else if(count == 4){
                            search_method_executed.setVisibility(View.VISIBLE);
                            search_method_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 6){
                            search_method_variable_mid1.setVisibility(View.VISIBLE);
                            search_method_variable_mid1_value.setText("2");
                        }else if(count == 7){
                            search_method_variable_mid2.setVisibility(View.VISIBLE);
                            search_method_variable_mid2_value.setText("4");
                        }else if(count == 13){
                            sort_method_variable_ar_length_value.setText("3");
                            sort_method_variable_starting_index_value.setText("3");
                        }else if(count == 15){
                            search_method_variable_mid1_value.setText("3");
                        }else if(count == 16){
                            search_method_variable_mid2_value.setText("3");
                        }else if(count == 20){
                            main_method_variable_result_executed.setVisibility(View.VISIBLE);
                            main_method_variable_result_value.setText("3");
                        }else if(count == 19){
                            search_method_executed.setVisibility(View.GONE);
                            search_method_variables_executed.setVisibility(View.GONE);
                        }else if(count == 21){
                            print_ternary_sorted_array.setVisibility(View.VISIBLE);
                            print_ternary_sorted_array.setText(R.string.ternary_result);
                        }
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