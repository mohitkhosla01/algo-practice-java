package easy;

public class LongestCommonPrefix {

	public static void main(String[] args) {

		String[][] strsArray = {
				{"aac","cab","abb"},
				{"ca","a"},
				{"","b"},
				{"flower","flow","flight"},
				{"dog","racecar","car"},
				{"","",""},
				{"ab","abcd","abcd","abc","abc","abc"},
				{"aac","aaca","baca","aac"},
				null,
				{},
				{"aa","a"},
				{"ba","b"},
				{"ab",null,"abcd","abc","abc","abc"}
		};

		for(String[] strs : strsArray) {
			System.out.println(new LongestCommonPrefix().longestCommonPrefix(strs));
		}
	}

	public String longestCommonPrefix(String[] strs) {

		if(strs == null || strs.length == 0) {
			return "";
		}

		char[] ch = null;

		int shortestLength = Integer.MAX_VALUE;
		for(String str : strs) {
			if(str == null) {
				return "";
			}
			else if(shortestLength > str.length()) {
				shortestLength = str.length();
				ch = str.toCharArray();
			}
		}

		int c = ch.length;

		for(int i=0; i<strs.length; ++i) {
			inner : for(int j=0, chj=0; j<strs[i].length() && chj<ch.length; ++j, ++chj) {

				if(strs[i].charAt(j) != ch[chj]) {
					if(c > j) {
						c = j;
					}
					break inner;
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for(int i=0; i<c; ++i) {
			sb.append(ch[i]);
		}

		return sb.toString();
	}
}
