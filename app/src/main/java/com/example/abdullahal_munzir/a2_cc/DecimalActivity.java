package com.example.abdullahal_munzir.a2_cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DecimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_decimal);

        Button btnDec = (Button)findViewById(R.id.calc_dec);

        btnDec.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        complement();

                    }
                }
        );




        btnDec.setOnLongClickListener(
                new Button.OnLongClickListener() {
                    public boolean onLongClick(View v) {
                        EditText inp = (EditText) findViewById(R.id.input_dec);
                        TextView outbin = (TextView) findViewById(R.id.out_dec_bin);
                        TextView outDec = (TextView) findViewById(R.id.out_dec_dec);

                        inp.setText(null);
                        outbin.setText("Result in Binary");
                        outDec.setText("Result in Decimal");


                        return true;
                    }
                }
        );
    }


    public void complement(){

        int n, garbage=0;
        String digit;

        EditText inp = (EditText) findViewById(R.id.input_dec);
        TextView outbin = (TextView) findViewById(R.id.out_dec_bin);
        TextView outDec = (TextView) findViewById(R.id.out_dec_dec);

        digit = inp.getText().toString();

        if(digit.indexOf("-")!=-1){
            garbage=1;
        }

        int len=digit.length();


        if(len!=0) {

                char[] chk;
                int count=0;
                chk = digit.toCharArray();

                for(int i=0; i<len; i++){
                    if(chk[i] == '0'){
                       count++;
                    }
                    else break;
                }
            if(count!=len && garbage == 0){

                if(len<=9){
                    n= Integer.parseInt(digit);
                    int bin[] = new int[35];
                    int temp[] = new int[35];

                    int i = 0;
                    while (n > 0) {
                        temp[i++] = n % 2;
                        n = n / 2;
                    }

                    int k = 0;
                    for (int j = i - 1; j >= 0; j--) {
                        bin[k] = temp[j];
                        k++;
                    }


                    char bin_char[] = new char[k];
                    for (int m = 0; m < k; m++) {
                        bin_char[m] = (char) (bin[m] + '0');

                    }


                    String binary = new String(bin_char);

                    String binRes = calComplement(binary); /**** calling calComplement method****/
                    outbin.setText(binRes);


                    /*** Convertion of binary to hexa***/
                    String binaryString = binRes;
                    int int_decimal = Integer.parseInt(binaryString, 2);
                    String str_decimal = Integer.toString(int_decimal);
                    outDec.setText(str_decimal);

                }
                else {
                    outbin.setText("Out of range!!");
                    outDec.setText("Out of range!!");
                }

            }
           else{
                outbin.setText("Invalid input!!");
                outDec.setText("Invalid input!!");
            }
        }
        else{
            outbin.setText("No input yet!");
            outDec.setText("No input yet!");
        }


    }


    public String calComplement(String digit) {

        int len = digit.length();
        int i;

        String res = null;
        if (len != 0) {
            char[] arry;
            char[] arry1 = new char[len];
            char[] arry2 = new char[len];

            arry = digit.toCharArray();
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

            res = new String(arry2);
        }
        return res;
    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.transition.left_to_right, R.transition.right_to_left);
    }

}
