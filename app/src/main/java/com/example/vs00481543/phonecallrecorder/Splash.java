package com.example.vs00481543.phonecallrecorder;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;

/**
 * Created by abhishek_sharma on 1/11/2018.
 */

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.splash);
        super.onCreate(savedInstanceState);
        requestDone();
    }

    private void requestDone() {
        new CountDownTimer(3000, 500) {

            public void onTick(long millisUntilFinished) {

            }

            public void onFinish() {


                Intent i = new Intent(Splash.this, MainActivity.class);
                startActivity(i);
                finish();


            }


        }.start();
    }


}
