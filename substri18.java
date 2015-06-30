package example;
import java.util.*;
public class substri18 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		s1=s1+s1;
		issubstring(s1,s2);
	}
	public static void issubstring(String s1,String s2){
		if(s1.contains(s2)){
			System.out.println("s2 is a rotation of s1");
		}
		else{
			System.out.println("s2 is not a rotation of s1");
		}
	}
}
