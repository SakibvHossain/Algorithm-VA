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

public class Stack_algo_Analysis extends AppCompatActivity {
    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView stack_5, stack_9, stack_10
           , stack_11, stack_12, stack_13
           , stack_17, stack_18, stack_19
           , stack_20, stack_23, stack_24
           , stack_28, stack_29, stack_30
           , stack_34, stack_35, stack_39
           , stack_40, stack_41, stack_45
           , stack_46, stack_47, stack_49
           , stack_53, stack_55, stack_56
           , stack_57, stack_58, stack_59
           , stack_60, stack_61, stack_54;

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

    //todo: Stack Analysis Hooks
    //Printing Result
    TextView print_stack_item_1, print_stack_item_2, print_stack_item_3
            , print_poped_item, print_peeked_item, print_stack_array;

    // main section
    LinearLayout layout_main_executed;
    LinearLayout layout_main_variables;

    LinearLayout main_method_variable_stack_x;
    TextView main_method_variable_stack_x_value;

    // Stack section
    LinearLayout stack_constructor_method_executed;
    LinearLayout stack_constructor_variables_executed;

    LinearLayout array_initialization;

    LinearLayout stack_constructor_section_variable_top;
    TextView stack_constructor_section_variable_top_value;

    LinearLayout stack_size_main_executed;
    TextView index_0,index_1,index_2,index_3,index_4;

    //todo: Stack Analysis Hooks

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_algo_analysis);

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

        //printing results
        print_stack_item_1 = findViewById(R.id.print_stack_item_1);
        print_stack_item_2 = findViewById(R.id.print_stack_item_2);
        print_stack_item_3 = findViewById(R.id.print_stack_item_3);
        print_poped_item = findViewById(R.id.print_poped_item);
        print_peeked_item = findViewById(R.id.print_peeked_item);
        print_stack_array = findViewById(R.id.print_stack_array);

        //main section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);

        main_method_variable_stack_x = findViewById(R.id.main_method_variable_stack_x);
        main_method_variable_stack_x_value = findViewById(R.id.main_method_variable_stack_x_value);

        //stack section
        stack_constructor_method_executed = findViewById(R.id.stack_constructor_method_executed);
        stack_constructor_variables_executed = findViewById(R.id.stack_constructor_variables_executed);
        stack_constructor_section_variable_top = findViewById(R.id.stack_constructor_section_variable_top);
        stack_constructor_section_variable_top_value = findViewById(R.id.stack_constructor_section_variable_top_value);
        array_initialization = findViewById(R.id.array_initialization);
        stack_size_main_executed = findViewById(R.id.stack_size_main_executed);
        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);


        //back btn
        analysis_back_btn = findViewById(R.id.stack_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Stack_algo_Analysis.this, Stack_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });


        stack_5 = findViewById(R.id.stack_05);
        stack_9 = findViewById(R.id.stack_09);
        stack_10 =findViewById(R.id.stack_10);
        stack_11 =findViewById(R.id.stack_11);
        stack_12 =findViewById(R.id.stack_12);
        stack_13 =findViewById(R.id.stack_13);
        stack_17 =findViewById(R.id.stack_17);
        stack_18 =findViewById(R.id.stack_18);
        stack_19 =findViewById(R.id.stack_19);
        stack_20 =findViewById(R.id.stack_20);
        stack_23 =findViewById(R.id.stack_23);
        stack_24 =findViewById(R.id.stack_24);
        stack_28 =findViewById(R.id.stack_28);
        stack_29 =findViewById(R.id.stack_29);
        stack_30=findViewById(R.id.stack_30);
        stack_34 =findViewById(R.id.stack_34);
        stack_35 =findViewById(R.id.stack_35);
        stack_39=findViewById(R.id.stack_39);
        stack_40 =findViewById(R.id.stack_40);
        stack_41 =findViewById(R.id.stack_41);
        stack_45=findViewById(R.id.stack_45);
        stack_46 =findViewById(R.id.stack_46);
        stack_47 =findViewById(R.id.stack_47);
        stack_49=findViewById(R.id.stack_49);
        stack_53 =findViewById(R.id.stack_53);
        stack_55 =findViewById(R.id.stack_55);
        stack_56=findViewById(R.id.stack_56);
        stack_57 =findViewById(R.id.stack_57);
        stack_58 =findViewById(R.id.stack_58);
        stack_59=findViewById(R.id.stack_59);
        stack_60 =findViewById(R.id.stack_60);
        stack_61=findViewById(R.id.stack_61);
        stack_54 = findViewById(R.id.stack_54);


        TextView[] list_of_views = {
                stack_53, stack_9, stack_5, stack_10
                , stack_11, stack_53, stack_54, stack_12
                , stack_13, stack_17, stack_18, stack_19
                , stack_20, stack_54, stack_55, stack_12
                , stack_13, stack_17, stack_18, stack_19
                , stack_20, stack_55, stack_56, stack_12
                , stack_13, stack_17, stack_18, stack_19
                , stack_20, stack_56, stack_57, stack_23
                , stack_24, stack_28, stack_29, stack_30
                , stack_57, stack_58, stack_34, stack_35
                , stack_39, stack_40, stack_41, stack_58
                , stack_59, stack_60, stack_45, stack_46
                , stack_47, stack_46, stack_47, stack_46
                , stack_49, stack_61
        };

        final_Count.setText(String.valueOf(list_of_views.length));
        //list_of_views[count].setBackgroundColor(getColor(R.color.completeTransparent));

        //Visualization operations
        //back operations
        back_btn.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {

                if(count > 0){
                    count--;
                    back_track = count + 1;
                    if(count == 0){
                        layout_main_executed.setVisibility(View.GONE);
                        layout_main_variables.setVisibility(View.GONE);
                        stack_size_main_executed.setVisibility(View.GONE);
                        stack_constructor_variables_executed.setVisibility(View.GONE);
                        stack_constructor_section_variable_top.setVisibility(View.GONE);
                        stack_size_main_executed.setVisibility(View.GONE);
                    }else if(count == 2){
                        array_initialization.setVisibility(View.INVISIBLE);
                    }else if(count == 3){
                        stack_constructor_section_variable_top_value.setText("0");
                    }else if(count == 6){
                        main_method_variable_stack_x.setVisibility(View.GONE);
                    }else if(count == 10){
                        index_0.setText("");
                        stack_constructor_section_variable_top_value.setText("-1");
                    }else if(count == 11){
                        print_stack_item_1.setVisibility(View.GONE);
                    }else if(count == 12){
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        main_method_variable_stack_x_value.setText("10");
                    }else if(count == 14){
                        main_method_variable_stack_x.setVisibility(View.GONE);
                    }else if(count == 18){
                        index_1.setText("");
                        stack_constructor_section_variable_top_value.setText("0");
                    }else if(count == 19){
                        print_stack_item_2.setVisibility(View.GONE);
                    }else if(count == 20){
                        print_stack_item_2.setText("20");
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                    }else if(count == 22){
                        main_method_variable_stack_x.setVisibility(View.GONE);
                    }else if(count == 26){//done
                        index_2.setText("");
                        stack_constructor_section_variable_top_value.setText("1");
                    }else if(count == 27){
                        print_stack_item_3.setVisibility(View.GONE);
                    }else if(count == 28){
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        main_method_variable_stack_x_value.setText("30");
                    }else if(count == 34){
                        main_method_variable_stack_x.setVisibility(View.GONE);
                        stack_constructor_section_variable_top_value.setText("2");
                    }else if(count == 36){
                        print_poped_item.setVisibility(View.GONE);
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        main_method_variable_stack_x_value.setText("30");
                    }else if(count == 41){
                        main_method_variable_stack_x.setVisibility(View.GONE);
                        stack_constructor_section_variable_top_value.setText("1");
                    }else if(count == 42){
                        main_method_variable_stack_x_value.setText("20");
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        stack_constructor_section_variable_top_value.setText("1");
                    }else if(count == 43){
                        print_peeked_item.setVisibility(View.GONE);
                        main_method_variable_stack_x.setVisibility(View.GONE);
                    }else if(count == 44){
                        print_stack_array.setVisibility(View.GONE);
                    }else if(count == 48){
                        print_stack_array.setText("Elements present in stack : ");
                    }else if(count == 50){
                        print_stack_array.setText("Elements present in stack : 20");
                    }else if(count == 35){
                        main_method_variable_stack_x_value.setText("30");
                        main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        stack_constructor_section_variable_top_value.setText("1");
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
            @SuppressLint("SetTextI18n")
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
                            stack_size_main_executed.setVisibility(View.VISIBLE);
                            stack_constructor_variables_executed.setVisibility(View.VISIBLE);
                            stack_constructor_section_variable_top.setVisibility(View.VISIBLE);
                            stack_constructor_section_variable_top_value.setText("0");
                            stack_size_main_executed.setVisibility(View.VISIBLE);
                        }else if(count == 3){
                            array_initialization.setVisibility(View.VISIBLE);
                        }else if(count == 4){
                            stack_constructor_section_variable_top_value.setText("-1");
                        }else if(count == 7){
                            main_method_variable_stack_x_value.setText("10");
                            main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        }else if(count == 11){
                            index_0.setText("10");
                            stack_constructor_section_variable_top_value.setText("0");
                        }else if(count == 12){
                            print_stack_item_1.setVisibility(View.VISIBLE);
                            print_stack_item_1.setText("10 pushed into stack");
                        }else if(count == 13){
                            main_method_variable_stack_x.setVisibility(View.GONE);
                        }else if(count == 15){
                            main_method_variable_stack_x_value.setText("20");
                            main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        }else if(count == 19){
                            index_1.setText("20");
                            stack_constructor_section_variable_top_value.setText("1");
                        }else if(count == 20){
                            print_stack_item_2.setVisibility(View.VISIBLE);
                            print_stack_item_2.setText(R.string.pushed_20);
                        }else if(count == 21){
                            main_method_variable_stack_x.setVisibility(View.GONE);
                        }else if(count == 23){
                            main_method_variable_stack_x_value.setText("30");
                            main_method_variable_stack_x.setVisibility(View.VISIBLE);
                        }else if(count == 27){
                            index_2.setText("30");
                            stack_constructor_section_variable_top_value.setText("2");
                        }else if(count == 28){
                            print_stack_item_3.setVisibility(View.VISIBLE);
                            print_stack_item_3.setText("30 pushed into stack");
                        }else if(count == 29){
                            main_method_variable_stack_x.setVisibility(View.GONE);
                        }else if(count == 35){
                            main_method_variable_stack_x_value.setText("30");
                            main_method_variable_stack_x.setVisibility(View.VISIBLE);
                            stack_constructor_section_variable_top_value.setText("1");
                        }else if(count == 36){
                            print_poped_item.setVisibility(View.GONE);
                        }else if(count == 37){
                            main_method_variable_stack_x.setVisibility(View.GONE);
                            print_poped_item.setVisibility(View.VISIBLE);
                            print_poped_item.setText("30 Popped from stack");
                        }else if(count == 42){
                            main_method_variable_stack_x_value.setText("20");
                            main_method_variable_stack_x.setVisibility(View.VISIBLE);
                            stack_constructor_section_variable_top_value.setText("1");
                        }else if(count == 43){
                            main_method_variable_stack_x.setVisibility(View.GONE);
                        }else if(count == 44){
                            print_peeked_item.setVisibility(View.VISIBLE);
                            print_peeked_item.setText("20 Is the top element");
                        }else if(count == 45){
                            print_stack_array.setVisibility(View.VISIBLE);
                            print_stack_array.setText(R.string.element_present);
                        }else if(count == 49){
                            print_stack_array.setText("Elements present in stack : 20");
                        }else if(count == 51){
                            print_stack_array.setText("Elements present in stack : 20 10");
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