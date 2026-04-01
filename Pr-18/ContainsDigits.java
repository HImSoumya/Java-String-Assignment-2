// Write a Java proogram to check whether a String contanis oonly digits.
import java.util.*;
class ContainsDigits{
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in); 

       System.out.println("Enter a String or Number: ");
       String user_str = sc.nextLine();
       
       boolean flag = true;

       for(int i = 0;i<user_str.length();i++){
         if(!Character.isDigit(user_str.charAt(i))){
            flag = false;
            break;
         }
       }

       if(flag){
        System.out.println("This String Contains Oonoly Digits");
       }else{
        System.out.println("This String Does Not Coontanis Oonly Digits");
       }
    sc.close();
    }
}