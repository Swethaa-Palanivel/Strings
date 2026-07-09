
import java.util.*;
public class Main
{
	public static void main(String[]args){
	    String ip ="abc";
	    for(int i =0;i<ip.length();i++){
	        for(int j =i+1;j<=ip.length();j++){
	            System.out.print(ip.substring(i,j)+" ");
	        }
	    }
	   
	}
}