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
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

    }

    //define a load method to feed the screen
    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("marge_sort_title","Ternary Search");
        data2.putString("marge_sort_description","Ternary Search is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
                "based on keys and swaps are made only when required.\n");

        data2.putString("marge_sort_algorithm_title","Algorithm");
        data2.putString("marge_sort_algorithm_description","1. Find the minimum value in the list\n" +
                "2. Swap it with the value in the current position\n" +
                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");

        data2.putString("marge_sort_in_detail_title","Selection Sort in Detail");
        data2.putString("marge_sort_in_detail_description","Description will be added later");

        data2.putString("marge_sort_performance_title","Performance");
        data2.putString("marge_sort_performance_description","Worst case complexity : O(n2)\n" +
                "Best case complexity (Improved version) : O(n)\n" +
                "Average case complexity (Basic version) : O(n2)\n" +
                "Worst case space complexity : O(1) auxiliary\n");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.marge_sort_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {

        //replace the fragment
          FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

          Bundle data = new Bundle();
          data.putString("marge_sort_code","import java.util.Arrays;\n" +
                  "  \tpublic class Marge_Sort{\n" +
                  "  \t    static void merge(int[] arr, int[] aux, int low, int mid, int high){\n" +
                  "  \t        int k = low, i = low, j = mid + 1;\n" +
                  "  \t        while (i <= mid && j <= high){\n" +
                  "  \t            if (arr[i] <= arr[j]) {\n" +
                  "  \t                aux[k++] = arr[i++];\n" +
                  "  \t            }\n" +
                  "  \t            else {\n" +
                  "  \t                aux[k++] = arr[j++];\n" +
                  "  \t            }\n" +
                  "  \t        }\n" +
                  "  \t        while (i <= mid) {\n" +
                  "  \t            aux[k++] = arr[i++];\n" +
                  "  \t        }\n" +
                  "  \t        for (i = low; i <= high; i++) {\n" +
                  "  \t            arr[i] = aux[i];\n" +
                  "  \t        }\n" +
                  "  \t    }\n" +
                  "  \t    static void mergeSort(int[] arr, int[] aux, int low, int high){\n" +
                  "  \t        if (high == low) {    \n" +
                  "  \t            return;\n" +
                  "  \t        }\n" +
                  "  \t        int mid = (low + ((high - low) >> 1));  \t\n" +
                  "  \t        mergeSort(arr, aux, low, mid);      \n" +
                  "  \t        mergeSort(arr, aux, mid + 1, high); \n" +
                  "  \t        merge(arr, aux, low, mid, high);    \n" +
                  "  \t    }\n" +
                  "  \t    public static void main(String[] args){\n" +
                  "  \t        int[] arr = {6,4,3,9};\n" +
                  "  \t        int[] aux = Arrays.copyOf(arr, arr.length);\n" +
                  "\t        mergeSort(arr, aux, 0, arr.length - 1);\n" +
                  "\t        System.out.println(Arrays.toString(arr));\n" +
                  "\t    }\n" +
                  "\t}");
          data.putString("marge_code_description","Implementation: The implementation of Marge Sort given below - ");
          fragment.setArguments(data);
          fragmentTransaction.replace(R.id.marge_sort_frameLayout,fragment, null)
                  .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("marge_sort_problem_title","Problem 1");
        data2.putString("marge_sort_problem_description","Problems not assigned yet\n");

        data2.putString("marge_sort_problem2_title","Problem 2");
        data2.putString("marge_sort_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.marge_sort_frameLayout,fragment, null)
                .commit();
    }
}