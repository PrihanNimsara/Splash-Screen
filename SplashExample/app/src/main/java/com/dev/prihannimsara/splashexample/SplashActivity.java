package com.dev.prihannimsara.splashexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        //show splash screen
        showSplashScreen();
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }

    private void showSplashScreen() {

        Thread thread = new Thread() {
            public void run() {
                try {
                    //sleep five second
                    sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    //move to second page form splash screen
                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                    startActivity(intent);
                }
            }
        };

        //start the thread
        thread.start();
    }
}
