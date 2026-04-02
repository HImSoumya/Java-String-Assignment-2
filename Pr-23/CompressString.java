// Write a Java program to compress a string by counting consecutive repeated characters.

// Example:
// Input: aaabbccdd
// Output: a3b2c2d2

class CompressString{
    public static void main(String[] args) {
        String str = "aaabbccdd";
        String result = "";

        int charCount = 1;

        for(int i = 0;i<str.length();i++){
            if(i < str.length() - 1 && str.charAt(i) == str.charAt(i+1)){
                charCount++;
            }else{
                result += str.charAt(i);
                result += charCount;

                charCount = 1;
            }
        }
        System.out.println("Compressed string: " + result);
    }
}