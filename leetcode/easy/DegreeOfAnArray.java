package easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DegreeOfAnArray {

	public static void main(String[] args) {
		
		DegreeOfAnArray obj = new DegreeOfAnArray();
		
		int[][] numsArr = {
				null,
				{},
				{1,2,3},
				{1,1,2,3},
				{1,2,3,3},
				{1,2,2,3,1},
				{1,2,2,3,1,4,2}
		};

		for(int[] nums : numsArr) {
			System.out.println(obj.findShortestSubArray(nums));
		}
	}

	public int findShortestSubArray(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return 0;
		}
		else if(nums.length == 1) {
			return 1;
		}
		
		Map<Integer, Integer> frequency = new HashMap<Integer, Integer>();
		
		List<Integer> maxValues = new ArrayList<Integer>();
		int degree = 0;
		
		Map<Integer, List<Integer>> startEndPositions = new HashMap<Integer, List<Integer>>();
		
		for(int i=0; i<nums.length; ++i) {
			if(frequency.containsKey(nums[i])) {
				frequency.put(nums[i], frequency.get(nums[i])+1);
			}
			else {
				frequency.put(nums[i], 1);
			}
			
			if(maxValues.isEmpty() || frequency.get(nums[i]) > degree) {
				maxValues = new ArrayList<Integer>();
				maxValues.add(nums[i]);
				degree = frequency.get(nums[i]);
			}
			else if(frequency.get(nums[i]) == degree) {
				maxValues.add(nums[i]);
			}
			
			if(!startEndPositions.containsKey(nums[i])) {
				List<Integer> startEnd = new ArrayList<Integer>();
				startEnd.add(i);
				startEndPositions.put(nums[i], startEnd);
			}
			else {
				List<Integer> startEnd = startEndPositions.get(nums[i]);
				if(startEnd.size() == 1) {
					startEnd.add(i);
				}
				else {
					startEnd.set(1, i);
				}
				startEndPositions.put(nums[i], startEnd);
			}
		}
		
		int shortestSize = Integer.MAX_VALUE;
		
		for(int i=0; i<maxValues.size(); ++i) {
			List<Integer> startEnd = startEndPositions.get(maxValues.get(i));
			int size = startEnd.size() == 1 ? 1 : startEndPositions.get(maxValues.get(i)).get(1) - startEndPositions.get(maxValues.get(i)).get(0) + 1;
			if(shortestSize > size) {
				shortestSize = size;
			}
		}
		
		return shortestSize;
	}
}
