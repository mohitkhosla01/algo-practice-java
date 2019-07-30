package easy;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

	public static void main(String[] args) {
		
		String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		String[] banned = {"hit"};
		System.out.println(new MostCommonWord().mostCommonWord(paragraph, banned));
	}

	public String mostCommonWord(String paragraph, String[] banned) {

		paragraph = paragraph.toLowerCase();
		paragraph = paragraph.concat(" ");
		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		int start = 0;
		boolean newWord = true;

		for(int i=0; i<paragraph.length(); ++i) {
			
			if(newWord && !(paragraph.charAt(i) >= 97 && paragraph.charAt(i) <= 122)) {
				newWord = false;
				String word = paragraph.substring(start, i);
				if(hm.containsKey(word)) {
					hm.put(word, hm.get(word) + 1);
				}
				else {
					hm.put(word, 1);
				}
			}
			else if(!newWord && (paragraph.charAt(i) >= 97 && paragraph.charAt(i) <= 122)) {
				newWord = true;
				start = i;
			}
		}
		
		for(int i=0; i<banned.length; ++i) {
			if(hm.containsKey(banned[i])) {
				hm.remove(banned[i]);
			}
		}
		
		int count = 0;
		String countString = null;
		
		for(Map.Entry<String, Integer> entry : hm.entrySet()) {
			if(entry.getValue() > count) {
				count = entry.getValue();
				countString = entry.getKey();
			}
		}

		return countString == null ? "" : countString;
	}
}
