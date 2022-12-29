package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.sakibxhossain.gridlayout_practice.helper.ClickListener;
import com.sakibxhossain.gridlayout_practice.helper.Main_Adapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    int[] itemsImage = new int[] {
            R.drawable.app_logo, R.drawable.app_logo,
            R.drawable.app_logo, R.drawable.app_logo,
            R.drawable.app_logo, R.drawable.app_logo,
            R.drawable.app_logo, R.drawable.app_logo,
            R.drawable.app_logo
    };

    String[] itemTitle = new String[]{
            "Sorting", "Searching",
            "Stack & Queue", "Tree",
            "Graph", "Dynamic",
            "Greedy", "String",
            "Hashing"
    };

    String[] itemDifficulty = new String[]{
            "Easy",
            "Easy",
            "Easy",
            "Medium",
            "Hard",
            "Hard",
            "Hard",
            "Hard",
            "Medium"
    };

    GridView gridView;
    Main_Adapter adapter;
    Animation bottom_aim;
    ImageView icon_main;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.grid_view);
        icon_main = findViewById(R.id.icon_main_activity);

        bottom_aim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
        icon_main.setAnimation(bottom_aim);

        adapter = new Main_Adapter(this, itemsImage, itemTitle, itemDifficulty, new ClickListener() {
            @Override
            public void onItemClicked(int position) {
//                if(position==0){
//                    Intent intent = new Intent(MainActivity.this, Sorting.class);
//                    startActivity(intent);
//                }
                switch (position) {
                    case 0:
                        Intent intent = new Intent(MainActivity.this, Sorting.class);
                        startActivity(intent);
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        Toast.makeText(MainActivity.this,"Nothing implemented",Toast.LENGTH_SHORT).show();
                        break;
                    default:
                        System.out.println("Looking forward to the Weekend");
                }
            }
        });
        gridView.setAdapter(adapter);
    }
}