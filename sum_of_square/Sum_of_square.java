package sum_of_square;

public class Sum_of_square {

    public static boolean sumOfSquare(int k){

        int i = 1;
        int j = (int) Math.sqrt(k);

        while (i < j){
            int value = i*i + j*j;
            if (value == k) return true;
            else if (value > k) j--;
            else i++;
        }

        return false;
    }

    public static void main(String[] args) {
        int k = 25;
        System.out.println(sumOfSquare(k));
        k = 7;
        System.out.println(sumOfSquare(k));
    }

    // Time Complexity : O(sqrt(k))
    // Space Complexity : O(1)
}
