package easy;

public class ReverseString {

	public static void main(String[] args) {
		
		// char[] s = {'h','e','l','l','o'};
		// char[] s = {'H','a','n','n','a','h'};
		// char[] s = {'H'};
		// char[] s = null;
		char[] s = {'A','B'};
		
		new ReverseString().reverseString(s);
		
    	for(int i=0; i<s.length; ++i) {
    		System.out.print(s[i] + " ");
    	}
	}
	
    public void reverseString(char[] s) {
    	
    	if(s != null) {
        	for(int i=0; i<s.length/2; ++i) {
        		char ch = s[s.length - i - 1];
        		s[s.length - i - 1] = s[i];
        		s[i] = ch;
        	}
    	}
    }
}
