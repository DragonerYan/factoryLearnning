package com.company.algorithm.AlgorithmImpl;

public class UncrossedLines1035 {
    /**
     * 最长公共子序列问题
     *  2 5 1 2 5
     * 10 5 2 1 5 2
     */
    public static void main(String[] args) {
        int[] nums1={1,1,2,1,2};
        int[] nums2={1,3,2,3,1};
        System.out.println(maxUncrossedLines(nums1,nums2));
    }
    public static int maxUncrossedLines(int[] nums1, int[] nums2) {
        int l1=nums1.length;
        int l2=nums2.length;
        int[][] dp=new int[l1+1][l2+1];
        for(int n1=1;n1<=l1;n1++){
            int num1=nums1[n1-1];
            for(int n2=1;n2<=l2;n2++){
                int num2=nums2[n2-1];
                if(num1==num2){
                    dp[n1][n2]=dp[n1-1][n2-1]+1;
                }
                else{
                    dp[n1][n2]=Math.max(dp[n1][n2-1],dp[n1-1][n2]);
                }
            }
        }
        return dp[l1][l2];
    }
}
