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
                "terminated, and the message “Element is not found” will be displayed.\n\n\nPseudo Code:\nLinearSearch(array, target):\n" +
                "    for i = 0 to length(array) - 1\n" +
                "        if array[i] == target:\n" +
                "            return i\n" +
                "    return -1 // Target not found in array\n\n\nIn this algorithm, array is the array to be searched, and target is the value being searched for. The algorithm works by sequentially searching the elements of the array from the first element to the last element until the target value is found or the end of the array is reached.\n" +
                "\n" +
                "The algorithm starts by initializing a loop that iterates through each element of the array, from i = 0 to i = length(array) - 1. At each iteration, it compares the current element of the array with the target value. If the current element is equal to the target value, it returns the index of that element. If the end of the array is reached and the target value has not been found, it returns -1 to indicate that the target value is not in the array.");

        data2.putString("linear_search_in_detail_title","Linear Search in Detail");
        data2.putString("linear_search_in_detail_description","Suppose we have an array A with the following elements: A = [7, 2, 9, 3, 6, 4]. We want to search for the value 6 in the array.\n" +
                "\n" +
                "Step 1: Initialize the loop\n" +
                "We start by initializing a loop that iterates through each element of the array from the first element to the last element:\n" +
                "\n" +
                "for i = 0 to 5 do\n" +
                "Step 2: Compare the current element with the target value\n" +
                "At each iteration of the loop, we compare the current element A[i] with the target value 6:\n" +
                "\n" +
                "if A[i] == 6 then\n" +
                "On the first iteration of the loop, i = 0 and A[0] = 7, so the condition is false.\n" +
                "\n" +
                "On the second iteration of the loop, i = 1 and A[1] = 2, so the condition is false.\n" +
                "\n" +
                "On the third iteration of the loop, i = 2 and A[2] = 9, so the condition is false.\n" +
                "\n" +
                "On the fourth iteration of the loop, i = 3 and A[3] = 3, so the condition is false.\n" +
                "\n" +
                "On the fifth iteration of the loop, i = 4 and A[4] = 6, so the condition is true.\n" +
                "\n" +
                "Step 3: Target value found\n" +
                "If the current element A[i] is equal to the target value, we return the index i:\n" +
                "\n" +
                "return i\n" +
                "In this case, the target value 6 is found at index 4, so we return 4.\n" +
                "\n" +
                "Step 4: Target value not found\n" +
                "If the loop completes without finding the target value, we return -1:\n" +
                "\n" +
                "return -1\n" +
                "In this example, we found the target value 6 at index 4, so we do not need to return -1.\n" +
                "\n" +
                "Therefore, the linear search algorithm for searching for the value 6 in the array A returns the index 4.");

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
        data2.putString("linear_problem_title","Kth Missing Positive Number");
        data2.putString("linear_problem_description","Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.\n" +
                "\n" +
                "Return the kth positive integer that is missing from this array.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: arr = [2,3,4,7,11], k = 5\n" +
                "Output: 9\n" +
                "Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.\n" +
                "Example 2:\n" +
                "\n" +
                "Input: arr = [1,2,3,4], k = 2\n" +
                "Output: 6\n" +
                "Explanation: The missing positive integers are [5,6,7,...]. The 2nd missing positive integer is 6.\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= arr.length <= 1000\n" +
                "1 <= arr[i] <= 1000\n" +
                "1 <= k <= 1000\n" +
                "arr[i] < arr[j] for 1 <= i < j <= arr.length\n" +
                " \n" +
                "\n" +
                "Follow up:\n" +
                "\n" +
                "Could you solve this problem in less than O(n) complexity?");

        data2.putString("linear_problem2_title","Problems Not Assigned Yet");
        data2.putString("linear_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.linear_search_frameLayout,fragment, null)
                .commit();
    }

}