package repeated_and_missing;

import java.util.HashMap;
import java.util.Map;

public class Repeated_and_missing {
    public static void repeatedAndMissing (int n, int[] nums){

        Map<Integer, Integer> numCount = new HashMap<>();
        int repeated = 0;
        int missing = 0;

        for (int i = 0; i < n; i++){
            if (numCount.containsKey(nums[i])) numCount.put(nums[i], numCount.get(nums[i])+1);
            else numCount.put(nums[i], 1);
        }

        for (int i = 1; i <= n; i++){
            if (numCount.containsKey(i) == false) missing = i;
            if (numCount.get(i) != null && numCount.get(i) > 1) repeated = i;
        }

        System.out.println(missing + " " + repeated);

    }

    public static void main(String[] args) {
        int n = 5;
        int[] nums = {1, 2, 3 ,3, 4};
        repeatedAndMissing(n, nums);

        int m = 2;
        int[] nums2 = {1, 1};
        repeatedAndMissing(m, nums2);
    }

    // Time Complexity : O(n)
    // Space Complexity : O(n)
}
