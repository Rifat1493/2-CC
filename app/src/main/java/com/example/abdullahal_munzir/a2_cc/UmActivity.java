package com.example.abdullahal_munzir.a2_cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class UmActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_um);

        TextView txt = (TextView) findViewById(R.id.um_text);
        txt.setText("\n\n\n"
                +"For decimal number 2's Complement tap\n\n\t\t\t\t\t\t\t\t\tbutton. Tap\t\t\t\t\t\t\t\t\t\tand\n\n\t\t\t\t\t\t\t\t\t\t\tbutton for calculation of\n\n binary and hexadecimal number." +
                " For calculation, enter the digit in the input\n\n field & then tap\t\t\t\t\t\t\t\t\t\tbutton and\n\n also long tap for clearing the field.");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.transition.back_up_start, R.transition.back_up_end);
    }
}
