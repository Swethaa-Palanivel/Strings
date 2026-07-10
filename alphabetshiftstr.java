import java.util.*;
public class Alphabetshift {
    public static void main(String[] args) {
        int n = 2;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int operation = 0;
        int index = 0;

        for(int i=0;i<n;i++){
            if(s1.charAt(i) != s2.charAt(i)){
                index = i;
                Boolean isMatch = false;
                for(char ch=s1.charAt(index); ch>='a'; ch--){
                    if(ch == s2.charAt(index)){
                        operation ++;
                        isMatch = true;
                        break;
                    }
                }
                if(!isMatch){
                    operation = -1;
                    break;
                }
            }
        }
        System.out.println(operation);
    }
}