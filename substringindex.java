import java.util.*;
public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        int index = str1.indexOf(str2);
        if(index !=-1){
            System.out.print(index);
        }else{
            System.out.print("-1");
        }
    }
}