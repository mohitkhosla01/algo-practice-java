package medium;

import java.util.ArrayList;

public class ReverseWordsInAString {

	public static void main(String[] args) {
		
		String[] lines = {
				"the sky is blue",
				"  hello world!  ",
				"a good   example",
				"a",
				"abcde",
				"    a",
				"    a    ",
				"    xyz    ",
				" ",
				""
		};
		
		for(String line : lines) {
			System.out.println(new ReverseWordsInAString().reverseWords(line));
		}
	}

	public String reverseWords(String s) {
		
		ArrayList<String> words = new ArrayList<String>();
		int begin = 0;
		boolean findingWord = false;
		
		for(int i = 0; i < s.length(); ++i) {
			if(findingWord && s.charAt(i) == 32) {
				String word = s.substring(begin, i);
				words.add(word);
				findingWord = false;
			}
			else if(findingWord && i == s.length() - 1) {
				String word = s.substring(begin, s.length());
				words.add(word);
			}
			else if(!findingWord && s.charAt(i) != 32) {
				begin = i;
				findingWord = true;
			}
			
			if(findingWord && i == s.length() - 1 && words.size() == 0) {
				String word = s.substring(begin, s.length());
				words.add(word);
			}
		}
		
		StringBuilder sb = new StringBuilder();
		for(int i = words.size() - 1; i >= 0; --i) {
			sb.append(words.get(i));
			if(i != 0) {
				sb.append(" ");
			}
		}
		
		return sb.toString();
	}
}
