package leetcode.$2610_Convert_an_Array_Into_a_2D_Array_With_Conditions;

import java.util.*;

public class Convert_an_Array_Into_a_2D_Array_With_Conditions {

    public static List<List<Integer>> convertTo2DArray2(int[] nums){

        List<List<Integer>> result = new ArrayList<>();
        int[] count = new int[nums.length + 1];

        for (int num : nums){
            count[num]++;

            if (count[num] > result.size()){
                result.add(new ArrayList<>());
            }

            result.get(count[num] - 1).add(num);
        }

        return result;
    }

    /*
    Approach 2: using count array
    We have already given Constraints
    1 <= nums.length <= 200
    1 <= nums[i] <= nums.length
    So we can create a count array of size nums.length + 1
    and store the count of each element in the count array
    then if count of any element is greater than the size of result list
    then we can add a new list in the result list
    and add the element in the list at index count[num] - 1
     */

    // Time Complexity: O(n)
    // Space Complexity: O(n)

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
        System.out.println(convertTo2DArray2(nums));
    }

    // Time Complexity: O(n)
    // Space Complexity: O(n)
}
