// Write a Java program to find the first non-repeated character in a string.
import java.util.Scanner;

class FirstNonRepeated{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string to find first non-repeating character: ");
        String str = sc.nextLine();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(str.indexOf(ch) == str.lastIndexOf(ch)){
                System.out.println("First Non-Repeating Character: "+ch);
                break;
            }
        }
        sc.close();
    }
}