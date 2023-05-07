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
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("insertion_problem_title","Insertion Sort");
        data2.putString("insertion_problem_description","The task is to complete the insert() function which is used to implement Insertion Sort.\n" +
                "\n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input:\n" +
                "N = 5\n" +
                "arr[] = { 4, 1, 3, 9, 7}\n" +
                "Output:\n" +
                "1 3 4 7 9\n" +
                "Example 2:\n" +
                "\n" +
                "Input:\n" +
                "N = 10\n" +
                "arr[] = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1}\n" +
                "Output:\n" +
                "1 2 3 4 5 6 7 8 9 10\n" +
                "\n" +
                "Your Task: \n" +
                "You don't have to read input or print anything. Your task is to complete the function insert() and insertionSort() where insert() takes the array, it's size and an index i and insertionSort() uses insert function to sort the array in ascending order using insertion sort algorithm. \n" +
                "\n" +
                "Expected Time Complexity: O(N*N).\n" +
                "Expected Auxiliary Space: O(1).\n" +
                "\n" +
                "\n" +
                "Constraints:\n" +
                "1 <= N <= 1000\n" +
                "1 <= arr[i] <= 1000"+"\n\n\nMicrosoft\tMAQ Software\tJuniper Networks\tCisco\tAccenture\tDell");

        data2.putString("insertion_problem2_title","Sort List");
        data2.putString("insertion_problem2_description","Given the head of a linked list, return the list after sorting it in ascending order.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: head = [4,2,1,3]\n" +
                "Output: [1,2,3,4]\n" +
                "Example 2:\n" +
                "\n" +
                "Input: head = [-1,5,3,4,0]\n" +
                "Output: [-1,0,3,4,5]\n" +
                "Example 3:\n" +
                "\n" +
                "Input: head = []\n" +
                "Output: []\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "The number of nodes in the list is in the range [0, 5 * 104].\n" +
                "-105 <= Node.val <= 105\n" +
                " \n" +
                "\n" +
                "Follow up: Can you sort the linked list in O(n logn) time and O(1) memory (i.e. constant space)?\n" +
                "\n" +
                "Accepted\n" +
                "627.9K\n" +
                "Submissions\n" +
                "1.1M\n" +
                "Acceptance Rate\n" +
                "55.3%");

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
        data2.putString("insertion_sort_description","Insertion Sort is a simple sorting algorithm that sorts an array by repeatedly inserting each unsorted element into its correct position in the sorted subarray to the left of it. It is an in-place, comparison-based algorithm that works well for small or nearly sorted arrays. The algorithm gets its name from the way elements are inserted into the sorted subarray, much like the way we sort a deck of cards by inserting each card into its proper place in the sorted sub-deck.");

        data2.putString("insertion_algorithm_title","Algorithm");
        data2.putString("insertion_sort_algorithm_description","InsertionSort(A):\n" +
                "   for i = 1 to length(A) - 1\n" +
                "      current = A[i]\n" +
                "      j = i - 1\n" +
                "      while j >= 0 and A[j] > current\n" +
                "         A[j+1] = A[j]\n" +
                "         j = j - 1\n" +
                "      A[j+1] = current\n\n\nIn this algorithm, A is the array to be sorted. The outer loop iterates through each element of the array starting from the second element. The inner loop compares the current element with the preceding elements in the sorted subarray and shifts them to the right until the current element is in its correct position in the subarray.");

        data2.putString("insertion_in_detail_title","Insertion Sort in Detail");
        data2.putString("insertion_sort_in_detail_description","Starting from the second element, compare each element with the preceding elements in the sorted subarray.\n" +
                "If the preceding element is greater than the current element, shift the preceding element to the right by one position and continue comparing until the preceding element is less than or equal to the current element.\n" +
                "Insert the current element in its correct position in the sorted subarray.\n" +
                "Repeat steps 1-3 for the remaining unsorted elements in the array.\n" +
                "Here's an example of Insertion Sort in action on the array [5, 4, 3, 2, 1]:\n" +
                "\n" +
                "The first element 5 is already sorted.\n" +
                "Compare 4 with the preceding element 5. Since 5 is greater than 4, shift 5 to the right and insert 4 in its correct position. The array becomes [4, 5, 3, 2, 1].\n" +
                "Compare 3 with the preceding elements 5 and 4. Since 5 and 4 are greater than 3, shift them to the right and insert 3 in its correct position. The array becomes [3, 4, 5, 2, 1].\n" +
                "Compare 2 with the preceding elements 5, 4, and 3. Since they are all greater than 2, shift them to the right and insert 2 in its correct position. The array becomes [2, 3, 4, 5, 1].\n" +
                "Compare 1 with the preceding elements 5, 4, 3, and 2. Since they are all greater than 1, shift them to the right and insert 1 in its correct position. The array becomes [1, 2, 3, 4, 5].\n" +
                "\n\n\nThe array is now sorted in ascending order.\n" +
                "In each iteration, the sorted subarray on the left of the current element increases by one element. The algorithm repeatedly inserts each unsorted element into its correct position in the sorted subarray until all elements are sorted.");

        data2.putString("insertion_sort_performance_title","Performance");
        data2.putString("insertion_sort_performance_description","Time Complexity:\n" +
                "\n" +
                "Best Case: O(n), when the array is already sorted.\n" +
                "Average and Worst Case: O(n^2), when the array is in reverse order or contains a large number of inversions.\n" +
                "Space Complexity:\n" +
                "\n" +
                "O(1), because Insertion Sort sorts the array in-place and only uses a constant amount of additional memory");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.insertion_frame_layout,fragment, null)
                .commit();
    }
}