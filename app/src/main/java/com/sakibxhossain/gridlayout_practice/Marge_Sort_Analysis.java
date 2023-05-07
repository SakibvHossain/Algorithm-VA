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

import java.util.Arrays;

public class Marge_Sort_Analysis extends AppCompatActivity {

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

    //todo: Printing sorted array
    TextView print_marge_sorted_array;

    //todo: main method section
    LinearLayout layout_main_executed;
    LinearLayout layout_main_variables;

    LinearLayout array_main_executed;
    TextView index_0, index_1, index_2, index_3;

    LinearLayout copy_array_main_executed;
    TextView copy_index_0, copy_index_1, copy_index_2, copy_index_3;

    LinearLayout main_method_variable_high;
    TextView main_method_variable_high_value;

    LinearLayout main_method_variable_low;
    TextView main_method_variable_low_value;

    //todo: Divide method section
    LinearLayout divide_margeSort_method_executed;
    LinearLayout divide_margeSort_variables_executed;

    LinearLayout divide_margeSort_method_variable_mid;
    TextView divide_margeSort_method_variable_mid_value;

    //todo: Conquer method section
    LinearLayout conquer_margeSort_method_executed;
    LinearLayout conquer_margeSort_method_variables_executed;

    LinearLayout conquer_margeSort_method_variable_k;
    TextView conquer_margeSort_method_variable_k_value;

    LinearLayout conquer_margeSort_method_variable_i;
    TextView conquer_margeSort_method_variable_i_value;

    LinearLayout conquer_margeSort_method_variable_j;
    TextView conquer_margeSort_method_variable_j_value;

    public int[] array = {3,4,6,9};


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marge_sort_analysis);

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


        //back btn
        analysis_back_btn = findViewById(R.id.marge_sort_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Marge_Sort_Analysis.this,Marge_Sort_Description.class);
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
        marge_22 = findViewById(R.id.marge_line_22);
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

        //Printing sorted array
        print_marge_sorted_array = findViewById(R.id.print_marge_sorted_array);

        //todo: main method section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);

        array_main_executed = findViewById(R.id.array_main_executed);
        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);

        copy_array_main_executed = findViewById(R.id.copy_array_main_executed);
        copy_index_0 = findViewById(R.id.copy_index_0);
        copy_index_1 = findViewById(R.id.copy_index_1);
        copy_index_2 = findViewById(R.id.copy_index_2);
        copy_index_3 = findViewById(R.id.copy_index_3);

        main_method_variable_high = findViewById(R.id.main_method_variable_high);
        main_method_variable_high_value = findViewById(R.id.main_method_variable_high_value);

        main_method_variable_low = findViewById(R.id.main_method_variable_low);
        main_method_variable_low_value = findViewById(R.id.main_method_variable_low_value);
        //todo: Divide method section
        divide_margeSort_method_executed = findViewById(R.id.divide_margeSort_method_executed);
        divide_margeSort_variables_executed = findViewById(R.id.divide_margeSort_variables_executed);

        divide_margeSort_method_variable_mid = findViewById(R.id.divide_margeSort_method_variable_mid);
        divide_margeSort_method_variable_mid_value = findViewById(R.id.divide_margeSort_method_variable_mid_value);

        //todo: Conquer method section
        conquer_margeSort_method_executed = findViewById(R.id.conquer_margeSort_method_executed);
        conquer_margeSort_method_variables_executed = findViewById(R.id.conquer_margeSort_method_variables_executed);

        conquer_margeSort_method_variable_k = findViewById(R.id.conquer_margeSort_method_variable_k);
        conquer_margeSort_method_variable_k_value = findViewById(R.id.conquer_margeSort_method_variable_k_value);

        conquer_margeSort_method_variable_i = findViewById(R.id.conquer_margeSort_method_variable_i);
        conquer_margeSort_method_variable_i_value = findViewById(R.id.conquer_margeSort_method_variable_i_value);

        conquer_margeSort_method_variable_j = findViewById(R.id.conquer_margeSort_method_variable_j);
        conquer_margeSort_method_variable_j_value = findViewById(R.id.conquer_margeSort_method_variable_j_value);

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
                        copy_array_main_executed.setVisibility(View.GONE);
                    }else if(count == 2){
                        main_method_variable_high.setVisibility(View.GONE);
                        main_method_variable_low.setVisibility(View.GONE);
                    }else if(count == 3){
                        divide_margeSort_method_executed.setVisibility(View.GONE);
                        divide_margeSort_variables_executed.setVisibility(View.GONE);
                    }else if(count == 5){
                        divide_margeSort_method_variable_mid.setVisibility(View.GONE);
                    }else if(count == 6){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 8){
                        divide_margeSort_method_variable_mid_value.setText("1");
                    }else if(count == 9){ //pending
                        main_method_variable_high_value.setText("1");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 11){
                        main_method_variable_high_value.setText("0");
                        divide_margeSort_method_variable_mid_value.setText("0");
                    }else if(count == 12){
                        main_method_variable_high_value.setText("0");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 14){
                        main_method_variable_high_value.setText("1");
                        main_method_variable_low_value.setText("1");
                        divide_margeSort_method_variable_mid_value.setText("0");
                    }else if(count == 16){
                        conquer_margeSort_method_executed.setVisibility(View.GONE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.GONE);
                    }else if(count == 17){
                        conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 21){ //pending
                        copy_index_0.setText("");
                        conquer_margeSort_method_variable_k_value.setText("0");
                        conquer_margeSort_method_variable_j_value.setText("1");
                    }else if(count == 24){
                        conquer_margeSort_method_variable_k_value.setText("1");
                        conquer_margeSort_method_variable_i_value.setText("0");
                        copy_index_1.setText("");
                    }else if(count == 26){
                        conquer_margeSort_method_variable_i_value.setText("0");
                        main_method_variable_high_value.setText("1");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 27){
                        index_0.setText("6");
                    }else if(count == 28){
                        conquer_margeSort_method_variable_i_value.setText("0");
                    }else if(count == 29){
                        index_0.setText("4");
                    }else if(count == 31){
                        conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);
                        main_method_variable_high_value.setText("1");
                        divide_margeSort_method_variable_mid_value.setText("0");
                    }else if(count == 32){
                        main_method_variable_high_value.setText("1");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 34){
                        divide_margeSort_method_variable_mid_value.setText("1");
                    }else if(count == 35){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("2");
                    }else if(count == 37){
                        divide_margeSort_method_variable_mid_value.setText("2");
                        main_method_variable_high_value.setText("2");
                    }else if(count == 38){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("2");
                    }else if(count == 41){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("3");
                        divide_margeSort_method_variable_mid_value.setText("2");
                    }else if(count == 42){
                        conquer_margeSort_method_executed.setVisibility(View.GONE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.GONE);

                        conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_k_value.setText("");

                        conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_i_value.setText("");

                        conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_j_value.setText("");
                    }else if(count == 43){
                        conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_k_value.setText("2");

                        conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_i_value.setText("2");

                        conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_j_value.setText("3");
                    }else if(count == 46){
                        conquer_margeSort_method_variable_k_value.setText("2");
                        conquer_margeSort_method_variable_i_value.setText("2");
                    }else if(count == 50){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("2");
                        conquer_margeSort_method_variable_i_value.setText("3");
                    }else if(count == 52){
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("2");
                        conquer_margeSort_method_variable_i_value.setText("2");
                    }else if(count == 55){
                        conquer_margeSort_method_variable_k.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variable_i.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variable_j.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("2");
                        conquer_margeSort_method_variable_i_value.setText("3");
                        divide_margeSort_method_variable_mid_value.setText("2");
                    }else if(count == 56){
                        conquer_margeSort_method_executed.setVisibility(View.GONE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.GONE);
                    }else if(count == 58){
                        conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                        conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 62){
                        conquer_margeSort_method_variable_k_value.setText("0");
                        conquer_margeSort_method_variable_j_value.setText("2");
                        copy_index_0.setText("3");
                    }else if(count == 65){
                        conquer_margeSort_method_variable_k_value.setText("1");
                        conquer_margeSort_method_variable_i_value.setText("0");
                        copy_index_1.setText("4");
                    }else if(count == 69){
                        conquer_margeSort_method_variable_k_value.setText("2");
                        conquer_margeSort_method_variable_i_value.setText("1");
                        copy_index_2.setText("6");
                    }

                    else if(count == 73){ //todo
                        conquer_margeSort_method_variable_i_value.setText("2");
                        main_method_variable_high_value.setText("3");
                        main_method_variable_low_value.setText("0");
                    }else if(count == 74){
                        index_0.setText("6");
                    }else if(count == 75){
                        conquer_margeSort_method_variable_i_value.setText("0");
                    }else if(count == 76){
                        index_1.setText("4");
                    }else if(count == 77){
                        conquer_margeSort_method_variable_i_value.setText("1");
                    }else if(count == 78){
                        index_2.setText("3");
                    }else if(count == 79){
                        conquer_margeSort_method_variable_i_value.setText("2");
                    }else if(count == 81){
                        conquer_margeSort_method_variable_i_value.setText("3");
                    }else if(count == 82){
                        conquer_margeSort_method_variable_k.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variable_i.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variable_j.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                        conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);
                    }else if(count == 83){
                        divide_margeSort_method_executed.setVisibility(View.VISIBLE);
                        divide_margeSort_variables_executed.setVisibility(View.VISIBLE);
                    }else if(count == 84){
                        print_marge_sorted_array.setVisibility(View.GONE);
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
                            index_0.setText("6");
                            index_1.setText("4");
                            index_2.setText("3");
                            index_3.setText("9");
                        }else if(count == 2){
                            copy_array_main_executed.setVisibility(View.VISIBLE);
                            copy_index_0.setText("6");
                            copy_index_1.setText("4");
                            copy_index_2.setText("3");
                            copy_index_3.setText("9");
                        }else if(count == 3){
                            main_method_variable_high.setVisibility(View.VISIBLE);
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low.setVisibility(View.VISIBLE);
                            main_method_variable_low_value.setText("0");
                        }else if(count == 4){
                            divide_margeSort_method_executed.setVisibility(View.VISIBLE);
                            divide_margeSort_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 6){
                            divide_margeSort_method_variable_mid.setVisibility(View.VISIBLE);
                            divide_margeSort_method_variable_mid_value.setText("1");
                        }else if(count == 7){
                            main_method_variable_high_value.setText("1");
                            main_method_variable_low_value.setText("0");
                        }else if(count == 9){
                            divide_margeSort_method_variable_mid_value.setText("0");
                        }else if(count == 10){
                            main_method_variable_high_value.setText("0");
                            main_method_variable_low_value.setText("0");
                        }else if(count == 12){
                            main_method_variable_high_value.setText("1");
                            divide_margeSort_method_variable_mid_value.setText("0");
                        }else if(count == 13){
                            main_method_variable_high_value.setText("1");
                            main_method_variable_low_value.setText("1");
                        }else if(count == 15){
                            main_method_variable_high_value.setText("1");
                            main_method_variable_low_value.setText("0");
                            divide_margeSort_method_variable_mid_value.setText("0");
                        }else if(count == 17){
                            conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 18){
                            conquer_margeSort_method_variable_k.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_k_value.setText("0");

                            conquer_margeSort_method_variable_i.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_i_value.setText("0");

                            conquer_margeSort_method_variable_j.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_j_value.setText("1");
                        }else if(count == 22){
                            copy_index_0.setText("4");
                            conquer_margeSort_method_variable_k_value.setText("1");
                            conquer_margeSort_method_variable_j_value.setText("2");
                        }else if(count == 25){
                            conquer_margeSort_method_variable_k_value.setText("2");
                            conquer_margeSort_method_variable_i_value.setText("1");
                            copy_index_1.setText("6");
                        }else if(count == 27){
                            conquer_margeSort_method_variable_i_value.setText("0");
                            main_method_variable_high_value.setText("1");
                            main_method_variable_low_value.setText("0");
                        }else if(count == 28){
                            index_0.setText("4");
                        }else if(count == 29){
                            conquer_margeSort_method_variable_i_value.setText("1");
                        }else if(count == 30){
                            index_1.setText("6");
                        }else if(count == 32){
                            conquer_margeSort_method_executed.setVisibility(View.GONE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.GONE);
                            main_method_variable_high_value.setText("3");
                            divide_margeSort_method_variable_mid_value.setText("1");
                        }else if(count == 33){
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("2");
                        }else if(count == 35){
                            divide_margeSort_method_variable_mid_value.setText("2");
                        }else if(count == 36){
                            main_method_variable_high_value.setText("2");
                            main_method_variable_low_value.setText("2");
                        }else if(count == 38){
                            divide_margeSort_method_variable_mid_value.setText("2");
                            main_method_variable_high_value.setText("3");
                        }else if(count == 39){
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("3");
                        }else if(count == 42){
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("2");
                            divide_margeSort_method_variable_mid_value.setText("2");
                        }else if(count == 43){
                            conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);

                            conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_k_value.setText("");

                            conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_i_value.setText("");

                            conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_j_value.setText("");
                        }else if(count == 44){
                            conquer_margeSort_method_variable_k.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_k_value.setText("2");

                            conquer_margeSort_method_variable_i.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_i_value.setText("2");

                            conquer_margeSort_method_variable_j.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_j_value.setText("3");
                        }else if(count == 47){
                            conquer_margeSort_method_variable_k_value.setText("3");
                            conquer_margeSort_method_variable_i_value.setText("3");
                        }else if(count == 51){
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("2");
                            conquer_margeSort_method_variable_i_value.setText("2");
                        }else if(count == 53){
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("2");
                            conquer_margeSort_method_variable_i_value.setText("3");
                        }else if(count == 56){
                            conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                            conquer_margeSort_method_executed.setVisibility(View.GONE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.GONE);
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("0");
                            divide_margeSort_method_variable_mid_value.setText("1");
                        }else if(count == 57){
                            conquer_margeSort_method_executed.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 59){
                            conquer_margeSort_method_variable_k.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_i.setVisibility(View.VISIBLE);
                            conquer_margeSort_method_variable_j.setVisibility(View.VISIBLE);

                            conquer_margeSort_method_variable_k_value.setText("0");
                            conquer_margeSort_method_variable_i_value.setText("0");
                            conquer_margeSort_method_variable_j_value.setText("2");
                        }else if(count == 63){
                            conquer_margeSort_method_variable_k_value.setText("1");
                            conquer_margeSort_method_variable_j_value.setText("3");
                            copy_index_0.setText("3");
                        }else if(count == 66){
                            conquer_margeSort_method_variable_k_value.setText("2");
                            conquer_margeSort_method_variable_i_value.setText("1");
                            copy_index_1.setText("4");
                        }else if(count == 70){
                            conquer_margeSort_method_variable_k_value.setText("3");
                            conquer_margeSort_method_variable_i_value.setText("2");
                            copy_index_2.setText("6");
                        }else if(count == 74){ //todo
                            conquer_margeSort_method_variable_i_value.setText("0");
                            main_method_variable_high_value.setText("3");
                            main_method_variable_low_value.setText("0");
                        }else if(count == 75){
                            index_0.setText("3");
                        }else if(count == 76){
                            conquer_margeSort_method_variable_i_value.setText("1");
                        }else if(count == 77){
                            index_1.setText("4");
                        }else if(count == 78){
                            conquer_margeSort_method_variable_i_value.setText("2");
                        }else if(count == 79){
                            index_2.setText("6");
                        }else if(count == 80){
                            conquer_margeSort_method_variable_i_value.setText("3");
                        }else if(count == 82){
                            conquer_margeSort_method_variable_i_value.setText("4");
                        }else if(count == 83){
                            conquer_margeSort_method_variable_k.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_i.setVisibility(View.GONE);
                            conquer_margeSort_method_variable_j.setVisibility(View.GONE);
                            conquer_margeSort_method_executed.setVisibility(View.GONE);
                            conquer_margeSort_method_variables_executed.setVisibility(View.GONE);
                        }else if(count == 84){
                            divide_margeSort_method_executed.setVisibility(View.GONE);
                            divide_margeSort_variables_executed.setVisibility(View.GONE);
                        }else if(count == 85){
                            print_marge_sorted_array.setVisibility(View.VISIBLE);
                            print_marge_sorted_array.setText(Arrays.toString(array));
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