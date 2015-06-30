package example;
import java.util.*;
public class unique {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		boolean f=true;
		f=unq(s);
		System.out.println();
		if(f==true){
			System.out.println("unqiue");
		}
		else{
			System.out.println("not unqiue");
		}
	}
	public static boolean unq(String s){
		int c[]=new int[256];
		/*for(int i=0;i<c.length;i++){
			c[i]=0;
		}*/
		for(int i=0;i<s.length();i++){
			int val=s.charAt(i);
			c[val]=c[val]+1;
			//System.out.print("\t"+val);
			if(c[val]>1){
				return false;
			}
		}
		return true;
	}
}
