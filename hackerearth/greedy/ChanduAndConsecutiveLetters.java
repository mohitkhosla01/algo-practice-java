package greedy;

import java.util.Scanner;

public class ChanduAndConsecutiveLetters {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int w=0; w<t; ++w) {
			String s = sc.nextLine();
			
			if(s == null || s.length() == 0) {
				System.out.println();
			}
			
			StringBuilder sb = new StringBuilder();
			
			char lastChar = s.charAt(0);
			sb.append(lastChar);
			
			for(int i=1; i<s.length(); ++i) {
				char ch = s.charAt(i);
				
				if(ch != lastChar) {
					sb.append(ch);
					lastChar = ch;
				}
			}
			
			System.out.println(sb.toString());
		}
		
		sc.close();
	}
}
