// Write a java program to remove all vowels from a string.
import java.util.*;

class RemoveVowels{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String a to remove vowels: ");
        String userInput = sc.nextLine();

        String str_lower = userInput.toLowerCase();

        String vowels = "aeiou";

        for(int i = 0;i<str_lower.length();i++){
            char ch = str_lower.charAt(i);

            if(vowels.contains(String.valueOf(ch))){
                str_lower = str_lower.replace(String.valueOf(ch), "");
            }
        }

        System.out.println("String after remooooving vooowels: "+str_lower );
        sc.close();
 
    }
}