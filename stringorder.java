import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        int count = 0;
        boolean inc = true, dec = true;
       for (int i=1;i<a.length()-1;i++){
        if (a.charAt(i)>a.charAt(i+1))
                inc = false;
            if (a.charAt(i)<a.charAt(i+1))
                dec = false;
   }
    for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i))
                count++;
             }
      if (inc){
            System.out.println("Inc:"+count);
           }
        else if (dec){
            System.out.println("Dec:"+count);
         }
        else{
            System.out.println("Invalid");
    }
         }
}