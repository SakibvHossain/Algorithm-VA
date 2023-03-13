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

public class Stack_Description extends AppCompatActivity {

    MeowBottomNavigation stack_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_algo);

        stack_bottom_navigation = findViewById(R.id.stack_bottom_bar);
        back_btn = findViewById(R.id.stack_back_btn);

        stack_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        stack_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        stack_bottom_navigation.show(0,true);

        stack_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("stack");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("stack");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("stack");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Stack_Description.this,Stack_Queue.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }

    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
//        Bundle data2 = new Bundle();
//        data2.putString("selection_sort_title","Selection Sort");
//        data2.putString("selection_sort_description","Selection sort is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
//                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
//                "based on keys and swaps are made only when required.\n");
//
//        data2.putString("selection_algorithm_title","Algorithm");
//        data2.putString("selection_sort_algorithm_description","1. Find the minimum value in the list\n" +
//                "2. Swap it with the value in the current position\n" +
//                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");
//
//        data2.putString("selection_in_detail_title","Selection Sort in Detail");
//        data2.putString("selection_sort_in_detail_description","Description will be added later");
//
//        data2.putString("selection_sort_performance_title","Performance");
//        data2.putString("selection_sort_performance_description","Worst case complexity : O(n2)\n" +
//                "Best case complexity (Improved version) : O(n)\n" +
//                "Average case complexity (Basic version) : O(n2)\n" +
//                "Worst case space complexity : O(1) auxiliary\n");
//        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
//        Bundle data = new Bundle();
//        data.putString("selection_sort_code","import java.util.Arrays;\n" +
//                "\n" +
//                "public class Selection_Sort{\n" +
//                "\n" +
//                "    public static void sort(int arr[])\n" +
//                "    {\n" +
//                "        int n = arr.length;\n" +
//                "\n" +
//                "        for (int i = 0; i < n-1; i++)\n" +
//                "        {\n" +
//                "            int min_idx = i;\n" +
//                "            for (int j = i+1; j < n; j++) {\n" +
//                "                if (arr[j] < arr[min_idx]) {\n" +
//                "                    min_idx = j;\n" +
//                "                }\n" +
//                "            }\n" +
//                "            int temp = arr[min_idx];\n" +
//                "            arr[min_idx] = arr[i];\n" +
//                "            arr[i] = temp;\n" +
//                "        }\n" +
//                "    }\n" +
//                "\n" +
//                "     public static boolean isSorted(int[] arr){\n" +
//                "        int prev = arr[0];\n" +
//                "       \n" +
//                "        for (int i = 1; i < arr.length; i++) {\n" +
//                "            if (prev > arr[i]) {\n" +
//                "                System.out.println(\"Selection Sort Fails!!\");\n" +
//                "                return false;\n" +
//                "            }\n" +
//                "            prev = arr[i];\n" +
//                "        }\n" +
//                "         \n" +
//                "        return true;\n" +
//                "    }\n" +
//                "\n" +
//                "    public static void main(String[] args) {\n" +
//                "        int[] arr = {4, 8, 2, 9, 5};\n" +
//                "\t    \tsort(arr);\n" +
//                "\t    \tif(isSorted(arr)) {\n" +
//                "\t    \t\tSystem.out.println(Arrays.toString(arr));\n" +
//                "\t    \t}\n" +
//                "    }\n" +
//                "}");
//
//        data.putString("selection_implementation","Implementation: Selection sort implementation given below - ");
//        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

//        Bundle data2 = new Bundle();
//        data2.putString("selection_problem_title","Problem 1");
//        data2.putString("selection_problem_description","Problems not assigned yet\n");
//
//        data2.putString("selection_problem2_title","Problem 2");
//        data2.putString("selection_problem2_description","Problems not assigned yet\n");
//
//        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }
}