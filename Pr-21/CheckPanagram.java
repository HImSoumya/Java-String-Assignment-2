// Write a Java program to check whether a string is a pangram or not.
// (Pangram = a sentence containing all 26 alphabets)

// Example:
// The quick brown fox jumps over the lazy dog

import java.util.*;
class CheckPanagram{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentance: ");
        String userInput = sc.nextLine().toLowerCase();

        boolean flag = true;

        for(char ch = 'a';ch<='z';ch++){
            if(userInput.indexOf(ch) == -1){
                flag = false;
                break;
            }
        }

        if(flag){
            System.out.println("Entered sentence is Panagram...");
        }else{
            System.out.println("Entered sentence is not Panagram...");
        }
        sc.close();
    }
}