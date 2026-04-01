// Write a Java program to count the number of uppercase letters, lowercase letters, digits, and special characters in a given string.

import java.util.Scanner;

class CountCharacters{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to count characters: ");
        String userInput = sc.nextLine();

        int upper = 0, lower = 0, digit = 0, special = 0;

        for(int i = 0;i<userInput.length();i++){
            char ch = userInput.charAt(i);

            if(Character.isUpperCase(ch)){
                upper += 1;
            }
            else if(Character.isLowerCase(ch)){
                lower += 1;
            }
            else if(Character.isDigit(ch)){
                digit += 1;
            }
            else{
                special += 1;
            }
        }

        System.out.println("String Entered By User: "+userInput);
        System.out.println("Uppercase Count: "+upper);
        System.out.println("Lowercase Count: "+lower);
        System.out.println("Digit Count: "+digit);
        System.out.println("Special Count: "+special);

        sc.close();
    }
}