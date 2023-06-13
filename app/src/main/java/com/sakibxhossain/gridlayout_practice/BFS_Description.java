package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Algorithm_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.Problems_Fragment;
import com.sakibxhossain.gridlayout_practice.algorithm_helper.code_fragment;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

public class BFS_Description extends AppCompatActivity {

    MeowBottomNavigation bfs_bottom_navigation;
    ImageView back_btn;
    Animation left_anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bfs_description);

        bfs_bottom_navigation = findViewById(R.id.bfs_bottom_bar);
        back_btn = findViewById(R.id.bfs_back_btn);

        left_anim = AnimationUtils.loadAnimation(this,R.anim.slide_from_left);

        bfs_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        bfs_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        bfs_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        bfs_bottom_navigation.show(0,true);

        bfs_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("bfs");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("bfs");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("bfs");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(BFS_Description.this,Graph_Algorithm.class);
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
        data2.putString("bfs_title","Breadth-First Search");
        data2.putString("bfs_description","Breadth-First Search, which is a graph traversal algorithm that visits all the nodes of a graph in breadth-first order, i.e., it visits all the nodes at the current level before moving on to the nodes at the next level.");

        data2.putString("bfs_algorithm_title","Algorithm");
        data2.putString("bfs_algorithm_description","BFS(G, s):\n" +
                "    for each vertex u in G:\n" +
                "        color[u] = WHITE  // Initialize all vertices as unvisited\n" +
                "        d[u] = INFINITY   // Initialize the distance from the source to all vertices as infinity\n" +
                "        p[u] = NULL       // Initialize the parent of all vertices as NULL\n" +
                "    color[s] = GRAY      // Mark the source vertex as visited and enqueue it\n" +
                "    d[s] = 0\n" +
                "    p[s] = NULL\n" +
                "    Q = empty queue\n" +
                "    enqueue(Q, s)\n" +
                "    while Q is not empty:   // Main BFS loop\n" +
                "        u = dequeue(Q)     // Dequeue a vertex from the queue\n" +
                "        for each neighbor v of u:\n" +
                "            if color[v] == WHITE:   // If the neighbor is unvisited\n" +
                "                color[v] = GRAY     // Mark the neighbor as visited and enqueue it\n" +
                "                d[v] = d[u] + 1     // Update the distance from the source to the neighbor\n" +
                "                p[v] = u            // Set the parent of the neighbor to u\n" +
                "                enqueue(Q, v)\n" +
                "        color[u] = BLACK   // Mark u as finished\n\nIn this pseudocode, G is the graph, s is the source vertex, color[u] represents the color of vertex u (either WHITE, GRAY, or BLACK), d[u] represents the distance from the source vertex s to vertex u, and p[u] represents the parent of vertex u in the BFS tree. The algorithm starts by initializing all vertices as unvisited, with infinite distance and null parent. Then, it marks the source vertex as visited (coloring it as GRAY) and enqueues it. The main loop of the algorithm dequeues a vertex u from the queue and visits all its unvisited neighbors, marking them as visited and enqueuing them. It also updates their distance and parent information in the BFS tree. Finally, it marks u as finished (coloring it as BLACK). The algorithm continues until the queue is empty, which means that all vertices have been visited.\n" +
                "\n");

        data2.putString("bfs_in_detail_title","Breadth-First Search in Detail");
        data2.putString("bfs_in_detail_description","Here's an example of how BFS algorithm works step by step:\n" +
                "\n" +
                "Suppose we have the following undirected graph:\n" +
                "\n" +

                "       1 -- 2 -- 3\n" +
                "       |    |    |\n" +
                "       4 -- 5 -- 6\n" +
                "We want to perform a BFS traversal starting from vertex 1. Here's how the algorithm works:\n" +
                "\n" +
                "Initialize all vertices as unvisited, with infinite distance and null parent:\n" +
                "\n" +

                "color = [WHITE, WHITE, WHITE, WHITE, WHITE, WHITE]\n" +
                "d = [INF, INF, INF, INF, INF, INF]\n" +
                "p = [NULL, NULL, NULL, NULL, NULL, NULL]\n" +
                "Mark the source vertex as visited (coloring it as GRAY) and enqueue it:\n" +
                "\n" +

                "color = [GRAY, WHITE, WHITE, WHITE, WHITE, WHITE]\n" +
                "d = [0, INF, INF, INF, INF, INF]\n" +
                "p = [NULL, NULL, NULL, NULL, NULL, NULL]\n" +
                "Q = [1]\n" +
                "Dequeue vertex 1 and visit all its unvisited neighbors (coloring them as GRAY) and enqueue them:\n" +
                "\n" +

                "color = [BLACK, GRAY, GRAY, WHITE, WHITE, WHITE]\n" +
                "d = [0, 1, 1, INF, INF, INF]\n" +
                "p = [NULL, 1, 1, NULL, NULL, NULL]\n" +
                "Q = []\n" +
                "The BFS tree so far is:\n" +
                "\n" +

                "    1 -- 2 -- 3\n" +
                "         |\n" +
                "         4 -- 5 -- 6\n" +
                "Dequeue vertex 2 and visit all its unvisited neighbors (coloring them as GRAY) and enqueue them:\n" +
                "\n" +

                "color = [BLACK, BLACK, GRAY, WHITE, WHITE, WHITE]\n" +
                "d = [0, 1, 1, 2, 2, INF]\n" +
                "p = [NULL, 1, 1, 2, 2, NULL]\n" +
                "Q = [3]\n" +
                "The BFS tree so far is:\n" +
                "\n" +

                "    1 -- 2 -- 3\n" +
                "         |\n" +
                "         4 -- 5 -- 6\n" +
                "              |\n" +
                "              3\n" +
                "Dequeue vertex 3 and visit all its unvisited neighbors (coloring them as GRAY) and enqueue them:\n" +
                "\n" +

                "color = [BLACK, BLACK, BLACK, WHITE, WHITE, GRAY]\n" +
                "d = [0, 1, 1, 2, 2, 3]\n" +
                "p = [NULL, 1, 1, 2, 2, 5]\n" +
                "Q = [4]\n" +
                "The BFS tree so far is:\n" +
                "\n" +

                "    1 -- 2 -- 3\n" +
                "         |\n" +
                "         4 -- 5 -- 6\n" +
                "              |\n" +
                "              3 -- 4\n" +
                "Dequeue vertex 4 and visit all its unvisited neighbors (coloring them as GRAY) and enqueue them:\n" +
                "\n" +

                "color = [BLACK, BLACK, BLACK, BLACK, GRAY, GRAY]\n" +
                "d = [0, 1, 1, 2, 2, 3]\n" +
                "p = [NULL, 1, 1, 2, 5, 5]\n" +
                "Q = [5, 6]\n" +
                "The BFS tree so far is:\n" +
                "\n" +

                "    1 -- 2 -- 3\n" +
                "         |\n" +
                "         4 -- 5 -- 6\n" +
                "              |\n" +
                "              3 -- 4 -- 6");

        data2.putString("bfs_performance_title","Performance");
        data2.putString("bfs_performance_description","BFS algorithm has a time complexity of O(V + E), where V is the number of vertices and E is the number of edges in the graph. The algorithm visits each vertex and each edge once, so the time complexity is proportional to the size of the input graph.\n" +
                "\n" +
                "In terms of space complexity, BFS uses a queue to store the nodes to be visited, and a boolean array to keep track of visited nodes. The maximum size of the queue is the maximum number of nodes at the same level in the graph, which can be as large as the diameter of the graph. Therefore, the space complexity of BFS is O(V), where V is the number of vertices in the graph.");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.bfs_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("bfs_code","import java.util.*;\n" +
                "\n" +
                "public class BFS {\n" +
                "    private int V; // number of vertices\n" +
                "    private LinkedList<Integer>[] adj; // adjacency list\n" +
                "\n" +
                "    public BFS(int v) {\n" +
                "        V = v;\n" +
                "        adj = new LinkedList[v];\n" +
                "        for (int i = 0; i < v; ++i) {\n" +
                "            adj[i] = new LinkedList<>();\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public void addEdge(int v, int w) {\n" +
                "        adj[v].add(w);\n" +
                "    }\n" +
                "\n" +
                "    public void bfs(int s) {\n" +
                "        boolean[] visited = new boolean[V];\n" +
                "        LinkedList<Integer> queue = new LinkedList<>();\n" +
                "\n" +
                "        visited[s] = true;\n" +
                "        queue.add(s);\n" +
                "\n" +
                "        while (queue.size() != 0) {\n" +
                "            s = queue.poll();\n" +
                "            System.out.print(s + \" \");\n" +
                "\n" +
                "            Iterator<Integer> i = adj[s].listIterator();\n" +
                "            while (i.hasNext()) {\n" +
                "                int n = i.next();\n" +
                "                if (!visited[n]) {\n" +
                "                    visited[n] = true;\n" +
                "                    queue.add(n);\n" +
                "                }\n" +
                "            }\n" +
                "        }\n" +
                "    }\n" +
                "\n" +
                "    public static void main(String[] args) {\n" +
                "        BFS g = new BFS(4);\n" +
                "\n" +
                "        g.addEdge(0, 1);\n" +
                "        g.addEdge(0, 2);\n" +
                "        g.addEdge(1, 2);\n" +
                "        g.addEdge(2, 0);\n" +
                "        g.addEdge(2, 3);\n" +
                "        g.addEdge(3, 3);\n" +
                "\n" +
                "        System.out.println(\"BFS Traversal starting from vertex 2:\");\n" +
                "        g.bfs(2);\n" +
                "    }\n" +
                "}\n");

        data.putString("bfs_implementation","Implementation: Breadth-First Search implementation given below - we create a graph with 4 vertices and add some edges to it. Then, we call the bfs method with the starting vertex 2 to perform BFS traversal starting from that vertex. The output should be: 2 0 3 1.");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.bfs_frameLayout,fragment, null)
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

        fragmentTransaction.replace(R.id.bfs_frameLayout,fragment, null)
                .commit();
    }

}