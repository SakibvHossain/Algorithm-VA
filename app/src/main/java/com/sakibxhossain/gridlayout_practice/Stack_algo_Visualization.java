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

public class Stack_algo_Visualization extends AppCompatActivity {

    ImageView stack_visualization_back_btn;

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

    //Where image will be placed
    Placeholder item_10_placeholder, item_20_placeholder, item_30_placeholder;
    //helping to enter to the stack
    Placeholder place_item_10_to_stack, place_item_20_to_stack, place_item_30_to_stack;
    //pop from stack 30
    Placeholder pop_item_30_from_stack;
    //item images
    ImageView item_30, item_20, item_10;
    //animation
    Animation fade_in, fade_out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_algo_visualization);

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


        //Where image will be placed
        item_10_placeholder = findViewById(R.id.item_10_placeholder);
        item_20_placeholder = findViewById(R.id.item_20_placeholder);
        item_30_placeholder = findViewById(R.id.item_30_placeholder);

        //helping to enter to the stack
        place_item_10_to_stack = findViewById(R.id.place_item_10_to_stack);
        place_item_20_to_stack = findViewById(R.id.place_item_20_to_stack);
        place_item_30_to_stack = findViewById(R.id.place_item_30_to_stack);

        //pop from stack item 30
        pop_item_30_from_stack = findViewById(R.id.pop_item_30_from_stack);

        // item image
        item_10 = findViewById(R.id.item_10);
        item_20 = findViewById(R.id.item_20);
        item_30 = findViewById(R.id.item_30);

        //animation
        fade_in = AnimationUtils.loadAnimation(Stack_algo_Visualization.this,R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(Stack_algo_Visualization.this,R.anim.fade_out);

        //back btn
        stack_visualization_back_btn = findViewById(R.id.stack_visualization_back_btn);
        stack_visualization_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Stack_algo_Visualization.this, Stack_Description.class);
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
                    if(count == 6) {
                        item_10.setAnimation(fade_out);
                        item_10.setVisibility(View.INVISIBLE);
                        place_item_10_to_placeholder_animation();
                    }else if(count == 10){
                        place_item_10_to_stack_animation();
                    }else if(count == 11){
                        print_stack_item_1.setVisibility(View.GONE);
                    }else if(count == 14){
                        item_20.setAnimation(fade_out);
                        item_20.setVisibility(View.INVISIBLE);
                        place_item_20_to_placeholder_animation();
                    }else if(count == 18){
                        place_item_20_to_stack_animation();
                    }else if(count == 19){
                        print_stack_item_2.setVisibility(View.GONE);
                    }else if(count == 22){
                        item_30.setAnimation(fade_out);
                        item_30.setVisibility(View.INVISIBLE);
                        place_item_30_to_placeholder_animation();
                    }else if(count == 26){
                        place_item_30_to_stack_animation();
                    }else if(count == 27){
                        print_stack_item_3.setVisibility(View.GONE);
                    }else if(count == 34){
                        remove_item_30_from_stack_animation();
                        removed_item_30_animation();
                        item_30.setAnimation(fade_in);
                        item_30.setVisibility(View.VISIBLE);
                    }else if(count == 36){
                        print_poped_item.setVisibility(View.GONE);
                    }else if(count == 43){
                        print_peeked_item.setVisibility(View.GONE);
                    }else if(count == 44){
                        print_stack_array.setVisibility(View.GONE);
                    }else if(count == 48){
                        print_stack_array.setText("Elements present in stack : 20");
                    }else if(count == 50){
                        print_stack_array.setText("Elements present in stack : 20 10");
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
                        if(count == 7) {
                            item_10.setAnimation(fade_in);
                            item_10.setVisibility(View.VISIBLE);
                            place_item_10_to_placeholder_animation();
                        }else if(count == 11){
                            place_item_10_to_stack_animation();
                        }else if(count == 12){
                            print_stack_item_1.setVisibility(View.VISIBLE);
                            print_stack_item_1.setText("10 pushed into stack");
                        }else if(count == 15){
                            item_20.setAnimation(fade_in);
                            item_20.setVisibility(View.VISIBLE);
                            place_item_20_to_placeholder_animation();
                        }else if(count == 19){
                            place_item_20_to_stack_animation();
                        }else if(count == 20){
                            print_stack_item_2.setVisibility(View.VISIBLE);
                            print_stack_item_2.setText(R.string.pushed_20);
                        }else if(count == 23){
                            item_30.setAnimation(fade_in);
                            item_30.setVisibility(View.VISIBLE);
                            place_item_30_to_placeholder_animation();
                        }else if(count == 27){
                            place_item_30_to_stack_animation();
                        }else if(count == 28){
                            print_stack_item_3.setVisibility(View.VISIBLE);
                            print_stack_item_3.setText("30 pushed into stack");
                        }else if(count == 35){
                            remove_item_30_from_stack_animation();
                            removed_item_30_animation();
                            item_30.setAnimation(fade_out);
                            item_30.setVisibility(View.INVISIBLE);
                        }else if(count == 37){
                            print_poped_item.setVisibility(View.VISIBLE);
                            print_poped_item.setText("30 Popped from stack");
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

    private void removed_item_30_animation() {
        item_30 = findViewById(R.id.item_30);
        pop_item_30_from_stack = findViewById(R.id.pop_item_30_from_stack);
        //element handling hooks

        float temp = 0f;
        float startX = pop_item_30_from_stack.getX();
        float startX2 = item_30.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(pop_item_30_from_stack, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_30, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void remove_item_30_from_stack_animation() {
        item_30 = findViewById(R.id.item_30);
        item_30_placeholder = findViewById(R.id.item_30_placeholder);
        //element handling hooks

        float temp = 0f;
        float startX = item_30_placeholder.getY();
        float startX2 = item_30.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(item_30_placeholder, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_30, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }


    private void place_item_10_to_stack_animation() {
        item_10 = findViewById(R.id.item_10);
        item_10_placeholder = findViewById(R.id.item_10_placeholder);
        //element handling hooks

        float temp = 0f;
        float startX = item_10_placeholder.getY();
        float startX2 = item_10.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(item_10_placeholder, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_10, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void place_item_20_to_stack_animation() {
        item_20 = findViewById(R.id.item_20);
        item_20_placeholder = findViewById(R.id.item_20_placeholder);
        //element handling hooks

        float temp = 0f;
        float startX = item_20_placeholder.getY();
        float startX2 = item_20.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(item_20_placeholder, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_20, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
    private void place_item_30_to_stack_animation() {
        item_30 = findViewById(R.id.item_30);
        item_30_placeholder = findViewById(R.id.item_30_placeholder);
        //element handling hooks

        float temp = 0f;
        float startX = item_30_placeholder.getY();
        float startX2 = item_30.getY();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(item_30_placeholder, "y", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_30, "y", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void place_item_10_to_placeholder_animation() {
        item_10 = findViewById(R.id.item_10);
        place_item_10_to_stack = findViewById(R.id.place_item_10_to_stack);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_10_to_stack.getX();
        float startX2 = item_10.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_10_to_stack, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_10, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(500);
        animator.setDuration(500);
        animator2.start();
        animator.start();
    }
    private void place_item_20_to_placeholder_animation() {
        item_20 = findViewById(R.id.item_20);
        place_item_20_to_stack = findViewById(R.id.place_item_20_to_stack);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_20_to_stack.getX();
        float startX2 = item_20.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_20_to_stack, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_20, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(500);
        animator.setDuration(500);
        animator2.start();
        animator.start();
    }
    private void place_item_30_to_placeholder_animation() {
        item_30 = findViewById(R.id.item_30);
        place_item_30_to_stack = findViewById(R.id.place_item_30_to_stack);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_30_to_stack.getX();
        float startX2 = item_30.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_30_to_stack, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(item_30, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(500);
        animator.setDuration(500);
        animator2.start();
        animator.start();
    }
}