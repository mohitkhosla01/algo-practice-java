package easy;

import java.util.ArrayList;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		// String s = "A man, a plan, a canal: Panama";
		// String s = "race a car";
		// String s = "mohit";
		// String s = "tomamot";
		// String s = "to Mamo,t";
		// String s = "t3o Mamo,2t";
		// String s = "t2o Mamo,2t";
		// String s = "";
		String s = null;

		System.out.println(new ValidPalindrome().isPalindrome(s));
	}
	
    public boolean isPalindrome(String s) {
    	
    	if(s == null) {
    		return true;
    	}
        
    	ArrayList<Character> arr = new ArrayList<Character>();
    	
    	for(int i=0; i<s.length(); ++i) {
    		char ch = s.charAt(i);
    		if((ch >= 48 && ch <= 57) || (ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122)) {
    			if(ch >= 65 && ch <= 90) {
    				arr.add((char)((int)ch + 32));
    			}
    			else {
    				arr.add(ch);
    			}
    		}
    	}
    	
    	for(int i=0; i<arr.size()/2; ++i) {
    		if(arr.get(i) != arr.get(arr.size()-i-1)) {
    			return false;
    		}
    	}
    	
    	return true;
    }
}
