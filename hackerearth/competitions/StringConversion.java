package competitions;

import java.util.Scanner;

public class StringConversion {

	// ** Rebel Foods **
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		int c=0; 
		int i=0, j=0;
		
		boolean flag = true;
		
		while(i<s1.length()) {
			if(s1.charAt(i) != s2.charAt(j)) {
				 ++c;
				 ++j;
			}
			else {
				++i;
				++j;
			}
			
			if(i<s1.length() && j==(s2.length())) {
				flag = false;
				break;
			}
		}
		
		if(flag == true) {
			System.out.println(c);
		}
		else {
			System.out.println("Not possible");
		}
		
		sc.close();
	}
}
