package leetcode.$14_Longest_Common_Prefix;

public class Longest_Common_Prefix {

    public static String longestCommonPrefix(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);
                if (prefix.isEmpty()) return "";
            }
        }

        return prefix;
    }

    // Time Complexity: O(n * m)
    // Space Complexity: O(1)

    public static String longestCommonPrefix2(String[] strs) {

        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){
            String s = strs[i];
            int sLength = s.length();
            int prefixLength = prefix.length();

            if (sLength < prefixLength) {
                prefix = prefix.substring(0, sLength);
                prefixLength = sLength;
            }

            for (int j = 0; j < prefixLength; j++){
                if (prefix.charAt(j) != s.charAt(j)){
                    prefix = prefix.substring(0, j);
                    break;
                }
            }
        }

        return prefix;
    }

    // Time Complexity: O(n * m)
    // Space Complexity: O(1)

    public static void main(String[] args) {

        String[] strs = {"flower","flow","flight"};

        System.out.println(longestCommonPrefix(strs));
        System.out.println(longestCommonPrefix2(strs));
    }

}
