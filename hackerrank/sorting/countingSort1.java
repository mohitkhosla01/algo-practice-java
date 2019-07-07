package sorting;

import java.util.Scanner;

public class countingSort1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int []arr=new int[100];
		
		for(int i=0;i<n;++i){
			++arr[sc.nextInt()];
		}
		
		for(int i=0;i<arr.length;++i){
			System.out.print(arr[i]+" ");
		}
		
		sc.close();
	}
}
