package medium;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		String s = "abcabcbb";
		// String s = "bbbbb";
		// String s = "pwwkew";
		// String s ="dvdf";
		// String s = "tmmzuxt";
		System.out.println(new LongestSubstringWithoutRepeatingCharacters().lengthOfLongestSubstring(s));
	}

	public int lengthOfLongestSubstring(String s) {

		if(s.length() == 0) {
			return 0;
		}
		else if(s.length() == 1) {
			return 1;
		}
		else {
			int b=0, e=1;
			int maxDiff = 1;
			HashSet<Character> hs = new HashSet<Character>();

			while(e != s.length()) {
				hs.add(s.charAt(b));
				
				if(!hs.contains(s.charAt(e)) && s.charAt(b) != s.charAt(e)) {
					hs.add(s.charAt(e));
					++e;
				}
				else {
					while(b != e) {
						if(s.charAt(b) == s.charAt(e)) {
							++b;
							++e;
							break;
						}
						else {
							hs.remove(s.charAt(b));
							++b;
						}
					}
					if(b == e) {
						++e;
					}
				}

				if((e - b) > maxDiff) {
					maxDiff = e - b;
				}
			}

			return maxDiff;
		}
	}
}
