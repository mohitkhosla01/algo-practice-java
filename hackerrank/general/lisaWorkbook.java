package general;

import java.util.Scanner;

public class lisaWorkbook {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int cx=0;
		int p=1;
		
		for(int i=1;i<=n;++i){
			int a=arr[i-1];
			
			int ac=a/k;
			if(a%k!=0){
				++ac;
			}
			
			int c1=1;
			
			for(int j=1;j<=ac;++j){
				int c2=0;
				if(a>=c1+k-1){
					c2=c1+k-1;
				}
				else{
					c2=a;
				}
				if(c1<=p && p<=c2){
					++cx;
				}
				c1+=k;
				++p;
			}
		}
		
		System.out.println(cx);
		
		sc.close();
	}
}
