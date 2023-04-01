package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

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

public class Ternary_Search_Description extends AppCompatActivity {
    MeowBottomNavigation ternary_Search_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternary_search);

        ternary_Search_bottom_navigation = findViewById(R.id.ternary_search_bottom_bar);
        back_btn = findViewById(R.id.ternary_search_back_btn);

        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        ternary_Search_bottom_navigation.show(0,true);

        ternary_Search_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("ternary_search");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("ternary_search");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("ternary_search");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Ternary_Search_Description.this,Searching.class);
                startActivity(goBack_to_Sorting);
                finish();
            }
        });
    }

    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("ternary_title","Ternary Search");
        data2.putString("ternary_description","Ternary Search is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
                "based on keys and swaps are made only when required.\n");

        data2.putString("ternary_algorithm_title","Algorithm");
        data2.putString("ternary_algorithm_description","1. Find the minimum value in the list\n" +
                "2. Swap it with the value in the current position\n" +
                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");

        data2.putString("ternary_in_detail_title","Selection Sort in Detail");
        data2.putString("ternary_sort_in_detail_description","Description will be added later");

        data2.putString("ternary_performance_title","Performance");
        data2.putString("ternary_performance_description","Worst case complexity : O(n2)\n" +
                "Best case complexity (Improved version) : O(n)\n" +
                "Average case complexity (Basic version) : O(n2)\n" +
                "Worst case space complexity : O(1) auxiliary\n");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("ternary_search_code","class Ternary_Search {\n" +
                "\tstatic int ternarySearch(int starting_index, int ar_length, int key, int ar[]){\n" +
                "\t\tif (ar_length >= starting_index) {  // Find the mid1 and mid2\n" +
                "\t\t\tint mid1 = starting_index + (ar_length - starting_index) / 3;\n" +
                "\t\t\tint mid2 = ar_length - (ar_length - starting_index) / 3;\n" +
                "\t\t\tif (ar[mid1] == key) { // Check if key is present at any mid\n" +
                "\t\t\t\treturn mid1;\n" +
                "\t\t\t}\n" +
                "\t\t\tif (ar[mid2] == key) {\n" +
                "\t\t\t\treturn mid2;\n" +
                "\t\t\t}// Since key is not present at mid, check in which region it is present then repeat the Search operation in that region\n" +
                "\t\t\tif (key < ar[mid1]) {\n" +
                "\t\t\t\treturn ternarySearch(starting_index, mid1 - 1, key, ar); // The key lies in between l and mid1\n" +
                "\t\t\t}\n" +
                "\t\t\telse if (key > ar[mid2]) {\n" +
                "\t\t\t\treturn ternarySearch(mid2 + 1, ar_length, key, ar); // The key lies in between mid2 and r\n" +
                "\t\t\t}\n" +
                "\t\t\telse {\n" +
                "\t\t\t\treturn ternarySearch(mid1 + 1, mid2 - 1, key, ar); // The key lies in between mid1 and mid2\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\treturn -1;// Key not found\n" +
                "\t}\n" +
                "\tpublic static void main(String args[]){\n" +
                "\t\tint ar[] = { 1, 2, 3, 4, 5, 6, 7};// Sort the array if not sorted\n" +
                "\t\tint starting_index = 0, ar_length = ar.length-1, search_for = 5, result;\n" +
                "\t\tresult = ternarySearch(starting_index, ar_length, search_for, ar); // Search the key using ternarySearch\n" +
                "\t\tSystem.out.println(\"Index of \" + search_for + \" is \" + result); // Print the result\n" +
                "\t}\n" +
                "}");

        data.putString("ternary_implementation","Implementation: Ternary Search implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("ternary_problem_title","Problem 1");
        data2.putString("ternary_problem_description","Problems not assigned yet\n");

        data2.putString("ternary_problem2_title","Problem 2");
        data2.putString("ternary_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }
}