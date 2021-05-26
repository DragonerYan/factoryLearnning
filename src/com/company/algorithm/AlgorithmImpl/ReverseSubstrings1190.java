package com.company.algorithm.AlgorithmImpl;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseSubstrings1190 {
    public static String reverseParentheses(String s) {
        //String regEx="(\\()[)]";
        String regEx=".*?\\(([^()]*)\\).*?";
        Pattern pattern=Pattern.compile(regEx);
        Matcher matcher=pattern.matcher(s);
        while(matcher.find()){
            String m=matcher.group(1);
            String oldString="("+m+")";
            s=s.replace(oldString,new StringBuffer(m).reverse().toString());
            matcher=pattern.matcher(s);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(reverseParentheses("(u(love)i)"));
    }
}
