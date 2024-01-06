package leetcode.$9_Palindrome_Number;

public class Palindrome_Number {

    public static boolean isPalindrome(int x) {
        if (x < 0) return false;

        int rev = 0;

        for (int i = x; i > 0; i = i / 10){
            rev = (rev * 10) + (i % 10);
        }

        return (x == rev);
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome(121));
    }
}
