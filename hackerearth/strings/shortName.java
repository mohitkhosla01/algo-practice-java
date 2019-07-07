package algorithms.strings;

import java.util.Scanner;

public class shortName {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String s=sc.nextLine();
		s=" "+s;
		
		int li=s.lastIndexOf(" ");
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=0; i<li; ++i){
			if(s.charAt(i)==' '){
				sb.append(s.charAt(i+1));
				sb.append(". ");
			}
		}
		
		sb.append(s.substring(li+1));
		System.out.println(sb);
		
		sc.close();
	}
}
