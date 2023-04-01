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

public class Linear_Search_Description extends AppCompatActivity {

    MeowBottomNavigation linear_search_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_search);

        linear_search_bottom_navigation = findViewById(R.id.linear_search_bottom_bar);
        back_btn = findViewById(R.id.linear_search_back_btn);

        linear_search_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        linear_search_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        linear_search_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        linear_search_bottom_navigation.show(0,true);

        linear_search_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("linear");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("linear");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("linear");
                    loadProblems(fragment);
                }
                return null;
            }
        });


        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Linear_Search_Description.this,Searching.class);
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
        data2.putString("linear_search_title","Linear Search");
        data2.putString("linear_search_description","Linear Search is defined as a sequential search algorithm that starts at one end and goes through each element of a list until the desired element is found, otherwise the search continues till the end of the data set. It is the easiest searching algorithm\n");

        data2.putString("linear_search_algorithm_title","Algorithm");
        data2.putString("linear_search_algorithm_description","Step 1: First, read the search element (Target element) in the array.\n" +
                "Step 2: In the second step compare the search element with the first element in the array.\n" +
                "Step 3: If both are matched, display “Target element is found” and terminate the Linear Search \n" +
                "function.\n" +
                "Step 4: If both are not matched, compare the search element with the next element in the array.\n" +
                "Step 5: In this step, repeat steps 3 and 4 until the search (Target) element is compared with the \n" +
                "last element of the array.\n" +
                "Step 6 – If the last element in the list does not match, the Linear Search Function will be \n" +
                "terminated, and the message “Element is not found” will be displayed.\n");

        data2.putString("linear_search_in_detail_title","Linear Search in Detail");
        data2.putString("linear_search_in_detail_description","Description will be added later");

        data2.putString("linear_search_performance_title","Performance");
        data2.putString("linear_search_performance_description","Time complexity: O(N)\n" +
                "Auxiliary Space: O(1)");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        //replace the fragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data = new Bundle();
        data.putString("linear_search_code","class Linear_Search {\n" +
                "\tpublic static int search(int arr[], int x){\n" +
                "\t\tint N = arr.length;\n" +
                "\t\tfor (int i = 0; i < N; i++) {\n" +
                "\t\t\tif (arr[i] == x)\n" +
                "\t\t\t\treturn i;\n" +
                "\t\t}\n" +
                "\t\treturn -1;\n" +
                "\t}\n" +
                "\tpublic static void main(String args[]){\n" +
                "\t\tint arr[] = { 2, 3, 4, 10, 40 };\n" +
                "\t\tint x = 10;\n" +
                "\t\tint result = search(arr, x);// Function call\n" +
                "\t\tif (result == -1)\n" +
                "\t\t\tSystem.out.print(\"Element is not present in array\");\n" +
                "\t\telse\n" +
                "\t\t\tSystem.out.print(\"Element is present at index \"+ result);\n" +
                "\t}\n" +
                "}");
        data.putString("linear_search_description","Implementation: Linear Search implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("linear_problem_title","Problem 1");
        data2.putString("linear_problem_description","Problems not assigned yet\n");

        data2.putString("linear_problem2_title","Problem 2");
        data2.putString("linear_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
    }

}