package leetcode.$2610_Convert_an_Array_Into_a_2D_Array_With_Conditions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {

    public static List<List<Integer>>  convertTo2DArray(int[] nums) {
        int max = 0;
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int num : nums){
            int value = map.getOrDefault(num, 0) + 1;
            map.put(num, value);
            max = Math.max(max, value);
        }

        for (int i = 0; i < max; i++) {
            result.add(new ArrayList<>());
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int key = entry.getKey();
            int value = entry.getValue();
            for (int i = 0; i < value; i++) {
                result.get(i).add(key);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,4,1,2,3,1};
        System.out.println(convertTo2DArray(nums));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
}
