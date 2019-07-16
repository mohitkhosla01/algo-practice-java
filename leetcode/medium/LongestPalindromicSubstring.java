package medium;

public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		System.out.println(new LongestPalindromicSubstring().longestPalindrome("aaabaaaa"));
	}

	public String longestPalindrome(String s) {
		
		if(s.length() == 0) {
			return "";
		}
		else {
			String sp = "" + s.charAt(0);
			
			for(int i=0; i<s.length(); ++i) {
				
				int b = i;
				int e = s.length()-1;
				
				int b0 = b;
				int e0 = e;
				
				boolean palinMatch = false;
				
				while(e0 > b0) {
					
					if(s.charAt(b0) == s.charAt(e0)) {
						if(!palinMatch) {
							e = e0;
						}
						palinMatch = true;
						++b0;
						--e0;
					}
					else {
						palinMatch = false;
						b0 = b;
						--e0;
					}
				}
				
				if(palinMatch) {
					String st = s.substring(b, e+1);
					if(st.length() > sp.length()) {
						sp = st;
					}
				}
			}
			
			for(int i=0; i<s.length(); ++i) {
				
				int b = 0;
				int e = s.length()- i - 1;
				
				int b0 = b;
				int e0 = e;
				
				boolean palinMatch = false;
				
				while(e0 > b0) {
					
					if(s.charAt(b0) == s.charAt(e0)) {
						if(!palinMatch) {
							b = b0;
						}
						palinMatch = true;
						++b0;
						--e0;
					}
					else {
						palinMatch = false;
						e0 = e;
						++b0;
					}
				}
				
				if(palinMatch) {
					String st = s.substring(b, e+1);
					if(st.length() > sp.length()) {
						sp = st;
					}
				}
			}
			
			return sp;
		}
	}
}
