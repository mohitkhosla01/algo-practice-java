package easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class UniqueNumberOfOccurences {

	public static void main(String[] args) {
		
		int[][] arrArr = {
				{1,2,2,1,1,3},
				{1,2},
				{-3,0,1,-3,1,1,1,-3,10,0},
				{},
				null,
				{1,2,3,4,4,3,2},
				{1,1,3,3,3,9}
		};

		for(int[] arr : arrArr) {
			System.out.println(new UniqueNumberOfOccurences().uniqueOccurrences(arr));
		}
	}

	public boolean uniqueOccurrences(int[] arr) {
		
		if(arr == null) {
			return true;
		}

		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i : arr) {
			if(hm.containsKey(i)) {
				hm.put(i, hm.get(i)+1);
			}
			else {
				hm.put(i, 1);
			}
		}

		Set<Integer> hs = new HashSet<Integer>();
		for(Map.Entry<Integer, Integer> entry : hm.entrySet()) {
			if(hs.contains(entry.getValue())) {
				return false;
			}
			else {
				hs.add(entry.getValue());
			}
		}
		
		return true;
	}
}
