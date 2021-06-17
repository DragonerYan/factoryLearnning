package com.company.algorithm.AlgorithmImpl;

public class maxN {
    /**
     *快排思想实现查找
     */

    static void quickSort(int[] n,int l,int r){
        if(l>=r){
            return ;
        }
        int par=n[l];
        int i=l;
        int j=r;
//        while(j>i){
//            for(int i0=j;i0>i;i0--){
//                if(par>=n[i0]){
//                    j=i0;
//                    n[i]=n[i0];
//                    i++;
//                    break;
//                }
//            }
//            for(int i0=i;i0<j;i0++){
//                if(par<n[i0]){
//                    i=i0;
//                    n[j]=n[i0];
//                    j--;
//                    break;
//                }
//            }
//        }
        while (i < j)
        {
            while(i < j && n[j] >= par){
                j--;
            }
            if(i < j){
                n[i++] = n[j];
            }
            while(i < j && n[i] < par){
                i++;
            }
            if(i < j) {
                n[j--] = n[i];
            }
        }
        n[i]=par;
        quickSort(n,l,i-1);
        quickSort(n,i+1,r);
    }
    public static void main(String[] args) {
        int[] n={1,3,5,7,9,2,4,6,8,10};
        quickSort(n,0,n.length-1);
        for(int m:n){
            System.out.println(m);
        }
    }
}
