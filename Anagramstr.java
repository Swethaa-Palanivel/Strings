import java.util.*;
public class Anagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String A =sc.nextLine();
        String B =sc.nextLine();
        if(A.length()!=B.length()){
            System.out.print("false");
            return;
        }
        char [] s1 = A.toCharArray();
             char [] s2 = B.toCharArray();
             Arrays.sort(s1);
             Arrays.sort(s2);
             System.out.print(Arrays.equals(s1,s2));
    }
}