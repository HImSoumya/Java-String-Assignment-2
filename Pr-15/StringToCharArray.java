// Write a Java program to convert a string into a character array and display each character one by one.
import java.util.Scanner;

public class StringToCharArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
 
        char[] arr = str.toCharArray();
 
        System.out.println("Characters in the string:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        sc.close();
    }
}