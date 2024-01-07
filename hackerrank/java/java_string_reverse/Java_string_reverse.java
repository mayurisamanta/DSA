package hackerrank.java.java_string_reverse;

import java.util.Scanner;

public class Java_string_reverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        int i = 0;
        int j = A.length() - 1;

        while (i < j) {
            if (A.charAt(i) != A.charAt(j)) {
                System.out.println("No");
                return;
            }
            i++;
            j--;
        }

        System.out.println("Yes");

    }
}
