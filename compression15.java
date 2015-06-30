package example;
import java.util.*;
public class compression15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		String res="";
		
		for (int i=0;i<s.length();i++) {
	        int count=0;
	        char ch= s.charAt(i);
	        for (int j=0;j<i;j++) {
	            if(ch==s.charAt(j)) {
	                ++count;
	            }
	        }
	        //if (!(count > 0))
	            res=res+ch+count;
	    }
		System.out.println(res);
	}

}
