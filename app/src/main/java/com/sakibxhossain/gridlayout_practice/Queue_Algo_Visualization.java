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
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

public class Queue_Algo_Visualization extends AppCompatActivity {

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

    //todo: queue visualization section hooks

    //Printing results
    TextView print_queue_item_1, print_queue_item_2, print_queue_item_3
            , print_dequeue, print_front_queue_item, print_rare_queue_item;


    //enqueue items
    ImageView queue_item_10, queue_item_20, queue_item_30;
    //Dequeue item 10
    Placeholder dequeue_item_10_from_queue;
    //Move item to queue
    Placeholder place_item_10_to_queue, place_item_20_to_queue, place_item_30_to_queue;

    //Animation
    Animation fade_in, fade_out;
    //todo: queue visualization section hooks

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_algo_visualization);

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


        //enqueue items
        queue_item_10 = findViewById(R.id.queue_item_10);
        queue_item_20 = findViewById(R.id.queue_item_20);
        queue_item_30 = findViewById(R.id.queue_item_30);
        //Dequeue item 10
        dequeue_item_10_from_queue = findViewById(R.id.dequeue_item_10_from_queue);
        //Move item to queue
        place_item_10_to_queue =findViewById(R.id.place_item_10_to_queue);
        place_item_20_to_queue =findViewById(R.id.place_item_20_to_queue);
        place_item_30_to_queue=findViewById(R.id.place_item_30_to_queue);

        //animation
        fade_in = AnimationUtils.loadAnimation(Queue_Algo_Visualization.this,R.anim.fade_in);
        fade_out = AnimationUtils.loadAnimation(Queue_Algo_Visualization.this,R.anim.fade_out);


        //back btn
        analysis_back_btn = findViewById(R.id.queue_visualization_back_btn);
        analysis_back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Queue_Algo_Visualization.this, Queue_Description.class);
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
                    if(count == 8){
                        queue_item_10.setVisibility(View.INVISIBLE);
                        queue_item_10.setAnimation(fade_out);
                    }else if(count == 15){
                        place_item_10_to_queue_animation();
                    }else if(count == 17){
                        print_queue_item_1.setVisibility(View.GONE);
                    }else if(count == 19){
                        queue_item_20.setVisibility(View.INVISIBLE);
                        queue_item_20.setAnimation(fade_out);
                    }else if(count == 25){
                        place_item_20_to_queue_animation();
                    }else if(count == 27){
                        print_queue_item_2.setVisibility(View.GONE);
                    }else if(count == 29){
                        queue_item_30.setVisibility(View.INVISIBLE);
                        queue_item_30.setAnimation(fade_out);
                    }else if(count == 36){
                        place_item_30_to_queue_animation();
                    }else if(count == 38){
                        print_queue_item_3.setVisibility(View.GONE);
                    }else if(count == 46){
                        dequeue_item_10_to_queue_animation();
                        queue_item_10.setAnimation(fade_in);
                        queue_item_10.setVisibility(View.VISIBLE);
                    }else if(count == 50){
                        print_dequeue.setVisibility(View.GONE);
                    }else if(count == 58){
                        print_front_queue_item.setVisibility(View.GONE);
                    }else if(count == 66){
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
                        if(count == 9){
                            queue_item_10.setVisibility(View.VISIBLE);
                            queue_item_10.setAnimation(fade_in);
                        }else if(count == 16){
                            place_item_10_to_queue_animation();
                        }else if(count == 18){
                            print_queue_item_1.setVisibility(View.VISIBLE);
                            print_queue_item_1.setText("10 enqueued to queue");
                        }else if(count == 20){
                            queue_item_20.setVisibility(View.VISIBLE);
                            queue_item_20.setAnimation(fade_in);
                        }else if(count == 26){
                            place_item_20_to_queue_animation();
                        }else if(count == 28){
                            print_queue_item_2.setVisibility(View.VISIBLE);
                            print_queue_item_2.setText("20 enqueued to queue");
                        }else if(count == 30){
                            queue_item_30.setVisibility(View.VISIBLE);
                            queue_item_30.setAnimation(fade_in);
                        }else if(count == 37){
                            place_item_30_to_queue_animation();
                        }else if(count == 39){
                            print_queue_item_3.setVisibility(View.VISIBLE);
                            print_queue_item_3.setText("30 enqueued to queue");
                        }else if(count == 47){
                            dequeue_item_10_to_queue_animation();
                            queue_item_10.setAnimation(fade_out);
                            queue_item_10.setVisibility(View.INVISIBLE);
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

    private void dequeue_item_10_to_queue_animation() {
        queue_item_10 = findViewById(R.id.queue_item_10);
        dequeue_item_10_from_queue = findViewById(R.id.dequeue_item_10_from_queue);
        //element handling hooks

        float temp = 0f;
        float startX = dequeue_item_10_from_queue.getX();
        float startX2 = queue_item_10.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(dequeue_item_10_from_queue, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(queue_item_10, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void place_item_30_to_queue_animation() {
        queue_item_30 = findViewById(R.id.queue_item_30);
        place_item_30_to_queue = findViewById(R.id.place_item_30_to_queue);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_30_to_queue.getX();
        float startX2 = queue_item_30.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_30_to_queue, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(queue_item_30, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void place_item_20_to_queue_animation() {
        queue_item_20 = findViewById(R.id.queue_item_20);
        place_item_20_to_queue = findViewById(R.id.place_item_20_to_queue);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_20_to_queue.getX();
        float startX2 = queue_item_20.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_20_to_queue, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(queue_item_20, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }

    private void place_item_10_to_queue_animation() {
        queue_item_10 = findViewById(R.id.queue_item_10);
        place_item_10_to_queue = findViewById(R.id.place_item_10_to_queue);
        //element handling hooks

        float temp = 0f;
        float startX = place_item_10_to_queue.getX();
        float startX2 = queue_item_10.getX();
        float endX = startX + 0;
        float endX2 = startX2 - 0;

        temp = endX;
        endX = endX2;
        endX2 = temp;

        ObjectAnimator animator = ObjectAnimator.ofFloat(place_item_10_to_queue, "x", startX, endX);
        ObjectAnimator animator2 = ObjectAnimator.ofFloat(queue_item_10, "x", startX2, endX2);
        animator.setInterpolator(new AccelerateInterpolator());
        animator2.setInterpolator(new AccelerateInterpolator());
        animator2.setDuration(1000);
        animator.setDuration(1000);
        animator2.start();
        animator.start();
    }
}