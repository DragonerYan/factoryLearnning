package com.company.algorithm.AlgorithmImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class coinChange322 {
    public static int change(int amount, int[] coins) {
        int[] res =new int[amount];
        if(amount<=2){
            return amount;
        }
        res[0]=1;
        res[1]=2;
        for(int i=2;i<amount;i++){
            res[i]=res[i-1]+res[i-2];
        }
        return res[amount-1];
    }

    public static int change1(int amount,int[] coins){
        int[] dp=new int[amount+1];
        Arrays.fill(dp,amount+1);
        for(int i=1;i<=amount;i++){
            for (int coin : coins) {
                if(coin<=i){
                    dp[i]=Math.min(dp[i],dp[i-coin]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }
    public static int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++) {
            for (int j = 0; j < coins.length; j++) {
                if (coins[j] <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coins[j]] + 1);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] coins={1,2};
        int amount=4;
        System.out.println(coinChange(coins,amount));
    }
}
