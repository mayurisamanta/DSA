package hackerrank.java.java_substring;

import java.util.Scanner;

public class Java_substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); // HelloWorld 0 5
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(S.substring(start, end));
    }
}
