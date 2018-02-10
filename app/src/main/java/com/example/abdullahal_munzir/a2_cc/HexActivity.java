package com.example.abdullahal_munzir.a2_cc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class HexActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hex);

        Button btnHex = (Button)findViewById(R.id.calc_hex);

    btnHex.setOnClickListener(
            new Button.OnClickListener() {
        public void onClick(View v) {
           complement();

        }
    }
    );




    btnHex.setOnLongClickListener(
            new Button.OnLongClickListener() {
            public boolean onLongClick(View v) {
            EditText inp = (EditText) findViewById(R.id.input_hex);
            TextView outbin = (TextView) findViewById(R.id.out_hex_bin);
            TextView outHex = (TextView) findViewById(R.id.out_hex_hex);

            inp.setText(null);
            outbin.setText("Result in Binary");
            outHex.setText("Result in Hexadecimal");


            return true;
        }
    }
    );
}


public void complement(){

    String digit, bin;
    int num,count=0;
    EditText inp = (EditText) findViewById(R.id.input_hex);
    TextView outbin = (TextView) findViewById(R.id.out_hex_bin);
    TextView outHex = (TextView) findViewById(R.id.out_hex_hex);

    digit = inp.getText().toString();
    int len= digit.length();

    char[] temp;
    temp = digit.toCharArray();

    if(len>0){
            for(int i=0; i<len; i++ ){
                if((temp[i]>='0' && temp[i]<='9')||(temp[i]>='a' && temp[i]<='f')||(temp[i]>='A' && temp[i]<'F')){
                    count++;
                }
                else
                    break;
            }
        if(count==len){


                if ((len <= 7) ||((len==8) && (temp[0]>='0' && temp[0]<='7'))){
                    num = Integer.parseInt(digit, 16);
                    bin = Integer.toBinaryString(num);
                    String binRes = calComplement(bin); // calling calComplement method
                    outbin.setText(binRes);

                    /****Converting binary result to Hexadecimal value****/
                    num = Integer.parseInt(binRes, 2);
                    String hexa = Integer.toHexString(num).toUpperCase();
                    outHex.setText(hexa);
                }
                else {
                    outbin.setText("Out of range!!");
                    outHex.setText("Out of range!!");
                }

        }
        else{
            outbin.setText("Invalid Input!!");
            outHex.setText("Invalid Input!!");

        }

    }
    else {
        outbin.setText("No input yet!");
        outHex.setText("No input yet!");
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
