package leetcode.$300_Longest_Increasing_Subsequence;

import java.util.Arrays;

public class Longest_Increasing_Subsequence {

    public static int lengthOfLIS(int[] nums) {
        int n = nums.length;
        if (n == 1) return 1;
        int[] dp = new int[n];
        int max = 1;
        dp[0] = 1;
        for(int i = 1; i < n; i++){
            int maxVal = 0;
            for(int j = 0; j < i; j++){
                if(nums[i] > nums[j]){
                    maxVal = Math.max(maxVal,dp[j]);
                }
            }
            dp[i] = maxVal + 1;
            max = Math.max(max,dp[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {10,9,2,5,3,7,101,18};

        System.out.println(lengthOfLIS(nums));
    }

    // Time Complexity: O(n^2)
    // Space Complexity: O(n)
}
