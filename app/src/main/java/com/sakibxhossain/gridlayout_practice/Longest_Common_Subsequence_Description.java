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

public class Longest_Common_Subsequence_Description extends AppCompatActivity {

    MeowBottomNavigation lcs_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longest_common_subsequence_description);

        lcs_bottom_navigation = findViewById(R.id.longest_common_subsequence_bottom_bar);
        back_btn = findViewById(R.id.longest_common_subsequence_back_btn);

        lcs_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        lcs_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        lcs_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        lcs_bottom_navigation.show(0,true);

        lcs_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("lcs");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("lcs");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("lcs");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Longest_Common_Subsequence_Description.this,Dynamic.class);
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
        data2.putString("lcs_title","Longest Common Subsequence");
        data2.putString("lcs_description","The Longest Common Subsequence (LCS) is a problem in computer science where the goal is to find the longest subsequence that is common to two given sequences. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.");

        data2.putString("lcs_algorithm_title","Algorithm");
        data2.putString("lcs_algorithm_description","function lcs(X[1..m], Y[1..n])\n" +
                "    L[0..m, 0..n]\n" +
                "    for i := 0..m\n" +
                "        L[i,0] = 0\n" +
                "    for j := 0..n\n" +
                "        L[0,j] = 0\n" +
                "\n" +
                "    for i := 1..m\n" +
                "        for j := 1..n\n" +
                "            if X[i] = Y[j]\n" +
                "                L[i,j] := L[i-1,j-1] + 1\n" +
                "            else\n" +
                "                L[i,j] := max(L[i-1,j], L[i,j-1])\n" +
                "\n" +
                "    LCS := \"\"\n" +
                "    i := m, j := n\n" +
                "    while i > 0 and j > 0\n" +
                "        if X[i] = Y[j]\n" +
                "            LCS := X[i] + LCS\n" +
                "            i := i - 1\n" +
                "            j := j - 1\n" +
                "        else if L[i-1,j] >= L[i,j-1]\n" +
                "            i := i - 1\n" +
                "        else\n" +
                "            j := j - 1\n" +
                "\n" +
                "    return LCS\n\n\nThe function lcs takes two sequences, X and Y, as input and returns the longest common subsequence of X and Y. The function initializes a 2D array L with dimensions (m+1) x (n+1), where m and n are the lengths of X and Y respectively. The algorithm fills in the L array using dynamic programming, computing the length of the LCS for all subproblems of X and Y by comparing the characters at each position.\n" +
                "\n" +
                "After computing the L array, the algorithm constructs the LCS by tracing back through the array, starting from the bottom right corner. The LCS is constructed by adding each matching character to a string LCS and moving diagonally to the left and up in the array when the characters match, otherwise moving to the left or up in the array, depending on which direction yields a larger LCS length.");

        data2.putString("lcs_in_detail_title","Longest Common Subsequence in Detail");
        data2.putString("lcs_in_detail_description","The Longest Common Subsequence (LCS) problem is a classic problem in computer science. It is a problem of finding the longest subsequence that is common to two given sequences. A subsequence is a sequence that can be derived from another sequence by deleting some or no elements without changing the order of the remaining elements.\n" +
                "\n" +
                "Let's take an example of two sequences, X and Y, and find the LCS of these two sequences. Suppose X is \"ABCBDAB\" and Y is \"BDCABA\". We can use the LCS algorithm to find the LCS of X and Y.\n" +
                "\n" +
                "Step 1: Initialize a 2D array L with dimensions (m+1) x (n+1), where m and n are the lengths of X and Y, respectively. Fill the first row and the first column of the array with zeros.\n" +
                "\n" +

                "    X = \"ABCBDAB\"\n" +
                "    Y = \"BDCABA\"\n" +
                "    L = [\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 0, 0, 0, 0]\n" +
                "        ]\n" +
                "Step 2: Iterate through each element of X and Y, and fill in the L array using dynamic programming. At each position (i,j) in the array, if X[i] is equal to Y[j], set L[i][j] to L[i-1][j-1] + 1. Otherwise, set L[i][j] to the maximum of L[i-1][j] and L[i][j-1].\n" +
                "\n" +

                "    for i := 1..m\n" +
                "        for j := 1..n\n" +
                "            if X[i] = Y[j]\n" +
                "                L[i,j] := L[i-1,j-1] + 1\n" +
                "            else\n" +
                "                L[i,j] := max(L[i-1,j], L[i,j-1])\n" +
                "After filling in the L array, it looks like this:\n" +
                "\n" +

                "    L = [\n" +
                "            [0, 0, 0, 0, 0, 0, 0],\n" +
                "            [0, 0, 0, 1, 1, 1, 1],\n" +
                "            [0, 1, 1, 1, 2, 2, 2],\n" +
                "            [0, 1, 1, 2, 2, 2, 2],\n" +
                "            [0, 1, 2, 2, 2, 3, 3],\n" +
                "            [0, 1, 2, 2, 3, 3, 3],\n" +
                "            [0, 1, 2, 2, 3, 4, 4],\n" +
                "            [0, 1, 2, 3, 3, 4, 5]");

        data2.putString("lcs_performance_title","Performance");
        data2.putString("lcs_performance_description","\"Note that this algorithm has a time complexity of O(mn) and a space complexity of O(mn), where m and n are the lengths of s1 and s2 respectively.\"");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.longest_common_subsequence_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("lcs_code","public static String lcs(String s1, String s2) {\n" +
                "    int m = s1.length();\n" +
                "    int n = s2.length();\n" +
                "    int[][] dp = new int[m+1][n+1];\n" +
                "    for (int i = 0; i <= m; i++) {\n" +
                "        for (int j = 0; j <= n; j++) {\n" +
                "            if (i == 0 || j == 0) {\n" +
                "                dp[i][j] = 0;\n" +
                "            } else if (s1.charAt(i-1) == s2.charAt(j-1)) {\n" +
                "                dp[i][j] = dp[i-1][j-1] + 1;\n" +
                "            } else {\n" +
                "                dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "    StringBuilder sb = new StringBuilder();\n" +
                "    int i = m, j = n;\n" +
                "    while (i > 0 && j > 0) {\n" +
                "        if (s1.charAt(i-1) == s2.charAt(j-1)) {\n" +
                "            sb.append(s1.charAt(i-1));\n" +
                "            i--;\n" +
                "            j--;\n" +
                "        } else if (dp[i-1][j] > dp[i][j-1]) {\n" +
                "            i--;\n" +
                "        } else {\n" +
                "            j--;\n" +
                "        }\n" +
                "    }\n" +
                "    return sb.reverse().toString();\n" +
                "}\n");

        data.putString("lcs_implementation","Implementation: Longest Common Subsequence implementation given below - This algorithm takes two strings s1 and s2 as input and returns the longest common subsequence between them as a string. It works by first creating a 2D array dp of size (m+1) x (n+1) where m and n are the lengths of s1 and s2 respectively. The dp[i][j] represents the length of the LCS between the first i characters of s1 and the first j characters of s2.\n" +
                "\n" +
                "The algorithm then fills in the dp array using dynamic programming. If the last characters of s1 and s2 are the same, then the LCS length is equal to dp[i-1][j-1] + 1. Otherwise, the LCS length is either dp[i-1][j] or dp[i][j-1], whichever is larger.\n" +
                "\n" +
                "Finally, the algorithm constructs the LCS by tracing back through the dp array. Starting from the bottom right corner, the algorithm checks if the current characters in s1 and s2 match. If they do, the character is part of the LCS and is added to a StringBuilder. Otherwise, the algorithm moves either up or left in the dp array, depending on which direction yields a larger LCS length.\n" +
                "\n");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.longest_common_subsequence_frameLayout,fragment, null)
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

        fragmentTransaction.replace(R.id.longest_common_subsequence_frameLayout,fragment, null)
                .commit();
    }
}