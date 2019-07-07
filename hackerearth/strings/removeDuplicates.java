package strings;

import java.util.HashSet;
import java.util.Scanner;

public class removeDuplicates {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.next();
		char []ch=s.toCharArray();
		
		HashSet<Character> hs=new HashSet<Character>();
		
		for(int i=0;i<ch.length;++i){
			if(!hs.contains(ch[i])){
				System.out.print(ch[i]);
				hs.add(ch[i]);
			}
		}
		
		sc.close();
	}
}
