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

public class Ternary_Search_Description extends AppCompatActivity {
    MeowBottomNavigation ternary_Search_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ternary_search);

        ternary_Search_bottom_navigation = findViewById(R.id.ternary_search_bottom_bar);
        back_btn = findViewById(R.id.ternary_search_back_btn);

        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        ternary_Search_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        ternary_Search_bottom_navigation.show(0,true);

        ternary_Search_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("ternary");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("ternary");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("ternary");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Ternary_Search_Description.this,Searching.class);
                startActivity(goBack_to_Sorting);
                finish();
            }
        });
    }

    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data2 = new Bundle();
        data2.putString("ternary_title","Ternary Search");
        data2.putString("ternary_description","Maximize your search capabilities and reduce time complexity with the introduction of the Ternary Search algorithm. One can look at this article as unlocking the power of efficient searching with the lesser-known, but highly effective algorithm known as the Ternary Search.");

        data2.putString("ternary_algorithm_title","Algorithm");
        data2.putString("ternary_algorithm_description","Steps to perform Ternary Search: \n" +
                "\n" +
                "First, we compare the key with the element at mid1. If found equal, we return mid1.\n" +
                "If not, then we compare the key with the element at mid2. If found equal, we return mid2.\n" +
                "If not, then we check whether the key is less than the element at mid1. If yes, then recur to the first part.\n" +
                "If not, then we check whether the key is greater than the element at mid2. If yes, then recur to the third part.\n" +
                "If not, then we recur to the second (middle) part.\n\n\nPseudo Code:\nTernarySearch(array, left, right, target):\n" +
                "    if left > right:\n" +
                "        return -1  // Target not found in array\n" +
                "    else:\n" +
                "        third1 = left + (right-left) / 3\n" +
                "        third2 = right - (right-left) / 3\n" +
                "        \n" +
                "        if array[third1] == target:\n" +
                "            return third1\n" +
                "        elif array[third2] == target:\n" +
                "            return third2\n" +
                "        elif target < array[third1]:\n" +
                "            return TernarySearch(array, left, third1-1, target)\n" +
                "        elif target > array[third2]:\n" +
                "            return TernarySearch(array, third2+1, right, target)\n" +
                "        else:\n" +
                "            return TernarySearch(array, third1+1, third2-1, target)\n\n\nIn this algorithm, array is the array to be searched, left and right are the indices of the left and right ends of the subarray being searched, and target is the value being searched for.\n" +
                "\n" +
                "The algorithm works by dividing the search interval into three parts, instead of two parts like binary search. It calculates the first and second thirds of the interval using the formulae third1 = left + (right-left) / 3 and third2 = right - (right-left) / 3. Then, it compares the target with the values at third1 and third2 and recursively searches either the left or right interval based on the comparison.\n" +
                "\n" +
                "If the target is found at array[third1] or array[third2], the algorithm returns the index of that element. If the target is less than array[third1], it searches the left interval. If the target is greater than array[third2], it searches the right interval. Otherwise, it searches the middle interval between third1 and third2.");

        data2.putString("ternary_in_detail_title","Ternary Search in Detail");
        data2.putString("ternary_sort_in_detail_description","Ternary search is a decrease(by constant) and conquer algorithm that can be used to find an element in an array. It is similar to binary search where we divide the array into two parts but in this algorithm, we divide the given array into three parts and determine which has the key (searched element). We can divide the array into three parts by taking mid1 and mid2 which can be calculated as shown below. Initially, l and r will be equal to 0 and n-1 respectively, where n is the length of the array. \n" +
                "\n" +
                "It is same as the binary search. The only difference is that, it reduces the time complexity a bit more. the algorithm involves ‘N’ steps. The searchable range would be the size = 3^N. Inversely, the number of steps needed to find the element is the log of the size of the collection. So the runtime is O(log N base 3).\n" +
                "\n" +
                "The time complexity for ternary search is O (log N base 3 ) on average.");

        data2.putString("ternary_performance_title","Performance");
        data2.putString("ternary_performance_description","Time Complexity: O(log3n), where n is the size of the array.\n" +
                "Auxiliary Space: O(1)");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("ternary_search_code","class Ternary_Search {\n" +
                "\tstatic int ternarySearch(int starting_index, int ar_length, int key, int ar[]){\n" +
                "\t\tif (ar_length >= starting_index) {  // Find the mid1 and mid2\n" +
                "\t\t\tint mid1 = starting_index + (ar_length - starting_index) / 3;\n" +
                "\t\t\tint mid2 = ar_length - (ar_length - starting_index) / 3;\n" +
                "\t\t\tif (ar[mid1] == key) { // Check if key is present at any mid\n" +
                "\t\t\t\treturn mid1;\n" +
                "\t\t\t}\n" +
                "\t\t\tif (ar[mid2] == key) {\n" +
                "\t\t\t\treturn mid2;\n" +
                "\t\t\t}// Since key is not present at mid, check in which region it is present then repeat the Search operation in that region\n" +
                "\t\t\tif (key < ar[mid1]) {\n" +
                "\t\t\t\treturn ternarySearch(starting_index, mid1 - 1, key, ar); // The key lies in between l and mid1\n" +
                "\t\t\t}\n" +
                "\t\t\telse if (key > ar[mid2]) {\n" +
                "\t\t\t\treturn ternarySearch(mid2 + 1, ar_length, key, ar); // The key lies in between mid2 and r\n" +
                "\t\t\t}\n" +
                "\t\t\telse {\n" +
                "\t\t\t\treturn ternarySearch(mid1 + 1, mid2 - 1, key, ar); // The key lies in between mid1 and mid2\n" +
                "\t\t\t}\n" +
                "\t\t}\n" +
                "\t\treturn -1;// Key not found\n" +
                "\t}\n" +
                "\tpublic static void main(String args[]){\n" +
                "\t\tint ar[] = { 1, 2, 3, 4, 5, 6, 7};// Sort the array if not sorted\n" +
                "\t\tint starting_index = 0, ar_length = ar.length-1, search_for = 5, result;\n" +
                "\t\tresult = ternarySearch(starting_index, ar_length, search_for, ar); // Search the key using ternarySearch\n" +
                "\t\tSystem.out.println(\"Index of \" + search_for + \" is \" + result); // Print the result\n" +
                "\t}\n" +
                "}");

        data.putString("ternary_implementation","Implementation: Ternary Search implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("ternary_problem_title","The exam");
        data2.putString("ternary_problem_description","Kate is wizard. Now she should pass the exam.\n" +
                "\n" +
                "During the exam she have to go into the magic room N times. Initially there are X magic items in the room. Before each visit she can use magic to decrease the number of magic items in the room. For each item she spends 1 mana point to destroy it. After each visit the number of magic items increases by 2 times. She can't go into room if there are more than L magic items in it. What minimum mana points does Kate need to pass the exam?\n" +
                "\n" +
                "You need to solve this problem for several test cases.\n" +
                "\n" +
                "\n" +
                "The first line of input contains single integer T \n" +
                " - a number of test cases.\n" +
                "\n" +
                "Then follow T lines. The i-th of these lines contains three integers \n" +
                "," +
                " and " +
                "Print T lines.\n" +
                "\n" +
                "The i-th of them should contain single integer - minimum number of mana points needed to pass the exam in the i-th test case.\n" +
                "\n" +
                "Sample Input\n" +
                "2\n" +
                "2 5 3\n" +
                "6 5 0\n" +
                "Sample Output\n" +
                "1\n" +
                "0\n" +
                "Time Limit: 1\n" +
                "Memory Limit: 256\n" +
                "Source Limit:\n" +
                "Explanation\n" +
                "In the first case test Kate should destroy 1 item before the first visit.\n" +
                "\n");

        data2.putString("ternary_problem2_title","Small Factorials");
        data2.putString("ternary_problem2_description","You are asked to calculate factorials of some small positive integers.\n" +
                "\n" +
                "InputAn integer T, denoting the number of testcases, followed by T lines, each containing a single integer N.\n" +
                "\n" +
                "Output For each integer N given at input, output a single line the value of N!\n" +
                "\n" +
                "Input Constraint\n" +
                "\n" +
                "1 <= T <= 100 1 <= N <= 100\n" +
                "\n" +
                "Sample Input\n" +
                "4\n" +
                "1\n" +
                "2\n" +
                "5\n" +
                "3\n" +
                "Sample Output\n" +
                "1\n" +
                "2\n" +
                "120\n" +
                "6");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.ternary_search_frameLayout,fragment, null)
                .commit();
    }
}