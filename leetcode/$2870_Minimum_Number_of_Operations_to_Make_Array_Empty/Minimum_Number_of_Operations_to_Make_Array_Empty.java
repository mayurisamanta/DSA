package leetcode.$2870_Minimum_Number_of_Operations_to_Make_Array_Empty;

import java.util.HashMap;
import java.util.Map;

public class Minimum_Number_of_Operations_to_Make_Array_Empty {

    public static int minOperations(int[] nums) {

        int operations = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int value = map.getOrDefault(num, 0) + 1;
            map.put(num, value);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()){
            int value = entry.getValue();
            if (value == 1) return -1;
            operations += value % 3 == 0 ?  (value / 3) : ((value / 3) + 1);
        }

        return operations;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println(minOperations(nums));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)

}
