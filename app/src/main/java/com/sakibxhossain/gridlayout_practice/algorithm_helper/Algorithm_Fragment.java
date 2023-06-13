package com.sakibxhossain.gridlayout_practice.algorithm_helper;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sakibxhossain.gridlayout_practice.R;

import java.util.Objects;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link Algorithm_Fragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class Algorithm_Fragment extends Fragment {

    String token;
    public Algorithm_Fragment(String token) {
        this.token = token;
    }


    TextView algorithm_title, algorithm_description
            , algorithm_process, algorithm_process_description
            , algorithm_in_detail, algorithm_in_detail_description
            , algorithm_performance, algorithm_performance_description;

    /////////// todo: Selection Sort Variables
    String selection_title, selection_description
            , selection_process, selection_process_description
            , selection_in_detail, selection_in_detail_description
            , selection_performance, selection_performance_description;


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_algorithm_, container, false);
        algorithm_title = myView.findViewById(R.id.algorithm_title);
        algorithm_description = myView.findViewById(R.id.algorithm_description);

        algorithm_process = myView.findViewById(R.id.algorithm_process_title);
        algorithm_process_description = myView.findViewById(R.id.algorithm_process_description);

        algorithm_in_detail = myView.findViewById(R.id.algorithm_indetail_title);
        algorithm_in_detail_description = myView.findViewById(R.id.algorithm_indetail_description);

        algorithm_performance = myView.findViewById(R.id.algorithm_performance);
        algorithm_performance_description = myView.findViewById(R.id.algorithm_performance_description);

        Bundle data = getArguments();

        if(Objects.equals(token, "selection")){
            load_selection_sort_algorithm(data);
        }else if(Objects.equals(token, "insertion")){
            load_insertion_sort_algorithm(data);
        }else if(Objects.equals(token,"marge")){
            load_marge_sort_algorithm(data);
        }else if(Objects.equals(token, "linear")){
            load_linear_search_algorithm(data);
        }else if(Objects.equals(token,"ternary")){
            load_ternary_search_algorithm(data);
        }else if(Objects.equals(token,"binary_search")){
            load_binary_search_algorithm(data);
        }else if(Objects.equals(token,"stack")){
            load_stack_algorithm(data);
        }else if(Objects.equals(token,"queue")){
            load_queue_algorithm(data);
        }else if(Objects.equals(token,"binary_tt")){
            load_binary_tree_traverse_algorithm(data);
        }else if(Objects.equals(token,"dfs")){
            load_dfs_algorithm(data);
        }else if(Objects.equals(token,"bfs")){
            load_bfs_algorithm(data);
        }else if(Objects.equals(token,"lcs")){
            load_lcs_algorithm(data);
        }else if(Objects.equals(token,"huffman_coding")){
            load_huffman_coding_algorithm(data);
        }
        return myView;
    }

    private void load_huffman_coding_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("huffman_coding_title");
            selection_description = data.getString("huffman_coding_description");

            selection_process = data.getString("huffman_coding_algorithm_title");
            selection_process_description = data.getString("huffman_coding_algorithm_description");

            selection_in_detail = data.getString("huffman_coding_in_detail_title");
            selection_in_detail_description = data.getString("huffman_coding_in_detail_description");

            selection_performance = data.getString("huffman_coding_performance_title");
            selection_performance_description = data.getString("huffman_coding_performance_description");
        }
        load_texts();
    }

    private void load_lcs_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("lcs_title");
            selection_description = data.getString("lcs_description");

            selection_process = data.getString("lcs_algorithm_title");
            selection_process_description = data.getString("lcs_algorithm_description");

            selection_in_detail = data.getString("lcs_in_detail_title");
            selection_in_detail_description = data.getString("lcs_in_detail_description");

            selection_performance = data.getString("lcs_performance_title");
            selection_performance_description = data.getString("lcs_performance_description");
        }
        load_texts();
    }

    private void load_bfs_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("bfs_title");
            selection_description = data.getString("bfs_description");

            selection_process = data.getString("bfs_algorithm_title");
            selection_process_description = data.getString("bfs_algorithm_description");

            selection_in_detail = data.getString("bfs_in_detail_title");
            selection_in_detail_description = data.getString("bfs_in_detail_description");

            selection_performance = data.getString("bfs_performance_title");
            selection_performance_description = data.getString("dfs_performance_description");
        }
        load_texts();
    }

    private void load_dfs_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("dfs_title");
            selection_description = data.getString("dfs_description");

            selection_process = data.getString("dfs_algorithm_title");
            selection_process_description = data.getString("dfs_sort_algorithm_description");

            selection_in_detail = data.getString("dfs_in_detail_title");
            selection_in_detail_description = data.getString("dfs_sort_in_detail_description");

            selection_performance = data.getString("dfs_performance_title");
            selection_performance_description = data.getString("dfs_performance_description");
        }
        load_texts();
    }

    private void load_binary_tree_traverse_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("binary_tt_title");
            selection_description = data.getString("binary_tt_description");

            selection_process = data.getString("binary_tt_algorithm_title");
            selection_process_description = data.getString("binary_tt_algorithm_description");

            selection_in_detail = data.getString("binary_tt_in_detail_title");
            selection_in_detail_description = data.getString("binary_tt_in_detail_description");

            selection_performance = data.getString("binary_tt_performance_title");
            selection_performance_description = data.getString("binary_tt_performance_description");
        }
        load_texts();
    }

    private void load_queue_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("queue_title");
            selection_description = data.getString("queue_description");

            selection_process = data.getString("queue_algorithm_title");
            selection_process_description = data.getString("queue_algorithm_description");

            selection_in_detail = data.getString("queue_in_detail_title");
            selection_in_detail_description = data.getString("queue_in_detail_description");

            selection_performance = data.getString("queue_performance_title");
            selection_performance_description = data.getString("queue_performance_description");
        }
        load_texts();
    }

    private void load_stack_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("stack_title");
            selection_description = data.getString("stack_description");

            selection_process = data.getString("stack_algorithm_title");
            selection_process_description = data.getString("stack_algorithm_description");

            selection_in_detail = data.getString("stack_in_detail_title");
            selection_in_detail_description = data.getString("stack_in_detail_description");

            selection_performance = data.getString("stack_performance_title");
            selection_performance_description = data.getString("stack_performance_description");
        }
        load_texts();
    }

    private void load_marge_sort_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("marge_sort_title");
            selection_description = data.getString("marge_sort_description");

            selection_process = data.getString("marge_sort_algorithm_title");
            selection_process_description = data.getString("marge_sort_algorithm_description");

            selection_in_detail = data.getString("marge_sort_in_detail_title");
            selection_in_detail_description = data.getString("marge_sort_in_detail_description");

            selection_performance = data.getString("marge_sort_performance_title");
            selection_performance_description = data.getString("marge_sort_performance_description");
        }
        load_texts();
    }

    private void load_binary_search_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("binary_search_title");
            selection_description = data.getString("binary_search_description");

            selection_process = data.getString("binary_search_algorithm_title");
            selection_process_description = data.getString("binary_search_algorithm_description");

            selection_in_detail = data.getString("binary_search_in_detail_title");
            selection_in_detail_description = data.getString("binary_search_in_detail_description");

            selection_performance = data.getString("binary_search_performance_title");
            selection_performance_description = data.getString("binary_search_performance_description");
        }
        load_texts();
    }

    private void load_ternary_search_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("ternary_title");
            selection_description = data.getString("ternary_description");

            selection_process = data.getString("ternary_algorithm_title");
            selection_process_description = data.getString("ternary_algorithm_description");

            selection_in_detail = data.getString("ternary_in_detail_title");
            selection_in_detail_description = data.getString("ternary_sort_in_detail_description");

            selection_performance = data.getString("ternary_performance_title");
            selection_performance_description = data.getString("ternary_performance_description");
        }
        load_texts();
    }

    private void load_linear_search_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("linear_search_title");
            selection_description = data.getString("linear_search_description");

            selection_process = data.getString("linear_search_algorithm_title");
            selection_process_description = data.getString("linear_search_algorithm_description");

            selection_in_detail = data.getString("linear_search_in_detail_title");
            selection_in_detail_description = data.getString("linear_search_in_detail_description");

            selection_performance = data.getString("linear_search_performance_title");
            selection_performance_description = data.getString("linear_search_performance_description");
        }
        load_texts();
    }

    private void load_insertion_sort_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("insertion_sort_title");
            selection_description = data.getString("insertion_sort_description");

            selection_process = data.getString("insertion_algorithm_title");
            selection_process_description = data.getString("insertion_sort_algorithm_description");

            selection_in_detail = data.getString("insertion_in_detail_title");
            selection_in_detail_description = data.getString("insertion_sort_in_detail_description");

            selection_performance = data.getString("insertion_sort_performance_title");
            selection_performance_description = data.getString("insertion_sort_performance_description");
        }
        load_texts();
    }

    private void load_selection_sort_algorithm(Bundle data) {
        if(data != null){
            selection_title = data.getString("selection_sort_title");
            selection_description = data.getString("selection_sort_description");

            selection_process = data.getString("selection_algorithm_title");
            selection_process_description = data.getString("selection_sort_algorithm_description");

            selection_in_detail = data.getString("selection_in_detail_title");
            selection_in_detail_description = data.getString("selection_sort_in_detail_description");

            selection_performance = data.getString("selection_sort_performance_title");
            selection_performance_description = data.getString("selection_sort_performance_description");
        }

        load_texts();
    }

    private void load_texts() {
        algorithm_title.setText(selection_title);
        algorithm_description.setText(selection_description);

        algorithm_process.setText(selection_process);
        algorithm_process_description.setText(selection_process_description);

        algorithm_in_detail.setText(selection_in_detail);
        algorithm_in_detail_description.setText(selection_in_detail_description);

        algorithm_performance.setText(selection_performance);
        algorithm_performance_description.setText(selection_performance_description);
    }
}