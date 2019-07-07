package general;

import java.util.*;
public class jumpingOnClouds {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[n];
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int x=0, c=0;
		
		while(true){		
			if(x>=(n-1)){
				break;
			}
			
			if((x+2!=n) && arr[x+2]!=1){
				x+=2;
			}
			else{
				x+=1;
			}
			c+=1;
		}
		
		System.out.println(c);
		
		sc.close();
	}
}
