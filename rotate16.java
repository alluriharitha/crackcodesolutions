package example;
import java.util.*;
public class rotate16 {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		int a[][]=new int[n][n];
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int b[][]=new int[n][n];
		for(int i=0;i<n;i++){
			
			for(int j=0;j<n;j++){
				b[i][j]=a[n-1-j][i];
			}
		}
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(b[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
