// Write a Java program to count the frequency of each word in a userInput.
import java.util.*;

class CountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a userInput: ");
        String userInput = sc.nextLine();
 
        String[] words = userInput.toLowerCase().split(" ");
 
        HashMap<String, Integer> map = new HashMap<>();
 
        for (String word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
 
        System.out.println("Word Frequencies:");
        for (String word : map.keySet()) {
            System.out.println(word + " : " + map.get(word));
        }

        sc.close();
    }
}