package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Tree_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Tree_ClickListener;

public class Tree_Algorithm extends AppCompatActivity {


    String[] algo_title = {
            "Binary Tree_Algorithm Traversal"
    };

    String[] algo_difficulty = {
             "Medium"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Tree_Adapter tree_adapter;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tree);

        text_ber_back_button = findViewById(R.id.tree_bar_button);
        sorting_gridview = findViewById(R.id.tree_Section_gridView);


        tree_adapter = new Tree_Adapter(this, algo_title, algo_difficulty, new Tree_ClickListener() {
            @Override
            public void onItemClicked(int position) {
                switch (position) {
                    case 0:
                        Intent btt = new Intent(Tree_Algorithm.this, Binary_Tree_Traversal_Description.class);
                        startActivity(btt);
                        break;
                    case 1:
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        sorting_gridview.setAdapter(tree_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Tree_Algorithm.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }
}