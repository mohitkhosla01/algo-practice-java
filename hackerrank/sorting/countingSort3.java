package sorting;

import java.util.Scanner;

public class countingSort3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[100];
		String []srr=new String[n];
		
		for(int i=0;i<n;++i){
			++arr[sc.nextInt()];
			srr[i]=sc.next();
		}
		
		int x=0;
		
		for(int i=0;i<100;++i){
			System.out.print(x+arr[i]+" ");
			x+=arr[i];
		}
		
		sc.close();
	}
}
