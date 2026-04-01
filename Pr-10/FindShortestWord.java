// Write a Java program to find the shortest word in a sentence.
import java.util.*;

class FindShortestWord{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to find the shortest word: ");
        String userInput = sc.nextLine();

        String[] str_arr = userInput.split(" ");

        int shortest_length = str_arr[0].length();

        for (int i = 1; i < str_arr.length; i++) {
            if (str_arr[i].length() < shortest_length) {
                shortest_length = str_arr[i].length();
            }
        }

        for (int i = 0; i < str_arr.length; i++) {
            if (str_arr[i].length() == shortest_length) {
                System.out.println("Shortest word in the sentence: " + str_arr[i]);
            }
        }
        sc.close();
    }
}