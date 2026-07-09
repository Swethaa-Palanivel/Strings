import java.util.*;
public class Main
{
	public static void main(String[]args){
	   String s = "abcaabcade";
       String r = "";

       for (int i = 0; i < s.length(); i++) {
        String ch = s.substring(i, i + 1);

      if (!r.contains(ch))
        r += ch;
       }

      System.out.println(r);}
     }