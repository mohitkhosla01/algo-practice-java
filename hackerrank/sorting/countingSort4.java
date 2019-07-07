package sorting;

import java.util.Scanner;

public class countingSort4 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();

		StringBuilder []arr=new StringBuilder[n];
		
		int t=0;

		for(int i=0;i<n;++i){
			int x=sc.nextInt();
			StringBuilder s=new StringBuilder(sc.next());
			
			if(i<(n/2)){
				s=new StringBuilder("-");
			}
			
			if(arr[x]==null){
				arr[x]=s;
				arr[x].append(" ");
			}
			else{
				arr[x].append(s);
				arr[x].append(" ");
			}
			
			if(x>t){
				t=x;
			}
		}

		for(int i=0;i<=t;++i){
			System.out.print(arr[i]);
		}

		sc.close();
	}
}
