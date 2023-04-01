package com.sakibxhossain.gridlayout_practice.algorithm_helper;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.transition.AutoTransition;
import androidx.transition.TransitionManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;
import com.sakibxhossain.gridlayout_practice.R;

import java.util.Objects;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link Problems_Fragment#newInstance} factory method to
// * create an instance of this fragment.
// */

public class Problems_Fragment extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;
//
//    public Problems_Fragment() {
//        // Required empty public constructor
//    }
//
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment Problems_Fragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static Problems_Fragment newInstance(String param1, String param2) {
//        Problems_Fragment fragment = new Problems_Fragment();
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


    LinearLayout card_layout, card_layout2;
    MaterialCardView cardView, cardView2;
    TextView card_Text_problem, card_des_text, card_Text_problem2, card_des_text2;
    String token;

    ////////////////todo: Selection Sort
    String problem_1,problem_1_description
            ,problem_2, problem_2_description;

    public Problems_Fragment(String token) {
        this.token = token;
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View myView = inflater.inflate(R.layout.fragment_problems_, container, false);

        cardView = myView.findViewById(R.id.card_view_xml);
        card_layout = myView.findViewById(R.id.card_linear_layout);
        card_Text_problem = myView.findViewById(R.id.card_text_problem);
        card_des_text = myView.findViewById(R.id.card_problem_des);

        cardView2 = myView.findViewById(R.id.card_view_xml2);
        card_layout2 = myView.findViewById(R.id.card_linear_layout2);
        card_Text_problem2 = myView.findViewById(R.id.card_text_problem2);
        card_des_text2 = myView.findViewById(R.id.card_problem_des2);

        card_layout.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);
        card_layout2.getLayoutTransition().enableTransitionType(LayoutTransition.CHANGING);

        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = (card_des_text.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

                TransitionManager.beginDelayedTransition(card_layout, new AutoTransition());
                card_des_text.setVisibility(v);
            }
        });

        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int v = (card_des_text2.getVisibility() == View.GONE) ? View.VISIBLE : View.GONE;

                TransitionManager.beginDelayedTransition(card_layout2, new AutoTransition());
                card_des_text2.setVisibility(v);
            }
        });

        Bundle data = getArguments();

        if(Objects.equals(token, "selection")){
            load_selection_problems(data);
        }else if(Objects.equals(token, "insertion")){
            load_insertion_problems(data);
        }else if(Objects.equals(token, "marge")){
            load_merge_problems(data);
        }else if(Objects.equals(token, "ternary_search")){
            load_ternary_problems(data);
        }else if(Objects.equals(token, "linear")){
            load_linear_problems(data);
        }else if(Objects.equals(token, "binary_search")){
            load_binary_search_problems(data);
        }

        return myView;
    }

    private void load_binary_search_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("binary_search_problem_title");
            problem_1_description = data.getString("binary_search_problem_description");

            problem_2 = data.getString("binary_search_problem2_title");
            problem_2_description = data.getString("binary_search_problem2_description");
        }
        load_problems();
    }

    private void load_linear_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("linear_problem_title");
            problem_1_description = data.getString("linear_problem_description");

            problem_2 = data.getString("linear_problem2_title");
            problem_2_description = data.getString("linear_problem2_description");
        }

        load_problems();
    }

    private void load_ternary_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("ternary_problem_title");
            problem_1_description = data.getString("ternary_problem_description");

            problem_2 = data.getString("ternary_problem2_title");
            problem_2_description = data.getString("ternary_problem2_description");
        }

        load_problems();
    }

    private void load_merge_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("marge_sort_problem_title");
            problem_1_description = data.getString("marge_sort_problem_description");

            problem_2 = data.getString("marge_sort_problem2_title");
            problem_2_description = data.getString("marge_sort_problem2_description");
        }

        load_problems();
    }

    private void load_insertion_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("insertion_problem_title");
            problem_1_description = data.getString("insertion_problem_description");

            problem_2 = data.getString("insertion_problem2_title");
            problem_2_description = data.getString("insertion_problem2_description");
        }

        load_problems();
    }

    private void load_selection_problems(Bundle data) {
        if(data != null){
            problem_1 = data.getString("selection_problem_title");
            problem_1_description = data.getString("selection_problem_description");

            problem_2 = data.getString("selection_problem2_title");
            problem_2_description = data.getString("selection_problem2_description");
        }
        load_problems();
    }

    private void load_problems() {
        card_Text_problem.setText(problem_1);
        card_des_text.setText(problem_1_description);

        card_Text_problem2.setText(problem_2);
        card_des_text2.setText(problem_2_description);
    }
}