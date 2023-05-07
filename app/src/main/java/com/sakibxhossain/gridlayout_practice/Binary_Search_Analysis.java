package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Binary_Search_Analysis extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView binary_3, binary_4
            , binary_5, binary_6
            , binary_7, binary_9
            , binary_10, binary_11
            , binary_14, binary_15
            , binary_25, binary_26
            , binary_27, binary_8, binary_28;

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
    TextView print_binary_sorted_array;

    //main section
    LinearLayout layout_main_executed;
    LinearLayout layout_main_variables;
    LinearLayout array_main_executed;
    TextView index_0, index_1, index_2, index_3, index_4;
    LinearLayout main_method_variable_to_find_executed;
    TextView sort_method_variable_to_find_value;

    //Binary Search
    LinearLayout search_method_executed;
    LinearLayout search_method_variables_executed;
       //lo
    LinearLayout search_method_variable_lo;
    TextView search_method_variable_lo_value;
       //hi
    LinearLayout search_method_variable_hi;
    TextView search_method_variable_hi_value;
       //mid
    LinearLayout search_method_variable_mid;
    TextView search_method_variable_mid_value;

    //array
    public int v[]={1, 3, 4, 5, 6};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_search_analysis);

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

       //Printing result
        print_binary_sorted_array = findViewById(R.id.print_binary_sorted_array);

        // main section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);

        array_main_executed = findViewById(R.id.array_main_executed);

        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);

        main_method_variable_to_find_executed = findViewById(R.id.main_method_variable_to_find_executed);
        sort_method_variable_to_find_value = findViewById(R.id.sort_method_variable_to_find_value);

        //Binary Search Section
        search_method_executed = findViewById(R.id.search_method_executed);
        search_method_variables_executed = findViewById(R.id.search_method_variables_executed);

        search_method_variable_lo = findViewById(R.id.search_method_variable_lo);
        search_method_variable_lo_value = findViewById(R.id.search_method_variable_lo_value);

        search_method_variable_hi = findViewById(R.id.search_method_variable_hi);
        search_method_variable_hi_value = findViewById(R.id.search_method_variable_hi_value);

        search_method_variable_mid = findViewById(R.id.search_method_variable_mid);
        search_method_variable_mid_value = findViewById(R.id.search_method_variable_mid_value);


        //back btn
        analysis_back_btn = findViewById(R.id.binary_search_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Binary_Search_Analysis.this, Binary_Search_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        binary_3 = findViewById(R.id.binary_03);
        binary_4 = findViewById(R.id.binary_04);
        binary_5 = findViewById(R.id.binary_05);
        binary_6 = findViewById(R.id.binary_06);
        binary_7 = findViewById(R.id.binary_07);
        binary_9 = findViewById(R.id.binary_09);
        binary_8 = findViewById(R.id.binary_08);
        binary_10 = findViewById(R.id.binary_10);
        binary_11 = findViewById(R.id.binary_11);
        binary_14 = findViewById(R.id.binary_14);
        binary_15 = findViewById(R.id.binary_15);
        binary_25 = findViewById(R.id.binary_25);
        binary_26 = findViewById(R.id.binary_26);
        binary_27 = findViewById(R.id.binary_27);
        binary_28 = findViewById(R.id.binary_28);

        TextView[] list_of_views = {
                binary_25, binary_26
                , binary_27, binary_3
                , binary_4, binary_5
                , binary_6, binary_7
                , binary_10, binary_11
                , binary_5, binary_6
                , binary_7, binary_8
                , binary_9, binary_5
                , binary_14, binary_15, binary_28
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
                        main_method_variable_to_find_executed.setVisibility(View.GONE);
                    }else if(count == 3){
                        search_method_executed.setVisibility(View.GONE);
                        search_method_variables_executed.setVisibility(View.GONE);
                    }else if(count == 4){
                        search_method_variable_lo.setVisibility(View.GONE);
                        search_method_variable_hi.setVisibility(View.GONE);
                    }else if(count == 6){
                        search_method_variable_mid.setVisibility(View.GONE);
                    }else if(count == 9){
                        search_method_variable_hi_value.setText("4");
                    }else if(count == 11){
                        search_method_variable_mid_value.setText("2");
                    }else if(count == 13){
                        search_method_variable_lo_value.setText("0");
                    }else if(count == 17){
                        print_binary_sorted_array.setVisibility(View.INVISIBLE);
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
                            index_0.setText(String.valueOf(v[0]));
                            index_1.setText(String.valueOf(v[1]));
                            index_2.setText(String.valueOf(v[2]));
                            index_3.setText(String.valueOf(v[3]));
                            index_4.setText(String.valueOf(v[4]));
                        }else if(count == 2){
                            main_method_variable_to_find_executed.setVisibility(View.VISIBLE);
                            sort_method_variable_to_find_value.setText("4");
                        }else if(count == 4){
                            search_method_executed.setVisibility(View.VISIBLE);
                            search_method_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 5){
                            search_method_variable_lo.setVisibility(View.VISIBLE);
                            search_method_variable_hi.setVisibility(View.VISIBLE);
                            search_method_variable_lo_value.setText("0");
                            search_method_variable_hi_value.setText("4");
                        }else if(count == 7){
                            search_method_variable_mid.setVisibility(View.VISIBLE);
                            search_method_variable_mid_value.setText("2");
                        }else if(count == 10){
                            search_method_variable_hi_value.setText("2");
                        }else if(count == 12){
                            search_method_variable_mid_value.setText("1");
                        }else if(count == 14){
                            search_method_variable_lo_value.setText("2");
                        }else if(count == 18){
                            print_binary_sorted_array.setVisibility(View.VISIBLE);
                            print_binary_sorted_array.setText(R.string.found_value_lo);
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