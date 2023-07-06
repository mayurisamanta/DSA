package reverse_the_value;

public class Reverse_the_value {

    public static void reverseTheValue (int num){

        int rev = 0;

        while(num > 0){
            rev = (rev * 10) + (num % 10);
            num = num /10;
        }

        System.out.println(rev);

    }
    public static void main(String[] args) {
        reverseTheValue(971);
    }

    // Time Complexity : O(log10(num))  i.e length of num
    // Space Complexity : O(1)
}
