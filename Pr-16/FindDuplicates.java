// Write a Java program to find duplicates character in a string.
import java.util.*;

class FindDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String a Find Duplicates: ");
        String userInput = sc.nextLine();

        String str_lower = userInput.toLowerCase();

        String duplicatesValues = "";

        for(int i = 0;i<str_lower.length();i++){
            char ch = str_lower.charAt(i);

            if(str_lower.indexOf(ch) != str_lower.lastIndexOf(ch)){
                duplicatesValues += ch;
            }
        }

        System.out.println("Duplicates values in the given String: "+duplicatesValues);
        sc.close();
    }
}