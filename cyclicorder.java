import java.util.*;
public class Cyclicorder{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
         String s = sc.nextLine();
         String rev="";
         for(int i = s.length()-1;i>=0;i--){
             rev += s.charAt(i);
         }
        String ans ="";
        for(int i =0;i<rev.length();i++){
            char ch =rev.charAt(i);
            if(Character.isUpperCase(ch))
            ch = (char)('A'+(ch -'A'+i)% 26);
            else if (Character.isLowerCase(ch))
            ch = (char)('a'+(ch -'a'+i)% 26);
            ans+=ch;
        }
        System.out.print(ans);
    }
}