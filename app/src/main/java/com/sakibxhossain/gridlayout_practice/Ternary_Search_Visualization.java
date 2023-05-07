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

public class Ternary_Search_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

    //Code section textViews
    TextView ternary_3, ternary_4
            , ternary_5, ternary_6
            , ternary_7, ternary_8
            , ternary_10, ternary_13
            , ternary_16, ternary_19
            , ternary_20, ternary_26
            , ternary_27, ternary_28
            , ternary_29, ternary_30;

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

    Placeholder placeholder_1, placeholder_2, placeholder_3, placeholder_4, placeholder_5, placeholder_4_2;
    //pointer
    ImageView mid_1, mid_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternary_search_visualization);

        mid_1 = findViewById(R.id.mid_1);
        mid_2 = findViewById(R.id.mid_2);

        placeholder_2 = findViewById(R.id.placeholder_2);
        placeholder_4 = findViewById(R.id.placeholder_4);
        placeholder_5 = findViewById(R.id.placeholder_5);
        placeholder_4_2 = findViewById(R.id.placeholder_4_2);

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

        //anim
        fade_in = AnimationUtils.loadAnimation(this, R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(this, R.anim.fade_out);
        //anim

        //Print array
        print_array = findViewById(R.id.print_ternary_searched_result);
        //Print array

        //back btn
        analysis_back_btn = findViewById(R.id.ternary_search_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Ternary_Search_Visualization.this,Ternary_Search_Description.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

        ternary_3 = findViewById(R.id.ternary_03);
        ternary_4 = findViewById(R.id.ternary_04);
        ternary_5 = findViewById(R.id.ternary_05);
        ternary_6 = findViewById(R.id.ternary_06);
        ternary_7 = findViewById(R.id.ternary_07);
        ternary_8 = findViewById(R.id.ternary_08);
        ternary_10 = findViewById(R.id.ternary_10);
        ternary_13 = findViewById(R.id.ternary_13);
        ternary_16 = findViewById(R.id.ternary_16);
        ternary_19 = findViewById(R.id.ternary_19);
        ternary_20 = findViewById(R.id.ternary_20);
        ternary_26 = findViewById(R.id.ternary_26);
        ternary_27 = findViewById(R.id.ternary_27);
        ternary_28 = findViewById(R.id.ternary_28);
        ternary_29 = findViewById(R.id.ternary_29);
        ternary_30 = findViewById(R.id.ternary_30);


        TextView[] list_of_views = {
                ternary_26, ternary_27
                , ternary_28, ternary_3
                , ternary_4, ternary_5
                , ternary_6, ternary_7
                , ternary_10, ternary_13
                , ternary_16, ternary_19
                , ternary_20, ternary_4
                , ternary_5, ternary_6
                , ternary_7, ternary_8
                , ternary_20, ternary_28
                , ternary_29, ternary_30
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
                        mid_1.setVisibility(View.INVISIBLE);
                        mid_1.startAnimation(fade_out);
                        animation_toward_2();
                    }else if(count == 6){
                        mid_2.setVisibility(View.INVISIBLE);
                        mid_2.startAnimation(fade_out);
                        animation_toward_5();
                    }else if(count == 14){
                        animation_toward_4();
                    }else if(count == 15){
                        mid_2.setVisibility(View.VISIBLE);
                        mid_2.startAnimation(fade_in);
                        again_animation_4();
                    }else if(count == 16){
                        mid_1.clearColorFilter();
                    }else if(count == 21){
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
                        if(count == 6){
                            mid_1.setVisibility(View.VISIBLE);
                            mid_1.startAnimation(fade_in);
                            animation_toward_2();
                        }else if(count == 7){
                            mid_2.setVisibility(View.VISIBLE);
                            mid_2.startAnimation(fade_in);
                            animation_toward_5();
                        }else if(count == 15){
                            animation_toward_4();
                        }else if(count == 16){
                            mid_2.setVisibility(View.INVISIBLE);
                            mid_2.startAnimation(fade_out);
                            again_animation_4();
                        }else if(count == 17){
                            mid_1.setColorFilter(ContextCompat.getColor(Ternary_Search_Visualization.this, R.color.green));
                        }else if(count == 21){
                            print_array.setVisibility(View.VISIBLE);
                            print_array.setText("Found At Index 3");
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

    private void again_animation_4() {
            mid_2 = findViewById(R.id.mid_2);
            placeholder_4_2 = findViewById(R.id.placeholder_4_2);
            //element handling hooks

            float temp = 0f;
            float startX = placeholder_4_2.getX();
            float startX2 = mid_2.getX();
            float endX = startX + 0;
            float endX2 = startX2 - 0;

            temp = endX;
            endX = endX2;
            endX2 = temp;

            ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_4_2, "x", startX, endX);
            ObjectAnimator animator2 = ObjectAnimator.ofFloat(mid_2, "x", startX2, endX2);
            animator.setInterpolator(new AccelerateInterpolator());
            animator2.setInterpolator(new AccelerateInterpolator());
            animator2.setDuration(1000);
            animator.setDuration(1000);
            animator2.start();
            animator.start();
        }



    private void animation_toward_4() {
        mid_1 = findViewById(R.id.mid_1);
        placeholder_4 = findViewById(R.id.placeholder_4);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_4.getX();
        float startX2 = mid_1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_4, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mid_1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void animation_toward_5() {
        mid_2 = findViewById(R.id.mid_2);
        placeholder_5 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_5.getY();
        float startX2 = mid_2.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_5, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mid_2, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void animation_toward_2() {
        mid_1 = findViewById(R.id.mid_1);
        placeholder_2 = findViewById(R.id.placeholder_2);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_2.getY();
        float startX2 = mid_1.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_2, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(mid_1, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

}