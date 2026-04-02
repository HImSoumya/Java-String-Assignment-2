// Write a Java program to check whether one string is a rotation of another string.

class RotationalString {
    public static void main(String[] args) {  
        String str1 = "ABCD"; 
        String str2 = "CDAB";
 
        if (str1.length() == str2.length() && (str1 + str1).contains(str2)) {
            System.out.println("It is a rotation");
        } else {
            System.out.println("It is NOT a rotation");
        }
 
    }
}