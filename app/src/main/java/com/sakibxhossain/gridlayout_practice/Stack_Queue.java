package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.sakibxhossain.gridlayout_practice.helper.Sorting_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Sorting_ClickListener;
import com.sakibxhossain.gridlayout_practice.helper.Stack_Queue_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Stack_Queue_ClickListener;

public class Stack_Queue extends AppCompatActivity {

    String[] algo_title = {
            "Stack", "Queue"
    };

    String[] algo_difficulty = {
            "Easy", "Easy"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Stack_Queue_Adapter stack_queue_adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_queue);

        text_ber_back_button = findViewById(R.id.stack_queue_bar_button);
        sorting_gridview = findViewById(R.id.stack_Queue_Section_gridView);


        stack_queue_adapter = new Stack_Queue_Adapter(this, algo_title, algo_difficulty, new Stack_Queue_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                    case 1:
                    case 2:
                        Toast.makeText(Stack_Queue.this,"Nothing implemented yet",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        System.out.println("Looking forward to the Weekend");
                }

            }
        });
        sorting_gridview.setAdapter(stack_queue_adapter);


        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Stack_Queue.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}