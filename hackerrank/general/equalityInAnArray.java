package general;

import java.util.Scanner;

public class equalityInAnArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int gc=n;
		
		for(int i=0;i<n;++i){
			
			int c=0;
			for(int j=0;j<n;++j){
				
				if(i!=j){
					if(arr[i]!=arr[j]){
						++c;
					}
				}
			}
			
			if(c<gc){
				gc=c;
			}
		}
		
		System.out.println(gc);
		
		sc.close();
	}
}
