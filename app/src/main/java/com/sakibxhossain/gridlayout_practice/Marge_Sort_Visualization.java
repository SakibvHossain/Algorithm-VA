package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

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

import java.util.Arrays;

public class Marge_Sort_Visualization extends AppCompatActivity {

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

    //array elements
    ImageView array_item_6, array_item_4, array_item_3, array_item_9;

    //level 1 split elements
    Placeholder level_1_item_6, level_1_item_4, level_1_item_3, level_1_item_9;
    //level 2 split elements
    ImageView level_2_item_6, level_2_item_4, level_2_item_3, level_2_item_9;
    //level 3 swap elements
    ImageView level_3_item_4, level_3_item_6, level_3_item_3, level_3_item_9;
    //level 4 swap elements
    ImageView level_4_item_3, level_4_item_4, level_4_item_6, level_4_item_9;

    //shifter
    Placeholder array_item_6_go_to_level_1, array_item_4_go_to_level_1
            , array_item_3_go_to_level_1, array_item_9_go_to_level_1
            , array_item_6_go_to_level_2, array_item_4_go_to_level_2;


    //array
    public int[] array = {6,4,3,9};

    Animation fade_in, fade_out;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marge_sort_visualization);

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
        print_array = findViewById(R.id.print_marge_visualized_sorted_array);
        //Print array
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

        array_item_6= findViewById(R.id.array_item_6);
        array_item_4= findViewById(R.id.array_item_4);
        array_item_3= findViewById(R.id.array_item_3);
        array_item_9= findViewById(R.id.array_item_9);

        //level 1 split elements
         level_1_item_6 = findViewById(R.id.level_1_item_6);
         level_1_item_4 = findViewById(R.id.level_1_item_4);
         level_1_item_3 = findViewById(R.id.level_1_item_3);
         level_1_item_9 = findViewById(R.id.level_1_item_9);
        //level 2 split elements
         level_2_item_6= findViewById(R.id.level_2_item_6);
         level_2_item_4= findViewById(R.id.level_2_item_4);
         level_2_item_3= findViewById(R.id.level_2_item_3);
         level_2_item_9= findViewById(R.id.level_2_item_9);
        //level 3 swap elements
         level_3_item_4= findViewById(R.id.level_3_item_4);
         level_3_item_6= findViewById(R.id.level_3_item_6);
         level_3_item_3= findViewById(R.id.level_3_item_3);
         level_3_item_9= findViewById(R.id.level_3_item_9);
        //level 4 swap elements
        level_4_item_3= findViewById(R.id.level_4_item_3);
        level_4_item_4= findViewById(R.id.level_4_item_4);
        level_4_item_6= findViewById(R.id.level_4_item_6);
        level_4_item_9= findViewById(R.id.level_4_item_9);

        //shifter
        array_item_4_go_to_level_1 = findViewById(R.id.array_item_4_go_to_level_1);
        array_item_6_go_to_level_1 = findViewById(R.id.array_item_6_go_to_level_1);
        array_item_3_go_to_level_1 = findViewById(R.id.array_item_3_go_to_level_1);
        array_item_9_go_to_level_1 = findViewById(R.id.array_item_9_go_to_level_1);

        //animation
        fade_in = AnimationUtils.loadAnimation(Marge_Sort_Visualization.this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(Marge_Sort_Visualization.this, R.anim.fade_out);


        //back btn
        analysis_back_btn = findViewById(R.id.marge_sort_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Marge_Sort_Visualization.this,Marge_Sort_Description.class);
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

        //Visualization operations
        //back operations
        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(count > 0){
                    count--;
                    back_track = count + 1;
                    if(count == 1){
                        array_item_6.setVisibility(View.INVISIBLE);
                        array_item_4.setVisibility(View.INVISIBLE);
                        array_item_3.setVisibility(View.INVISIBLE);
                        array_item_9.setVisibility(View.INVISIBLE);
                    }else if(count == 6){
                        move_6_level_1_shifter_animation();
                        move_4_level_1_shifter_animation();
                        move_6_level_1_animation();
                        move_4_level_1_animation();
                    }else if(count == 9){
                        level_2_item_6.setAnimation(fade_out);
                        level_2_item_6.setVisibility(View.INVISIBLE);
                    }else if(count == 12){
                        level_2_item_4.setAnimation(fade_out);
                        level_2_item_4.setVisibility(View.INVISIBLE);
                    }else if(count == 21){
                        level_3_item_4.setAnimation(fade_out);
                        level_3_item_4.setVisibility(View.INVISIBLE);
                    }else if(count == 32){
                        move_3_level_1_shifter_animation();
                        move_9_level_1_shifter_animation();
                        move_3_level_1_animation();
                        move_9_level_1_animation();
                    }else if(count == 35){
                        level_2_item_3.setVisibility(View.INVISIBLE);
                        level_2_item_3.setAnimation(fade_out);
                    }else if(count == 38){
                        level_2_item_9.setVisibility(View.INVISIBLE);
                        level_2_item_9.setAnimation(fade_out);
                    }else if(count == 46){
                        level_3_item_3.setVisibility(View.INVISIBLE);
                        level_3_item_3.setAnimation(fade_out);
                    }else if(count == 49){
                        level_3_item_9.setVisibility(View.INVISIBLE);
                        level_3_item_9.setAnimation(fade_out);
                    }else if(count == 62){
                        level_4_item_3.setVisibility(View.INVISIBLE);
                        level_4_item_3.setAnimation(fade_out);
                    }else if(count == 65){
                        level_4_item_4.setVisibility(View.INVISIBLE);
                        level_4_item_4.setAnimation(fade_out);
                    }else if(count == 69){
                        level_4_item_6.setVisibility(View.INVISIBLE);
                        level_4_item_6.setAnimation(fade_out);
                    }else if(count == 72){
                        level_4_item_9.setVisibility(View.INVISIBLE);
                        level_4_item_9.setAnimation(fade_out);
                    }else if(count == 84){
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
                        if(count == 2){
                            array_item_6.setVisibility(View.VISIBLE);
                            array_item_4.setVisibility(View.VISIBLE);
                            array_item_3.setVisibility(View.VISIBLE);
                            array_item_9.setVisibility(View.VISIBLE);
                        }else if(count == 7){
                            move_6_level_1_shifter_animation();
                            move_4_level_1_shifter_animation();
                            move_6_level_1_animation();
                            move_4_level_1_animation();
                        }else if(count == 10){
                            level_2_item_6.setVisibility(View.VISIBLE);
                            level_2_item_6.setAnimation(fade_in);
                        }else if(count == 13){
                            level_2_item_4.setVisibility(View.VISIBLE);
                            level_2_item_4.setAnimation(fade_in);
                        }else if(count == 22){
                            level_3_item_4.setVisibility(View.VISIBLE);
                            level_3_item_4.setAnimation(fade_in);
                        }else if(count == 25){
                            level_3_item_6.setVisibility(View.VISIBLE);
                            level_3_item_6.setAnimation(fade_in);
                        }else if(count == 33){
                            move_3_level_1_shifter_animation();
                            move_9_level_1_shifter_animation();
                            move_3_level_1_animation();
                            move_9_level_1_animation();
                        }else if(count == 36){
                            level_2_item_3.setVisibility(View.VISIBLE);
                            level_2_item_3.setAnimation(fade_in);
                        }else if(count == 39){
                            level_2_item_9.setVisibility(View.VISIBLE);
                            level_2_item_9.setAnimation(fade_in);
                        }else if(count == 47){
                            level_3_item_3.setVisibility(View.VISIBLE);
                            level_3_item_3.setAnimation(fade_in);
                        }else if(count == 50){
                            level_3_item_9.setVisibility(View.VISIBLE);
                            level_3_item_9.setAnimation(fade_in);
                        }else if(count == 63){
                            level_4_item_3.setVisibility(View.VISIBLE);
                            level_4_item_3.setAnimation(fade_in);
                        }else if(count == 66){
                            level_4_item_4.setVisibility(View.VISIBLE);
                            level_4_item_4.setAnimation(fade_in);
                        }else if(count == 70){
                            level_4_item_6.setVisibility(View.VISIBLE);
                            level_4_item_6.setAnimation(fade_in);
                        }else if(count == 73){
                            level_4_item_9.setVisibility(View.VISIBLE);
                            level_4_item_9.setAnimation(fade_in);
                        }else if(count == 85){
                            print_array.setVisibility(View.VISIBLE);
                            print_array.setText("[3, 4, 6, 9]");
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


    private void move_4_level_1_shifter_animation() {
        array_item_4 = findViewById(R.id.array_item_4);
        array_item_4_go_to_level_1 = findViewById(R.id.array_item_4_go_to_level_1);
        //element handling hooks

        float temp = 0f;
        float startX = array_item_4_go_to_level_1.getY();
        float startX2 = array_item_4.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(array_item_4_go_to_level_1, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_4, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_6_level_1_shifter_animation() {
        array_item_6 = findViewById(R.id.array_item_6);
        array_item_6_go_to_level_1 = findViewById(R.id.array_item_6_go_to_level_1);
        //element handling hooks

        float temp = 0f;
        float startX = array_item_6_go_to_level_1.getY();
        float startX2 = array_item_6.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(array_item_6_go_to_level_1, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_6, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_4_level_1_animation() {
        array_item_4 = findViewById(R.id.array_item_4);
        level_1_item_4 = findViewById(R.id.level_1_item_4);
        //element handling hooks

        float temp = 0f;
        float startX = level_1_item_4.getX();
        float startX2 = array_item_4.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(level_1_item_4, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_4, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_6_level_1_animation() {
        array_item_6 = findViewById(R.id.array_item_6);
        level_1_item_6 = findViewById(R.id.level_1_item_6);
        //element handling hooks

        float temp = 0f;
        float startX = level_1_item_6.getX();
        float startX2 = array_item_6.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(level_1_item_6, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_6, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }


    private void move_3_level_1_shifter_animation() {
        array_item_3 = findViewById(R.id.array_item_3);
        array_item_3_go_to_level_1 = findViewById(R.id.array_item_3_go_to_level_1);
        //element handling hooks

        float temp = 0f;
        float startX = array_item_3_go_to_level_1.getY();
        float startX2 = array_item_3.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(array_item_3_go_to_level_1, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_3, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_9_level_1_shifter_animation() {
        array_item_9 = findViewById(R.id.array_item_9);
        array_item_9_go_to_level_1 = findViewById(R.id.array_item_9_go_to_level_1);
        //element handling hooks

        float temp = 0f;
        float startX = array_item_9_go_to_level_1.getY();
        float startX2 = array_item_9.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(array_item_9_go_to_level_1, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_9, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_3_level_1_animation() {
        array_item_3 = findViewById(R.id.array_item_3);
        level_1_item_3 = findViewById(R.id.level_1_item_3);
        //element handling hooks

        float temp = 0f;
        float startX = level_1_item_3.getX();
        float startX2 = array_item_3.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(level_1_item_3, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_3, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void move_9_level_1_animation() {
        array_item_9 = findViewById(R.id.array_item_9);
        level_1_item_9 = findViewById(R.id.level_1_item_9);
        //element handling hooks

        float temp = 0f;
        float startX = level_1_item_9.getX();
        float startX2 = array_item_9.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(level_1_item_9, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(array_item_9, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }





    //back



}