package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class MaximizeArraySum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int w=0; w<t; ++w) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			
			for(int i=0; i<n; ++i) {
				arr[i] = sc.nextInt();
			}
			
			Arrays.sort(arr);
			
			int nc=0;
			int C=0;
			
			for(int i=0; i<n; ++i) {
				if((nc + ((n-i)*arr[i])) > C) {
					C = nc + ((n-i)*arr[i]);
				}
				nc += arr[i]*-1;
			}
			
			System.out.println(C);
		}
		
		sc.close();
	}
}
