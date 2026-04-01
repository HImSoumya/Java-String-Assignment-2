// Write a Java program to capitalize the first letter of each word in a sentence.
import java.util.*;

class CapitalizeFirstLatter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a siting  to capitalize the first letter of each word: ");
        String userInput = sc.nextLine();

        String[] arr = userInput.split(" ");
        String result = "";

        for (int i = 0; i < arr.length; i++) {
            String firstLetter = arr[i].substring(0, 1).toUpperCase();
            String restPart = arr[i].substring(1);

            result += firstLetter + restPart + " ";
        }

        System.out.println("String after capitalize the first letter of each word: " + result.trim());
        sc.close();

    }
}