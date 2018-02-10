package com.example.abdullahal_munzir.a2_cc;

/**
 * Created by Abdullah Al-Munzir on 2/5/2018.
 */

public class Conversion {


    public String BtoD(String digit) {
        int dec = Integer.parseInt(digit, 2);
        String res = Integer.toString(dec);
        return res;
    }

    public String BtoH(String digit) {
        int num = Integer.parseInt(digit, 2);
        String hexa = Integer.toHexString(num).toUpperCase();
        return hexa;
    }

    public String BtoO(String digit) {
        int num;
        num = Integer.parseInt(digit, 2);
        String octal = Integer.toOctalString(num);
        return octal;
    }




    public String DtoB(String digit) {
        int num = Integer.parseInt(digit);
        String res = Integer.toBinaryString(num);
        return res;
    }
    public String HtoB(String digit){
        int num = Integer.parseInt(digit, 16);
        String res = Integer.toBinaryString(num);
        return  res;
    }

    public String OtoB(String digit){
        int num = Integer.parseInt(digit, 8);
        String res = Integer.toBinaryString(num);
        return res;
    }
}
