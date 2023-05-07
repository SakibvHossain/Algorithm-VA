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
        data2.putString("marge_sort_title","Marge Sort");
        data2.putString("marge_sort_description","Merge sort is a popular sorting algorithm that follows the divide-and-conquer approach. It works by dividing the input array into two halves, sorting each half recursively using the merge sort algorithm, and then merging the two sorted halves back into a single sorted array.\n" +
                "\n" +
                "The merge operation is the key step in the algorithm. It involves comparing the first element of each sorted half and selecting the smaller one to be placed in the final sorted array. This process is repeated until all elements have been merged into the final sorted array.");

        data2.putString("marge_sort_algorithm_title","Algorithm");
        data2.putString("marge_sort_algorithm_description","procedure merge_sort(arr)\n" +
                "    if length(arr) > 1 then\n" +
                "        mid = length(arr) / 2\n" +
                "        left_half = arr[1:mid]\n" +
                "        right_half = arr[mid+1:length(arr)]\n" +
                "\n" +
                "        merge_sort(left_half)\n" +
                "        merge_sort(right_half)\n" +
                "\n" +
                "        i = j = k = 1\n" +
                "\n" +
                "        while i <= length(left_half) and j <= length(right_half) do\n" +
                "            if left_half[i] < right_half[j] then\n" +
                "                arr[k] = left_half[i]\n" +
                "                i = i + 1\n" +
                "            else\n" +
                "                arr[k] = right_half[j]\n" +
                "                j = j + 1\n" +
                "            end if\n" +
                "            k = k + 1\n" +
                "        end while\n" +
                "\n" +
                "        while i <= length(left_half) do\n" +
                "            arr[k] = left_half[i]\n" +
                "            i = i + 1\n" +
                "            k = k + 1\n" +
                "        end while\n" +
                "\n" +
                "        while j <= length(right_half) do\n" +
                "            arr[k] = right_half[j]\n" +
                "            j = j + 1\n" +
                "            k = k + 1\n" +
                "        end while\n" +
                "    end if\n" +
                "\n" +
                "    return arr\n" +
                "end procedure\n\n\nThe merge_sort procedure takes an unsorted array as input and returns the sorted array. It first checks if the length of the array is greater than 1. If it is, it divides the array into two halves and recursively sorts each half using merge_sort. Once the two halves are sorted, it merges them into a single sorted array using the while loop and the merge algorithm.\n" +
                "\n" +
                "The merge algorithm compares the elements in the left and right halves and puts them in the correct order in a new array. Finally, the sorted array is returned.");

        data2.putString("marge_sort_in_detail_title","Marge Sort in Detail");
        data2.putString("marge_sort_in_detail_description","Divide the unsorted array into two halves.\n" +
                "Recursively sort the left half and right half of the array until each half has only one element or is empty.\n" +
                "Merge the sorted left and right halves into a single sorted array.\n" +
                "Create a new array to hold the merged elements.\n" +
                "Compare the first elements of both the left and right halves.\n" +
                "Add the smaller element to the new array and move the pointer of that half to the next element.\n" +
                "Repeat the comparison and addition process until all elements in one half are merged.\n" +
                "Add any remaining elements from the other half to the new array.\n" +
                "Replace the original unsorted array with the sorted array.\n" +
                "Here's an example of Merge Sort in action on the array [5, 4, 3, 2, 1]:\n" +
                "\n" +
                "The array is divided into two halves: [5, 4, 3] and [2, 1].\n" +
                "The left half is recursively sorted into [5], [4], and [3]. The right half is recursively sorted into [2] and [1].\n" +
                "The left and right halves are merged into two sorted arrays: [3, 4, 5] and [1, 2].\n" +
                "The two sorted arrays are merged into the final sorted array: [1, 2, 3, 4, 5].");

        data2.putString("marge_sort_performance_title","Performance");
        data2.putString("marge_sort_performance_description","Time complexity : O(N*Log N)\n" +
                "Space complexity : O(n)\n");
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
        data2.putString("marge_sort_problem_title","Merge k Sorted Lists");
        data2.putString("marge_sort_problem_description","You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.\n" +
                "\n" +
                "Merge all the linked-lists into one sorted linked-list and return it.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: lists = [[1,4,5],[1,3,4],[2,6]]\n" +
                "Output: [1,1,2,3,4,4,5,6]\n" +
                "Explanation: The linked-lists are:\n" +
                "[\n" +
                "  1->4->5,\n" +
                "  1->3->4,\n" +
                "  2->6\n" +
                "]\n" +
                "merging them into one sorted list:\n" +
                "1->1->2->3->4->4->5->6\n" +
                "Example 2:\n" +
                "\n" +
                "Input: lists = []\n" +
                "Output: []\n" +
                "Example 3:\n" +
                "\n" +
                "Input: lists = [[]]\n" +
                "Output: []\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "k == lists.length\n" +
                "0 <= k <= 104\n" +
                "0 <= lists[i].length <= 500\n" +
                "-104 <= lists[i][j] <= 104\n" +
                "lists[i] is sorted in ascending order.\n" +
                "The sum of lists[i].length will not exceed 104.");

        data2.putString("marge_sort_problem2_title","No Problem Assigned yet");
        data2.putString("marge_sort_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.marge_sort_frameLayout,fragment, null)
                .commit();
    }
}