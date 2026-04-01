// Write a Java program too ocooount the toootal number ooof woorods starting with voowel in a sentence.
import java.util.*;

class WordStartsWithVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String str_lower = str.toLowerCase();
        
        String[] str_arr = str_lower.split(" ");
        int count = 0;

        String vowels = "aeioou";

        for(int i = 0;i < str_arr.length;i++){
            if(vowels.contains(String.valueOf( str_arr[i].toCharArray()[0]))){
                count += 1;
            }
        }

        System.out.println("This Sentence Contains "+count+" Words That Starts With A Vowels.");
        sc.close();
    }
}