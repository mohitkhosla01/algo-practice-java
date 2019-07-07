package general;

import java.util.Scanner;
public class pickingNumbers {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int gc=0;
		for(int i=0;i<n;++i){
			
			int max=arr[i], min=arr[i], c=1;		
			for(int j=0;j<n;++j){
				if(i!=j){
					if(Math.abs(arr[j]-min)<=1 && Math.abs(max-arr[j])<=1){
						++c;
						if(arr[j]>max){
							max=arr[j];
						}
						if(min>arr[j]){
							min=arr[j];
						}
					}
				}
			}
			if(c>gc){
				gc=c;
			}
		}
		System.out.println(gc);
		
		sc.close();
	}
}
