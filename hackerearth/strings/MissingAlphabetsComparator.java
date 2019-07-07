package algorithms.strings;

import java.util.Comparator;
public class MissingAlphabetsComparator implements Comparator {
	
	public int compare(Object o1, Object o2) {
		String s1 = o1.toString();
		String s2 = o2.toString();
		
		for(int i=0; i<s1.length() || i<s2.length(); ++i) {
			
			if(MissingAlphabets.hm.get(s1.charAt(i)) > MissingAlphabets.hm.get(s2.charAt(i))) {
				return 1;
			}
			else if(MissingAlphabets.hm.get(s1.charAt(i)) < MissingAlphabets.hm.get(s2.charAt(i))) {
				return -1;
			}
			else if(i==s1.length()-1) {
				return -1;
			}
			else if(i==s2.length()-1) {
				return 1;
			}
		}
		return -1;
	}
}
