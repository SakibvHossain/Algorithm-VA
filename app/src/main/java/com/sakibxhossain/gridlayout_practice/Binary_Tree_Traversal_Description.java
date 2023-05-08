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

public class Binary_Tree_Traversal_Description extends AppCompatActivity {

    MeowBottomNavigation binary_tree_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary_tree_traversal_description);

        binary_tree_bottom_navigation = findViewById(R.id.binary_tree_traversal_bottom_bar);
        back_btn = findViewById(R.id.binary_tree_traversal_back_btn);

        binary_tree_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        binary_tree_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        binary_tree_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        binary_tree_bottom_navigation.show(0,true);

        binary_tree_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("binary_tt");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("binary_tt");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("binary_tt");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Binary_Tree_Traversal_Description.this, Tree_Algorithm.class);
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
        data2.putString("binary_tt_title","Binary Tree Traversal");
        data2.putString("binary_tt_description","Binary tree traversal is the process of visiting every node in a binary tree exactly once in a defined order. There are three common types of binary tree traversal: in-order, pre-order, and post-order traversal.\n" +
                "\n" +
                "In-order traversal visits the left child, then the node itself, and then the right child. This results in a sorted list of the nodes if the binary tree is a binary search tree.\n" +
                "\n" +
                "Pre-order traversal visits the node itself, then the left child, and then the right child.\n" +
                "\n" +
                "Post-order traversal visits the left child, then the right child, and then the node itself.\n" +
                "\n" +
                "Traversal can be done recursively or iteratively. Recursive traversal involves calling the traversal function on the left and right children of each node, while iterative traversal involves using a stack or queue to store the nodes to be visited.\n" +
                "\n" +
                "Binary tree traversal is a fundamental concept in computer science and is used in many algorithms, such as searching, sorting, and tree manipulation.");

        data2.putString("binary_tt_algorithm_title","Algorithm");
        data2.putString("binary_tt_algorithm_description","In-Order Traversal\n" +

                "inOrderTraversal(root)\n" +
                "    if root is null\n" +
                "        return\n" +
                "    inOrderTraversal(root.left)\n" +
                "    print root.value\n" +
                "    inOrderTraversal(root.right)\n" +
                "Pre-Order Traversal\n" +

                "preOrderTraversal(root)\n" +
                "    if root is null\n" +
                "        return\n" +
                "    print root.value\n" +
                "    preOrderTraversal(root.left)\n" +
                "    preOrderTraversal(root.right)\n" +
                "Post-Order Traversal\n" +

                "postOrderTraversal(root)\n" +
                "    if root is null\n" +
                "        return\n" +
                "    postOrderTraversal(root.left)\n" +
                "    postOrderTraversal(root.right)\n" +
                "    print root.value\n" +
                "In each of these algorithms, we first check if the current node is null. If it's not null, we perform the appropriate action (either printing the node value or recursively traversing its children) and then recursively call the traversal method on the left child, followed by the right child.\n" +
                "\n" +
                "Note that these are recursive algorithms, and the base case is when we reach a leaf node or a null child node.");

        data2.putString("binary_tt_in_detail_title","Binary Tree Traversal in Detail");
        data2.putString("binary_tt_in_detail_description","First, let's define a binary tree node class with fields for the node value, left child, and right child:\n" +
                "\n" +

                "public class TreeNode {\n" +
                "    int val;\n" +
                "    TreeNode left;\n" +
                "    TreeNode right;\n" +
                "\n" +
                "    public TreeNode(int val) {\n" +
                "        this.val = val;\n" +
                "        this.left = null;\n" +
                "        this.right = null;\n" +
                "    }\n" +
                "}\n" +
                "Next, let's implement the three common types of binary tree traversal: in-order, pre-order, and post-order traversal.\n" +
                "\n" +
                "In-Order Traversal\n" +
                "In-order traversal visits the left child, then the node itself, and then the right child. Here's an implementation of in-order traversal using recursion:\n" +
                "\n" +

                "public void inOrderTraversal(TreeNode root) {\n" +
                "    if (root == null) {\n" +
                "        return;\n" +
                "    }\n" +
                "\n" +
                "    inOrderTraversal(root.left);\n" +
                "    System.out.print(root.val + \" \");\n" +
                "    inOrderTraversal(root.right);\n" +
                "}\n" +
                "This implementation first checks if the current node is null. If it's not null, it recursively visits the left child, then prints the node value, and finally recursively visits the right child.\n" +
                "\n" +
                "Here's an example usage of the in-order traversal method:\n" +
                "\n" +

                "TreeNode root = new TreeNode(1);\n" +
                "root.left = new TreeNode(2);\n" +
                "root.right = new TreeNode(3);\n" +
                "root.left.left = new TreeNode(4);\n" +
                "root.left.right = new TreeNode(5);\n" +
                "\n" +
                "inOrderTraversal(root); // Output: 4 2 5 1 3\n" +
                "In this example, we create a binary tree with the root node having a value of 1, a left child with a value of 2, a right child with a value of 3, and left child's left and right children with values 4 and 5, respectively. We then call the in-order traversal method on the root node, which prints the node values in the order 4 2 5 1 3.\n" +
                "\n" +
                "Pre-Order Traversal\n" +
                "Pre-order traversal visits the node itself, then the left child, and then the right child. Here's an implementation of pre-order traversal using recursion:\n" +
                "\n" +

                "public void preOrderTraversal(TreeNode root) {\n" +
                "    if (root == null) {\n" +
                "        return;\n" +
                "    }\n" +
                "\n" +
                "    System.out.print(root.val + \" \");\n" +
                "    preOrderTraversal(root.left);\n" +
                "    preOrderTraversal(root.right);\n" +
                "}\n" +
                "This implementation first checks if the current node is null. If it's not null, it prints the node value, then recursively visits the left child, and finally recursively visits the right child.\n" +
                "\n" +
                "Here's an example usage of the pre-order traversal method:\n" +
                "\n" +

                "TreeNode root = new TreeNode(1);\n" +
                "root.left = new TreeNode(2);\n" +
                "root.right = new TreeNode(3);\n" +
                "root.left.left = new TreeNode(4);\n" +
                "root.left.right = new TreeNode(5);\n" +
                "\n" +
                "preOrderTraversal(root); // Output: 1 2 4 5 3\n" +
                "In this example, we create the same binary tree as before and call the pre-order traversal method on the root node, which prints the node values in the order 1 2 4 5 3.\n" +
                "\n" +
                "Post-Order Traversal\n" +
                "Post-order traversal visits the left child, then the right child, and then the node itself. Here's an implementation of post-order traversal using recursion:\n" +
                "\n" +

                "public void postOrderTraversal(TreeNode root) {\n" +
                "    if (root == null) {\n" +
                "        return;\n" +
                "    }\n" +
                "\n" +
                "    postOrderTraversal(root.left);\n" +
                "    postOrderTraversal(root.right);\n" +
                "    System.out.print(root.val + \" \");\n" +
                "}\n" +
                "This implementation first checks if the current node is null. If it's not null, it recursively visits the left child");

        data2.putString("binary_tt_performance_title","Performance");
        data2.putString("binary_tt_performance_description","The time complexity of each type of binary tree traversal depends on the number of nodes in the tree. In the worst case, where the binary tree is a degenerate tree (i.e., a linked list), each node must be visited exactly once. Therefore, the time complexity of binary tree traversal is O(n), where n is the number of nodes in the tree.\n" +
                "\n" +
                "The space complexity of binary tree traversal depends on the type of traversal algorithm used. In-order traversal and post-order traversal typically require O(h) space, where h is the height of the binary tree, due to the use of a stack to keep track of the path to the current node. Pre-order traversal can be implemented iteratively using a queue instead of a stack, which also requires O(h) space. However, pre-order traversal can also be implemented recursively, which can result in O(n) space complexity in the worst case due to the recursive function call stack.\n" +
                "\n" +
                "Here's a summary of the space and time complexity for each type of binary tree traversal:\n" +
                "\n" +
                "In-order traversal: O(n) time complexity, O(h) space complexity\n" +
                "Pre-order traversal: O(n) time complexity (recursive), O(h) space complexity (iterative), O(n) space complexity (recursive)\n" +
                "Post-order traversal: O(n) time complexity, O(h) space complexity\n" +
                "It's worth noting that there are variations of these traversal algorithms that can have different space and time complexities. For example, Morris traversal is an in-order traversal algorithm that requires only O(1) space, but has a time complexity of O(n^2) in the worst case.");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.binary_tree_traversal_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("binary_tt_code","package Tree; \n" +
                "public class Binary_Tree_Traversal{ \n" +
                "    \tstatic class Node {  \n" +
                "\t      int key; \n" +
                "\t      Node left, right;    \n" +
                "\t      public Node(int item) { \n" +
                "\t          key = item; \n" +
                "\t          left = right = null; \n" +
                "\t      } \n" +
                "\t    } \n" +
                "        Node root; \n" +
                "\t    Binary_Tree_Traversal() { \n" +
                "\t        root = null; \n" +
                "\t    } \n" +
                "\t    void postOrder(Node node) { \n" +
                "\t        if (node == null) \n" +
                "\t            return; \n" +
                "\t        postOrder(node.left); \n" +
                "\t        postOrder(node.right); \n" +
                "\t        System.out.print(node.key + \" \"); \n" +
                "\t    } \n" +
                "\t    void InOrder(Node node) { \n" +
                "\t        if (node == null) \n" +
                "\t            return; \n" +
                "\t        InOrder(node.left); \n" +
                "\t        System.out.print(node.key + \" \"); \n" +
                "\t        InOrder(node.right); \n" +
                "\t    } \n" +
                "\t    void PreOrder(Node node) { \n" +
                "\t        if (node == null) \n" +
                "\t            return; \n" +
                "\t        System.out.print(node.key + \" \"); \n" +
                "\t        PreOrder(node.left); \n" +
                "\t        PreOrder(node.right); \n" +
                "\t    } \n" +
                "\t    void postOrder(){     \n" +
                "\t        postOrder(root);  \n" +
                "\t    } \n" +
                "\t    void InOrder(){    \n" +
                "\t        InOrder(root);   \n" +
                "\t    } \n" +
                "\t    void PreOrder(){     \n" +
                "\t        PreOrder(root);  \n" +
                "\t    } \n" +
                "    public static void main(String[] args) {\n" +
                "            Binary_Tree_Traversal tree = new Binary_Tree_Traversal(); \n" +
                "\t        tree.root = new Node(1); \n" +
                "\t        tree.root.left = new Node(2); \n" +
                "\t        tree.root.right = new Node(3); \n" +
                "\t        tree.root.left.left = new Node(4); \n" +
                "\t        tree.root.left.right = new Node(5); \n" +
                "\t        tree.PreOrder(); \n" +
                "            System.out.println();\n" +
                "\t        tree.InOrder(); \n" +
                "            System.out.println();\n" +
                "\t        tree.postOrder(); \n" +
                "    }\n" +
                "}");

        data.putString("binary_tt_implementation","Binary Tree Traversal implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.binary_tree_traversal_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("binary_tt_problem_title","Binary Tree Inorder Traversal");
        data2.putString("binary_tt_problem_description","Given the root of a binary tree, return the inorder traversal of its nodes' values.\n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: root = [1,null,2,3]\n" +
                "Output: [1,3,2]\n" +
                "Example 2:\n" +
                "\n" +
                "Input: root = []\n" +
                "Output: []\n" +
                "Example 3:\n" +
                "\n" +
                "Input: root = [1]\n" +
                "Output: [1]\n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "The number of nodes in the tree is in the range [0, 100].\n" +
                "-100 <= Node.val <= 100");

        data2.putString("binary_tt_problem2_title","Validate Binary Search Tree");
        data2.putString("binary_tt_problem2_description","Given the root of a binary tree, determine if it is a valid binary search tree (BST).\n" +
                "\n" +
                "A valid BST is defined as follows:\n" +
                "\n" +
                "The left \n" +
                "subtree\n" +
                " of a node contains only nodes with keys less than the node's key.\n" +
                "The right subtree of a node contains only nodes with keys greater than the node's key.\n" +
                "Both the left and right subtrees must also be binary search trees.\n" +
                " \n" +
                "Example 1:\n" +
                "\n" +
                "Input: root = [2,1,3]\n" +
                "Output: true\n" +
                "Example 2:\n" +
                "\n" +
                "\n" +
                "Input: root = [5,1,4,null,null,3,6]\n" +
                "Output: false\n" +
                "Explanation: The root node's value is 5 but its right child's value is 4.\n" +
                " \n" +
                "Constraints:\n" +
                "\n" +
                "The number of nodes in the tree is in the range [1, 104].\n" +
                "-231 <= Node.val <= 231 - 1");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.binary_tree_traversal_frameLayout,fragment, null)
                .commit();
    }
}