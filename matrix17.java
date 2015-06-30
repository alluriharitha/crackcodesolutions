package example;
import java.util.*;
public class matrix17 {
	static int r[][];
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of matrix MXN:");
		int m=sc.nextInt();
		int n=sc.nextInt();
		r=new int[m][n];
		int a[][]=new int[m][n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		int r[]=new int[m];
		int c[]=new int[n];
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(a[i][j]==0){
					r[i]=1;
					c[j]=1;
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				if(r[i]==1 || c[j]==1){
					a[i][j]=0;
				}
			}
		}
		for(int i=0;i<m;i++){
			for(int j=0;j<n;j++){
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
