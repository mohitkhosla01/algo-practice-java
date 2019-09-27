package strings;

public class Pangrams {

	public static void main(String[] args) {

		String[] sArr = {
				"The quick brown fox jumps over the lazy dog",
				"The quick brown fox jump over the lazy dog",
				"We promptly judged antique ivory buckles for the next prize",
				"We promptly judged antique ivory buckles for the prize"
		};

		for(String s : sArr) {
			System.out.println(pangrams(s));
		}
	}

	static String pangrams(String s) {

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
				return "not pangram";
			}
		}

		return "pangram";
	}
}
