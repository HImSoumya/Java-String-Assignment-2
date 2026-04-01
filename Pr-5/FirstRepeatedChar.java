// Write a Java program to find the first repeated character in a string.
import java.util.Scanner;

class FirstRepeatedChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Enter a string to find first repeating character: ");
        String str = sc.nextLine();

        for(int i = 0;i<str.length();i++){
            char ch = str.charAt(i);

            if(str.indexOf(ch) != str.lastIndexOf(ch)){
                System.out.println("First Repeating Character: "+ch);
                break;
            }
        }
        sc.close();
    }
}