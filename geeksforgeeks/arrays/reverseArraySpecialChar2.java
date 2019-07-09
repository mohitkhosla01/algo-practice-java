package arrays;

public class reverseArraySpecialChar2 {

	public static void main(String[] args) {
		
		// https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
		// better than reverseArraySpecialChar
		
		String s = "ab*c$d*ef#";
		char[] ch = s.toCharArray();

		int left = 0, right = ch.length - 1;
		
		while(left < right) {
			if(! Character.isAlphabetic(ch[left])) {
				++left;
			}
			else if(! Character.isAlphabetic(ch[right])) {
				--right;
			}
			else {
				char temp = ch[left];
				ch[left] = ch[right];
				ch[right] = temp;
				++left;
				--right;
			}
		}
		
		for(int i=0; i<ch.length; ++i) {
			System.out.print(ch[i]);
		}
	}
}
