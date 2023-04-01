package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.sakibxhossain.gridlayout_practice.helper.Slide_Adapter;

public class Onboarding_Screen extends AppCompatActivity {

    CollapsingToolbarLayout toolbarLayout;

    ViewPager viewPager2;
    //Dots portion
    LinearLayout dots_layout;
    TextView[] dots;
    //For lets get started button
    Button lets_get_started;
    //Animation for onboarding screen
    Animation OnboardingAnimation;
    private int current_Position;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding_screen);

        toolbarLayout = findViewById(R.id.collapsingToolbar);
        //hooks
        viewPager2 = findViewById(R.id.onboarding_ViewPager);
        dots_layout = findViewById(R.id.onboarding_linearlayout_dots);
        lets_get_started = findViewById(R.id.onboarding_getStart_button);
        //call adapter
        Slide_Adapter adapter = new Slide_Adapter(this);
        //setAdapter
        viewPager2.setAdapter(adapter);
        //adding dots
        addDots(0);
        viewPager2.addOnPageChangeListener(changeListener);
        lets_get_started.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Onboarding_Screen.this, MainActivity.class);
                startActivity(intent);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }
        });
    }

    //Next Button
    public void next(View view){
        viewPager2.setCurrentItem(current_Position + 1);
    }
    //Skip Button
    public void skip(View view){
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    private void addDots(int position){
        current_Position = position;
        dots = new TextView[5];
        dots_layout.removeAllViews();

        for(int i=0; i<dots.length; i++){
            dots[i] = new TextView(this);
            dots[i].setText(Html.fromHtml("&#8226"));
            dots[i].setTextSize(35);

            dots_layout.addView(dots[i]);
        }
        if(dots.length > 0){
            dots[position].setTextColor(getResources().getColor(R.color.splash_screen_background));
        }
    }

    ViewPager.OnPageChangeListener changeListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {
            addDots(position);
            //Condition when button will be shown
            if(position>=0 && position<=3){
                lets_get_started.setVisibility(View.INVISIBLE);
            }else{
                OnboardingAnimation = AnimationUtils.loadAnimation(Onboarding_Screen.this,R.anim.bottom_anim_for_onboarding);
                lets_get_started.setAnimation(OnboardingAnimation);
                lets_get_started.setVisibility(View.VISIBLE);
            }
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }
    };

}