package hackerrank.java.java_loops_1;

public class java_loops_1 {

    public static void javaLoops1 (int N) {
        for (int i = 1; i <= 10; i++){
            System.out.println(N + " x " + i + " = " + (i * N));
        }
    }

    public static void main(String[] args) {
        javaLoops1(2);
    }
}
