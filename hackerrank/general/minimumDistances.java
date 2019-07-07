package general;

import java.util.Scanner;

public class minimumDistances {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int c=n;
		for(int i=0;i<n;++i){
			for(int j=i-1;j>=0;--j){
				if(arr[i]==arr[j] && c>(i-j)){
					c=i-j;
					break;
				}
			}
			for(int j=i+1;j<n;++j){
				if(arr[i]==arr[j] && c>(j-i)){
					c=j-i;
					break;
				}
			}
		}
		
		if(c!=n){
			System.out.println(c);
		}
		else{
			System.out.println(-1);
		}
		
		sc.close();
	}
}
