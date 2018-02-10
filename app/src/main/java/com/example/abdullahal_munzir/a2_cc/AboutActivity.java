package com.example.abdullahal_munzir.a2_cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        TextView txt = (TextView) findViewById(R.id.about_text);
        txt.setText("Version 1.0\n\n" + "Developer:\n" + "Abdullah Al-Munzir\n\n"+"Idea & Cooperation:\n"+"Md. Jamiur Rahman Rifat\nMd. Lutfor Rahman\n\n"+"© 2017");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.transition.back_up_start, R.transition.back_up_end);
    }
}
