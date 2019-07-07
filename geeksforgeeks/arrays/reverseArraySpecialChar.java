package general;

public class reverseArraySpecialChar {

	public static void main(String[] args) {
		
		// https://www.geeksforgeeks.org/reverse-an-array-without-affecting-special-characters/
		
		String s = "ab*c$d*ef#";
		char[] ch = s.toCharArray();
		
		char []temp = new char[s.length()];
		int pos = 0;
		
		for(int i=0; i<ch.length; ++i) {
			if(ch[i] >= 97 && ch[i] <= 122) {
				temp[pos] = ch[i];
				++pos;
			}
		}
		
		for(int i=0; i<ch.length; ++i) {
			if(ch[i] >= 97 && ch[i] <= 122) {
				ch[i] = temp[pos-1];
				--pos;
			}
		}
		
		for(int i=0; i<ch.length; ++i) {
			System.out.print(ch[i]);
		}
	}
}
