package easy;

import java.util.HashMap;

public class ValidAnagram {

	public static void main(String[] args) {

		String s = "anagram", t = "nagaram";
		// String s = "mohit", t = "mohit";
		// String s = "rat", t = "car";
		// String s = "", t = "";
		// String s = null, t = null;
		// String s = "A", t = null;
		// String s = null, t = "A";

		System.out.println(new ValidAnagram().isAnagram(s, t));
	}

    public boolean isAnagram(String s, String t) {
    	
    	if(s == null && t == null) {
    		return true;
    	}
    	else if(s == null || t == null) {
    		return false;
    	}
        
    	HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    	
    	for(int i=0; i<s.length(); ++i) {	
    		Character ch = s.charAt(i);
    		if(hm.containsKey(ch)) {
    			hm.put(ch, hm.get(ch)+1);
    		}
    		else {
    			hm.put(ch, 1);
    		}
    	}
    	
    	for(int i=0; i<t.length(); ++i) {
    		Character ch = t.charAt(i);
    		if(!hm.containsKey(ch)) {
    			return false;
    		}
    		else if(hm.get(ch) == 1){
    			hm.remove(ch);
    		}
    		else {
    			hm.put(ch, hm.get(ch)-1);
    		}
    	}
    	
    	if(hm.size() == 0) {
    		return true;
    	}
    	else {
    		return false;
    	}
    }
}
