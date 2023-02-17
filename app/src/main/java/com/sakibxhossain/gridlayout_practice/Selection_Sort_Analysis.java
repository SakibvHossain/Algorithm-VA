package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

import java.util.Arrays;

public class Selection_Sort_Analysis extends AppCompatActivity {

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
      LinearLayout sortMethodExecuted
                 , sortMethodVariable
                 , sortMethodSwapOperation
                 , sortMethodVariable_n
                 , sortMethodVariable_i
                 , sortMethodVariable_j
                 , sortMethodVariable_minIdx
                 , sortMethodVariable_Temp
                 , sortMethodVariable_arr_minIdx
                 , sortMethodVariable_arr_i
                 , isSorted_method_executed
                 , isSorted_method_variable
                 , isSorted_operation_1
                 , isSorted_operation_2
                 , isSorted_operation_3
                 , isSorted_operation_4
                 , isSorted_operation_5;

      TextView  sortMethodVariable_n_value
              , sortMethodVariable_i_value
              , sortMethodVariable_minIdx_value
              , sortMethodVariable_j_value
              , isSorted_operation_value1
              , isSorted_operation_value2
              , isSorted_operation_value3
              , isSorted_operation_value4
              , isSorted_operation_value5
              , isSorted_operation_Condition1
              , isSorted_operation_Condition2
              , isSorted_operation_Condition3
              , isSorted_operation_Condition4
              , isSorted_operation_Condition5;
      //swap
      TextView sortMethodVariable_Temp_value, sortMethodVariable_arr_minIdx_value
              , sortMethodVariable_arr_i_value;
    //sort method

    //
     TextView print_sorted_array;
    //

    //track array operations
      int count = -1;
    //track array operations

    // Algorithm sort method  track
    public int[] arr = {4, 8, 2, 9, 5};
    int[] copy_initial_array = Arrays.copyOf(arr,arr.length);
    int inc = 0;
    int[] copy_array_1, copy_array_2, copy_array_3, copy_array_4;
    // Algorithm sort method track

    //Tracking operations
      int back_track = 0;
      int forward_track = 0;
    //Tracking operations

    //counting algo operations
      int algo_operations = 1;
    //counting algo operations

    // increment i
    int i = 0;
    int j = 0;
    boolean is_time_to_increment = false;

    // 2nd increment of j
    int j2 = 0;
    int min_idx2 = 0;
    // 3rd increment of j
    int j3 = 0;
    int min_idx3 = 0;
    // 4th increment of j
    int j4 = 0;
    int min_idx4 = 0;

    // Track isSorted method
    int isSorted_for_i = 1;

    //Tracking array operation access
     boolean dont_give_permission_21_to_access = true;
     boolean dont_give_permission_35_to_access = true;
     boolean dont_give_permission_47_to_access = true;
     boolean dont_give_permission_57_to_access = true;


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

        //printing array hooks
          //LinearLayout
          isSorted_method_executed = findViewById(R.id.isSorted_executed);
          isSorted_method_variable = findViewById(R.id.isSorted_method_variables);
          isSorted_operation_1 = findViewById(R.id.isSorted_operation_1);
          isSorted_operation_2 = findViewById(R.id.isSorted_operation_2);
          isSorted_operation_3 = findViewById(R.id.isSorted_operation_3);
          isSorted_operation_4 = findViewById(R.id.isSorted_operation_4);
          isSorted_operation_5 = findViewById(R.id.isSorted_operation_5);
          //LinearLayout

          //TextView
          //value
          isSorted_operation_value1 = findViewById(R.id.isSorted_operation_1_value);
          isSorted_operation_value2 = findViewById(R.id.isSorted_operation_2_value);
          isSorted_operation_value3 = findViewById(R.id.isSorted_operation_3_value);
          isSorted_operation_value4 = findViewById(R.id.isSorted_operation_4_value);
          isSorted_operation_value5 = findViewById(R.id.isSorted_operation_5_value);
          //condition
          isSorted_operation_Condition1 = findViewById(R.id.isSorted_operation_1_condition);
          isSorted_operation_Condition2 = findViewById(R.id.isSorted_operation_2_condition);
          isSorted_operation_Condition3 = findViewById(R.id.isSorted_operation_3_condition);
          isSorted_operation_Condition4 = findViewById(R.id.isSorted_operation_4_condition);
          isSorted_operation_Condition5 = findViewById(R.id.isSorted_operation_5_condition);
          //TextView
        //printing array hooks


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
                , selection_19, selection_20, selection_19
                , selection_20, selection_19, selection_20
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
                        if(count == 73){
                            print_sorted_array.setVisibility(View.INVISIBLE);
                        }else if(count == 0){
                            layoutMainExecuted.setVisibility(View.INVISIBLE);
                            layoutMainVariable.setVisibility(View.INVISIBLE);
                        }else if(count == 1){
                            arrayMainExecuted.setVisibility(View.INVISIBLE);
                        }else if(count == 2){
                            sortMethodExecuted.setVisibility(View.INVISIBLE);
                            sortMethodVariable.setVisibility(View.INVISIBLE);
                        }else if(count == 4){
                            sortMethodVariable_n.setVisibility(View.GONE);
                        }else if(count == 5){
                            sortMethodVariable_i.setVisibility(View.GONE);
                        }else if(count == 6){
                            sortMethodVariable_minIdx.setVisibility(View.GONE);
                            is_time_to_increment = false;
                        }else if(count == 7){
                            j--;
                            sortMethodVariable_j.setVisibility(View.GONE);
                        }else if(count == 9 || count == 13 || count == 15){
                            j--;
                            sortMethodVariable_j_value.setText(String.valueOf(j));
                        }else if(count == 11){
                            sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                        }else if(count == 17){
                            sortMethodVariable_j_value.setText(String.valueOf(j));
                            sortMethodSwapOperation.setVisibility(View.GONE);
                        }else if(count == 18){
                            sortMethodSwapOperation.setVisibility(View.GONE);
                            sortMethodVariable_Temp.setVisibility(View.GONE);
                        }else if(count == 19){
                            sortMethodVariable_arr_minIdx.setVisibility(View.GONE);
                        }else if(count == 20){
                            sortMethodVariable_arr_i.setVisibility(View.GONE);
                            arr_index_0.setText(String.valueOf(copy_initial_array[0]));
                            arr_index_1.setText(String.valueOf(copy_initial_array[1]));
                            arr_index_2.setText(String.valueOf(copy_initial_array[2]));
                            arr_index_3.setText(String.valueOf(copy_initial_array[3]));
                            arr_index_4.setText(String.valueOf(copy_initial_array[4]));
                        }else if(count == 21){
                            i--;
                            sortMethodVariable_i_value.setText(String.valueOf(i));
                        }else if(count == 22){
                            j2 = 0;
                            sortMethodVariable_minIdx_value.setText(String.valueOf(2));
                        }else if(count == 23 || count == 27 || count == 29 || count == 25 || count == 31){
                            if(count == 23){
                                j2--;
                                sortMethodVariable_j_value.setText(String.valueOf(0));
                            }else if(count == 25){
                                sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                            }else if(count == 31){
                                sortMethodVariable_j_value.setText(String.valueOf(j2));
                            }else{
                                j2--;
                                sortMethodVariable_j_value.setText(String.valueOf(j2));
                            }
                        }else if(count == 32 || count == 33 || count == 34){
                            if(count == 32){
                                sortMethodVariable_Temp_value.setText(String.valueOf(copy_initial_array[2]));
                            }else if(count == 33){
                                sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_initial_array[0]));
                            }else{
                                dont_give_permission_35_to_access = false;
                                sortMethodVariable_arr_i_value.setText(String.valueOf(copy_initial_array[2]));
                                arr_index_0.setText(String.valueOf(copy_array_1[0]));
                                arr_index_1.setText(String.valueOf(copy_array_1[1]));
                                arr_index_2.setText(String.valueOf(copy_array_1[2]));
                                arr_index_3.setText(String.valueOf(copy_array_1[3]));
                                arr_index_4.setText(String.valueOf(copy_array_1[4]));
                            }
                        }else if(count == 35){
                            i--;
                            sortMethodVariable_i_value.setText(String.valueOf(i));
                        }else if(count == 36){
                            j3 = 0;
                            sortMethodVariable_minIdx_value.setText(String.valueOf(2));
                        }else if(count == 37 || count == 39 || count == 41 || count == 43){
                            if(count == 37){
                                j3--;
                                sortMethodVariable_j_value.setText(String.valueOf(0));
                            }else if(count == 41){
                                sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                            }else if(count == 43){
                                sortMethodVariable_j_value.setText(String.valueOf(j3));
                            }else{
                                j3--;
                                sortMethodVariable_j_value.setText(String.valueOf(j3));
                            }
                        }else if(count == 44 || count == 45 || count == 46){
                            if(count == 44){
                                sortMethodVariable_Temp_value.setText(String.valueOf(copy_array_1[2]));
                            }else if(count == 45){
                                sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_array_1[1]));
                            }else{
                                dont_give_permission_47_to_access = false;
                                sortMethodVariable_arr_i_value.setText(String.valueOf(copy_array_1[2]));
                                arr_index_0.setText(String.valueOf(copy_array_2[0]));
                                arr_index_1.setText(String.valueOf(copy_array_2[1]));
                                arr_index_2.setText(String.valueOf(copy_array_2[2]));
                                arr_index_3.setText(String.valueOf(copy_array_2[3]));
                                arr_index_4.setText(String.valueOf(copy_array_2[4]));
                            }
                        }else if(count == 47){
                            i--;
                            sortMethodVariable_i_value.setText(String.valueOf(i));
                        }else if(count == 48){
                            j4 = 0;
                            sortMethodVariable_minIdx_value.setText(String.valueOf(4));
                        }else if(count == 49 || count == 51 || count == 53 ){
                            if(count == 49){
                                j4--;
                                sortMethodVariable_j_value.setText(String.valueOf(0));
                            }else if(count == 51){
                                sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                            }else{
                                sortMethodVariable_j_value.setText(String.valueOf(j4));
                            }
                        }else if(count == 54 || count == 55 || count == 56){
                            if(count == 54){
                                sortMethodVariable_Temp_value.setText(String.valueOf(copy_array_2[4]));
                            }else if(count == 55){
                                sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_array_2[2]));
                            }else{
                                dont_give_permission_57_to_access = false;
                                sortMethodVariable_arr_i_value.setText(String.valueOf(copy_array_2[4]));
                                arr_index_0.setText(String.valueOf(copy_array_3[0]));
                                arr_index_1.setText(String.valueOf(copy_array_3[1]));
                                arr_index_2.setText(String.valueOf(copy_array_3[2]));
                                arr_index_3.setText(String.valueOf(copy_array_3[3]));
                                arr_index_4.setText(String.valueOf(copy_array_3[4]));
                            }
                        }else if(count == 59){
                            isSorted_method_executed.setVisibility(View.GONE);
                            isSorted_method_variable.setVisibility(View.GONE);
                        }else if(count == 62 || count == 63 || count == 64 || count == 66 || count == 68){
                            if(count == 62){
                                isSorted_for_i = 1;
                                isSorted_operation_1.setVisibility(View.GONE);
                            }else if(count == 63){
                                isSorted_operation_Condition1.setText("");
                            }else{
                                isSorted_for_i--;
                                isSorted_operation_Condition1.setText(getString(R.string.condition_false));
                                isSorted_operation_value1.setText(String.valueOf(isSorted_for_i));
                            }
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
                             if(count == 74){
                                 print_sorted_array.setVisibility(View.VISIBLE);
                                 print_sorted_array.setText(String.valueOf(Arrays.toString(arr)));
                             }else if(count == 76){
                                 Toast.makeText(Selection_Sort_Analysis.this,"Program Terminated", Toast.LENGTH_SHORT).show();
                             }else if(count == 1){
                                 layoutMainExecuted.setVisibility(View.VISIBLE);
                                 layoutMainVariable.setVisibility(View.VISIBLE);
                             }else if(count == 2){
                                 arr_index_0.setText(String.valueOf(arr[0]));
                                 arr_index_1.setText(String.valueOf(arr[1]));
                                 arr_index_2.setText(String.valueOf(arr[2]));
                                 arr_index_3.setText(String.valueOf(arr[3]));
                                 arr_index_4.setText(String.valueOf(arr[4]));
                                 arrayMainExecuted.setVisibility(View.VISIBLE);
                             }else if(count == 3){
                                 sortMethodExecuted.setVisibility(View.VISIBLE);
                                 sortMethodVariable.setVisibility(View.VISIBLE);
                             }else if(count == 5){
                                 sortMethodVariable_n.setVisibility(View.VISIBLE);
                                 sortMethodVariable_n_value.setText(String.valueOf(arr.length));
                             }else if(count == 6){
                                 sortMethodVariable_i.setVisibility(View.VISIBLE);
                                 sortMethodVariable_i_value.setText(String.valueOf(i));
                             }else if(count == 7){
                                 sortMethodVariable_minIdx.setVisibility(View.VISIBLE);
                                 sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                                 is_time_to_increment = true;
                             }else if(count == 8 || count == 10 || count == 14 || count == 16){
                                 j++;
                                 sortMethodVariable_j.setVisibility(View.VISIBLE);
                                 sortMethodVariable_j_value.setText(String.valueOf(j));
                             }else if(count == 12){
                                 sortMethodVariable_minIdx_value.setText(String.valueOf(j));
                             }else if(count == 18){
                                 sortMethodVariable_j_value.setText(String.valueOf(0));
                             }else if(count == 19){
                                 if(dont_give_permission_21_to_access){
                                     sortMethodSwapOperation.setVisibility(View.VISIBLE);
                                     sortMethodVariable_Temp.setVisibility(View.VISIBLE);
                                     sortMethodVariable_Temp_value.setText(String.valueOf(arr[2]));
                                 }else{
                                     sortMethodSwapOperation.setVisibility(View.VISIBLE);
                                     sortMethodVariable_Temp.setVisibility(View.VISIBLE);
                                     sortMethodVariable_Temp_value.setText(String.valueOf(copy_initial_array[2]));
                                 }
                             }else if(count == 20){
                                 if(dont_give_permission_21_to_access){
                                     sortMethodVariable_arr_minIdx.setVisibility(View.VISIBLE);
                                     sortMethodVariable_arr_minIdx_value.setText(String.valueOf(arr[0]));
                                 }else{
                                     sortMethodVariable_arr_minIdx.setVisibility(View.VISIBLE);
                                     sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_initial_array[0]));
                                 }
                             }else if(count == 21){
                                 if(dont_give_permission_21_to_access){
                                     sortMethodVariable_arr_i.setVisibility(View.VISIBLE);
                                     sortMethodVariable_arr_i_value.setText(String.valueOf(arr[2]));
                                     sort_selection_sort(arr);
                                     dont_give_permission_21_to_access = false;
                                 }else{
                                     sortMethodVariable_arr_i.setVisibility(View.VISIBLE);
                                     sortMethodVariable_arr_i_value.setText(String.valueOf(copy_initial_array[2]));
                                 }
                                 arr_index_0.setText(String.valueOf(copy_array_1[0]));
                                 arr_index_1.setText(String.valueOf(copy_array_1[1]));
                                 arr_index_2.setText(String.valueOf(copy_array_1[2]));
                                 arr_index_3.setText(String.valueOf(copy_array_1[3]));
                                 arr_index_4.setText(String.valueOf(copy_array_1[4]));
                             }else if(count == 22){
                                 i++;
                                 sortMethodVariable_i_value.setText(String.valueOf(i));
                             }else if(count == 23){
                                 sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                                 j2 = i;
                             }else if(count == 24 || count == 28 || count == 30 || count == 26 || count == 32){
                                 if(count == 26){
                                     min_idx2 = j2;
                                     sortMethodVariable_minIdx_value.setText(String.valueOf(j2));
                                 }else if(count == 32){
                                     sortMethodVariable_j_value.setText(String.valueOf(0));
                                 }else{
                                     j2++;
                                     sortMethodVariable_j_value.setText(String.valueOf(j2));
                                 }
                             }else if(count == 33 || count == 34 || count == 35){
                                 if(count == 33){
                                     sortMethodVariable_Temp_value.setText(String.valueOf(copy_array_1[2]));
                                 }else if(count == 34){
                                     sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_array_1[1]));
                                 }else{
                                     if(dont_give_permission_35_to_access){
                                         sort_selection_sort(arr);
                                     }
                                     sortMethodVariable_arr_i_value.setText(String.valueOf(copy_array_1[2]));
                                     arr_index_0.setText(String.valueOf(copy_array_2[0]));
                                     arr_index_1.setText(String.valueOf(copy_array_2[1]));
                                     arr_index_2.setText(String.valueOf(copy_array_2[2]));
                                     arr_index_3.setText(String.valueOf(copy_array_2[3]));
                                     arr_index_4.setText(String.valueOf(copy_array_2[4]));
                                 }
                             }else if(count == 36){
                                 i++;
                                 sortMethodVariable_i_value.setText(String.valueOf(i));
                             }else if(count == 37){
                                 sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                                 j3 = i;
                             }else if(count == 38 || count == 40 || count == 42 || count == 44 ){
                                 if(count == 42){
                                     min_idx3 = j3;
                                     sortMethodVariable_minIdx_value.setText(String.valueOf(j3));
                                 }else if(count == 44){
                                     sortMethodVariable_j_value.setText(String.valueOf(0));
                                 }else{
                                     j3++;
                                     sortMethodVariable_j_value.setText(String.valueOf(j3));
                                 }
                             } else if(count == 45 || count == 46 || count == 47){
                                 if(count == 45){
                                     sortMethodVariable_Temp_value.setText(String.valueOf(copy_array_2[4]));
                                 }else if(count == 46){
                                     sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_array_2[2]));
                                 }else{
                                     if(dont_give_permission_47_to_access){
                                         sort_selection_sort(arr);
                                     }
                                     sortMethodVariable_arr_i_value.setText(String.valueOf(copy_array_2[4]));
                                     arr_index_0.setText(String.valueOf(copy_array_3[0]));
                                     arr_index_1.setText(String.valueOf(copy_array_3[1]));
                                     arr_index_2.setText(String.valueOf(copy_array_3[2]));
                                     arr_index_3.setText(String.valueOf(copy_array_3[3]));
                                     arr_index_4.setText(String.valueOf(copy_array_3[4]));
                                 }
                             } else if(count == 48){
                                 i++;
                                 sortMethodVariable_i_value.setText(String.valueOf(i));
                             }else if(count == 49){
                                 sortMethodVariable_minIdx_value.setText(String.valueOf(i));
                                 j4 = i;
                             }else if(count == 50 || count == 52 || count == 54 ){
                                 if(count == 52){
                                     min_idx4 = j4;
                                     sortMethodVariable_minIdx_value.setText(String.valueOf(j4));
                                 }else if(count == 54){
                                     sortMethodVariable_j_value.setText(String.valueOf(0));
                                 }else{
                                     j4++;
                                     sortMethodVariable_j_value.setText(String.valueOf(j4));
                                 }
                             }else if(count == 55 || count == 56 || count == 57){
                                 if(count == 55){
                                     sortMethodVariable_Temp_value.setText(String.valueOf(copy_array_3[4]));
                                 }else if(count == 56){
                                     sortMethodVariable_arr_minIdx_value.setText(String.valueOf(copy_array_3[3]));
                                 }else{
                                     if(dont_give_permission_57_to_access){
                                         sort_selection_sort(arr);
                                     }
                                     sortMethodVariable_arr_i_value.setText(String.valueOf(copy_array_3[4]));
                                     arr_index_0.setText(String.valueOf(copy_array_4[0]));
                                     arr_index_1.setText(String.valueOf(copy_array_4[1]));
                                     arr_index_2.setText(String.valueOf(copy_array_4[2]));
                                     arr_index_3.setText(String.valueOf(copy_array_4[3]));
                                     arr_index_4.setText(String.valueOf(copy_array_4[4]));
                                 }
                             }else if(count == 59){
                                 Toast.makeText(Selection_Sort_Analysis.this,"End of Sort method",Toast.LENGTH_SHORT).show();
                             }else if(count == 60){
                                 isSorted_method_executed.setVisibility(View.VISIBLE);
                                 isSorted_method_variable.setVisibility(View.VISIBLE);
                             }else if(count == 63 || count == 64 || count == 65 || count == 67 || count == 69){
                                 if(count == 63){
                                     isSorted_operation_1.setVisibility(View.VISIBLE);
                                     isSorted_operation_value1.setText(String.valueOf(isSorted_for_i));
                                 }else if(count == 64){
                                     isSorted_operation_Condition1.setText(getString(R.string.condition_false));
                                 }else{
                                     isSorted_for_i++;
                                     isSorted_operation_value1.setText(String.valueOf(isSorted_for_i));
                                 }
                             }else if(count == 73){
                                 Toast.makeText(Selection_Sort_Analysis.this,"isSorted method terminated",Toast.LENGTH_SHORT).show();
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
                Intent goBack = new Intent(Selection_Sort_Analysis.this, Sorting_Description_Section.class);
                startActivity(goBack);
            }
        });
    }

    public void sort_selection_sort(int[] arr){

        int n = arr.length;
        for(int i=inc; i<n -1; i++){
            int min_inx = i;
            for(int j = i+1; j<n; j++){
                if(arr[j] < arr[min_inx]){
                    min_inx = j;
                }
            }
            int temp = arr[min_inx];
            arr[min_inx] = arr[i];
            arr[i] = temp;
            updateArray(arr);
            break;
        }
    }

    public void updateArray(int[] arr){
        if(inc == 0){
            copy_array_1 = Arrays.copyOf(arr,arr.length);
        }else if(inc == 1){
            copy_array_2 = Arrays.copyOf(arr,arr.length);
        }else if(inc == 2){
            copy_array_3 = Arrays.copyOf(arr,arr.length);
        }else if(inc == 3){
            copy_array_4 = Arrays.copyOf(arr,arr.length);
        }
        inc++;
    }


}