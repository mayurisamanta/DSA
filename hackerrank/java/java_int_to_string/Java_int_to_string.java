package hackerrank.java.java_int_to_string;

import java.util.Scanner;

public class Java_int_to_string {

    public static void main(String[] args) {


        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        //String s=???; Complete this line below
        String s = String.valueOf(n);
        //Write your code here


        if (n == Integer.parseInt(s)) {
            System.out.println("Good job");
        } else {
            System.out.println("Wrong answer.");
        }
    }
}
