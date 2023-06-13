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
        Bundle data2 = new Bundle();
        data2.putString("dfs_title","Depth First Search");
        data2.putString("dfs_description","Depth-First Search, which is a graph traversal algorithm that starts at a particular vertex and explores as far as possible along each branch before backtracking. In other words, DFS visits vertices in a graph by going down a path until it reaches a dead end, and then backtracking to explore other paths.\n" +
                "\n" +
                "The basic idea behind DFS is to maintain a stack of vertices to be visited, starting with the initial vertex. At each step, the algorithm pops a vertex from the stack, visits it if it has not been visited before, and then pushes its unvisited neighbors onto the stack. This process is repeated until all vertices have been visited, or until a specific condition is met.\n" +
                "\n" +
                "DFS is often used to solve problems that involve exploring all possible paths in a graph, such as finding connected components, detecting cycles, and determining whether a path exists between two vertices. It can be implemented recursively or iteratively using a stack.");

        data2.putString("dfs_algorithm_title","Algorithm");
        data2.putString("dfs_sort_algorithm_description","1. Initialize an empty stack and an empty set of visited vertices.\n" +
                "2. Push the starting vertex onto the stack and add it to the set of visited vertices.\n" +
                "3. While the stack is not empty:\n" +
                "      a. Pop a vertex from the top of the stack.\n" +
                "      b. Visit the vertex if it has not been visited before.\n" +
                "      c. Add all of its unvisited neighbors to the stack and mark them as visited.\n" +
                "4. When the stack is empty, the DFS is complete.\n\nThis pseudo code assumes that the graph is represented as an adjacency list or matrix, and that the starting vertex is known. The DFS can be implemented using either recursion or iteration.");

        data2.putString("dfs_in_detail_title","Selection Sort in Detail");
        data2.putString("dfs_sort_in_detail_description","Suppose we have the following graph:\n" +
                "\n" +
                "A -- B -- C\n" +
                "|         |\n" +
                "D -- E -- F\n" +
                "where the letters represent vertices and the lines represent edges.\n" +
                "\n" +
                "Starting from vertex A, the DFS algorithm would proceed as follows:\n" +
                "\n" +
                "Initialize an empty stack and an empty set of visited vertices.\n" +

                "stack: []\n" +
                "visited: {}\n" +
                "Push vertex A onto the stack and add it to the set of visited vertices.\n" +

                "stack: [A]\n" +
                "visited: {A}\n" +
                "While the stack is not empty:\n" +
                "a. Pop a vertex from the top of the stack, starting with vertex A.\n" +

                "stack: []\n" +
                "visited: {A}\n" +
                "current: A\n" +
                "b. Visit the vertex if it has not been visited before. In this case, print \"Visited vertex A\".\n" +

                "Visited vertex A\n" +
                "c. Add all of its unvisited neighbors to the stack and mark them as visited. In this case, the unvisited neighbors of A are vertices B and D. We add them to the stack and mark them as visited.\n" +

                "stack: [B, D]\n" +
                "visited: {A, B, D}\n" +
                "d. Pop vertex D from the top of the stack.\n" +

                "stack: [B]\n" +
                "visited: {A, B, D}\n" +
                "current: D\n" +
                "e. Visit vertex D and print \"Visited vertex D\".\n" +

                "Visited vertex D\n" +
                "f. Add all of its unvisited neighbors to the stack and mark them as visited. In this case, the unvisited neighbor of D is vertex A, but we have already visited A, so there are no neighbors to add.\n" +

                "stack: [B]\n" +
                "visited: {A, B, D}\n" +
                "g. Pop vertex B from the top of the stack.\n" +

                "stack: []\n" +
                "visited: {A, B, D}\n" +
                "current: B\n" +
                "h. Visit vertex B and print \"Visited vertex B\".\n" +

                "Visited vertex B\n" +
                "i. Add all of its unvisited neighbors to the stack and mark them as visited. In this case, the unvisited neighbors of B are vertices A, C, and E. However, we have already visited A, so we only add vertices C and E to the stack and mark them as visited.\n" +

                "stack: [C, E]\n" +
                "visited: {A, B, C, D, E}\n" +
                "j. Pop vertex E from the top of the stack.\n" +

                "stack: [C]\n" +
                "visited: {A, B, C, D, E}\n" +
                "current: E\n" +
                "k. Visit vertex E and print \"Visited vertex E\".\n" +

                "Visited vertex E\n" +
                "l. Add all of its unvisited neighbors to the stack and mark them as visited. In this case, the unvisited neighbors of E are vertices B and F. However, we have already visited B, so we only add vertex F to the stack and mark it as visited.\n" +

                "stack: [C, F]\n" +
                "visited: {A, B, C, D, E, F}\n" +
                "m. Pop vertex F from the top of the stack.\n" +

                "stack: [C]\n" +
                "visited: {A, B, C, D, E, F}\n" +
                "current: F");

        data2.putString("dfs_performance_title","Performance");
        data2.putString("dfs_performance_description","The time complexity of DFS (Depth-First Search) algorithm is O(V + E), where V is the number of vertices and E is the number of edges in the graph. This is because the algorithm visits every vertex and every edge at most once.\n" +
                "\n" +
                "The space complexity of DFS depends on the data structure used to implement the algorithm. If we use an adjacency matrix to represent the graph and a stack to implement the DFS algorithm, then the space complexity is O(V^2 + V) = O(V^2), where V is the number of vertices. This is because the adjacency matrix takes up O(V^2) space and the stack can contain at most V vertices.");
        fragment.setArguments(data2);
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