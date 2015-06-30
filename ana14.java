package example;
import java.util.*;
public class ana14 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		System.out.println(isAnagram(s1,s2));
	}
	public static boolean isAnagram(String s1,String s2){
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		boolean flag=false;
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				char c=s1.charAt(i);
				for(int j=i;j<s2.length();j++){
					char t=s2.charAt(j);
					if(c==t){
						flag=true;
						continue;
					}	
				}
				if(flag==false){
					return false;
				}
			}
			return true;
		}
		else{
			return false;
		}
	}
}
