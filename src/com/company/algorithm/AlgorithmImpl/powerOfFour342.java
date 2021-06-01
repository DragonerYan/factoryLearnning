package com.company.algorithm.AlgorithmImpl;

public class powerOfFour342 {
    public static boolean isPowerOfFour(int n) {
        int loss=n%4;
        if(loss!=0 && n!=1){
            return false;
        }
        while(n>=4){
            n=n/4;
            if(n%4!=0){
                break;
            }
        }
        return n == 1;
    }

    public boolean isPowerOfFourEasy(int n) {
        return n > 0 && (n & (n - 1)) == 0 && (n & 0xaaaaaaaa) == 0;
    }

    public static void main(String[] args) {
        System.out.println(isPowerOfFour(20));
        int a=4>>2;
        int b=13;
        int c=12;
        System.out.println(a+" "+(b&c)+" "+(b|c)+" "+(~c)+" "+(b^c));
    }
}
