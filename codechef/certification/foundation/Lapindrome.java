package certification.foundation;

import java.util.HashMap;
import java.util.Scanner;

public class Lapindrome {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int w=0; w<t; ++w) {
			
			String s = sc.nextLine();
			HashMap<Character, Integer> h1 = new HashMap<Character, Integer>();
			
			for(int i=0; i<s.length()/2; ++i) {
				char ch = s.charAt(i);
				
				if(h1.containsKey(ch)) {
					h1.put(ch, h1.get(ch)+1);
				}
				else {
					h1.put(ch, 1);
				}
			}
			
			int halfLength = (s.length() % 2 == 0) ? (s.length() / 2) : ((s.length() / 2) + 1);
			
			for(int i = halfLength; i<s.length(); ++i) {
				char ch = s.charAt(i);
				
				if(h1.containsKey(ch) && h1.get(ch) != 1) {
					h1.put(ch, h1.get(ch)-1);
				}
				else if(h1.containsKey(ch) && h1.get(ch) == 1) {
					h1.remove(ch);
				}
			}
			
			if(h1.size() == 0) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
		
		sc.close();
	}
}
