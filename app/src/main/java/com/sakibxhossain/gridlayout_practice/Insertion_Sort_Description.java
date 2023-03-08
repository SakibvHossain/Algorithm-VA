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

public class Insertion_Sort_Description extends AppCompatActivity {

    MeowBottomNavigation insertion_bottom_navigation;
    ImageView back_btn;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_insertion_sort_description);

        insertion_bottom_navigation = findViewById(R.id.insertion_bottom_bar);
        back_btn = findViewById(R.id.insertion_sort_back_btn);

        insertion_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        insertion_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        insertion_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        insertion_bottom_navigation.show(0,true);

        insertion_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("insertion");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("insertion");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("insertion");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Insertion_Sort_Description.this,Sorting.class);
                startActivity(goBack_to_Sorting);
            }
        });
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("insertion_problem_title","Problem 1");
        data2.putString("insertion_problem_description","Problems not assigned yet on Insertion Sort\n");

        data2.putString("insertion_problem2_title","Problem 2");
        data2.putString("insertion_problem2_description","Problems not assigned yet on Insertion Sort\n");

        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.insertion_frame_layout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("insertion_sort_code","import java.util.Arrays;\n" +
                "\n" +
                "public class Insertion_Sort{\n" +
                "\n" +
                "    public static void sort(int arr[])\n" +
                "    {\n" +
                "\t\tint n = arr.length;\n" +
                "\t    for (int i = 1; i < n; i++) {\n" +
                "\t        int key = arr[i];\n" +
                "\t        int j = i - 1;\n" +
                "\t        while (j >= 0 && arr[j] > key) {\n" +
                "\t            arr[j + 1] = arr[j];\n" +
                "\t            j--;\n" +
                "\t        }\n" +
                "\t        arr[j + 1] = key;\n" +
                "\t    }\n" +
                "    }\n" +
                "\n" +
                "     public static boolean isSorted(int[] arr){\n" +
                "        int prev = arr[0];\n" +
                "       \n" +
                "        for (int i = 1; i < arr.length; i++) {\n" +
                "            if (prev > arr[i]) {\n" +
                "        \t\tSystem.out.println(\"Selection Sort Fails!!\");\n" +
                "        \t\treturn false;\n" +
                "            }\n" +
                "            prev = arr[i];\n" +
                "        }\n" +
                "  \t   \n" +
                "        return true;\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        int[] array = {2,8,5,9,1};\n" +
                "        sort(array);\n" +
                "\n" +
                "        if(isSorted(array)){\n" +
                "            System.out.println(Arrays.toString(array));\n" +
                "        }\n" +
                "    }\n" +
                "}");

        data.putString("insertion_implementation","Implementation: Insertion sort implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.insertion_frame_layout,fragment, null)
                .commit();
    }

    private void loadAlgorithm(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("insertion_sort_title","Insertion Sort");
        data2.putString("insertion_sort_description","Insertion sort is a simple and efficient comparison sort. In this algorithm, each iteration removes\n" +
                "an element from the input data and inserts it into the correct position in the list being sorted. The\n" +
                "choice of the element being removed from the input is random and this process is repeated until\n" +
                "all input elements have gone through.\n");

        data2.putString("insertion_algorithm_title","Algorithm");
        data2.putString("insertion_sort_algorithm_description","Every repetition of insertion sort removes an element from the input data, and inserts it into the\n" +
                "correct position in the already-sorted list until no input elements remain. Sorting is typically done\n" +
                "in-place. The resulting array after k iterations has the property where the first k + 1 entries are\n" +
                "sorted.\n");

        data2.putString("insertion_in_detail_title","Insertion Sort in Detail");
        data2.putString("insertion_sort_in_detail_description","Description will be added later");

        data2.putString("insertion_sort_performance_title","Performance");
        data2.putString("insertion_sort_performance_description","If every element is greater than or equal to every element to its left, the running time of insertion\n" +
                "sort is Θ(n). This situation occurs if the array starts out already sorted, and so an already-sorted\n" +
                "array is the best case for insertion sort.\n\n" +
                "Worst case complexity: Θ(n^2)\n" +
                "Best case complexity: Θ(n)\n" +
                "Average case complexity: Θ(n^2)\n" +
                "Worst case space complexity: O(n^2) \ntotal, O(1) auxiliary");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.insertion_frame_layout,fragment, null)
                .commit();
    }
}