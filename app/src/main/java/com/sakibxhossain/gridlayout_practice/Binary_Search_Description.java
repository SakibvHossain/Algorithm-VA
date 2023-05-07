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
        data2.putString("binary_search_title","Binary Search");
        data2.putString("binary_search_description","In computer science, binary search, also known as half-interval search, logarithmic search, or binary chop, is a search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of the array.");

        data2.putString("binary_search_algorithm_title","Algorithm");
        data2.putString("binary_search_algorithm_description","The basic steps to perform Binary Search are:\n" +
                "\n" +
                "Sort the array in ascending order.\n" +
                "Set the low index to the first element of the array and the high index to the last element.\n" +
                "Set the middle index to the average of the low and high indices.\n" +
                "If the element at the middle index is the target element, return the middle index.\n" +
                "If the target element is less than the element at the middle index, set the high index to the middle index – 1.\n" +
                "If the target element is greater than the element at the middle index, set the low index to the middle index + 1.\n" +
                "Repeat steps 3-6 until the element is found or it is clear that the element is not present in the array.");

        data2.putString("binary_search_in_detail_title","Binary Sort in Detail");
        data2.putString("binary_search_in_detail_description","We basically ignore half of the elements just after one comparison.\n" +
                "\n" +
                "\n" +
                "Compare x with the middle element.\n" +
                "If x matches with the middle element, we return the mid index.\n" +
                "Else If x is greater than the mid element, then x can only lie in the right half subarray after the mid element. So we recur for the right half.\n" +
                "Else (x is smaller) recur for the left half.");

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
        data2.putString("binary_search_problem_title","Search in Rotated Sorted Array");
        data2.putString("binary_search_problem_description","There is an integer array nums sorted in ascending order (with distinct values).\n" +
                "\n" +
                "Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].\n" +
                "\n" +
                "Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.\n" +
                "\n" +
                "You must write an algorithm with O(log n) runtime complexity.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: nums = [4,5,6,7,0,1,2], target = 0\n" +
                "Output: 4\n" +
                "Example 2:\n" +
                "\n" +
                "Input: nums = [4,5,6,7,0,1,2], target = 3\n" +
                "Output: -1\n" +
                "Example 3:\n" +
                "\n" +
                "Input: nums = [1], target = 0\n" +
                "Output: -1\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= nums.length <= 5000\n" +
                "-104 <= nums[i] <= 104\n" +
                "All values of nums are unique.\n" +
                "nums is an ascending array that is possibly rotated.\n" +
                "-104 <= target <= 104");

        data2.putString("binary_search_problem2_title","Problem Not Assigned Yet");
        data2.putString("binary_search_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.binary_search_frameLayout,fragment, null)
                .commit();
    }
}