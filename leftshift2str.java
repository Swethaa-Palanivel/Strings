import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String s = sc.nextLine();
        int n = s.length();
        for (int i = 1; i <(1<<n); i++) {
            for (int j = n-1; j >=0; j--) {
                if ((i & (1 << j)) != 0) {
                    System.out.print(s.charAt(j));
                    }
    }
            System.out.println();
        }
    }
}