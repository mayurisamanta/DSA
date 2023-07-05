package pattern_of_n;

public class Pattern_of_n {

    public static void patternOfN (int n){

        StringBuilder bag = new StringBuilder();

        for (int i = 1; i <= n*n; i++){
            if (i % n == 0) bag.append(i + "\n"); // When number is multiple of n, we need line break
            else bag.append(i + " ");
        }

        System.out.println(bag);
    }

    public static void main(String[] args) {
        int n = 3;
        patternOfN(n);
    }

    // Time Complexity : O(N*N)
    // Space Complexity : O(N*N) - bag

}
