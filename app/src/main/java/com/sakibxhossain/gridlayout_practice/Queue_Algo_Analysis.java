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

public class Queue_Algo_Analysis extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView queue_50, queue_6, queue_7
            , queue_8, queue_9, queue_10
            , queue_11, queue_51, queue_18
            , queue_19, queue_12, queue_13
            , queue_21, queue_22, queue_23
            , queue_24, queue_25, queue_52
            , queue_54, queue_26, queue_27
            , queue_15, queue_16, queue_30
            , queue_31, queue_32, queue_33
            , queue_55, queue_35, queue_36
            , queue_39, queue_56, queue_41
            , queue_42, queue_45, queue_57, queue_53;

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

    //todo: queue analysis section hooks

    //Printing results
    TextView print_queue_item_1, print_queue_item_2, print_queue_item_3
            , print_dequeue, print_front_queue_item, print_rare_queue_item;

    //main method
    LinearLayout layout_main_executed;
    LinearLayout layout_main_variables;
       //variables
    LinearLayout main_method_variable_queue_capacity;
    TextView main_method_variable_queue_capacity_value;

    LinearLayout main_method_variable_queue_item;
    TextView main_method_variable_queue_item_value;

    //Queue constructor
    LinearLayout queue_method_executed;
    LinearLayout queue_variables_executed;

    LinearLayout queue_constructor_section_variable_capacity;
    TextView queue_constructor_section_variable_capacity_value;

    LinearLayout queue_constructor_section_variable_front;
    TextView queue_constructor_section_variable_front_value;

    LinearLayout queue_constructor_section_variable_rear;
    TextView queue_constructor_section_variable_rear_value;

    LinearLayout queue_constructor_section_variable_size;
    TextView queue_constructor_section_variable_size_value;

    LinearLayout queue_size_main_executed;
    TextView index_0,index_1,index_2,index_3,index_4;

    LinearLayout queue_array_initialization;

    //todo: queue analysis section hooks


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_algo_analysis);
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
        print_queue_item_1 = findViewById(R.id.print_queue_item_1);
        print_queue_item_2 = findViewById(R.id.print_queue_item_2);
        print_queue_item_3 = findViewById(R.id.print_queue_item_3);
        print_dequeue = findViewById(R.id.print_dequeue);
        print_front_queue_item = findViewById(R.id.print_front_queue_item);
        print_rare_queue_item = findViewById(R.id.print_rare_queue_item);

        //main method
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);
        //variables
        main_method_variable_queue_capacity = findViewById(R.id.main_method_variable_queue_capacity);
        main_method_variable_queue_capacity_value = findViewById(R.id.main_method_variable_queue_capacity_value);

        main_method_variable_queue_item = findViewById(R.id.main_method_variable_queue_item);
        main_method_variable_queue_item_value = findViewById(R.id.main_method_variable_queue_item_value);

        //Queue constructor
        queue_method_executed = findViewById(R.id.queue_method_executed);
        queue_variables_executed = findViewById(R.id.queue_variables_executed);
        //variables
        queue_constructor_section_variable_capacity = findViewById(R.id.queue_constructor_section_variable_capacity);
        queue_constructor_section_variable_capacity_value = findViewById(R.id.queue_constructor_section_variable_capacity_value);

        queue_constructor_section_variable_front = findViewById(R.id.queue_constructor_section_variable_front);
        queue_constructor_section_variable_front_value = findViewById(R.id.queue_constructor_section_variable_front_value);

        queue_constructor_section_variable_rear = findViewById(R.id.queue_constructor_section_variable_rear);
        queue_constructor_section_variable_rear_value = findViewById(R.id.queue_constructor_section_variable_rear_value);

        queue_constructor_section_variable_size = findViewById(R.id.queue_constructor_section_variable_size);
        queue_constructor_section_variable_size_value = findViewById(R.id.queue_constructor_section_variable_size_value);

        queue_size_main_executed = findViewById(R.id.queue_size_main_executed);
        queue_array_initialization = findViewById(R.id.queue_array_initialization);

        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);


        //back btn
        analysis_back_btn = findViewById(R.id.queue_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Queue_Algo_Analysis.this, Queue_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        queue_50 = findViewById(R.id.queue_50);
        queue_6 = findViewById(R.id.queue_06);
        queue_7 = findViewById(R.id.queue_07);
        queue_8= findViewById(R.id.queue_08);
        queue_9 =findViewById(R.id.queue_09);
        queue_10=findViewById(R.id.queue_10);
        queue_11= findViewById(R.id.queue_11);
        queue_51 =findViewById(R.id.queue_51);
        queue_18=findViewById(R.id.queue_18);
        queue_19= findViewById(R.id.queue_19);
        queue_12 =findViewById(R.id.queue_12);
        queue_13=findViewById(R.id.queue_13);
        queue_21 =findViewById(R.id.queue_21);
        queue_22 =findViewById(R.id.queue_22);
        queue_23=findViewById(R.id.queue_23);
        queue_24 =findViewById(R.id.queue_24);
        queue_25= findViewById(R.id.queue_25);
        queue_52=findViewById(R.id.queue_52);
        queue_54 =findViewById(R.id.queue_54);
        queue_26 =findViewById(R.id.queue_26);
        queue_27=findViewById(R.id.queue_27);
        queue_15= findViewById(R.id.queue_15);
        queue_16 =findViewById(R.id.queue_16);
        queue_30=findViewById(R.id.queue_30);
        queue_31= findViewById(R.id.queue_31);
        queue_32 =findViewById(R.id.queue_32);
        queue_33=findViewById(R.id.queue_33);
        queue_55= findViewById(R.id.queue_55);
        queue_35 =findViewById(R.id.queue_35);
        queue_36=findViewById(R.id.queue_36);
        queue_39 =findViewById(R.id.queue_39);
        queue_56 =findViewById(R.id.queue_56);
        queue_41=findViewById(R.id.queue_41);
        queue_42 =findViewById(R.id.queue_42);
        queue_45= findViewById(R.id.queue_45);
        queue_57=findViewById(R.id.queue_57);
        queue_53 = findViewById(R.id.queue_53);

        TextView[] list_of_views = {
                queue_50, queue_6, queue_7
, queue_8, queue_9, queue_10
, queue_11, queue_50, queue_51
, queue_18, queue_19, queue_12
, queue_13, queue_19, queue_21
, queue_22, queue_23, queue_24
, queue_25, queue_52, queue_18
, queue_19, queue_12, queue_19
, queue_21, queue_22, queue_23
, queue_24, queue_25, queue_53
, queue_18, queue_19, queue_12
, queue_13, queue_19, queue_21
, queue_22, queue_23, queue_24
, queue_25, queue_54, queue_26
, queue_27, queue_15, queue_16
, queue_27, queue_30, queue_31
, queue_32, queue_33, queue_54
, queue_55, queue_35, queue_36
, queue_15, queue_16, queue_36
, queue_39, queue_55, queue_56
, queue_41, queue_42, queue_15
, queue_16, queue_42, queue_45
, queue_56, queue_57
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
                        main_method_variable_queue_capacity.setVisibility(View.GONE);
                        //queue
                        queue_method_executed.setVisibility(View.GONE);
                        queue_variables_executed.setVisibility(View.GONE);
                        //capacity
                        queue_constructor_section_variable_capacity.setVisibility(View.GONE);
                        //front
                        queue_constructor_section_variable_front.setVisibility(View.GONE);
                        //rear
                        queue_constructor_section_variable_rear.setVisibility(View.GONE);
                        //size
                        queue_constructor_section_variable_size.setVisibility(View.GONE);
                    }else if(count == 2){
                        queue_constructor_section_variable_capacity_value.setText("0");
                    }else if(count == 4){
                        queue_constructor_section_variable_rear_value.setText("0");
                    }else if(count == 5){
                        queue_array_initialization.setVisibility(View.INVISIBLE);
                    }else if(count == 6){
                        queue_method_executed.setVisibility(View.VISIBLE);
                        queue_variables_executed.setVisibility(View.VISIBLE);
                        layout_main_executed.setVisibility(View.VISIBLE);
                        layout_main_variables.setVisibility(View.VISIBLE);
                        main_method_variable_queue_capacity.setVisibility(View.VISIBLE);
                    }else if(count == 7){
                        queue_method_executed.setVisibility(View.GONE);
                        queue_variables_executed.setVisibility(View.GONE);
                    }else if(count == 8){
                        main_method_variable_queue_item.setVisibility(View.GONE);
                    }else if(count == 14){
                        queue_constructor_section_variable_rear_value.setText("4");
                    }else if(count == 15){
                        index_0.setText("");
                    }else if(count == 16){
                        queue_constructor_section_variable_size_value.setText("0");
                    }else if(count == 17){
                        print_queue_item_1.setVisibility(View.GONE);
                    }else if(count == 18){
                        main_method_variable_queue_item.setVisibility(View.VISIBLE);
                        main_method_variable_queue_item_value.setText("10");
                    }else if(count == 19){ //
                    main_method_variable_queue_item.setVisibility(View.GONE);
                }else if(count == 24){
                    queue_constructor_section_variable_rear_value.setText("0");
                }else if(count == 25){
                    index_1.setText("");
                }else if(count == 26){
                    queue_constructor_section_variable_size_value.setText("1");
                }else if(count == 27){
                    print_queue_item_2.setVisibility(View.GONE);
                }else if(count == 28){
                    main_method_variable_queue_item.setVisibility(View.VISIBLE);
                        main_method_variable_queue_item_value.setText("20");
                }else if(count == 29){ //
                        main_method_variable_queue_item.setVisibility(View.GONE);
                    }else if(count == 35){
                        queue_constructor_section_variable_rear_value.setText("1");
                    }else if(count == 36){
                        index_2.setText("");
                    }else if(count == 37){
                        queue_constructor_section_variable_size_value.setText("2");
                    }else if(count == 38){
                        print_queue_item_3.setVisibility(View.GONE);
                    }else if(count == 39){
                        main_method_variable_queue_item.setVisibility(View.VISIBLE);
                        main_method_variable_queue_item_value.setText("30");
                    }else if(count == 46){ //pending
                       // main_method_variable_queue_item_value.setText("10");
                        main_method_variable_queue_item.setVisibility(View.GONE);
                    }else if(count == 47){
                        queue_constructor_section_variable_front_value.setText("0");
                    }else if(count == 48){
                        queue_constructor_section_variable_size_value.setText("3");
                    }else if(count == 49){
                        main_method_variable_queue_item_value.setText("10");
                        main_method_variable_queue_item.setVisibility(View.VISIBLE);
                    }else if(count == 50){
                        print_dequeue.setVisibility(View.GONE);
                    }else if(count == 59){
                        print_front_queue_item.setVisibility(View.GONE);
                    }else if(count == 67){
                        print_rare_queue_item.setVisibility(View.GONE);
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
                            main_method_variable_queue_capacity.setVisibility(View.VISIBLE);
                            main_method_variable_queue_capacity_value.setText("5");
                            //queue
                            queue_method_executed.setVisibility(View.VISIBLE);
                            queue_variables_executed.setVisibility(View.VISIBLE);
                            //capacity
                            queue_constructor_section_variable_capacity.setVisibility(View.VISIBLE);
                            queue_constructor_section_variable_capacity_value.setText("0");
                            //front
                            queue_constructor_section_variable_front.setVisibility(View.VISIBLE);
                            queue_constructor_section_variable_front_value.setText("0");
                            //rear
                            queue_constructor_section_variable_rear.setVisibility(View.VISIBLE);
                            queue_constructor_section_variable_rear_value.setText("0");
                            //size
                            queue_constructor_section_variable_size.setVisibility(View.VISIBLE);
                            queue_constructor_section_variable_size_value.setText("0");
                            //array
                            queue_size_main_executed.setVisibility(View.VISIBLE);
                        }else if(count == 3){
                            queue_constructor_section_variable_capacity_value.setText("5");
                        }else if(count == 5){
                            queue_constructor_section_variable_rear_value.setText("4");
                        }else if(count == 6){
                            queue_array_initialization.setVisibility(View.VISIBLE);
                        }else if(count == 7){
                            queue_method_executed.setVisibility(View.GONE);
                            queue_variables_executed.setVisibility(View.GONE);
                            main_method_variable_queue_capacity.setVisibility(View.GONE);
                        }else if(count == 8){
                            queue_method_executed.setVisibility(View.VISIBLE);
                            queue_variables_executed.setVisibility(View.VISIBLE);
                        }else if(count == 9){
                            main_method_variable_queue_item.setVisibility(View.VISIBLE);
                            main_method_variable_queue_item_value.setText("10");
                        }else if(count == 15){
                            queue_constructor_section_variable_rear_value.setText("0");
                        }else if(count == 16){
                            index_0.setText("10");
                        }else if(count == 17){
                            queue_constructor_section_variable_size_value.setText("1");
                        }else if(count == 18){
                            print_queue_item_1.setVisibility(View.VISIBLE);
                            print_queue_item_1.setText("10 enqueued to queue");
                        }else if(count == 19){
                            main_method_variable_queue_item.setVisibility(View.GONE);
                        }else if(count == 20){
                            main_method_variable_queue_item.setVisibility(View.VISIBLE);
                            main_method_variable_queue_item_value.setText("20");
                        }else if(count == 25){
                            queue_constructor_section_variable_rear_value.setText("1");
                        }else if(count == 26){
                            index_1.setText("20");
                        }else if(count == 27){
                            queue_constructor_section_variable_size_value.setText("2");
                        }else if(count == 28){
                            print_queue_item_2.setVisibility(View.VISIBLE);
                            print_queue_item_2.setText("20 enqueued to queue");
                        }else if(count == 29){
                            main_method_variable_queue_item.setVisibility(View.GONE);
                        }else if(count == 30){
                            main_method_variable_queue_item.setVisibility(View.VISIBLE);
                            main_method_variable_queue_item_value.setText("30");
                        }else if(count == 36){
                            queue_constructor_section_variable_rear_value.setText("2");
                        }else if(count == 37){
                            index_2.setText("30");
                        }else if(count == 38){
                            queue_constructor_section_variable_size_value.setText("3");
                        }else if(count == 39){
                            print_queue_item_3.setVisibility(View.VISIBLE);
                            print_queue_item_3.setText("30 enqueued to queue");
                        }else if(count == 40){
                            main_method_variable_queue_item.setVisibility(View.GONE);
                        }else if(count == 47){ //pending
                            main_method_variable_queue_item_value.setText("10");
                            main_method_variable_queue_item.setVisibility(View.VISIBLE);
                        }else if(count == 48){
                            queue_constructor_section_variable_front_value.setText("1");
                        }else if(count == 49){
                            queue_constructor_section_variable_size_value.setText("2");
                        }else if(count == 50){
                            main_method_variable_queue_item_value.setText("10");
                            main_method_variable_queue_item.setVisibility(View.GONE);
                        }else if(count == 51){
                            print_dequeue.setVisibility(View.VISIBLE);
                            print_dequeue.setText("10  Dequeued from queue");
                        }else if(count == 59){
                            print_front_queue_item.setVisibility(View.VISIBLE);
                            print_front_queue_item.setText("20 Is the Front item");
                        }else if(count == 67){
                            print_rare_queue_item.setVisibility(View.VISIBLE);
                            print_rare_queue_item.setText("30 Is the Rear item");
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