package com.company.algorithm.interview;


import static java.lang.StrictMath.pow;

public class interview58 {
    double getFloat(String str){
        double res = 0;
        if(str.contains(".")){
            String font=str.split("\\.")[0];
            String back=str.split("\\.")[1];
            String first=font.substring(0,1);
            int lf=font.length();
            int lb=0;
            lb=back.length();
            if("-".equals(first)){
                lf=font.length()-1;
            }
            for(int i=lf;i>0;i--){
                res=res+(font.charAt(i)-'0')*(pow(10,(lf-i)));
            }
            for(int j=0;j<lb;j++){
                res=res+(back.charAt(j)-'0')*(pow(10,(j-lb)));
            }

        }
        return res;
    }
    public static void main(String[] args) {
        String m="+123.45";
    }
}
