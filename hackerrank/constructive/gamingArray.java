package constructive;

import java.util.Scanner;

public class gamingArray {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		
		for(int w=0;w<t;++w){
			int n=sc.nextInt();
			int []arr=new int[n];
			
			for(int i=0;i<n;++i){
				arr[i]=sc.nextInt();
			}
			
			int sw=-1;
			int b=n;

			while(b!=0){
				sw*=-1;
				int max=0, index=0;
				for(int j=0;j<b;++j){
					if(arr[j]>max){
						max=arr[j];
						index=j;
					}
				}
				b=index;
			}
			
			if(sw==-1){
				System.out.println("ANDY");
			}
			else{
				System.out.println("BOB");
			}
		}
		
		sc.close();
	}
}
