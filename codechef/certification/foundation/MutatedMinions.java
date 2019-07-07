package certification.foundation;

import java.util.Scanner;

public class MutatedMinions {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int w=0; w<t; ++w) {
			
			int n = sc.nextInt();
			int k = sc.nextInt();
			int c = 0;
			
			for(int i=0; i<n; ++i) {
				int v = sc.nextInt();
				v += k;
				if(v % 7 == 0) {
					++c;
				}
			}
			
			System.out.println(c);
		}
		
		sc.close();
	}
}
