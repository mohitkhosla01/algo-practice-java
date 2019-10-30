package easy;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {
		
		int[][] numsArr = {
				{2,7,11,15},
				{3,7,5,20,15,4,12,19,9},
				{3,2,4},
				{3,3}
		};
		
		int[] targetArr = {9,28,6,6};
		
		for(int i=0; i<numsArr.length; ++i) {
			int[] ans = new TwoSum().twoSum(numsArr[i], targetArr[i]);
			System.out.println(ans[0] + " " + ans[1]);
		}
	}
	
	public int[] twoSum_Sol1(int[] nums, int target) { // 1st solution
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; ++i) {
			hm.put(nums[i], i);
		}
		
		int[] ans = new int[2];

		for(int i=0; i<nums.length; ++i) {
			int val = target - nums[i];
			if(hm.containsKey(val) && i != hm.get(val)) {
				ans[0] = i;
				ans[1] = hm.get(val);
				break;
			}
		}
		
		return ans;
    }
	
	public int[] twoSum(int[] nums, int target) { // 2nd solution
		
		int[] ans = new int[2];
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0; i<nums.length; ++i) {
			int val = target - nums[i];
			if(hm.containsKey(val)) {
				ans[0] = hm.get(val);
				ans[1] = i;
				break;
			}
			
			hm.put(nums[i], i);
		}
		
		return ans;
    }
}
