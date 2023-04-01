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

public class Binary_Search_Description extends AppCompatActivity {

    MeowBottomNavigation binary_search_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_search);

        binary_search_bottom_navigation = findViewById(R.id.binary_search_bottom_bar);
        back_btn = findViewById(R.id.binary_search_back_btn);

        binary_search_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        binary_search_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        binary_search_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        binary_search_bottom_navigation.show(0,true);

        binary_search_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("binary_search");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("binary_search");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("binary_search");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Binary_Search_Description.this,Searching.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }

    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("binary_search_title","Selection Sort");
        data2.putString("binary_search_description","Selection sort is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
                "based on keys and swaps are made only when required.\n");

        data2.putString("binary_search_algorithm_title","Algorithm");
        data2.putString("binary_search_algorithm_description","1. Find the minimum value in the list\n" +
                "2. Swap it with the value in the current position\n" +
                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");

        data2.putString("binary_search_in_detail_title","Selection Sort in Detail");
        data2.putString("binary_search_in_detail_description","Description will be added later");

        data2.putString("binary_search_performance_title","Performance");
        data2.putString("binary_search_performance_description","Worst case complexity : O(n2)\n" +
                "Best case complexity (Improved version) : O(n)\n" +
                "Average case complexity (Basic version) : O(n2)\n" +
                "Worst case space complexity : O(1) auxiliary\n");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.binary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("binary_search_code","class Binary_Search {\n" +
                "static void binarySearch(int v[], int To_Find){\n" +
                "\tint lo = 0, hi = v.length - 1;\n" +
                "\twhile (hi - lo > 1) {\n" +
                "\t\tint mid = (hi + lo) / 2;\n" +
                "\t\tif (v[mid] < To_Find) {\n" +
                "\t\t\tlo = mid + 1;\n" +
                "\t\t}\n" +
                "\t\telse {\n" +
                "\t\t\thi = mid;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tif (v[lo] == To_Find) {\n" +
                "\tSystem.out.println(\"Found At Index \" + lo );\n" +
                "\t}\n" +
                "\telse if (v[hi] == To_Find) {\n" +
                "\t\tSystem.out.println(\"Found At Index \" + hi );\n" +
                "\t}\n" +
                "\telse {\n" +
                "\t\tSystem.out.println(\"Not Found\" );\n" +
                "\t}\n" +
                "}\n" +
                "\tpublic static void main (String[] args) {\t\n" +
                "\tint v[]={1, 3, 4, 5, 6};\n" +
                "\tint To_Find = 4;\n" +
                "\tbinarySearch(v, To_Find);\n" +
                "\t}\n" +
                "}");

        data.putString("binary_search_implementation","Implementation: Binary Search implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.binary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("binary_search_problem_title","Problem 1");
        data2.putString("binary_search_problem_description","Problems not assigned yet\n");

        data2.putString("binary_search_problem2_title","Problem 2");
        data2.putString("binary_search_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.binary_search_frameLayout,fragment, null)
                .commit();
    }
}