package algorithms.strings;

import java.util.ArrayList;
import java.util.Scanner;

public class LargestBalancedString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		ArrayList<String> strings = new ArrayList<String>();
		
		for(int i=0; i<t; ++i) {
			strings.add(sc.nextLine());
		}
		
		for(int i=0; i<strings.size(); ++i) {
			char[] stringChar = strings.get(i).toCharArray();
			
			int squareOpen = 0;
			int squareClosed = 0;
			int curlyOpen = 0;
			int curlyClosed = 0;
			int roundOpen = 0;
			int roundClosed = 0;
			
			for(int j=0; j<stringChar.length; ++j) {
				if(stringChar[j] == '[') {
					++squareOpen;
				}
				else if(stringChar[j] == ']') {
					++squareClosed;
				}
				else if(stringChar[j] == '{') {
					++curlyOpen;
				}
				else if(stringChar[j] == '}') {
					++curlyClosed;
				}
				else if(stringChar[j] == '(') {
					++roundOpen;
				}
				else if(stringChar[j] == ')') {
					++roundClosed;
				}
			}
			
			System.out.println((Math.min(squareOpen, squareClosed)*2) + (Math.min(curlyOpen, curlyClosed)*2) + (Math.min(roundOpen, roundClosed)*2));
		}
		
		sc.close();
	}
}
