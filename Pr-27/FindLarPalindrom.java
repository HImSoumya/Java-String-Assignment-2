// Write a Java program to find the largest palindrome word in a sentence.

// Example:
// Input: madam and racecar are palindrome words
// Output: racecar 

class FindLarPalindrom{
    public static void main(String[] args) {
        String str = "madam and racecar are palindrome words";
        String[] arr = str.split(" ");

        String largest = "";

        for(int i = 0;i<arr.length;i++){
             String word = arr[i];
             String reverse = "";
             for(int j = word.length() - 1;j>=0;j--){
                reverse += word.charAt(j);
             }

             if (word.equals(reverse)) {
                if (word.length() > largest.length()) {
                    largest = word;
                }
            }
        }
        System.out.println("Largest palindrome word: " + largest);
    }
}