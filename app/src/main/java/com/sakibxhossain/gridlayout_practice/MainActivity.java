package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.sakibxhossain.gridlayout_practice.helper.ClickListener;
import com.sakibxhossain.gridlayout_practice.helper.Main_Adapter;

public class MainActivity extends AppCompatActivity {

    int[] itemsImage = new int[] {
            R.drawable.sorting,
            R.drawable.searching,
            R.drawable.stack_queue,
            R.drawable.tree,
            R.drawable.graph,
//            R.drawable.dynamic,
//            R.drawable.greedy,
//            R.drawable.string,
//            R.raw.sorting
    };

    String[] itemTitle = new String[]{
            "Sorting",
            "Searching",
            "Stack & Queue",
            "Tree",
            "Graph",
//            "Dynamic",
//            "Greedy",
//            "String",
//            "Hashing"
    };

    String[] itemDifficulty = new String[]{
            "Easy",
            "Easy",
            "Easy",
            "Medium",
            "Hard",
//            "Hard",
//            "Hard",
//            "Hard",
//            "Medium"
    };

    GridView gridView;
    Main_Adapter adapter;
    Animation bottom_aim;
    ImageView icon_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      //  getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
      //  icon_main = findViewById(R.id.icon_main_activity);

        adapter = new Main_Adapter(this, itemsImage, itemTitle, itemDifficulty, new ClickListener() {
            @Override
            public void onItemClicked(int position) {
//                if(position==0){
//                    Intent intent = new Intent(MainActivity.this, Sorting.class);
//                    startActivity(intent);
//                }
                switch (position) {
                    case 0:
                        Intent sorting = new Intent(MainActivity.this, Sorting.class);
                        startActivity(sorting);
                        break;
                    case 1:
                        Intent intent = new Intent(MainActivity.this, Searching.class);
                        startActivity(intent);
                        break;
                    case 2:
                        Intent stack_queue = new Intent(MainActivity.this, Stack_Queue.class);
                        startActivity(stack_queue);
                        break;
                    case 3:
                        Intent tree = new Intent(MainActivity.this, Tree_Algorithm.class);
                        startActivity(tree);
                        break;
                    case 4:
                        Intent graph = new Intent(MainActivity.this, Graph_Algorithm.class);
                        startActivity(graph);
                        break;
                    case 6:
                    case 5:
//                        Intent dynamic = new Intent(MainActivity.this, Dynamic.class);
//                        startActivity(dynamic);
//                        Intent greedy = new Intent(MainActivity.this, Greedy.class);
//                        startActivity(greedy);
                    case 7:

//                        Intent string_algo = new Intent(MainActivity.this, Strings_Algorithm.class);
//                        startActivity(string_algo);
                    case 8:
                        Toast.makeText(MainActivity.this,"Under Implementation",Toast.LENGTH_SHORT).show();
//                        Intent graph = new Intent(MainActivity.this, Graph_Algorithm.class);
//                        startActivity(graph);
                        break;

//                        Intent hashing = new Intent(MainActivity.this, Hashing.class);
//                        startActivity(hashing);
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        gridView.setAdapter(adapter);
    }
}