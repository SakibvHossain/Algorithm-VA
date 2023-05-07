package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Placeholder;

import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.Arrays;

public class Insertion_Sort_Visualization extends AppCompatActivity {

    ImageView analysis_back_btn;

    //Handler button
    MaterialButton back_btn, forward_btn;
    //Handler TextView
    TextView initial_Count, final_Count, print_array;

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
    public int[] array = {2,8,5,9,1};

    // array elements to be visualize
    ImageView img2, img8, img5, img9, img1;
    Placeholder placeholder_2, placeholder_8, placeholder_5, placeholder_9, placeholder_1;
    // array elements to be visualize

    boolean dont_give_access_43_to_access = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort_visualization);

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

        //back btn
        analysis_back_btn = findViewById(R.id.insertion_sort_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Insertion_Sort_Visualization.this,Insertion_Sort_Description.class);
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
                    if(count == 6){
                        select_8_animation();
                    }else if(count == 9){
                        select_8_animation();
                    }else if(count == 11){
                        select_5_animation();
                    }else if(count == 14){
                        change_5_and_8_animation();
                        change_8_and_5_animation();
                    }else if(count == 17){
                        select_5_animation();
                    }else if(count == 19){
                        select_9_animation();
                    }else if(count == 22){
                        select_9_animation();
                    }else if(count == 24){
                        select_1_animation();
                    }else if(count == 27){
                        change_1_and_9_animation();
                        change_9_and_1_animation();
                    }else if(count == 30){
                        change_1_and_8_animation();
                        change_8_and_1_animation();
                    }else if(count == 33){
                        change_1_and_5_animation();
                        change_5_and_1_animation();
                    }else if(count == 36){
                        change_1_and_2_animation();
                        change_2_and_1_animation();
                    }else if(count == 39){
                        select_1_animation();
                    }else if(count == 42){
                        dont_give_access_43_to_access = false;
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
                        if(count == 7){
                            select_8_animation();
                        }else if(count == 10){
                            select_8_animation();
                        }else if(count == 12){
                            select_5_animation();
                        }else if(count == 15){
                            change_5_and_8_animation();
                            change_8_and_5_animation();
                        }else if(count == 18){
                            select_5_animation();
                        }else if(count == 20){
                            select_9_animation();
                        }else if(count == 23){
                            select_9_animation();
                        }else if(count == 25){
                            select_1_animation();
                        }else if(count == 28){
                            change_1_and_9_animation();
                            change_9_and_1_animation();
                        }else if(count == 31){
                            change_1_and_8_animation();
                            change_8_and_1_animation();
                        }else if(count == 34){
                            change_1_and_5_animation();
                            change_5_and_1_animation();
                        }else if(count == 37){
                            change_1_and_2_animation();
                            change_2_and_1_animation();
                        }else if(count == 40){
                            select_1_animation();
                        }else if(count == 43){
                            if(dont_give_access_43_to_access){
                                sort_insertion(array);
                            }
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

    private void change_2_and_1_animation() {
        img2 = findViewById(R.id.image_2);
        placeholder_1 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_1.getX();
        float startX2 = img2.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_1, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img2, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_1_and_2_animation() {
        img1 = findViewById(R.id.image_5);
        placeholder_2 = findViewById(R.id.placeholder_2);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_2.getX();
        float startX2 = img1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_2, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_8_and_1_animation() {
        img8 = findViewById(R.id.image_1);
        placeholder_1 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_1.getX();
        float startX2 = img8.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_1, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img8, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_1_and_8_animation() {
        img1 = findViewById(R.id.image_5);
        placeholder_8 = findViewById(R.id.placeholder_1);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_8.getX();
        float startX2 = img1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_8, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_5_and_1_animation() {
        img5 = findViewById(R.id.image_3);
        placeholder_1 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_1.getX();
        float startX2 = img5.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_1, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img5, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_1_and_5_animation() {
        img1 = findViewById(R.id.image_5);
        placeholder_5 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_5.getX();
        float startX2 = img1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_5, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_9_and_1_animation() {
        img9 = findViewById(R.id.image_4);
        placeholder_1 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_1.getX();
        float startX2 = img9.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_1, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img9, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_1_and_9_animation() {
        img1 = findViewById(R.id.image_5);
        placeholder_9 = findViewById(R.id.placeholder_4);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_9.getX();
        float startX2 = img1.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_9, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void select_1_animation() {
        img1 = findViewById(R.id.image_5);
        placeholder_1 = findViewById(R.id.placeholder_5);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_1.getY();
        float startX2 = img1.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_1, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img1, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void select_9_animation() {
        img9 = findViewById(R.id.image_4);
        placeholder_9 = findViewById(R.id.placeholder_4);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_9.getY();
        float startX2 = img9.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_9, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img9, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_8_and_5_animation() {
        img5 = findViewById(R.id.image_3);
        placeholder_8 = findViewById(R.id.placeholder_1);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_8.getX();
        float startX2 = img5.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_8, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img5, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void change_5_and_8_animation() {
        img8 = findViewById(R.id.image_1);
        placeholder_5 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_5.getX();
        float startX2 = img8.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_5, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img8, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void select_5_animation() {
        img5 = findViewById(R.id.image_3);
        placeholder_5 = findViewById(R.id.placeholder_3);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_5.getY();
        float startX2 = img5.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_5, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img5, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void select_8_animation() {
        img8 = findViewById(R.id.image_1);
        placeholder_8 = findViewById(R.id.placeholder_1);
        //element handling hooks

        float temp = 0f;
        float startX = placeholder_8.getY();
        float startX2 = img8.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(placeholder_8, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(img8, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void sort_insertion(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }
}