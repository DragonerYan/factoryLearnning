package com.company.algorithm.interview;

import java.util.HashMap;
import java.util.Map;

public class tiger {
    public static void main(String[] args) {
        System.out.println(getunique("abcabcbb"));
    }
    public static int getunique(String str){
        int result=0;
        char[] charlist=str.toCharArray();
        int l=charlist.length;
        if(l==0){return 0;}
        Map<Character,String> existmap=new HashMap<>();
        //1代表存在
        existmap.put('0',"1");
        int flagL=0;
        for(int i=0;i<l;i++){
            char m=charlist[i];
            if("1".equals(existmap.get(m))){
                result=Math.max(result,flagL);
                i=i-flagL+1;
                flagL=0;
                continue;
            }
            existmap.put(m,"1");
            flagL++;

        }
        return result;
    }
}
