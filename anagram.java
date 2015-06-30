package example;
import java.io.*;
import java.util.*;
public class anagram {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		int c1[]=new int[256];
		int c2[]=new int[256];
		if(s1.length()==s2.length()){
			for(int i=0;i<s1.length();i++){
				int val=s1.charAt(i);
				c1[val]=c1[val]+1;
				int val1=s2.charAt(i);
				c2[val1]=c2[val1]+1;
				//System.out.println(c1[val]+" ,"+c2[val1]);
			}
			for(int i=0;i<c1.length;i++){
				if(c1[i]!=c2[i]){
					//System.out.println(c1[i]+","+c2[i]);
					System.out.println("not anagram");
					return ;
				}
			}
			System.out.println("Anagram");
		}
		else{
			System.out.println("Strings are of different length");
		}
		
	}
}
