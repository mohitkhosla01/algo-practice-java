package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;
public class MissingAlphabets {
	
	static HashMap<Character, Integer> hm;

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for(int w=0; w<t; ++w) {
			String e = sc.nextLine();
			int m = sc.nextInt();
			sc.nextLine();
			ArrayList<String> s = new ArrayList<String>();
			
			for(int v=0; v<m; ++v) {
				s.add(sc.nextLine());
			}
			
			hm = new HashMap<Character, Integer>();
			for(int i=0; i<e.length(); ++i) {
				hm.put(e.charAt(i), i+1);
			}
			
			Collections.sort(s, new MissingAlphabetsComparator());
			
			for(int i=0; i<s.size(); ++i) {
				System.out.println(s.get(i));
			}
		}
		
		sc.close();
	}
}
