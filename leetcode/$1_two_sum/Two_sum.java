package leetcode.$1_two_sum;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Two_sum {

    public static int[] twoSum (int target, int[] nums){

        int[] ans = new int[2];
        Map<Integer,Integer> numCount = new HashMap<>();

        for (int i = 0; i < nums.length; i++){
            if (numCount.containsKey(target - nums[i])){
                ans[0] = numCount.get(target - nums[i]);
                ans[1] = i;
                break;
            }
            else numCount.put(nums[i],i);
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {3,3};
        int target = 6;

        System.out.println(Arrays.toString(twoSum(target, nums)));
    }

    // Time Complexity : O(N)
    // Space Complexity : O(N)
}
