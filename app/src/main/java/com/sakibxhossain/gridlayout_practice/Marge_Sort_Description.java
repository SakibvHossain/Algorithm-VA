package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Algorithm_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Problems_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.code_fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Marge_Sort_Description extends AppCompatActivity {
    MeowBottomNavigation marge_bottom_navigation;
    ImageView back_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marge_sort_description);
        marge_bottom_navigation = findViewById(R.id.marge_bottom_bar);
        back_btn = findViewById(R.id.marge_sort_back_btn);

        marge_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        marge_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        marge_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        marge_bottom_navigation.show(0,true);

        marge_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("marge");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("marge");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("marge");
                    loadProblems(fragment);
                }
                return null;
            }
        });


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Marge_Sort_Description.this,Sorting.class);
                startActivity(goBack_to_Sorting);
                finish();
            }
        });

    }
    //define a load method to feed the screen
    private void loadAlgorithm(Fragment fragment) {
        //replace the fragment
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                .replace(R.id.frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {

        //replace the fragment
          FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

          Bundle data = new Bundle();
          data.putString("marge_sort_code",""+ "import java.util.Arrays;\n" +
                  "\n" +
                  "public class Selection_Sort{\n" +
                  "\n" +
                  "    public static void sort(int arr[])\n" +
                  "    {\n" +
                  "        int n = arr.length;\n" +
                  "\n" +
                  "        for (int i = 0; i < n-1; i++)\n" +
                  "        {\n" +
                  "            int min_idx = i;\n" +
                  "            for (int j = i+1; j < n; j++) {\n" +
                  "                if (arr[j] < arr[min_idx]) {\n" +
                  "                    min_idx = j;\n" +
                  "                }\n" +
                  "            }\n" +
                  "            int temp = arr[min_idx];\n" +
                  "            arr[min_idx] = arr[i];\n" +
                  "            arr[i] = temp;\n" +
                  "        }\n" +
                  "    }\n" +
                  "\n" +
                  "     public static boolean isSorted(int[] arr){\n" +
                  "        int prev = arr[0];\n" +
                  "       \n" +
                  "        for (int i = 1; i < arr.length; i++) {\n" +
                  "            if (prev > arr[i]) {\n" +
                  "                System.out.println(\"Selection Sort Fails!!\");\n" +
                  "                return false;\n" +
                  "            }\n" +
                  "            prev = arr[i];\n" +
                  "        }\n" +
                  "         \n" +
                  "        return true;\n" +
                  "    }\n" +
                  "\n" +
                  "    public static void main(String[] args) {\n" +
                  "        int[] arr = {4, 8, 2, 9, 5};\n" +
                  "\t    \tsort(arr);\n" +
                  "\t    \tif(isSorted(arr)) {\n" +
                  "\t    \t\tSystem.out.println(Arrays.toString(arr));\n" +
                  "\t    \t}\n" +
                  "    }\n" +
                  "}");
          data.putString("marge_code_description","<b>Code</b>: The implementation of Marge Sort given below - ");
          fragment.setArguments(data);
          fragmentTransaction.replace(R.id.frameLayout,fragment, null)
                  .commit();
    }

    private void loadProblems(Fragment fragment) {
        //replace the fragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        fragmentTransaction.replace(R.id.frameLayout,fragment, null)
                .commit();
    }
}