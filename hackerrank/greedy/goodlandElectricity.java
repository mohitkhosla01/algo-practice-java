package greedy;

import java.util.Scanner;

public class goodlandElectricity {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		
		int []arr=new int[n];
		
		for(int i=0;i<n;++i){
			arr[i]=sc.nextInt();
		}
		
		int c=0;
		int i=k-1;
		
		while(i<arr.length){
			if(arr[i]==1){
				System.out.print(i+" ");
				++c;
				i=i+(2*k)-1;
			}
			else{
				boolean flag=false;
				for(int j=k-1;j>=0;--j){
					--i;
					if(arr[i]==1){
						System.out.print(i+" ");
						++c;
						i=i+(2*k)-1;
						flag=true;
						break;
					}
				}
				if(flag==false){
					c=-1;
					break;
				}
			}
		}
		
		System.out.println("\n"+c);
		// System.out.println(c);
		
		sc.close();
	}
}
