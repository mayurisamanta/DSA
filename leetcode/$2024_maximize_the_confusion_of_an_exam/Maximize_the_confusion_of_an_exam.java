package leetcode.$2024_maximize_the_confusion_of_an_exam;

public class Maximize_the_confusion_of_an_exam {

    public static int maximizeTheConfusion (String answerKey, int k){
        int fCount = 0;
        int tCount = 0;
        int i = 0;
        int j = 1;
        int n = answerKey.length();
        int ans = 0;

        if (answerKey.charAt(0) == 'F') fCount++;
        else tCount++;

        while (i < n || j < n){

            if (Math.min(fCount,tCount) <= k){
                ans = Math.max(ans, j - i);
            }
            else {
                if (answerKey.charAt(i) == 'F') fCount--;
                else tCount--;

                i++;
            }

            if (j == n && Math.min(fCount,tCount) <= k) break;

            if (j < n) {
                if (answerKey.charAt(j) == 'F') fCount++;
                else tCount++;

                j++;
            }

        }

        return ans;
    }

    public static void main(String[] args) {

        String s = "TTFTTFTT";
        int k = 1;

        System.out.println(maximizeTheConfusion(s, k));

    }
}

//    Time complexity: O(n), where n is the length of the answer key string.
//    Space complexity: O(1) since only a constant amount of extra space is used for counters and pointers.
