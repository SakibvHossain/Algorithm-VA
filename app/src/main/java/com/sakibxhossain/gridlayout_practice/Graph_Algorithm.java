package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;

import com.sakibxhossain.gridlayout_practice.helper.Graph_Adapter;
import com.sakibxhossain.gridlayout_practice.helper.Graph_ClickListener;

public class Graph_Algorithm extends AppCompatActivity {

    String[] algo_title = {
            "Breadth First Search", "Depth First Search"
    };

    String[] algo_difficulty = {
            "Easy", "Easy"
    };


    ImageView text_ber_back_button;
    GridView sorting_gridview;
    Graph_Adapter graph_adapter;

    @SuppressLint("MissingInflatedId")

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_graph);

        text_ber_back_button = findViewById(R.id.graph_bar_button);
        sorting_gridview = findViewById(R.id.graph_Section_gridView);

        graph_adapter = new Graph_Adapter(this, algo_title, algo_difficulty, new Graph_ClickListener() {
            @Override
            public void onItemClicked(int position) {

                switch (position) {
                    case 0:
                        Intent bfs = new Intent(Graph_Algorithm.this, BFS_Description.class);
                        startActivity(bfs);
                        break;
                    case 1:
                        Intent dfs = new Intent(Graph_Algorithm.this, DFS_Description.class);
                        startActivity(dfs);
                        break;
                    case 2:
                    default:
                        System.out.println("Looking forward to the Weekend");
                }

            }
        });
        sorting_gridview.setAdapter(graph_adapter);

        text_ber_back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Graph_Algorithm.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

    }
}