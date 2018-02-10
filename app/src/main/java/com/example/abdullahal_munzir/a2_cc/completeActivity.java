package com.example.abdullahal_munzir.a2_cc;

import android.content.Context;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class completeActivity extends AppCompatActivity {

    RadioGroup rg_inp, rg_out;
    RadioButton bin, dec, oct, hex, binOut, decOut, octOut, hexOut;
    Button button0 , button1 , button2 , button3 , button4 , button5 , button6 , button_complement, button_conversion,
            button7 , button8 , button9 , buttonA, buttonB , buttonC ,
            buttonD , buttonE , buttonF , buttonCal, buttonMinus, buttonClear, buttonBackspace;

    TextView input, output;
    public boolean mode=true, small_text=false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        final Context context = getApplicationContext();


        rg_inp=(RadioGroup) findViewById(R.id.inp_radio_group);
        rg_out=(RadioGroup) findViewById(R.id.out_radio_group);

        input = (TextView) findViewById(R.id.input);
        output = (TextView) findViewById(R.id.output);

        buttonCal = (Button) findViewById(R.id.buttonCal);
        buttonClear = (Button) findViewById(R.id.buttonClear);
        buttonBackspace = (Button) findViewById(R.id.buttonBackspace);
        buttonMinus = (Button) findViewById(R.id.buttonminus);
        button_complement = (Button) findViewById(R.id.button_complement);
        button_conversion = (Button) findViewById(R.id.button_conversion);

        bin = (RadioButton) findViewById(R.id.binary_r);
        dec = (RadioButton) findViewById(R.id.decimal_r);
        oct = (RadioButton) findViewById(R.id.octal_r);
        hex = (RadioButton) findViewById(R.id.hex_r);

        binOut = (RadioButton) findViewById(R.id.out_binary_r);
        decOut = (RadioButton) findViewById(R.id.out_decimal_r);
        octOut = (RadioButton) findViewById(R.id.out_octal_r);
        hexOut = (RadioButton) findViewById(R.id.out_hex_r);




        button0 = (Button) findViewById(R.id.button0);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        buttonA = (Button) findViewById(R.id.buttonA);
        buttonB = (Button) findViewById(R.id.buttonB);
        buttonC = (Button) findViewById(R.id.buttonC);
        buttonD = (Button) findViewById(R.id.buttonD);
        buttonE = (Button) findViewById(R.id.buttonE);
        buttonF = (Button) findViewById(R.id.buttonF);


        //buttonMinus.setEnabled(false);



        button_complement.setOnClickListener(
                new Button.OnClickListener(){
                    public  void onClick(View v){
                        if(!mode) {
                            //button_conversion.setBackgroundColor(Color.parseColor("#FFECEFF1")); //white
                           // button_complement.setBackgroundColor(Color.parseColor("#ff00ddff")); //blue
                            button_complement.setBackgroundResource(R.drawable.compl_on);
                            button_complement.setTextColor(Color.parseColor("#ffffff"));

                            button_conversion.setTextColor(Color.parseColor("#ff00ddff"));
                            button_conversion.setBackgroundResource(R.drawable.conv_off);
                            mode=true;

                            Toast toast = Toast.makeText(context, "2's Complement mode activated", Toast.LENGTH_SHORT);
                            toast.show();
                        }}});


        button_conversion.setOnClickListener(
                new Button.OnClickListener(){
                    public  void  onClick(View v){
                       // button_complement.setBackgroundColor(Color.parseColor("#FFECEFF1")); //white
                        //button_conversion.setBackgroundColor(Color.parseColor("#ff00ddff")); // blue
                        button_conversion.setBackgroundResource(R.drawable.conv_on);
                        button_conversion.setTextColor(Color.parseColor("#ffffff"));

                        button_complement.setTextColor(Color.parseColor("#ff00ddff"));
                        button_complement.setBackgroundResource(R.drawable.comple_off);
                        buttonMinus.setEnabled(true);
                        mode=false;

                        Toast toast = Toast.makeText(context, "Conversion mode activated", Toast.LENGTH_SHORT);
                        toast.show();
                    }});


        bin.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Binary as input type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        dec.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Decimal as input type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        oct.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Octal as input type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        hex.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Hexadecimal as input type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});


        binOut.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Binary as output type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        decOut.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Decimal as output type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        octOut.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Octal as output type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});

        hexOut.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Toast toast = Toast.makeText(context, "Selected Hexadecimal as output type", Toast.LENGTH_SHORT);
                        toast.show();
                    }});






        buttonClear.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        input.setText(null);
                        output.setText(null);
                       // button1.performClick();
                    }});

            button1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "1");
                }});

            button2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "2");
                }});

            button3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "3");
                }});

            button4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "4");
                }});

            button5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "5");
                }});

            button6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "6");
                }});

            button7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "7");
                }});

            button8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "8");
                }});

            button9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "9");
                }});

            button0.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String str = input.getText().toString();
                    int len = str.length();
                    if (len != 0) {
                        input.setText(input.getText() + "0");
                    }
                }});

            buttonA.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "A");
                }});

            buttonB.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "B");
                }});

            buttonC.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "C");
                }});

            buttonD.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "D");
                }});

            buttonE.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "E");
                }});

            buttonF.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    input.setText(input.getText() + "F");
                }});

            buttonBackspace.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String str = input.getText().toString();
                    if (str.length() > 1) {
                        str = str.substring(0, str.length() - 1);
                        input.setText(str);
                    } else if (str.length() <= 1) {
                        input.setText(null);
                    }}});

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int radiobtnId=rg_inp.getCheckedRadioButtonId();
                if(!mode && radiobtnId== R.id.decimal_r) {
                    String str = input.getText().toString();
                    int len = str.length();
                    if (len == 0) {
                        input.setText(input.getText() + "-");
                    }}}});


        buttonCal.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v){

                        //Context context = getApplicationContext();
                        CharSequence text;
                        int duration = Toast.LENGTH_SHORT;

                        Complement compl= new Complement();

                        if(small_text){
                            output.setTextSize(20);
                        }

                        int radiobtnId=rg_inp.getCheckedRadioButtonId();
                        int rBtnId=rg_out.getCheckedRadioButtonId();

                        String digit;
                        String res;
                        digit = input.getText().toString();

if(radiobtnId== R.id.binary_r){
                            int len = digit.length();
                            int count=0;
                            if (len != 0){
                                char[] arry;
                                arry = digit.toCharArray();

                                for(int m=0; m<len; m++){
                                    if((arry[m] == '0')||(arry[m]== '1')){
                                        count++;
                                    }
                                    else break;
                                }

                                if(count==len) {
                                    if (len <= 31) {

                                        if(mode) {
                                            res = compl.complement(digit); //calling Complement method
                                        }
                                        else{res=digit;}

                                        if (rBtnId == R.id.out_binary_r) {
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_decimal_r) {
                                            res = compl.BtoD(res);
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_octal_r) {
                                            res = compl.BtoO(res);
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_hex_r) {
                                            res = compl.BtoH(res);
                                            output.setText(res);
                                        }
                                    } else {
                                        text="Out of range!";
                                        Toast toast = Toast.makeText(context, text, duration);
                                        toast.show();

                                    }
                                }
                                else {
                                    text="Invalid Input!";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            }
                            else {
                                text="No Input Yet!";
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                            }
                        }


else if(radiobtnId== R.id.decimal_r){
                            int len = digit.length();
                            int count=0;
                            if (len != 0){
                                char[] arry;
                                arry = digit.toCharArray();

                                for(int m=0; m<len; m++){
                                    if((arry[m]>='0' && arry[m]<='9')|| arry[m]=='-'){
                                        count++;
                                    }
                                    else break;
                                }

                                if(count==len){
                                    if(len<=9){

                                       if(mode) {
                                        String bin = compl.DtoB(digit); //calling conversion method
                                        res = compl.complement(bin); //calling Complement method
                                           if(rBtnId== R.id.out_binary_r){
                                               output.setText(res);
                                           }
                                           else if(rBtnId== R.id.out_decimal_r){
                                               res = compl.BtoD(res);
                                               output.setText(res);
                                           }
                                           else if(rBtnId== R.id.out_octal_r){
                                               res = compl.BtoO(res);
                                               output.setText(res);
                                           }
                                           else if(rBtnId== R.id.out_hex_r){
                                               res = compl.BtoH(res);
                                               output.setText(res);
                                           }
                                      }
                                        else{

                                           if(rBtnId== R.id.out_binary_r){
                                               res = compl.DtoB(digit);
                                               output.setTextSize(19);
                                               output.setText(res);
                                               small_text =true;

                                           }
                                           else if(rBtnId== R.id.out_decimal_r){
                                               output.setText(digit);
                                           }
                                           else if(rBtnId== R.id.out_octal_r){
                                               res = compl.DtoO(digit);
                                               output.setText(res);
                                           }
                                           else if(rBtnId== R.id.out_hex_r){
                                               res = compl.DtoH(digit);
                                               output.setText(res);
                                           }

                                       }


                                    }
                                    else {
                                        text="Out Of Range!";
                                        Toast toast = Toast.makeText(context, text, duration);
                                        toast.show();
                                    }
                                }
                                else {
                                    text="Invalid Input!";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            }
                            else {
                                text="No Input Yet!";
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                            }
                        }

else if(radiobtnId== R.id.octal_r){
                            int len = digit.length();
                            int count=0;
                            if (len != 0){
                                char[] arry;
                                arry = digit.toCharArray();

                                for(int m=0; m<len; m++){
                                    if(arry[m]>='0' && arry[m]<='7'){
                                        count++;
                                    }
                                    else break;
                                }

                                if(count==len) {
                                    if(len<=10) {
                                        String bin = compl.OtoB(digit); //calling conversion method
                                       if(mode) {
                                        res = compl.complement(bin); //calling Complement method
                                       }
                                        else{res=bin;}

                                        if (rBtnId == R.id.out_binary_r) {
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_decimal_r) {
                                            res = compl.BtoD(res);
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_octal_r) {
                                            res = compl.BtoO(res);
                                            output.setText(res);
                                        } else if (rBtnId == R.id.out_hex_r) {
                                            res = compl.BtoH(res);
                                            output.setText(res);
                                        }
                                    }
                                    else {
                                        text="Out of Range!";
                                        Toast toast = Toast.makeText(context, text, duration);
                                        toast.show();
                                    }
                                }
                                else {
                                    text="Invalid Input!";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            }
                            else {
                                text="No Input Yet!";
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                            }
                        }

else if(radiobtnId== R.id.hex_r){
                            int len = digit.length();
                            int count=0;
                            if (len != 0){
                                char[] arry;
                                arry = digit.toCharArray();

                                for(int m=0; m<len; m++){
                                    if((arry[m]>='0' && arry[m]<='9')||(arry[m]>='A' && arry[m]<='F')||(arry[m]>='a' && arry[m]<'f')){
                                        count++;
                                    }
                                    else break;
                                }

                                if(count==len) {
                                    if ((len <= 7)||((len==8) && (arry[0]>='0' && arry[0]<='7'))){

                                        String bin = compl.HtoB(digit); //calling conversion method
                                       if(mode) {
                                        res = compl.complement(bin);//calling Complement method
                                        }
                                        else{res=bin;}

                                        if(rBtnId== R.id.out_binary_r){
                                            output.setText(res);
                                        }
                                        else if(rBtnId== R.id.out_decimal_r){
                                            res = compl.BtoD(res);
                                            output.setText(res);
                                        }
                                        else if(rBtnId== R.id.out_octal_r){
                                            res = compl.BtoO(res);
                                            output.setText(res);
                                        }
                                        else if(rBtnId== R.id.out_hex_r){
                                            res = compl.BtoH(res);
                                            output.setText(res);
                                        }
                                    }
                                    else {
                                        text="Out of Range!";
                                        Toast toast = Toast.makeText(context, text, duration);
                                        toast.show();
                                    }
                                }
                                else {
                                    text="Invalid Input!";
                                    Toast toast = Toast.makeText(context, text, duration);
                                    toast.show();
                                }
                            }
                            else {
                                text="No Input Yet!";
                                Toast toast = Toast.makeText(context, text, duration);
                                toast.show();
                            }
                        }

                    }
                }
        );
    }
}
