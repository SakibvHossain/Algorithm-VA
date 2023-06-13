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

public class Binary_Search_Visualization_Action extends AppCompatActivity {

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

    //array elements
    ImageView image_1, image_3, image_4, image_5, image_6;
    //placeholders
    Placeholder placeholder_1, placeholder_3, placeholder_4;
    //searching
    ImageView binary_searching;
    //animation
    Animation fade_in, fade_out;

    //Git pull
    //New branch

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_search_visualization_action);

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

        //printing array
        print_binary_sorted_array = findViewById(R.id.print_binary_searched_result);

        //animation
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);

        //searching
        binary_searching = findViewById(R.id.binary_searching);

        //back btn
        analysis_back_btn = findViewById(R.id.binary_search_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Binary_Search_Visualization_Action.this, Binary_Search_Description.class);
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
                    if(count == 6){
                        binary_searching.setVisibility(View.INVISIBLE);
                        binary_searching.startAnimation(fade_out);
                        move_to_4();
                    }else if(count == 13){
                        move_to_4_again();
                    }else if(count == 11){
                        move_to_3();
                    }else if(count == 16){
                        binary_searching.setColorFilter(ContextCompat.getColor(Binary_Search_Visualization_Action.this, R.color.red));
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
                        if(count == 7){
                            binary_searching.setVisibility(View.VISIBLE);
                            binary_searching.startAnimation(fade_in);
                            move_to_4();
                        }else if(count == 12){
                            move_to_3();
                        }else if(count == 14){
                            move_to_4_again();
                        }else if(count == 17){
                            binary_searching.setColorFilter(ContextCompat.getColor(Binary_Search_Visualization_Action.this, R.color.green));
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

    private void move_to_4_again() {
        binary_searching = findViewById(R.id.binary_searching);
        placeholder_4 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_4.getX();
        float startX2 = binary_searching.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_4, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(binary_searching, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void move_to_3() {
        binary_searching = findViewById(R.id.binary_searching);
        placeholder_3 = findViewById(R.id.placeholder_2);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_3.getX();
        float startX2 = binary_searching.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_3, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(binary_searching, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void move_to_4() {
        binary_searching = findViewById(R.id.binary_searching);
        placeholder_4 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_4.getY();
        float startX2 = binary_searching.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_4, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(binary_searching, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
}