import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
     
        String binary = Integer.toBinaryString(n);

        String reverse = new StringBuilder(binary).reverse().toString();

        String result = "";
        int countY = 0;

        for (int i = 0; i < reverse.length(); i++) {
            if (reverse.charAt(i) == '0') {
                result += "x";
            } else {
                result += "y";
                countY++;
            }
        }

        System.out.println(result + countY);
    }
}