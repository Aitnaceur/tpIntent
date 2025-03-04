package com.example.tpintents;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashScreenActivity extends Activity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_acitvity);

        logo = findViewById(R.id.logo);

        // Rotate Animation
        RotateAnimation rotate = new RotateAnimation(0, 180, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(5000);
        rotate.setInterpolator(new LinearInterpolator());
        logo.startAnimation(rotate);

        // Start MainActivity after animation
        Thread t = new Thread() {
            @Override
            public void run() {
                try {
                    sleep(5000); // Wait for 5 seconds
                    Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish(); // Finish the Splash Activity
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();
    }
}
