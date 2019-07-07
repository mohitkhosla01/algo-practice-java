package general;

import java.util.Scanner;

public class boatTrips {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=sc.nextInt();
		int m=sc.nextInt();
		
		int large=0;
		
		int []arr=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
			if(arr[i]>large){
				large=arr[i];
			}
		}
		
		if(large<=(c*m)){
			System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		
		sc.close();
	}

}
