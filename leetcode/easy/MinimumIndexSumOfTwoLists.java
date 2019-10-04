package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MinimumIndexSumOfTwoLists {

	public static void main(String[] args) {
		
//		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//		String[] list2 = {"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
		
//		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
//		String[] list2 = {"KFC", "Shogun", "Burger King"};
		
		String[] list1 = {"Shogun", "Tapioca Express", "Burger King", "KFC"};
		String[] list2 = {"Tapioca Express", "Shogun", "Burger King"};
		
		String[] commonInterest = new MinimumIndexSumOfTwoLists().findRestaurant(list1, list2);
		
		for(String s : commonInterest) {
			System.out.print(s + "\t");
		}
		System.out.println();
	}

	public String[] findRestaurant(String[] list1, String[] list2) {
		
		int minIndex = Integer.MAX_VALUE;
		List<String> arr = new ArrayList<String>();
		
		Map<String, Integer> hm1 = new HashMap<String, Integer>();
		Map<String, Integer> hm2 = new HashMap<String, Integer>();
		
		for(int i=0; i<list1.length; ++i) {
			hm1.put(list1[i], i);
		}
		for(int i=0; i<list2.length; ++i) {
			hm2.put(list2[i], i);
		}
		
		Map<String, Integer> shortMap = list1.length < list2.length ? hm1 : hm2;
		Map<String, Integer> longMap = list1.length < list2.length ? hm2 : hm1;
		
		for(Map.Entry<String, Integer> entry : shortMap.entrySet()) {
			if(longMap.containsKey(entry.getKey())) {
				if(minIndex > (entry.getValue() + longMap.get(entry.getKey()))) {
					minIndex = entry.getValue() + longMap.get(entry.getKey());
					arr.clear();
					arr.add(entry.getKey());
				}
				else if(minIndex == (entry.getValue() + longMap.get(entry.getKey()))) {
					arr.add(entry.getKey());
				}
			}
		}
		
		String[] commonInterest = new String[arr.size()];
		for(int i=0; i<arr.size(); ++i) {
			commonInterest[i] = arr.get(i);
		}
		
		return commonInterest;
	}
}
