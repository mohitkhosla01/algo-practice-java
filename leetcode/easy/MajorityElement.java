package easy;

import java.util.Arrays;

public class MajorityElement {

	public static void main(String[] args) {
		
		MajorityElement obj = new MajorityElement();
		
		int[][] numsArr = {
				{3,2,3},
				{2,2,1,1,1,2,2},
				{2,2,1,1,1,2,1}
		};

		for(int[] nums : numsArr) {
			System.out.println(obj.majorityElement(nums));
		}
	}

	public int majorityElement(int[] nums) {
		Arrays.sort(nums);
		
		int maxCount = 1, currentCount = 1, majorityElement = nums[0];
		
		if(nums.length == 1) {
			return majorityElement;
		}
		
		for(int i=1; i<nums.length; ++i) {
			if(nums[i] != nums[i-1]) {
				if(currentCount > maxCount) {
					maxCount = currentCount;
					majorityElement = nums[i-1];
				}
				currentCount = 1;
			}
			else {
				++currentCount;
			}
		}
		
		if(currentCount > maxCount) {
			majorityElement = nums[nums.length-1];
		}
		
		return majorityElement;
	}
}
