package com.company.algorithm.AlgorithmImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class contiguousArray525 {
    public static int findMaxLength(int[] nums) {
        int res = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                nums[i] = -1;
            }
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            //为什么
            if (sum == 0 && i > res) {
                res = i + 1;
            }
            if (map.containsKey(sum)) {
                res = Math.max(i - map.get(sum), res);
            } else {
                map.put(sum, i);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums={0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(nums));
    }

}
