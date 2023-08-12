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
        //Hooks for Variables
        splashscreen_ImageView = findViewById(R.id.splashscreen_ImageView);
        //Hooks for Animation Variables
        slide_right_anim = AnimationUtils.loadAnimation(this,R.anim.fade_in);

            onBoarding = getSharedPreferences("OnboardingScreen",MODE_PRIVATE);
            boolean firstTime = onBoarding.getBoolean("FirstTime",true);

            if(firstTime){
                SharedPreferences.Editor editor = onBoarding.edit();
                editor.putBoolean("FirstTime",false);
                editor.apply();
                startActivity(new Intent(Splash_Screen.this, Onboarding_Screen.class));
                finish();
                //overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }else{
                startActivity(new Intent(Splash_Screen.this, MainActivity.class));
                finish();
               // overridePendingTransition(R.anim.fade_in,R.anim.fade_out);
            }

    }
}