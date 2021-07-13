package com.company.algorithm.AlgorithmImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class skyLine218 {
    public List<List<Integer>> getSkyline(List<List<Integer>> buildings) {
        return new ArrayList<>();
    }

    public static void main(String[] args){
        List<List<Integer>> buildings=new ArrayList<>();
        List<Integer> s1=new ArrayList(Collections.singleton(new int[]{2, 9, 10}));
        List<Integer> s2=new ArrayList(Collections.singleton(new int[]{3,7,15}));
        List<Integer> s3=new ArrayList(Collections.singleton(new int[]{5,12,12}));
        List<Integer> s4=new ArrayList(Collections.singleton(new int[]{15,20,10}));
        List<Integer> s5=new ArrayList(Collections.singleton(new int[]{19,24,8}));
        buildings.add(s1);
        buildings.add(s2);
        buildings.add(s3);
        buildings.add(s4);
        buildings.add(s5);

    }
}
