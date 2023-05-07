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

public class Stack_Description extends AppCompatActivity {

    MeowBottomNavigation stack_bottom_navigation;
    ImageView back_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stack_algo);

        stack_bottom_navigation = findViewById(R.id.stack_bottom_bar);
        back_btn = findViewById(R.id.stack_back_btn);

        stack_bottom_navigation.add(new MeowBottomNavigation.Model(0, R.drawable.algorithm_bottom_icon));
        stack_bottom_navigation.add(new MeowBottomNavigation.Model(1, R.drawable.code_bottom_nav_icon));
        stack_bottom_navigation.add(new MeowBottomNavigation.Model(2, R.drawable.problems_bottom_bar_icon));
        stack_bottom_navigation.show(0,true);

        stack_bottom_navigation.setOnShowListener(new Function1<MeowBottomNavigation.Model, Unit>() {
            @Override
            public Unit invoke(MeowBottomNavigation.Model model) {
                Fragment fragment;

                if(model.getId() == 0){
                    fragment = new Algorithm_Fragment("stack");
                    loadAlgorithm(fragment);
                }else if(model.getId() == 1){
                    fragment = new code_fragment("stack");
                    loadCode(fragment);

                }else if(model.getId() == 2){
                    fragment = new Problems_Fragment("stack");
                    loadProblems(fragment);
                }
                return null;
            }
        });

        back_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent goBack_to_Sorting = new Intent(Stack_Description.this,Stack_Queue.class);
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
        data2.putString("stack_title","Stack");
        data2.putString("stack_description","A stack is a linear data structure in which the insertion of a new element and removal of an existing element takes place at the same end represented as the top of the stack.");

        data2.putString("stack_algorithm_title","Basic Operations on Stack");
        data2.putString("stack_algorithm_description","In order to make manipulations in a stack, there are certain operations provided to us.\n" +
                "\n" +
                "push() to insert an element into the stack\n" +
                "pop() to remove an element from the stack\n" +
                "top() Returns the top element of the stack.\n" +
                "isEmpty() returns true if stack is empty else false.\n" +
                "size() returns the size of stack.");

        data2.putString("stack_in_detail_title","Stack in Detail");
        data2.putString("stack_in_detail_description","A stack can be implemented using an array or a linked list. In an array-based implementation, the push operation is implemented by incrementing the index of the top element and storing the new element at that index. The pop operation is implemented by decrementing the index of the top element and returning the value stored at that index. In a linked list-based implementation, the push operation is implemented by creating a new node with the new element and setting the next pointer of the current top node to the new node. The pop operation is implemented by setting the next pointer of the current top node to the next node and returning the value of the current top node.\n" +
                "\n" +
                "Stacks are commonly used in computer science for a variety of applications, including the evaluation of expressions, function calls, and memory management. In the evaluation of expressions, a stack can be used to store operands and operators as they are processed. In function calls, a stack can be used to keep track of the order in which functions are called and to return control to the correct function when a function returns. In memory management, a stack can be used to store the values of the program counter and the values of the registers in a computer program, allowing the program to return to the previous state when a function returns.\n" +
                "\n" +
                "In conclusion, a Stack is a linear data structure that operates on the LIFO principle and can be implemented using an array or a linked list. The basic operations that can be performed on a stack include push, pop, and peek, and stacks are commonly used in computer science for a variety of applications, including the evaluation of expressions, function calls, and memory management.There are two ways to implement a stack –\n" +
                "\n" +
                "Using array\n" +
                "Using linked list");

        data2.putString("stack_performance_title","Advantages & Disadvantages");
        data2.putString("stack_performance_description","Advantages of array implementation:\n" +
                "Easy to implement.\n" +
                "Memory is saved as pointers are not involved.\n" +
                "Disadvantages of array implementation:\n" +
                "It is not dynamic i.e., it doesn’t grow and shrink depending on needs at runtime. [But in case of dynamic sized arrays like vector in C++, list in Python, ArrayList in Java, stacks can grow and shrink with array implementation as well].\n" +
                "The total size of the stack must be defined beforehand.");
        fragment.setArguments(data2);
        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }

    private void loadCode(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);
        Bundle data = new Bundle();
        data.putString("stack_code","package StackQueue;\n" +
                "  class Stack {\n" +
                "    static final int MAX = 10;\n" +
                "\tint top;\n" +
                "\tint a[] = new int[MAX]; // Maximum size of Stack\n" +
                "\tboolean isEmpty(){\n" +
                "\t\treturn (top < 0);\n" +
                "\t}\n" +
                "\tStack(){\n" +
                "\t\ttop = -1;\n" +
                "\t}\n" +
                "\tboolean push(int x){\n" +
                "\t\tif (top >= (MAX - 1)) {\n" +
                "\t\t\tSystem.out.println(\"Stack Overflow\");\n" +
                "\t\t\treturn false;\n" +
                "\t\t}\n" +
                "\t\telse {\n" +
                "\t\t\ta[++top] = x;\n" +
                "\t\t\tSystem.out.println(x + \" pushed into stack\");\n" +
                "\t\t\treturn true;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\tint pop(){\n" +
                "\t\tif (top < 0) {\n" +
                "\t\t\tSystem.out.println(\"Stack Underflow\");\n" +
                "\t\t\treturn 0;\n" +
                "\t\t}\n" +
                "\t\telse {\n" +
                "\t\t\tint x = a[top--];\n" +
                "\t\t\treturn x;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\n" +
                "\tint peek(){\n" +
                "\t\tif (top < 0) {\n" +
                "\t\t\tSystem.out.println(\"Stack Underflow\");\n" +
                "\t\t\treturn 0;\n" +
                "\t\t}\n" +
                "\t\telse {\n" +
                "\t\t\tint x = a[top];\n" +
                "\t\t\treturn x;\n" +
                "\t\t}\n" +
                "\t}\n" +
                "\t\n" +
                "\tvoid print(){\n" +
                "\tfor(int i = top;i>-1;i--){\n" +
                "\tSystem.out.print(\" \"+ a[i]);\n" +
                "\t}\n" +
                "  }\n" +
                "}\n" +
                "class Main {\n" +
                "\tpublic static void main(String args[]){\n" +
                "\t\tStack s = new Stack();\n" +
                "\t\ts.push(10);\n" +
                "\t\ts.push(20);\n" +
                "\t\ts.push(30);\n" +
                "\t\tSystem.out.println(s.pop() + \" Popped from stack\");\n" +
                "\t\tSystem.out.println(s.peek() + \"Is the top element\");\n" +
                "\t\tSystem.out.print(\"Elements present in stack :\");\n" +
                "\t\ts.print();\n" +
                "\t}\n" +
                "}");

        data.putString("stack_implementation","Implementation: Stack implementation given below - ");
        fragment.setArguments(data);
        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }

    private void loadProblems(Fragment fragment) {
        FragmentTransaction fragmentTransaction = getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.fade_in, R.anim.fade_out);

        Bundle data2 = new Bundle();
        data2.putString("stack_problem_title","Valid Parentheses");
        data2.putString("stack_problem_description","Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.\n" +
                "\n" +
                "An input string is valid if:\n" +
                "\n" +
                "Open brackets must be closed by the same type of brackets.\n" +
                "Open brackets must be closed in the correct order.\n" +
                "Every close bracket has a corresponding open bracket of the same type.\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: s = \"()\"\n" +
                "Output: true\n" +
                "Example 2:\n" +
                "\n" +
                "Input: s = \"()[]{}\"\n" +
                "Output: true\n" +
                "Example 3:\n" +
                "\n" +
                "Input: s = \"(]\"\n" +
                "Output: false\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= s.length <= 104\n" +
                "s consists of parentheses only '()[]{}'.");

        data2.putString("stack_problem2_title","Generate Parentheses");
        data2.putString("stack_problem2_description","Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.\n" +
                "\n" +
                " \n" +
                "\n" +
                "Example 1:\n" +
                "\n" +
                "Input: n = 3\n" +
                "Output: [\"((()))\",\"(()())\",\"(())()\",\"()(())\",\"()()()\"]\n" +
                "Example 2:\n" +
                "\n" +
                "Input: n = 1\n" +
                "Output: [\"()\"]\n" +
                " \n" +
                "\n" +
                "Constraints:\n" +
                "\n" +
                "1 <= n <= 8");

        fragment.setArguments(data2);

        fragmentTransaction.replace(R.id.stack_frameLayout,fragment, null)
                .commit();
    }
}