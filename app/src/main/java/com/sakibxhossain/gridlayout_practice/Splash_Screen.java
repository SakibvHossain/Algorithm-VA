package com.sakibxhossain.gridlayout_practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash_Screen extends AppCompatActivity {

    //Timer for Splash Screen
    private static final int SPLASH_TIMER = 5000;

    //Variables
    ImageView splashscreen_ImageView;
    TextView splashscreen_textview;

    //Animation Variables
    Animation slide_right_anim, bottom_aim;

    //Creating sheared preferences
    SharedPreferences onBoarding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        //Hooks for Variables
        splashscreen_ImageView = findViewById(R.id.splashscreen_ImageView);
        //Hooks for Animation Variables
        slide_right_anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
//        bottom_aim = AnimationUtils.loadAnimation(this,R.anim.bottom_anim);
//        //Animation for image
//        splashscreen_ImageView.setAnimation(slide_right_anim);
//        //Animation for text
//        splashscreen_textview.setAnimation(bottom_aim);

        //Creating Handler for Handling the time for Splash Screen
        new Handler().postDelayed(() -> {
            onBoarding = getSharedPreferences("OnboardingScreen",MODE_PRIVATE);
            boolean firstTime = onBoarding.getBoolean("FirstTime",true);

            if(firstTime){
                SharedPreferences.Editor editor = onBoarding.edit();
                editor.putBoolean("FirstTime",false);
                editor.apply();

                Intent mainActivity = new Intent(getApplicationContext(), Onboarding_Screen.class);
                startActivity(mainActivity);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }else{
                Intent mainActivity = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(mainActivity);
                overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
                finish();
            }
        },SPLASH_TIMER);
    }
}