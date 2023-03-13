package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;

public class Selection_Sort_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

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
        setContentView(R.layout.activity_selection_sort_visualization);

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
          print_array = findViewById(R.id.print_sorted_array);
        //Print array

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

                    if(count==20){
                        animation_1();
                    }else if(count==34){
                        animation_2();
                    }else if(count == 46){
                        animation_3();
                    }else if(count == 56){
                        animation_4();
                    }else if(count == 73){
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
                        if(count==21){
                            animation_1();
                        }else if(count==35){
                            animation_2();
                        }else if(count == 47){
                            animation_3();
                        }else if(count == 57){
                            animation_4();
                        }else if(count == 74){
                            print_array.setVisibility(View.VISIBLE);
                        }else if(count==76){
                            Toast.makeText(Selection_Sort_Visualization.this,"Program Terminated",Toast.LENGTH_SHORT).show();
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
        //Analysis operations

        analysis_back_btn = findViewById(R.id.selection_sort_analysis_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack = new Intent(Selection_Sort_Visualization.this, Selection_Sort_Description.class);
                startActivity(goBack);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

    }

    private void animation_1(){
        //element handling hooks
        img1 = findViewById(R.id.selection_arr_1);
        img2 = findViewById(R.id.selection_arr_2);
        //element handling hooks

        float temp = 0f;
        float startX = img2.getX();
        float startX2 = img1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(img2, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void animation_2(){
        //element handling hooks
        img2 = findViewById(R.id.selection_arr_2);
        img4 = findViewById(R.id.selection_arr_4);
        //element handling hooks
        float temp = 0f;
        float startX = img4.getX();
        float startX2 = img2.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(img4, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img2, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void animation_3(){
        //element handling hooks
        img4 = findViewById(R.id.selection_arr_4);
        img3 = findViewById(R.id.selection_arr_3);
        //element handling hooks
        float temp = 0f;
        float startX = img4.getX();
        float startX2 = img3.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(img4, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img3, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void animation_4(){
        //element handling hooks
        img5 = findViewById(R.id.selection_arr_5);
        img4 = findViewById(R.id.selection_arr_4);
        //element handling hooks
        float temp = 0f;
        float startX = img5.getX();
        float startX2 = img4.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(img5, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img4, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
}