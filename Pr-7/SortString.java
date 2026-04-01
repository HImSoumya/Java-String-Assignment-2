
// Write a Java program to sort the characters of a string in alphabetical order.
import java.util.*;;

class SortString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String to sort: ");
        String userInput = sc.nextLine();

        char[] arr = userInput.toCharArray();
        Arrays.sort(arr);

        System.out.println("String Before Sorting: " + userInput);
        System.out.println("String After Sorting: " + new String(arr));

        sc.close();

    }
}