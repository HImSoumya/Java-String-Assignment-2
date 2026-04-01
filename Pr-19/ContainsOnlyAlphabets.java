// Write a Java proogram too check whether a string coontains ooonly alphabets
import java.util.*;

class ContainsOnlyAlphabets{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter a String or Number: ");
       String user_str = sc.nextLine();
       
       boolean flag = true;

       for(int i = 0;i<user_str.length();i++){
         if(Character.isDigit(user_str.charAt(i))){
            flag = false;
            break;
         }
       }
       if(flag){
        System.out.println("This String Contains Oonoly Alphabets.");
       }else{
        System.out.println("This String Does Not Coontanis Oonly Alphabets.");
       }
    sc.close();
    }
}