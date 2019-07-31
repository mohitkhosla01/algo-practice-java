package thoughtworks;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class BinaryMadness {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		ArrayList<String> ans = new ArrayList<String>();
		
		for(int w=0; w<t; ++w) {
			
			BigInteger num = new BigInteger(sc.nextLine());
			
			ArrayList<Character> charList = getBinary(num);
			
			ArrayList<ArrayList<Character>> substringList = new ArrayList<ArrayList<Character>>();
			
			for(int i=0; i<charList.size(); ++i) {
				
				for(int j=1; j<=charList.size(); ++j) {
					
					ArrayList<Character> substring = new ArrayList<Character>();
					
					for(int k=i; k<j; ++k) {
						substring.add(charList.get(k));
					}
					
					substringList.add(substring);
				}
			}
			
			int zeroCount = 0, oneCount = 0;
			
			
			for(int i=0; i<substringList.size(); ++i) {
				
				ArrayList<Character> substring = substringList.get(i);
				int zero = 0, one = 0;
				
				for(int j=0; j<substring.size(); ++j) {
					if(substring.get(j) == 48) {
						++zero;
					}
					if(substring.get(j) == 49) {
						++one;
					}
				}
				
				if(zero % 2 == 1) {
					++zeroCount;
				}
				if(one % 2 == 1) {
					++oneCount;
				}
			}
			
			ans.add(zeroCount + " " + oneCount);
		}
		
		for(int w = 0; w < ans.size(); ++w) {
			System.out.println(ans.get(w));
		}
		
		sc.close();
	}
	
	public static ArrayList<Character> getBinary(BigInteger num) {
		
		ArrayList<Character> t = new ArrayList<Character>();
		
		if(num.equals(BigInteger.ZERO)) {
			t.add((char) 48);
		}
		else {
			
			BigInteger TWO = new BigInteger("2");
			
			while(num != BigInteger.ZERO) {
				if(num.mod(TWO) == BigInteger.ZERO) {
					t.add((char) 48);
				}
				else {
					t.add((char) 49);
				}
				num = num.divide(TWO);
			}
		}
		
		return t;
	}
}
