package example;
import java.util.*;
public class dup13 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		remDup(s);
	}
	public static void remDup(final String input) {
	    String res = "";
	    for (int i=0;i<input.length();i++) {
	        int count=0;
	        char ch= input.charAt(i);
	        for (int j=0;j<i;j++) {
	            if(ch==input.charAt(j)) {
	                ++count;
	            }
	        }
	        if (!(count > 0))
	            res=res+ch;
	    }
	    System.out.println(res);
	}
}
