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

    @SuppressLint("MissingInflatedId")
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
                Intent goBack_to_Sorting = new Intent(Linear_Search_Description.this,Sorting.class);
                startActivity(goBack_to_Sorting);
                finish();
            }
        });
    }

    private void loadProblems(Fragment fragment) {
        //replace the fragment
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out)
                .replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        //replace the fragment
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data = new Bundle();
        data.putString("linear_search_code","  \timport java.util.Arrays;\n" +
                "  \t\n" +
                "  \tpublic class Marge_Sort\n" +
                "  \t{\n" +
                "  \t    public static void merge(int[] arr, int[] aux, int low, int mid, int high)\n" +
                "  \t    {\n" +
                "  \t        int k = low, i = low, j = mid + 1;\n" +
                "  \t\n" +
                "  \t        while (i <= mid && j <= high)\n" +
                "  \t        {\n" +
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
                "  \t\n" +
                "  \t        for (i = low; i <= high; i++) {\n" +
                "  \t            arr[i] = aux[i];\n" +
                "  \t        }\n" +
                "  \t    }\n" +
                "  \t\n" +
                "  \t    // Sort array arr [low..high] using auxiliary array aux\n" +
                "  \t    public static void mergeSort(int[] arr, int[] aux, int low, int high)\n" +
                "  \t    {\n" +
                "  \t        // Base case\n" +
                "  \t        if (high == low) {    // if run size == 1\n" +
                "  \t            return;\n" +
                "  \t        }\n" +
                "  \t\n" +
                "  \t        // find mid point\n" +
                "  \t        int mid = (low + ((high - low) >> 1));\n" +
                "  \t\n" +
                "  \t        // recursively split runs into two halves until run size == 1,\n" +
                "  \t        // then merge them and return back up the call chain\n" +
                "  \t\n" +
                "  \t        mergeSort(arr, aux, low, mid);      // split / merge left  half\n" +
                "  \t        mergeSort(arr, aux, mid + 1, high); // split / merge right half\n" +
                "  \t\n" +
                "  \t        merge(arr, aux, low, mid, high);    // merge the two half runs\n" +
                "  \t    }\n" +
                "  \t\n" +
                "  \t    // Function to check if arr is sorted in ascending order or not\n" +
                "  \t    public static boolean isSorted(int[] arr)\n" +
                "  \t    {\n" +
                "  \t        int prev = arr[0];\n" +
                "  \t        for (int i = 1; i < arr.length; i++) {\n" +
                "  \t            if (prev > arr[i]) {\n" +
                "  \t                System.out.println(\"MergeSort Fails!!\");\n" +
                "  \t                return false;\n" +
                "  \t            }\n" +
                "  \t            prev = arr[i];\n" +
                "  \t        }\n" +
                "  \t\n" +
                "  \t        return true;\n" +
                "  \t    }\n" +
                "  \t\n" +
                "  \t    \n" +
                "  \t    public static void main(String[] args)\n" +
                "  \t    {\n" +
                "  \t        int[] arr = {8,4,3,12};\n" +
                "  \t        int[] aux = Arrays.copyOf(arr, arr.length);\n" +
                "  \t\n" +
                "  \t        // sort array 'arr' using auxiliary array 'aux'\n" +
                "\t        mergeSort(arr, aux, 0, arr.length - 1);\n" +
                "\t\n" +
                "\t        if (isSorted(arr)) {\n" +
                "\t            System.out.println(Arrays.toString(arr));\n" +
                "\t        }\n" +
                "\t    }\n" +
                "\t}\n");
        data.putString("linear_search_description","Implementation: The implementation of Marge Sort given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
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
}