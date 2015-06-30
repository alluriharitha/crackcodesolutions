package example;
import java.util.*;
public class replace15 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String res="",temp="";
		res=space(s);
		//System.out.println(res);
		for(int i=0;i<res.length();i++){
			char ch=res.charAt(i);
			if(ch==' '){
				temp=temp+"%20";
			}
			else{
				temp=temp+ch;
				
			}
		}
		System.out.println(temp);
		//System.out.println(s.replaceAll("  ","%20"));
	}
	public static String space(String s){
		char prev=s.charAt(0);
		String res="";
		for(int i=0;i<s.length();i++){
			char cur=s.charAt(i);
			if(cur==' ' && prev==' '){
				
			}
			else{
				res=res+cur;
			}
			prev=cur;
		}
		return res;
	}
}
