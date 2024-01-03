package leetcode.$2125_Number_of_Laser_Beams_in_a_Bank;

public class Number_of_Laser_Beams_in_a_Bank {

    public static int numberOfBeams(String[] bank) {
        int beams = 0;
        int prev = 0;

        for (String s : bank) {
            int curr = 0;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '1') {
                    curr += 1;
                }
            }
            if (curr > 0) {
                beams += curr * prev;
                prev = curr;
            }
        }

        return beams;
    }

    public static void main(String[] args) {
        String[] bank = {"011001","000000","010100","001000"};
        System.out.println(numberOfBeams(bank));
    }

    // Time Complexity: O(n * m)
    // Space Complexity: O(1)
}
