// Write a Java program to expand a compressed string.

// Example:
// Input: a3b2c2
// Output: aaabbcc

class ExpandComString{
    public static void main(String[] args) {
        String str = "a3b2c2";
        String result = "";

        for(int i  = 0 ;i<str.length(); i+=2){
            char ch = str.charAt(i);
            int chCount = str.charAt(i+1) - '0';

            for(int j = 0;j<chCount;j++){
                result += ch;
            }
        }
        System.out.println("Expanded string: " + result);
    }
}