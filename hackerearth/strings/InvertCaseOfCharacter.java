package strings;

import java.util.Scanner;

public class InvertCaseOfCharacter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		n1 = n1-1;
		n2 = n2-1;
		
		System.out.print(s.substring(0, n1));
		
		char ch1 = s.charAt(n1);
		if(ch1 >= 65 && ch1 <= 90) {
			ch1 = (char)((int)ch1 + 32);
		}
		else if(ch1 >= 97 && ch1 <= 122) {
			ch1 = (char)((int)ch1 - 32);
		}
		System.out.print(ch1);
		
		System.out.print(s.substring(n1+1, n2));
		
		char ch2 = s.charAt(n2);
		if(ch2 >= 65 && ch2 <= 90) {
			ch2 = (char)((int)ch2 + 32);
		}
		else if(ch2 >= 97 && ch2 <= 122) {
			ch2 = (char)((int)ch2- 32);
		}
		System.out.print(ch2);
		
		System.out.println(s.substring(n2+1));
	}
}
