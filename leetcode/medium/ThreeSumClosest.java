package medium;

import java.util.Arrays;

public class ThreeSumClosest {

	// ** Needs to be worked upon **

	public static void main(String[] args) {

		int[][] numsArr = {
				{0, 1, 2},
				{-1, 2, 1, -4},
				{-3, -2, 1, 5, 8},
				{6, 7, 8, 9, 4, 3, -2, -1},
				{6, 7, 8, 9, 4, 3, -1},
				{6, 7, 8, 9, 4, -3, -1},
				{-6, 7, 8, 9, 4, -3, -1},
				{7, 8, 4},
				{1, 7, 8, 4},
				{-1, 7, 8, -4}
		};

		int target = 0;
		//	int target = 1;
		//	int target = 2;
		
		for(int[] nums : numsArr) {
			System.out.println(new ThreeSumClosest().threeSumClosest(nums, target));
		}
	}

	public int threeSumClosest(int[] nums, int target) {
		Arrays.sort(nums);
		int sum = nums[0] + nums[1] + nums[2];

		for(int i=0; i<nums.length-2; ++i) {

			int left = i+1;
			int right = nums.length-1;

			while(left < right) {
				int localSum = nums[i] + nums[left] + nums[right];
				if(localSum == target) {
					return localSum;
				}
				else if(localSum > target) {
					--right;
				}
				else if(localSum < target) {
					++left;
				}

				if(Math.abs(sum-target) > Math.abs(localSum-target)) {
					sum = localSum;
				}
			}
		}
		
		return sum;
	}
}
