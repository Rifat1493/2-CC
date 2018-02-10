package com.example.abdullahal_munzir.a2_cc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BinaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_binary);


        Button btnCalc = (Button)findViewById(R.id.calc_bin);

        btnCalc.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        complement();

                    }
                }
        );




        btnCalc.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        EditText inp = (EditText) findViewById(R.id.input_bin);
                        TextView outbin = (TextView) findViewById(R.id.out_bin_bin);
                        TextView outDec = (TextView) findViewById(R.id.out_bin_dec);

                        inp.setText(null);
                        outbin.setText("Result in Binary");
                        outDec.setText("Result in Decimal");


                        return true;
                    }
                }
        );
    }


    public void complement(){
        String digit;
        EditText inp = (EditText) findViewById(R.id.input_bin);
        TextView outBin = (TextView) findViewById(R.id.out_bin_bin);
        TextView outDec = (TextView) findViewById(R.id.out_bin_dec);
        digit = inp.getText().toString();

        int len = digit.length();
        int i, count=0;

        if (len != 0){

            char[] arry;
            char[] arry1 = new char[len];
            char[] arry2 = new char[len];

            arry = digit.toCharArray();

            for(int m=0; m<len; m++){
                if((arry[m] == '0')||(arry[m]== '1')){
                    count++;
                }
                else break;
            }

            if(count==len) {
                for (i = 0; i < len; i++) {
                    if (arry[i] == '0') {
                        arry1[i] = '1';
                    } else {
                        arry1[i] = '0';
                    }
                }

                for (i = 0; i < len; i++) {
                    arry2[i] = arry1[i];
                }


                for (i = len - 1; i >= 0; i--) {
                    if (arry1[i] == '1') {
                        arry2[i] = '0';
                    } else {
                        arry2[i] = '1';
                        break;
                    }
                }

                String res = new String(arry2);

                outBin.setText(res);


                /****convertion of binary to decimal******/

                String binaryString = res;

                int dec = Integer.parseInt(binaryString, 2);

                String s = Integer.toString(dec);

                outDec.setText(s);
            }
            else {
                outBin.setText("Invalid Input!!");
                outDec.setText("Invalid Input!!");
            }
        }
        else {
            outBin.setText("No input yet!");
            outDec.setText("No input yet!");
        }
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.transition.left_to_right, R.transition.right_to_left);
    }
}
