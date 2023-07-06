package leetcode.$345_reverse_vowels_of_string;

public class Reverse_vowels_of_string {
    public static String reverseVowels(String s) {

        char[] ch = s.toCharArray();

        int i = 0;
        int j = s.length() - 1;
        boolean leftVowel = false;
        boolean rightVowel = false;

        while (i < j){

            if (leftVowel && rightVowel){
                char temp = ch[i];
                ch[i] = ch[j];
                ch[j] = temp;
                i++;
                j--;
                leftVowel = false;
                rightVowel = false;
            }

            if (ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' || ch[i] == 'A' ||
                    ch[i] == 'E' || ch[i] == 'I' || ch[i] == 'O' || ch[i] == 'U') leftVowel = true;
            else i++;

            if (ch[j] == 'a' || ch[j] == 'e' || ch[j] == 'i' || ch[j] == 'o' || ch[j] == 'u' || ch[j] == 'A' ||
                    ch[j] == 'E' || ch[j] == 'I' || ch[j] == 'O' || ch[j] == 'U') rightVowel = true;
            else j--;
        }

        String revString = new String(ch);

        return revString;
    }

    public static void main(String[] args) {
        System.out.println(reverseVowels("leetcode"));
    }

    //Time complexity: O(n), where n is the length of the string.
    //Space complexity: O(n) due to the character array used to store the modified string.
}
