package strings;

public class Pangram {

	public static void main(String[] args) {
		
		// String s = "The quick brown fox jumps over the lazy dog";
		String s = "The quick brown fox jump over the lazy dog";
		
		System.out.println(new Pangram().pangram(s));
	}
	
	public boolean pangram(String s) {
		
		int[] ch = new int[26];
		
		for(int i=0; i<s.length(); ++i) {
			if(s.charAt(i) >= 65 && s.charAt(i) <= 90) {
				ch[s.charAt(i) - 65] = 1;
			}
			else if(s.charAt(i) >= 97 && s.charAt(i) <= 122) {
				ch[s.charAt(i) - 97] = 1;
			}
		}
		
		for(int i=0; i<ch.length; ++i) {
			if(ch[i] == 0) {
				return false;
			}
		}
		
		return true;
	}
}
