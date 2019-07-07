package certification.advanced;

import java.util.Scanner;

public class AlternatingSubarrayPrefix {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int w=0; w<t; ++w) {
			int n = sc.nextInt();
			sc.nextLine();
			
			int []arr = new int[n];
			for(int i=0; i<n; ++i) {
				int temp = sc.nextInt();
				arr[i] = temp > 0 ? 1 : -1;
			}
			sc.nextLine();
			
			int []brr = new int[n];
			brr[n-1] = 1;
			
			for(int i=n-2; i>=0; --i) {
				if(arr[i] != arr[i+1]) {
					brr[i] = brr[i+1] + 1;
				}
				else {
					brr[i] = 1;
				}
			}
			
			for(int i=0; i<brr.length; ++i) {
				System.out.print(brr[i] + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}
}
