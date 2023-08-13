package com.sakibxhossain.gridlayout_practice.algorithm_helper;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.button.MaterialButton;
import com.sakibxhossain.gridlayout_practice.BFS_Analysis;
import com.sakibxhossain.gridlayout_practice.BFS_Visualization;
import com.sakibxhossain.gridlayout_practice.Binary_Search_Analysis;
import com.sakibxhossain.gridlayout_practice.Binary_Search_Visualization_Action;
import com.sakibxhossain.gridlayout_practice.Binary_Tree_Traversal_Analysis;
import com.sakibxhossain.gridlayout_practice.Binary_Tree_Traversal_Visualization;
import com.sakibxhossain.gridlayout_practice.DFS_Analysis;
import com.sakibxhossain.gridlayout_practice.DFS_Visualization;
import com.sakibxhossain.gridlayout_practice.Huffman_Coding_Analysis;
import com.sakibxhossain.gridlayout_practice.Huffman_Coding_Visualization;
import com.sakibxhossain.gridlayout_practice.Insertion_Sort_Analysis;
import com.sakibxhossain.gridlayout_practice.Insertion_Sort_Visualization;
import com.sakibxhossain.gridlayout_practice.Linear_Search_Analysis;
import com.sakibxhossain.gridlayout_practice.Linear_Search_Visualization;
import com.sakibxhossain.gridlayout_practice.Longest_Common_Subsequence_Analysis;
import com.sakibxhossain.gridlayout_practice.Longest_Common_Subsequence_Visualization;
import com.sakibxhossain.gridlayout_practice.Marge_Sort_Analysis;
import com.sakibxhossain.gridlayout_practice.Marge_Sort_Visualization;
import com.sakibxhossain.gridlayout_practice.Queue_Algo_Analysis;
import com.sakibxhossain.gridlayout_practice.Queue_Algo_Visualization;
import com.sakibxhossain.gridlayout_practice.R;
import com.sakibxhossain.gridlayout_practice.Selection_Sort_Analysis;
import com.sakibxhossain.gridlayout_practice.Selection_Sort_Visualization;
import com.sakibxhossain.gridlayout_practice.Stack_algo_Analysis;
import com.sakibxhossain.gridlayout_practice.Stack_algo_Visualization;
import com.sakibxhossain.gridlayout_practice.Ternary_Search_Analysis_Action;
import com.sakibxhossain.gridlayout_practice.Ternary_Search_Visualization;

import java.util.Objects;

import thereisnospon.codeview.CodeView;
import thereisnospon.codeview.CodeViewTheme;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link code_fragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class code_fragment extends Fragment {
//
//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public code_fragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment code_fragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static code_fragment newInstance(String param1, String param2) {
//        code_fragment fragment = new code_fragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }

    CodeView codeView;
    String codeString;
    String code_Implementation_String;
    TextView marge_des;
    String token;
    MaterialButton analysis_btn, visualize_btn;

    public code_fragment(String token) {
        this.token = token;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_code_fragment, container, false);

        codeView = myView.findViewById(R.id.codeview);
        codeView.setTheme(CodeViewTheme.ANDROIDSTUDIO);
        analysis_btn = myView.findViewById(R.id.analysis);
        visualize_btn = myView.findViewById(R.id.visualize);
//      codeView.showCode();

        marge_des = myView.findViewById(R.id.code_description);

        Bundle data = getArguments();

        if(Objects.equals(token, "selection")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Selection_Sort_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Selection_Sort_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            loadSelectionSort_Code(data);
        }
        else if(Objects.equals(token, "marge")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Marge_Sort_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Marge_Sort_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            loadMargeSort_Code(data);
        }
        else if(Objects.equals(token, "insertion")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Insertion_Sort_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Insertion_Sort_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_Insertion_Sort_Code(data);
        }
        else if(Objects.equals(token, "linear")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Linear_Search_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Linear_Search_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_Linear_Search_Code(data);
        }
        else if(Objects.equals(token, "binary_search")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Binary_Search_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Binary_Search_Visualization_Action.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_binary_Search_Code(data);
        }
        else if(Objects.equals(token, "stack")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Stack_algo_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Stack_algo_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_stack_Code(data);
        }
        else if(Objects.equals(token, "ternary")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Ternary_Search_Analysis_Action.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Ternary_Search_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_ternary_Search_Code(data);
        }
        else if(Objects.equals(token, "queue")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Queue_Algo_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Queue_Algo_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_queue_Code(data);
        }
        else if(Objects.equals(token, "binary_tt")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Analysis = new Intent(getContext(), Binary_Tree_Traversal_Analysis.class);
//                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Visualize = new Intent(getContext(), Binary_Tree_Traversal_Visualization.class);
//                    startActivity(go_for_Visualize);
                }
            });
            load_binary_tt_Code(data);
        }
        else if(Objects.equals(token, "dfs")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Analysis = new Intent(getContext(), DFS_Analysis.class);
//                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Visualize = new Intent(getContext(), DFS_Visualization.class);
//                    startActivity(go_for_Visualize);
                }
            });
            load_dfs_Code(data);
        }
        else if(Objects.equals(token, "bfs")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Analysis = new Intent(getContext(), BFS_Analysis.class);
//                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(getActivity(), "Under Implementation", Toast.LENGTH_SHORT).show();
//                    Intent go_for_Visualize = new Intent(getContext(), BFS_Visualization.class);
//                    startActivity(go_for_Visualize);
                }
            });
            load_bfs_Code(data);
        }
        else if(Objects.equals(token, "lcs")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Longest_Common_Subsequence_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Longest_Common_Subsequence_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_lcs_Code(data);
        }
        else if(Objects.equals(token, "huffman_coding")){
            analysis_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Analysis = new Intent(getContext(), Huffman_Coding_Analysis.class);
                    startActivity(go_for_Analysis);
                }
            });
            visualize_btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent go_for_Visualize = new Intent(getContext(), Huffman_Coding_Visualization.class);
                    startActivity(go_for_Visualize);
                }
            });
            load_huffman_coding_Code(data);
        }
        return myView;
    }

    private void load_huffman_coding_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("huffman_coding_code");
            code_Implementation_String = data.getString("huffman_coding_implementation");
        }
        loadCode();
    }

    private void load_lcs_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("lcs_code");
            code_Implementation_String = data.getString("lcs_implementation");
        }
        loadCode();
    }

    private void load_bfs_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("bfs_code");
            code_Implementation_String = data.getString("bfs_implementation");
        }
        loadCode();
    }

    private void load_dfs_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("dfs_code");
            code_Implementation_String = data.getString("dfs_implementation");
        }
        loadCode();
    }

    private void load_binary_tt_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("binary_tt_code");
            code_Implementation_String = data.getString("binary_tt_implementation");
        }
        loadCode();
    }

    private void load_queue_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("queue_code");
            code_Implementation_String = data.getString("queue_implementation");
        }
        loadCode();
    }

    private void load_stack_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("stack_code");
            code_Implementation_String = data.getString("stack_implementation");
        }
        loadCode();
    }

    private void load_binary_Search_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("binary_search_code");
            code_Implementation_String = data.getString("binary_search_implementation");
        }
        loadCode();
    }

    private void load_ternary_Search_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("ternary_search_code");
            code_Implementation_String = data.getString("ternary_implementation");
        }
        loadCode();
    }

    private void load_Linear_Search_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("linear_search_code");
            code_Implementation_String = data.getString("linear_search_description");
        }
        loadCode();
    }

    private void load_Insertion_Sort_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("insertion_sort_code");
            code_Implementation_String = data.getString("insertion_implementation");
        }
        loadCode();
    }

    private void loadSelectionSort_Code(Bundle data) {
        if(data != null){
            codeString = data.getString("selection_sort_code");
            code_Implementation_String = data.getString("selection_implementation");
        }
        loadCode();
    }

    private void loadMargeSort_Code(Bundle data){
        if(data != null){
            codeString = data.getString("marge_sort_code");
            code_Implementation_String = data.getString("marge_code_description");
        }
        loadCode();
    }

    private void loadCode() {
        codeView.showCode(codeString);
        marge_des.setText(code_Implementation_String);
    }
}