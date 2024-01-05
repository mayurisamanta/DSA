package hackerrank.java.java_stack;

import java.util.Scanner;
import java.util.Stack;

public class Java_stack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String input = sc.next();
            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;
            for (int i = 0; i < input.length(); i++) {
                char c = input.charAt(i);
                if (c == '{' || c == '[' || c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty()) {
                        isBalanced = false;
                        break;
                    }
                    char top = stack.pop();
                    if (c == '}' && top != '{') {
                        isBalanced = false;
                        break;
                    }
                    if (c == ']' && top != '[') {
                        isBalanced = false;
                        break;
                    }
                    if (c == ')' && top != '(') {
                        isBalanced = false;
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                isBalanced = false;
            }
            System.out.println(isBalanced);
        }
    }
}