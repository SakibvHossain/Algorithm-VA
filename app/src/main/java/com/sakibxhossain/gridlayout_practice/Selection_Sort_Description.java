package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Algorithm_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Problems_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.code_fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class Selection_Sort_Description extends AppCompatActivity {

    MeowBottomNavigation selection_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection_sort_description);

        selection_bottom_navigation = findViewById(R.id.selection_bottom_bar);
        back_btn = findViewById(R.id.selection_sort_back_btn);

        selection_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        selection_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        selection_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        selection_bottom_navigation.show(0,true);
        
        selection_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("selection");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("selection");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("selection");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Selection_Sort_Description.this,Sorting.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("selection_problem_title","Selection Sort");
        data2.putString("selection_problem_description","Given an unsorted array of size N, use selection sort to sort arr[] in increasing order.\n" +
                "\n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input:\n" +
                "N = 5\n" +
                "arr[] = {4, 1, 3, 9, 7}\n" +
                "Output:\n" +
                "1 3 4 7 9\n" +
                "Explanation:\n" +
                "Maintain sorted (in bold) and unsorted subarrays.\n" +
                "Select 1. Array becomes 1 4 3 9 7.\n" +
                "Select 3. Array becomes 1 3 4 9 7.\n" +
                "Select 4. Array becomes 1 3 4 9 7.\n" +
                "Select 7. Array becomes 1 3 4 7 9.\n" +
                "Select 9. Array becomes 1 3 4 7 9.\n" +
                "\n\nExample 2:\n" +
                "\n" +
                "Input:\n" +
                "N = 10\n" +
                "arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}\n" +
                "Output:\n" +
                "1 2 3 4 5 6 7 8 9 10\n" +
                "\n" +
                "Your Task:  \n" +
                "You dont need to read input or print anything. Complete the functions select() and selectionSort() ,where select() takes arr[] and starting point of unsorted array i as input parameters and returns the selected element for each iteration in selection sort, and selectionSort() takes the array and it's size and sorts the array.\n" +
                "\n" +
                "\n" +
                "Expected Time Complexity: O(N2)\n" +
                "Expected Auxiliary Space: O(1)\n" +
                "\n" +
                "\n" +
                "Constraints:\n" +
                "1 ≤ N ≤ 10^3\n\n" +
                "Company Tags\n" +
                "Microsoft\t\tMedlife");

        data2.putString("selection_problem2_title","Minimum Integer");
        data2.putString("selection_problem2_description","You are given an array A of size N. Let us denote S as the sum of all integers present in the array. Among all integers present in the array, find the minimum integer X such that S ≤ N*X.\n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input:\n" +
                "N = 3,\n" +
                "A = { 1, 3, 2}\n" +
                "Output:\n" +
                "2\n" +
                "Explanation:\n" +
                "Sum of integers in the array is 6.\n" +
                "since 6 ≤ 3*2, therefore 2 is the answer.\n" +
                "Example 2:\n" +
                "\n" +
                "Input:\n" +
                "N = 1,\n" +
                "A = { 3 }\n" +
                "Output:\n" +
                "3\n" +
                "Explanation:\n" +
                "3 is the only possible answer\n" +
                "Your Task:\n" +
                "The task is to complete the function minimumInteger() which takes an integer N and an integer array A as input parameters and returns the minimum integer which satisfies the condition.\n" +
                "\n" +
                "Expected Time Complexity: O(N)\n" +
                "Expected Auxiliary Space: O(1)\n" +
                "\n" +
                "Constraints:\n" +
                "1 ≤  N ≤ 105\n" +
                "1 ≤  Ai ≤ 109\n\n"+"Topic Tags\n" +
                "Mathematical\tArrays");

        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.selection_frame_layout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("selection_sort_code","import java.util.Arrays;\n" +
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

        data.putString("selection_implementation","Implementation: Selection sort implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.selection_frame_layout,fragment, null)
        .commit();
    }

    private void loadAlgorithm(Fragment fragment) {

        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("selection_sort_title","Selection Sort");
        data2.putString("selection_sort_description","Selection sort is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
                "based on keys and swaps are made only when required.\n");

        data2.putString("selection_algorithm_title","Algorithm");
        data2.putString("selection_sort_algorithm_description","1. Find the minimum value in the list\n" +
                "2. Swap it with the value in the current position\n" +
                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");

        data2.putString("selection_in_detail_title","Selection Sort in Detail");
        data2.putString("selection_sort_in_detail_description","Lets consider the following array as an example: arr[] = {4, 8, 2, 9, 5}\n" +
                "\n" +
                "First pass:\n" +
                "\n" +
                "For the first position in the sorted array, the whole array is traversed from index 0 to 4 sequentially. The first position where 4 is stored presently, after traversing whole array it is clear that 2 is the lowest value.\n" +
                "   4   \t   8   \t   2   \t   9   \t   5   \n" +
                "Thus, replace 4 with 2. After one iteration 2, which happens to be the least value in the array, tends to appear in the first position of the sorted list.\n" +
                "   2   \t   8   \t   4   \t   9   \t   5   \n" +
                "Second Pass:\n" +
                "\n" +
                "For the second position, where 8 is present, again traverse the rest of the array in a sequential manner.\n" +
                "   2   \t   8   \t   4   \t   9   \t   5   \n" +
                "After traversing, we found that 4 is the second lowest value in the array and it should appear at the second place in the array, thus swap these values.\n" +
                "   2   \t   4   \t   8   \t   9   \t   5   \n" +
                "Third Pass:\n" +
                "\n" +
                "Now, for third place, where 8 is present again traverse the rest of the array and find the third least value present in the array.\n" +
                "   2   \t   4   \t   8   \t   9   \t   5   \n" +
                "While traversing, 5 came out to be the third least value and it should appear at the third place in the array, thus swap 5 with element present at third position.\n" +
                "   2   \t   4   \t   5   \t   9   \t   8   \n" +
                "Fourth pass:\n" +
                "\n" +
                "Similarly, for fourth place, where 9 is present to traverse the rest of the array and find the fourth least value present in the array.\n" +
                "   2   \t   4   \t   5   \t   9   \t   8   \n" +
                "While traversing, 8 came out to be the fourth least value and it should appear at the fourth place in the array, thus swap 9 with element present at fourth position.\n" +
                "   2   \t   4   \t   5   \t   8   \t   9   \n" +
                "Fifth Pass:\n" +
                "\n" +
                "At last the largest value present in the array automatically get placed at the last position in the array\n" +
                "The resulted array is the sorted array.\n" +
                "   2   \t   4   \t   5   \t   8   \t   9 ");

        data2.putString("selection_sort_performance_title","Performance");
        data2.putString("selection_sort_performance_description","Worst case complexity : O(n2)\n" +
                "Best case complexity (Improved version) : O(n)\n" +
                "Average case complexity (Basic version) : O(n2)\n" +
                "Worst case space complexity : O(1) auxiliary\n");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.selection_frame_layout,fragment, null)
                .commit();
    }
}