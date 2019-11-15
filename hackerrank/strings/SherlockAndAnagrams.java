package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SherlockAndAnagrams {

    public static void main(String[] args) {
    	
    	String[] sArr = {
    		"abba",
    		"abcd",
    		"ifailuhkqq",
    		"kkkk"
    	};
    	
    	for(String s : sArr) {
    		System.out.println(sherlockAndAnagrams(s));
    	}
    }
    
    static int sherlockAndAnagrams(String s) {

    	Map<String, Integer> substrings = new HashMap<String, Integer>();
    	
    	for(int i=0; i<s.length(); ++i) {
    		List<Character> ch = new ArrayList<Character>();
    		
    		for(int j=i; j<s.length(); ++j) {
    			ch.add(s.charAt(j));
    			String substring = sortString(ch);
    			
    			if(substrings.containsKey(substring)) {
    				substrings.put(substring, substrings.get(substring)+1);
    			}
    			else {
    				substrings.put(substring, 1);
    			}
    		}
    	}
    	
    	int count = 0;
    	
    	for(Map.Entry<String, Integer> entry : substrings.entrySet()) {
    		count += permutations(entry.getValue());
    	}
    	
    	return count;
    }
    
    static String sortString(List<Character> ch) {
    	
    	Collections.sort(ch);
    	
    	StringBuilder sb = new StringBuilder();
    	for(int i=0; i<ch.size(); ++i) {
    		sb.append(ch.get(i));
    	}
    	
    	return sb.toString();
    }
    
    static int permutations(int n) {
    	
    	int sum = 1;
    	for(int i=n; i>n-2; --i) {
    		sum *= i;
    	}
    	
    	return sum/2;
    }
}
