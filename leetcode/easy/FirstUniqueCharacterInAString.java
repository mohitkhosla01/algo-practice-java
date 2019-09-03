package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FirstUniqueCharacterInAString {
	
	public static void main(String[] args) {
		
		String s = "leetcode";
		// String s = "loveleetcode";
		// String s = "";
		// String s = "mohit";
		// String s = "mmhitoohit";
		// String s = null;
		// String s = "aadadaad";
		
		System.out.println(new FirstUniqueCharacterInAString().firstUniqChar(s));
	}
	
    public int firstUniqChar(String s) {
    	
    	if(s == null) {
    		return -1;
    	}
    	
    	Map<Character, Integer> hm = new HashMap<Character, Integer>();
    	Set<Character> hs = new HashSet<Character>();
    	int index = Integer.MAX_VALUE;
    	
    	for(int i=0; i<s.length(); ++i) {
    		Character ch = s.charAt(i);
    		
    		if(hm.containsKey(ch)) {
    			hm.remove(ch);
    			hs.add(ch);
    		}
    		else if(!hs.contains(ch)) {
    			hm.put(ch, i);
    		}
    	}
    	
    	for(Map.Entry<Character, Integer> entry : hm.entrySet()) {
    		if(index > entry.getValue()) {
    			index = entry.getValue();
    		}
    	}
    	
    	if(index == Integer.MAX_VALUE) {
    		return -1;
    	}
    	return index;
    }
}
