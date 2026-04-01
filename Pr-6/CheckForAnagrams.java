
// Write a Java program to check whether two strings are anagrams or not.
import java.util.Arrays;

class CheckForAnagrams {
    public static void main(String[] args) {
        String s1 = "Listen";
        // String s2 = "Silent";
        String s2 = "Silents";

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char[] s1_arr = s1.toCharArray();
        char[] s2_arr = s2.toCharArray();

        Arrays.sort(s1_arr);
        Arrays.sort(s2_arr);

        if (Arrays.equals(s1_arr, s2_arr)) {
            System.out.println("Strings are anagrams");
        } else {
            System.out.println("Strings are not anagrams");
        }
    }
}