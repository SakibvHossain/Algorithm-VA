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

public class Insertion_Sort_Analysis extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count;

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

    //Printing array
    TextView print_array;

    //array
    TextView index_0, index_1, index_2, index_3, index_4;

    //main executed layouts
    LinearLayout layout_main_executed, layout_main_variables, array_main_executed;

    //sort executed layouts
    LinearLayout sort_method_executed, sort_method_variables
            , sort_method_variables_n, sort_method_variable_key
            , sort_method_variable_j, sort_method_variable_i;

    //sort method variables
    TextView sort_method_variable_i_value, sort_method_variable_key_value
            , sort_method_variable_j_value, sort_method_variable_n_value;

    public int[] array = {2,8,5,9,1};
    int[] copy_initial_array = Arrays.copyOf(array,array.length);
    int inc = 1;
    int[] copy_array_1, copy_array_2, copy_array_3, copy_array_4;


    //sorting operation control
    boolean dont_give_permission_40_to_access = true;
    boolean dont_give_permission_15_to_access = true;
    boolean dont_give_permission_8_to_access = true;
    boolean dont_give_permission_22_to_access = true;


    // array elements to be visualize
    ImageView img1, img2, img3, img4, img5;
    // array elements to be visualize

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort_analysis);

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

        //main section
        layout_main_executed = findViewById(R.id.layout_main_executed);
        layout_main_variables = findViewById(R.id.layout_main_variables);
        array_main_executed = findViewById(R.id.array_main_executed);
        index_0 = findViewById(R.id.index_0);
        index_1 = findViewById(R.id.index_1);
        index_2 = findViewById(R.id.index_2);
        index_3 = findViewById(R.id.index_3);
        index_4 = findViewById(R.id.index_4);

        //sort method
        sort_method_executed = findViewById(R.id.sort_method_executed);
        sort_method_variables=findViewById(R.id.sort_method_variables);
        sort_method_variables_n =findViewById(R.id.sort_method_variable_n);
        sort_method_variable_key=findViewById(R.id.sort_method_variable_key);
        sort_method_variable_i=findViewById(R.id.sort_method_variable_i);
        sort_method_variable_j=findViewById(R.id.sort_method_variable_j);

        //sort method variable
        sort_method_variable_i_value = findViewById(R.id.sort_method_variable_i_value);
        sort_method_variable_key_value = findViewById(R.id.sort_method_variable_key_value);
        sort_method_variable_n_value = findViewById(R.id.sort_method_variable_n_value);
        sort_method_variable_j_value = findViewById(R.id.sort_method_variable_j_value);

        //back btn
        analysis_back_btn = findViewById(R.id.insertion_sort_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Insertion_Sort_Analysis.this,Insertion_Sort_Description.class);
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
                    if(count == 0){
                        layout_main_executed.setVisibility(View.GONE);
                        layout_main_variables.setVisibility(View.GONE);
                    }else if(count == 1){
                        array_main_executed.setVisibility(View.GONE);
                    }else if(count == 3){
                        sort_method_executed.setVisibility(View.GONE);
                        sort_method_variables.setVisibility(View.GONE);
                    }else if(count == 4){
                        sort_method_variables_n.setVisibility(View.GONE);
                    }else if(count == 5){
                        sort_method_variable_i.setVisibility(View.GONE);
                    }else if(count == 6){
                        sort_method_variable_key.setVisibility(View.GONE);
                    }else if(count == 7){
                        dont_give_permission_8_to_access = false;
                        sort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 8){
                        sort_method_variable_j.setVisibility(View.VISIBLE);
                        sort_method_variable_j_value.setText("0");
                    }else if(count == 10){
                        sort_method_variable_i_value.setText(String.valueOf(1));
                    }else if(count == 11){
                        sort_method_variable_key_value.setText(String.valueOf(copy_initial_array[1]));
                    }else if(count == 12){
                        sort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 14){
                        dont_give_permission_15_to_access = false;
                        index_0.setText(String.valueOf(copy_initial_array[0]));
                        index_1.setText(String.valueOf(copy_initial_array[1]));
                        index_2.setText(String.valueOf(copy_initial_array[2]));
                        index_3.setText(String.valueOf(copy_initial_array[3]));
                        index_4.setText(String.valueOf(copy_initial_array[4]));
                    }else if(count == 15){
                        sort_method_variable_j_value.setText("1");
                    }else if(count == 16){
                        sort_method_variable_j.setVisibility(View.VISIBLE);
                        sort_method_variable_j_value.setText("0");
                    }else if(count == 18){
                        sort_method_variable_i_value.setText("2");
                    }else if(count == 19){
                        sort_method_variable_key_value.setText("5");
                    }else if(count == 20){
                        dont_give_permission_22_to_access = false;
                        sort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 23){
                        sort_method_variable_i_value.setText("3");
                    }else if(count == 25){
                        sort_method_variable_key_value.setText("9");
                    }else if(count == 26){
                        sort_method_variable_j.setVisibility(View.GONE);
                    }else if(count == 27){
                        index_0.setText(String.valueOf(copy_array_2[0]));
                        index_1.setText(String.valueOf(copy_array_2[1]));
                        index_2.setText(String.valueOf(copy_array_2[2]));
                        index_3.setText(String.valueOf(copy_array_2[3]));
                        index_4.setText(String.valueOf(copy_array_2[4]));
                    }else if(count == 28){
                        sort_method_variable_j_value.setText("3");
                    }else if(count == 30){
                        index_0.setText(String.valueOf(copy_array_2[0]));
                        index_1.setText(String.valueOf(copy_array_2[1]));
                        index_2.setText(String.valueOf(copy_array_2[2]));
                        index_3.setText(String.valueOf(copy_array_2[3]));
                        index_4.setText(String.valueOf(9));
                    }else if(count == 31){
                        sort_method_variable_j_value.setText("2");
                    }else if(count == 33){
                        index_0.setText(String.valueOf(copy_array_2[0]));
                        index_1.setText(String.valueOf(copy_array_2[1]));
                        index_2.setText(String.valueOf(copy_array_2[2]));
                        index_3.setText(String.valueOf(8));
                        index_4.setText(String.valueOf(9));
                    }else if(count == 34){
                        sort_method_variable_j_value.setText("1");
                    }else if(count == 36){
                        index_0.setText(String.valueOf(copy_array_2[0]));
                        index_1.setText(String.valueOf(copy_array_2[1]));
                        index_2.setText(String.valueOf(5));
                        index_3.setText(String.valueOf(8));
                        index_4.setText(String.valueOf(9));
                    }else if(count == 37){
                        sort_method_variable_j_value.setText("0");
                    }else if(count == 38){
                        sort_method_variable_j.setVisibility(View.VISIBLE);
                        sort_method_variable_j_value.setText("-1");
                    }else if(count == 39){
                        dont_give_permission_40_to_access = false;
                        index_0.setText(String.valueOf(copy_array_2[0]));
                        index_1.setText(String.valueOf(2));
                        index_2.setText(String.valueOf(5));
                        index_3.setText(String.valueOf(8));
                        index_4.setText(String.valueOf(9));
                    }else if(count == 40){
                        sort_method_variable_key.setVisibility(View.VISIBLE);
                        sort_method_variable_i.setVisibility(View.VISIBLE);
                        sort_method_variable_key_value.setText("1");
                        sort_method_variable_i_value.setText("4");
                    }else if(count == 41){
                        sort_method_executed.setVisibility(View.VISIBLE);
                        sort_method_variables.setVisibility(View.VISIBLE);
                        sort_method_variables_n.setVisibility(View.VISIBLE);
                        sort_method_variable_n_value.setText(String.valueOf(array.length));
                    }else if(count == 42){
                        print_array.setVisibility(View.INVISIBLE);
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
                        }else if(count == 2){
                            array_main_executed.setVisibility(View.VISIBLE);
                            index_0.setText(String.valueOf(copy_initial_array[0]));
                            index_1.setText(String.valueOf(copy_initial_array[1]));
                            index_2.setText(String.valueOf(copy_initial_array[2]));
                            index_3.setText(String.valueOf(copy_initial_array[3]));
                            index_4.setText(String.valueOf(copy_initial_array[4]));
                        }else if(count == 4){
                            sort_method_executed.setVisibility(View.VISIBLE);
                            sort_method_variables.setVisibility(View.VISIBLE);
                        }else if(count == 5){
                            sort_method_variables_n.setVisibility(View.VISIBLE);
                            sort_method_variable_n_value.setText(String.valueOf(array.length));
                        }else if(count == 6){
                            sort_method_variable_i.setVisibility(View.VISIBLE);
                            sort_method_variable_i_value.setText("1");
                        }else if(count == 7){
                            sort_method_variable_key.setVisibility(View.VISIBLE);
                            sort_method_variable_key_value.setText(String.valueOf(copy_initial_array[1]));
                        }else if(count == 8){
                            if(dont_give_permission_8_to_access){
                                sort_insertion(array);
                            }
                            sort_method_variable_j.setVisibility(View.VISIBLE);
                            sort_method_variable_j_value.setText(String.valueOf(0));
                        }else if(count == 9){
                            sort_method_variable_j.setVisibility(View.GONE);
                        }else if(count == 11){
                            sort_method_variable_i_value.setText(String.valueOf(2));
                        }else if(count == 12){
                            sort_method_variable_key_value.setText(String.valueOf(copy_initial_array[2]));
                        }else if(count == 13){
                            sort_method_variable_j.setVisibility(View.VISIBLE);
                            sort_method_variable_j_value.setText("1");
                        }else if(count == 15){
                            if(dont_give_permission_15_to_access){
                                sort_insertion(array);
                            }
                            index_0.setText(String.valueOf(copy_array_2[0]));
                            index_1.setText(String.valueOf(copy_array_2[1]));
                            index_2.setText(String.valueOf(8));
                            index_3.setText(String.valueOf(copy_array_2[3]));
                            index_4.setText(String.valueOf(copy_array_2[4]));
                        }else if(count == 16){
                            sort_method_variable_j_value.setText("0");
                        }else if(count == 17){
                            sort_method_variable_j.setVisibility(View.GONE);
                        }else if(count == 19){
                            sort_method_variable_i_value.setText("3");
                        }else if(count == 20){
                            sort_method_variable_key_value.setText("9");
                        }else if(count == 21){
                            if(dont_give_permission_22_to_access){
                                sort_insertion(array);
                            }
                            sort_method_variable_j.setVisibility(View.VISIBLE);
                            sort_method_variable_j_value.setText("2");
                        }else if(count == 24){
                            sort_method_variable_i_value.setText("4");
                        }else if(count == 25){
                            sort_method_variable_key_value.setText("1");
                        }else if(count == 26){
                            sort_method_variable_j.setVisibility(View.VISIBLE);
                            sort_method_variable_j_value.setText("3");
                        }else if(count == 28){
                            index_0.setText(String.valueOf(copy_array_2[0]));
                            index_1.setText(String.valueOf(copy_array_2[1]));
                            index_2.setText(String.valueOf(copy_array_2[2]));
                            index_3.setText(String.valueOf(copy_array_2[3]));
                            index_4.setText(String.valueOf(9));
                        }else if(count == 29){
                            sort_method_variable_j_value.setText("2");
                        }else if(count == 31){
                            index_0.setText(String.valueOf(copy_array_2[0]));
                            index_1.setText(String.valueOf(copy_array_2[1]));
                            index_2.setText(String.valueOf(copy_array_2[2]));
                            index_3.setText(String.valueOf(8));
                            index_4.setText(String.valueOf(9));
                        }else if(count == 32){
                            sort_method_variable_j_value.setText("1");
                        }else if(count == 34){
                            index_0.setText(String.valueOf(copy_array_2[0]));
                            index_1.setText(String.valueOf(copy_array_2[1]));
                            index_2.setText(String.valueOf(5));
                            index_3.setText(String.valueOf(8));
                            index_4.setText(String.valueOf(9));
                        }else if(count == 35){
                            sort_method_variable_j_value.setText("0");
                        }else if(count == 37){
                            index_0.setText(String.valueOf(copy_array_2[0]));
                            index_1.setText(String.valueOf(2));
                            index_2.setText(String.valueOf(5));
                            index_3.setText(String.valueOf(8));
                            index_4.setText(String.valueOf(9));
                        }else if(count == 38){
                            sort_method_variable_j_value.setText("-1");
                        }else if(count == 39){
                            sort_method_variable_j.setVisibility(View.GONE);
                        }else if(count == 40){
                            if(dont_give_permission_40_to_access){
                                sort_insertion(array);
                            }
                            index_0.setText(String.valueOf(copy_array_4[0]));
                            index_1.setText(String.valueOf(copy_array_4[1]));
                            index_2.setText(String.valueOf(copy_array_4[2]));
                            index_3.setText(String.valueOf(copy_array_4[3]));
                            index_4.setText(String.valueOf(copy_array_4[4]));
                        }else if(count == 41){
                            sort_method_variable_key.setVisibility(View.GONE);
                            sort_method_variable_i.setVisibility(View.GONE);
                        }else if(count == 42){
                            sort_method_executed.setVisibility(View.GONE);
                            sort_method_variables.setVisibility(View.GONE);
                            sort_method_variables_n.setVisibility(View.GONE);
                        }else if(count == 43){
                            print_array.setVisibility(View.VISIBLE);
                            print_array.setText(Arrays.toString(array));
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

    private void sort_insertion(int[] arr) {
        int n = arr.length;
        for (int i = inc; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
            updateArray(arr);
            break;
        }
    }

    private void updateArray(int[] arr) {
        if(inc == 2){
            copy_array_2 = Arrays.copyOf(arr,arr.length);
        }else if(inc == 4){
            copy_array_4 = Arrays.copyOf(arr,arr.length);
        }
        inc++;
    }
}


//        else if(count == 2){
//        array_main_executed.setVisibility(View.VISIBLE);
//        index_0.setText(String.valueOf(array[0]));
//        index_1.setText(String.valueOf(array[1]));
//        index_2.setText(String.valueOf(array[2]));
//        index_3.setText(String.valueOf(array[3]));
//        index_4.setText(String.valueOf(array[4]));
//        sort_insertion(array);
//        }else if(count == 4){
//        sort_insertion(array);
//        index_0.setText(String.valueOf(copy_array_1[0]));
//        index_1.setText(String.valueOf(copy_array_1[1]));
//        index_2.setText(String.valueOf(copy_array_1[2]));
//        index_3.setText(String.valueOf(copy_array_1[3]));
//        index_4.setText(String.valueOf(copy_array_1[4]));
//        sort_method_executed.setVisibility(View.VISIBLE);
//        }else if(count == 5){
//        sort_insertion(array);
//        index_0.setText(String.valueOf(copy_array_2[0]));
//        index_1.setText(String.valueOf(copy_array_2[1]));
//        index_2.setText(String.valueOf(copy_array_2[2]));
//        index_3.setText(String.valueOf(copy_array_2[3]));
//        index_4.setText(String.valueOf(copy_array_2[4]));
//        sort_method_variables_n.setVisibility(View.VISIBLE);
//        sort_method_variable_n.setText(String.valueOf(array.length));
//        }else if(count == 6){
//        sort_insertion(array);
//        index_0.setText(String.valueOf(copy_array_3[0]));
//        index_1.setText(String.valueOf(copy_array_3[1]));
//        index_2.setText(String.valueOf(copy_array_3[2]));
//        index_3.setText(String.valueOf(copy_array_3[3]));
//        index_4.setText(String.valueOf(copy_array_3[4]));
//        sort_method_variable_i.setVisibility(View.VISIBLE);
//        sort_method_variable_i.setText(String.valueOf(inc));
//        }else if(count == 7){
//        sort_insertion(array);
//        index_0.setText(String.valueOf(copy_array_4[0]));
//        index_1.setText(String.valueOf(copy_array_4[1]));
//        index_2.setText(String.valueOf(copy_array_4[2]));
//        index_3.setText(String.valueOf(copy_array_4[3]));
//        index_4.setText(String.valueOf(copy_array_4[4]));
//        sort_method_variable_key.setVisibility(View.VISIBLE);
//        sort_method_variable_key.setText(String.valueOf(array[inc]));
//        }