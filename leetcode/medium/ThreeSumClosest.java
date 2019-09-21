package medium;

import java.util.Arrays;

public class ThreeSumClosest {
	
	// ** Needs to be worked upon **

	public static void main(String[] args) {

		int[] nums = {-1, 2, 1, -4};
//		int[] nums = {-3, -2, 1, 5, 8};
//		int[] nums = {6, 7, 8, 9, 4, 3, -2, -1};
//		int[] nums = {6, 7, 8, 9, 4, 3, -1};
//		int[] nums = {6, 7, 8, 9, 4, -3, -1};
//		int[] nums = {-6, 7, 8, 9, 4, -3, -1};
//		int[] nums = {7, 8, 4};
//		int[] nums = {1, 7, 8, 4};
//		int[] nums = {-1, 7, 8, -4};

		int target = 1;
//		int target = 2;

		System.out.println(new ThreeSumClosest().threeSumClosest(nums, target));
	}

	public int threeSumClosest(int[] nums, int target) {
		
		// {-4, -1, 2, 1}    1

		Arrays.sort(nums);

		// boolean diffSet = false;
		// int diff = 0;
		int sum = 0;
		// int beginAns = 0, midAns = 0, endAns = 0;
		int result = nums[0] + nums[1] + nums[2] ;
		int begin = 0, mid = 1, end = nums.length - 1;

		for(int i=0; i<nums.length - 2; ++i) {
			while(mid < end) {
//				int max = Math.max((nums[begin] + nums[mid] + nums[end]), target);
//				int min = Math.min((nums[begin] + nums[mid] + nums[end]), target);
//				int localDiff = max - min;
//				System.out.println("localDiff: " + localDiff);
//				
//				if((!diffSet) || (diff > localDiff)) {
//					diffSet = true;
//					
//					diff = localDiff;
//					sum = nums[begin] + nums[mid] + nums[end];
//					beginAns = nums[begin];
//					midAns = nums[mid];
//					endAns = nums[end];
//				}
//
//				if(diff > target) {
//					--end;
//				}
//				else {
//					++mid;
//				}
				
				 sum = nums[begin] + nums[mid] + nums[end];
				 
				 if ( sum == target ) {
					 return sum;
				 }
				 else if ( sum > target ) {
					 end--;
				 }
				 else {
					 mid++;
				 }
				 
				 if ( Math.abs(target - result)  > Math.abs( target- (sum))) {
					 result = sum;
				 }
				 
			}
			++begin;
			++mid;
		}

		//System.out.println(beginAns + " " + midAns + " " + endAns);
		return sum;
	}
}
