package example;
import java.util.*;
public class permu13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		if(s1.length()==s2.length()){
			char c1[]=s1.toCharArray();
			char c2[]=s2.toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			for(int i=0;i<c1.length;i++){
				if(c1[i]!=c2[i]){
					System.out.println("one string is not permutation of other");
					return;
				}
			}
			System.out.println("both are permutation of one another");
		}
		else{
			System.out.println("strings are of not equal");
		}
	}
}
