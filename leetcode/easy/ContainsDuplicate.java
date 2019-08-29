package easy;

import java.util.HashSet;

public class ContainsDuplicate {

	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,1};
//		int[] nums = {1,2,3,4};
//		int[] nums = {1,1,1,3,3,4,3,2,4,2};
//		int[] nums = {};
		int[] nums = {3};

		System.out.println(new ContainsDuplicate().containsDuplicate(nums));
	}

	public boolean containsDuplicate(int[] nums) {
		
		HashSet<Integer> hs = new HashSet<Integer>();
		boolean flag = false;
		
		for(int i=0; i<nums.length; ++i) {
			if(hs.contains(nums[i])) {
				flag = true;
				break;
			}
			else {
				hs.add(nums[i]);
			}
		}

		return flag;
	}
}
