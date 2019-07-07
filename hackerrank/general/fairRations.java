package general;

import java.util.Scanner;

public class fairRations {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int c=0;
		
		for(int i=0;i<n-1;++i){
			if(arr[i]%2!=0){
				++arr[i];
				++arr[i+1];
				c+=2;
			}
		}
		
		if(arr[n-1]%2==0){
			System.out.println(c);
		}
		else{
			System.out.println("NO");
		}
		
		sc.close();
	}
}
