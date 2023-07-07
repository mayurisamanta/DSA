package leetcode.$209_minimum_size_subarray_sum;

public class Minimum_size_subarray_sum {
    public static int minSubArrayLen(int target, int[] nums) {

        int ans = Integer.MAX_VALUE;
        int sum = nums[0];
        int i = 0;
        int j = 1;
        int n = nums.length;

        while (i < n || j < n){

            if (sum >= target){
                ans = Math.min(ans, j - i);
                sum -= nums[i++];
            }
            else if (j < n) sum += nums[j++];

            if (sum < target && j == n) break;
        }

        return ans == Integer.MAX_VALUE ? 0 : ans;

    }

    public static void main(String[] args) {
        int n = 7;
        int[] nums = {2,3,1,2,4,3};

        System.out.println(minSubArrayLen(n, nums));
    }
}

//    Time complexity: O(n), where n is the length of nums.
//    Space complexity: O(1).
