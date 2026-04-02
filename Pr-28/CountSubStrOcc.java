// Write a Java program to count how many times a substring occurs in a main string.

// Example:
// Input:
// String = banana
// Substring = an
// Output: 2

class CountSubStrOcc {
    public static void main(String[] args) {
        String str = "banana";
        String subStr = "an";

        int count = 0;
 
        for (int i = 0; i <= str.length() - subStr.length(); i++) {
 
            String temp = str.substring(i, i + subStr.length());
 
            if (temp.equals(subStr)) {
                count++;
            }
        }

        System.out.println("Occurrences: " + count);
    }
}