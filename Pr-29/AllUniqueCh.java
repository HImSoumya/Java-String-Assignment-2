// Write a Java program to check whether a string has all unique characters or not.

// Example:
// Input: abcd → Unique
// Input: hello → Not Unique
import java.util.*;

class AllUniqueCh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine().toLowerCase();

        boolean flag = true;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (str.indexOf(ch) != str.lastIndexOf(ch)) {
                flag = false;
                break;  
            }
        }

        if (flag) {
            System.out.println("Unique String");
        } else {
            System.out.println("Not A Unique String");
        }

        sc.close();
    }
}