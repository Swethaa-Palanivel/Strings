import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s1 = "Welcome";
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int inc = 0;
        while(true){
            for(int i=0;i<k;i++){
                if(inc < s1.length()){
                    System.out.print(s1.charAt(inc));
                    inc++;
                }
                else
                System.out.print('-');
            }
            System.out.println();
            if(inc==s1.length()) break;
        }
    }
}