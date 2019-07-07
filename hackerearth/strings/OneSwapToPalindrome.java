package algorithms.strings;

import java.util.Scanner;

public class OneSwapToPalindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int w=0; w<t; ++w) {
			StringBuilder s = new StringBuilder(sc.nextLine());
			
			for(int i=0; i<s.length()/2; ++i) {
				if(s.charAt(i) != s.charAt(s.length()-1-i)) {
					
					for(int j=(s.length()-1-i); j>i; --j) {
						
					}
				}
			}
		}
	}
}
