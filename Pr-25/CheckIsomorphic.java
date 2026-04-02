// Write a Java program to check whether two strings are isomorphic or not.

// Example:
// egg and add → Isomorphic
// foo and bar → Not Isomorphic
 

class CheckIsomorphic {
    public static void main(String[] args) {
        String str1 = "egg";
        String str2 = "add";
 
        if (str1.length() != str2.length()) {
            System.out.println("Not Isomorphic");
            return;
        }

        for (int i = 0; i < str1.length(); i++) {
            for (int j = i + 1; j < str1.length(); j++) { 

                if (str1.charAt(i) == str1.charAt(j) && str2.charAt(i) != str2.charAt(j)) {
                    System.out.println("Not Isomorphic");
                    return;
                }
 
                if (str1.charAt(i) != str1.charAt(j) && str2.charAt(i) == str2.charAt(j)) {
                    System.out.println("Not Isomorphic");
                    return;
                }
            }
        }

        System.out.println("Isomorphic");
    }
}