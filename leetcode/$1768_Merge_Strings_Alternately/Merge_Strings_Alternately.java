package leetcode.$1768_Merge_Strings_Alternately;

public class Merge_Strings_Alternately {

    public static String mergeAlternately(String word1, String word2) {

        // Here StringBuilder is used instead of string because
        // StringBuilder is faster when performing several concatenations,
        // as it doesn't create a new object each time.
        StringBuilder sb = new StringBuilder();

        // The length of the string is obtained only once,
        // and the length is used in the loop instead of the method.
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0;
        int j = 0;

        while (i < w1 && j < w2){
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }

        if (i < w1) sb.append(word1, i, w1);
        if (j < w2) sb.append(word2, j, w2);

        return String.valueOf(sb);
    }

    public static void main(String[] args) {

        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }

    // Time Complexity: O(n) where n is the length of the longer string.
    // Space Complexity: O(n) where n = total length of both strings.
}
