package medium;

import java.util.ArrayList;

public class MultiplyStrings {

	public static void main(String[] args) {
		System.out.println(new MultiplyStrings().multiply("1", "0"));
	}

	public String multiply(String num1, String num2) {
		
		ArrayList<Integer> digits = new ArrayList<Integer>();
		for(int i=0; i<(num1.length() + num2.length()); ++i) {
			digits.add(0);
		}
		
		for(int i=num2.length()-1; i>=0; --i) {
			int c = num2.length() - i - 1;
			for(int j=num1.length()-1; j>=0; --j) {
				int t = ((int) num1.charAt(j) - 48) * ((int) num2.charAt(i) - 48);
				
				int currentSum = digits.get(c) + t%10;
				if(currentSum > 9) {
					digits.set(c, currentSum % 10);
					digits.set(c+1, digits.get(c+1) + (currentSum - (currentSum % 10)) / 10);
				}
				else {
					digits.set(c, currentSum);
				}
				
				int carriedSum = digits.get(c+1) + (t-(t%10))/10;
				if(carriedSum > 9) {
					digits.set(c+1, carriedSum % 10);
					digits.set(c+2, digits.get(c+2) + (carriedSum - (carriedSum % 10)) / 10);
				}
				else {
					digits.set(c+1, carriedSum);
				}
				
				++c;
			}
		}
		
		StringBuilder st = new StringBuilder();
		boolean initialZeros = true;
		for(int i=digits.size()-1; i>=0; --i) {
			if(!(initialZeros && digits.get(i) == 0)) {
				initialZeros = false;
				st.append(digits.get(i));
			}
		}
		
		if(st.length() == 0) {
			return "0";
		}
		return st.toString();
	}
}
