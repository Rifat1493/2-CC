package com.example.abdullahal_munzir.a2_cc;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import static android.view.animation.AnimationUtils.*;

public class WsActivity extends Activity {
    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_ws);






        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent newIntent = new Intent(WsActivity.this, MainActivity.class);
                startActivity(newIntent);
                //overridePendingTransition(R.anim.fade_in, R.anim.fade_out);
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);

                finish();

            }
        },SPLASH_TIME_OUT);


    }
}
