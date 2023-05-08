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

public class DFS_Description extends AppCompatActivity {

    MeowBottomNavigation dfs_bottom_navigation;
    ImageView back_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dfs_description);

        dfs_bottom_navigation = findViewById(R.id.dfs_bottom_bar);
        back_btn = findViewById(R.id.dfs_back_btn);

        dfs_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        dfs_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        dfs_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        dfs_bottom_navigation.show(0,true);

        dfs_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("dfs");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("dfs");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("dfs");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(DFS_Description.this, Graph_Algorithm.class);
                startActivity(goBack_to_Sorting);
                overridePendingTransition(R.anim.slide_from_left,R.anim.slideout_from_right);
            }
        });

    }

    private void loadAlgorithm(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
//        Bundle data2 = new Bundle();
//        data2.putString("selection_sort_title","Selection Sort");
//        data2.putString("selection_sort_description","Selection sort is an in-place sorting algorithm. Selection sort works well for small files. It is used\n" +
//                "for sorting the files with very large values and small keys. \n\nThis is because selection is made" +
//                "based on keys and swaps are made only when required.\n");
//
//        data2.putString("selection_algorithm_title","Algorithm");
//        data2.putString("selection_sort_algorithm_description","1. Find the minimum value in the list\n" +
//                "2. Swap it with the value in the current position\n" +
//                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called selection sort since it repeatedly selects the smallest element.\n");
//
//        data2.putString("selection_in_detail_title","Selection Sort in Detail");
//        data2.putString("selection_sort_in_detail_description","Description will be added later");
//
//        data2.putString("selection_sort_performance_title","Performance");
//        data2.putString("selection_sort_performance_description","Worst case complexity : O(n2)\n" +
//                "Best case complexity (Improved version) : O(n)\n" +
//                "Average case complexity (Basic version) : O(n2)\n" +
//                "Worst case space complexity : O(1) auxiliary\n");
//        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.dfs_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("dfs_code","class Graph {\n" +
                "    private int V;\n" +
                "    private LinkedList<Integer>[] adj;\n" +
                " \n" +
                "    Graph(int v) {\n" +
                "        V = v;\n" +
                "        adj = new LinkedList[v];\n" +
                "        for (int i=0; i<v; ++i)\n" +
                "            adj[i] = new LinkedList();\n" +
                "    }\n" +
                " \n" +
                "    void addEdge(int v, int w) {\n" +
                "        adj[v].add(w);\n" +
                "    }\n" +
                " \n" +
                "    void DFSUtil(int v, boolean[] visited) {\n" +
                "        visited[v] = true;\n" +
                "        System.out.print(v + \" \");\n" +
                " \n" +
                "        Iterator<Integer> i = adj[v].listIterator();\n" +
                "        while (i.hasNext()) {\n" +
                "            int n = i.next();\n" +
                "            if (!visited[n])\n" +
                "                DFSUtil(n, visited);\n" +
                "        }\n" +
                "    }\n" +
                " \n" +
                "    void DFS(int v) {\n" +
                "        boolean[] visited = new boolean[V];\n" +
                "        DFSUtil(v, visited);\n" +
                "    }\n" +
                "}\n");

        data.putString("dfs_implementation","Implementation: Depth First Search implementation given below using recursion - In this code, we first create a Graph class that contains an adjacency list representation of the graph, as well as methods to add edges and perform DFS. The DFSUtil method performs the recursive DFS traversal, marking visited nodes and printing them as it goes. Finally, the DFS method initializes the visited array and calls DFSUtil on the starting node.");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.dfs_frameLayout,fragment, null)
        .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("selection_problem_title","Problem 1");
        data2.putString("selection_problem_description","Problems not assigned yet\n");

        data2.putString("selection_problem2_title","Problem 2");
        data2.putString("selection_problem2_description","Problems not assigned yet\n");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.dfs_frameLayout,fragment, null)
                .commit();
    }

}