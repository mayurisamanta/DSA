package leetcode.$455_Assign_Cookies;

import java.util.Arrays;

public class Assign_Cookies {

    public static void main(String[] args) {
        int[] g = {1,2,3};
        int[] s = {1,1};

        System.out.println(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {

        int gPointer = 0;
        int sPointer = 0;
        int count = 0;
        int gLength = g.length;
        int sLength = s.length;

        Arrays.sort(g);
        Arrays.sort(s);

        while (gPointer < gLength && sPointer < sLength){
            if (s[sPointer] >= g[gPointer]) {
                count++;
                sPointer++;
                gPointer++;
            }
            else sPointer++;

        }

        return count;

    }

    // Time Complexity: O(n log n) where n is the length of the shorter array
    // Space Complexity: O(1)
}
