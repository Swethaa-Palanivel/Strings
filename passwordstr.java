import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String pass =sc.nextLine();
        boolean upper = false;
        boolean lower =false;
        boolean digit =false;
        boolean special =false;
         if(pass.length()<8){
             System.out.print("INVALID PASSWORD");
             return;
         }
         for(int i =0;i<pass.length();i++){
             char ch = pass.charAt(i);
             if(Character.isUpperCase(ch)){
                 upper = true;
             }
             else if (Character.isLowerCase(ch)){
                 lower = true;
             }
             else if (Character.isDigit(ch)){
                 digit = true;
             }else{
                 special = true;
             }
         }
         if(upper && lower && special && digit){
             System.out.print("VALID PASSWORD");
         }else{
             System.out.print("INVALID PASSWORD");
         }
    }
}