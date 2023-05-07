package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;
import androidx.core.content.ContextCompat;

import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Linear_Search_Visualization extends AppCompatActivity {

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

    Animation fade_in, fade_out;

    //images
    ImageView searching;
    Placeholder placeholder_8, placeholder_2, placeholder_5, placeholder_9, placeholder_1;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search_visualization);

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
        print_array = findViewById(R.id.print_searched_result);
        //Print array

        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);


        //back btn
        analysis_back_btn = findViewById(R.id.linear_search_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Linear_Search_Visualization.this,Linear_Search_Description.class);
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
        searching = findViewById(R.id.binary_searching);

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
                    if(count == 5){
                        searching.setVisibility(View.INVISIBLE);
                        searching.startAnimation(fade_out);
                        animation_upward();
                    }else if(count == 7){
                        move_toward_of_2();
                    }else if(count == 9){
                        move_toward_of_5();
                    }else if(count == 11){
                        move_toward_of_9();
                    }else if(count == 12){
                        searching.setColorFilter(ContextCompat.getColor(Linear_Search_Visualization.this, R.color.red));
                    }else if(count == 17){
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
                        if(count == 6){
                            searching.setVisibility(View.VISIBLE);
                            searching.startAnimation(fade_in);
                            animation_upward();
                        }else if(count == 8){
                            move_toward_of_2();
                        }else if(count == 10){
                            move_toward_of_5();
                        }else if(count == 12){
                            move_toward_of_9();
                        }else if(count == 13){
                            searching.setColorFilter(ContextCompat.getColor(Linear_Search_Visualization.this, R.color.green));
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

    private void move_toward_of_9() {
        searching = findViewById(R.id.binary_searching);
        placeholder_9 = findViewById(R.id.placeholder_4);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_9.getX();
        float startX2 = searching.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_9, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(searching, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void move_toward_of_5() {
        searching = findViewById(R.id.binary_searching);
        placeholder_5 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_5.getX();
        float startX2 = searching.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_5, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(searching, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void move_toward_of_2() {
        searching = findViewById(R.id.binary_searching);
        placeholder_2 = findViewById(R.id.placeholder_2);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_2.getX();
        float startX2 = searching.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_2, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(searching, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void animation_upward() {
        searching = findViewById(R.id.binary_searching);
        placeholder_8 = findViewById(R.id.placeholder_1);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_8.getY();
        float startX2 = searching.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_8, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(searching, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
}