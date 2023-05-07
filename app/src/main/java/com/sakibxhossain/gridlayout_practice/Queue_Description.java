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

public class Queue_Description extends AppCompatActivity {

    MeowBottomNavigation queue_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_queue_algo);

        queue_bottom_navigation = findViewById(R.id.queue_bottom_bar);
        back_btn = findViewById(R.id.queue_back_btn);

        queue_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        queue_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        queue_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        queue_bottom_navigation.show(0,true);

        queue_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("queue");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("queue");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("queue");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Queue_Description.this,Stack_Queue.class);
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
        data2.putString("queue_title","Queue");
        data2.putString("queue_description","queue sort is an in-place sorting algorithm. queue sort works well for small files. It is used\n" +
                "for sorting the files with very large values and small keys. \n\nThis is because queue is made" +
                "based on keys and swaps are made only when required.\n");

        data2.putString("queue_algorithm_title","Algorithm");
        data2.putString("queue_algorithm_description","1. Find the minimum value in the list\n" +
                "2. Swap it with the value in the current position\n" +
                "3. Repeat this process for all the elements until the entire array is sorted\n\nThis algorithm is called queue sort since it repeatedly selects the smallest element.\n");

        data2.putString("queue_in_detail_title","queue Sort in Detail");
        data2.putString("queue_in_detail_description","Description will be added later");

        data2.putString("queue_performance_title","Performance");
        data2.putString("queue_performance_description","\n" +
                "The space and time complexity of a queue depend on the specific implementation of the queue. However, here are the typical space and time complexities of the two most common implementations of a queue:\n" +
                "\n" +
                "Array-based queue:\n" +
                "Space complexity: O(n), where n is the maximum number of elements that can be stored in the queue. This is because the array needs to be allocated with enough memory to hold all the elements.\n" +
                "\n" +
                "Time complexity:\n" +
                "\n" +
                "Enqueue operation: O(1) on average, but O(n) in the worst case when the array needs to be resized to accommodate more elements.\n" +
                "\n" +
                "Dequeue operation: O(1) because it only requires updating the front pointer.\n" +
                "\n" +
                "Peek operation: O(1) because it only requires accessing the front element.\n" +
                "\n" +
                "Linked list-based queue:\n" +
                "Space complexity: O(n), where n is the number of elements in the queue. This is because each element requires a node in the linked list.\n" +
                "\n" +
                "Time complexity:\n" +
                "\n" +
                "Enqueue operation: O(1) because it only requires adding a new node at the tail of the linked list.\n" +
                "\n" +
                "Dequeue operation: O(1) because it only requires removing the front node of the linked list.\n" +
                "\n" +
                "Peek operation: O(1) because it only requires accessing the front node of the linked list.\n" +
                "\n" +
                "Overall, the array-based queue is more space-efficient but can have slower worst-case time complexity for the enqueue operation. The linked list-based queue is more time-efficient for the enqueue operation but requires more space to store the nodes.");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.queue_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("queue_code","package StackQueue;\n" +
                "class Queue {\n" +
                "\tint front, rear, size;\n" +
                "\tint capacity;\n" +
                "\tint array[];\n" +
                "\tpublic Queue(int capacity){\n" +
                "\t\tthis.capacity = capacity;\n" +
                "\t\tfront = this.size = 0;\n" +
                "\t\trear = capacity - 1;\n" +
                "\t\tarray = new int[this.capacity];\n" +
                "\t}\n" +
                "\tboolean isFull(Queue queue){ // Queue is full when size becomes equal to the capacity\n" +
                "\t\treturn (queue.size == queue.capacity);\n" +
                "\t}\n" +
                "\tboolean isEmpty(Queue queue){ // Queue is empty when size is 0\n" +
                "\t\treturn (queue.size == 0);\n" +
                "\t}\n" +
                "\tvoid enqueue(int item){ // Method to add an item to the queue. It changes rear and size\n" +
                "\t\tif (isFull(this))\n" +
                "\t\t\treturn;\n" +
                "\t\tthis.rear = (this.rear + 1) % this.capacity;\n" +
                "\t\tthis.array[this.rear] = item;\n" +
                "\t\tthis.size = this.size + 1;\n" +
                "\t\tSystem.out.println(item + \" enqueued to queue\");\n" +
                "\t}\n" +
                "\tint dequeue(){ // Method to remove an item from queue. It changes front and size\n" +
                "\t\tif (isEmpty(this))\n" +
                "\t\t\treturn Integer.MIN_VALUE;\n" +
                "\n" +
                "\t\tint item = this.array[this.front];\n" +
                "\t\tthis.front = (this.front + 1) % this.capacity;\n" +
                "\t\tthis.size = this.size - 1;\n" +
                "\t\treturn item;\n" +
                "\t}\n" +
                "\tint front(){ // Method to get front of queue\n" +
                "\t\tif (isEmpty(this))\n" +
                "\t\t\treturn Integer.MIN_VALUE;\n" +
                "\n" +
                "\t\treturn this.array[this.front];\n" +
                "\t}\n" +
                "\tint rear(){ // Method to get rear of queue\n" +
                "\t\tif (isEmpty(this))\n" +
                "\t\t\treturn Integer.MIN_VALUE;\n" +
                "\n" +
                "\t\treturn this.array[this.rear];\n" +
                "\t}\n" +
                "}\n" +
                "public class Queue_Algo {\n" +
                "\tpublic static void main(String[] args){\n" +
                "\t\tQueue queue = new Queue(10);\n" +
                "\t\tqueue.enqueue(10);\n" +
                "\t\tqueue.enqueue(20);\n" +
                "\t\tqueue.enqueue(30);\n" +
                "\t\tSystem.out.println(queue.dequeue() + \" Dequeued from queue\");\n" +
                "\t\tSystem.out.println(queue.front()+ \" Is the Front item\");\n" +
                "\t\tSystem.out.println(queue.rear()+ \" Is the Rear item\");\n" +
                "\t}\n" +
                "}");

        data.putString("queue_implementation","Implementation: Queue implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.queue_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("queue_problem_title","Implement Stack using Queues");
        data2.putString("queue_problem_description","Implement a last-in-first-out (LIFO) stack using only two queues. The implemented stack should support all the functions of a normal stack (push, top, pop, and empty).\n" +
                "\n" +
                "Implement the MyStack class:\n" +
                "\n" +
                "void push(int x) Pushes element x to the top of the stack.\n" +
                "int pop() Removes the element on the top of the stack and returns it.\n" +
                "int top() Returns the element on the top of the stack.\n" +
                "boolean empty() Returns true if the stack is empty, false otherwise.\n" +
                "Notes:\n" +
                "\n" +
                "You must use only standard operations of a queue, which means that only push to back, peek/pop from front, size and is empty operations are valid.\n" +
                "Depending on your language, the queue may not be supported natively. You may simulate a queue using a list or deque (double-ended queue) as long as you use only a queue's standard operations.\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input\n" +
                "[\"MyStack\", \"push\", \"push\", \"top\", \"pop\", \"empty\"]\n" +
                "[[], [1], [2], [], [], []]\n" +
                "Output\n" +
                "[null, null, null, 2, 2, false]\n" +
                "\n" +
                "Explanation\n" +
                "MyStack myStack = new MyStack();\n" +
                "myStack.push(1);\n" +
                "myStack.push(2);\n" +
                "myStack.top(); // return 2\n" +
                "myStack.pop(); // return 2\n" +
                "myStack.empty(); // return False\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= x <= 9\n" +
                "At most 100 calls will be made to push, pop, top, and empty.\n" +
                "All the calls to pop and top are valid.");

        data2.putString("queue_problem2_title","Sliding Window Maximum");
        data2.putString("queue_problem2_description","You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.\n" +
                "\n" +
                "Return the max sliding window.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: nums = [1,3,-1,-3,5,3,6,7], k = 3\n" +
                "Output: [3,3,5,5,6,7]\n" +
                "Explanation: \n" +
                "Window position                   Max\n" +
                "---------------             -----\n" +
                "[1  3  -1] -3  5  3  6  7               3\n" +
                " 1 [3  -1  -3] 5  3  6  7               3\n" +
                " 1  3 [-1  -3  5] 3  6  7               5\n" +
                " 1  3  -1 [-3  5  3] 6  7               5\n" +
                " 1  3  -1  -3 [5  3  6] 7               6\n" +
                " 1  3  -1  -3  5 [3  6  7]              7\n" +
                "Example 2:\n" +
                "\n" +
                "Input: nums = [1], k = 1\n" +
                "Output: [1]\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= nums.length <= 105\n" +
                "-104 <= nums[i] <= 104\n" +
                "1 <= k <= nums.length");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.queue_frameLayout,fragment, null)
                .commit();
    }
}