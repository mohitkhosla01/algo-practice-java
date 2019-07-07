package strings;

import java.util.Scanner;

public class palindromes {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		
		int e=s.length();
		
		for(int i=0;i<s.length();++i){
			if(s.charAt(0)==s.charAt(s.length()-i-1)){
				--e;
			}
			else{
				break;
			}
		}
		
		System.out.println(e);
		
		sc.close();
	}
}
