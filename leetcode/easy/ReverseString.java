package easy;

public class ReverseString {

	public static void main(String[] args) {
		
		char[] s = {'h','e','l','l','o'};
		// char[] s = {"H","a","n","n","a","h"};
		
		new ReverseString().reverseString(s);
	}
	
    public void reverseString(char[] s) {
    	
    	for(int i=0; i<s.length/2; ++i) {
    		s[i] = s[s.length - i - 1];
    		s[s.length - i - 1] = s[i];
    	}
    	
    	for(int i=0; i<s.length; ++i) {
    		System.out.print(s[i] + " ");
    	}
    }
}
