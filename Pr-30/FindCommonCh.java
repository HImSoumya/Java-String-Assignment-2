// Write a Java program to find the common characters between two strings.

// Example:
// Input: apple and plane
// Output: p, l, e

class FindCommonCh {
    public static void main(String[] args) {
        String s1 = "apple";
        String s2 = "plane";

        System.out.print("Common characters: ");

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i); 
            
            if (s2.indexOf(ch) != -1) { 
                if (s1.indexOf(ch) == i) {
                    System.out.print(ch + " ");
                }
            }
        }
    }
}