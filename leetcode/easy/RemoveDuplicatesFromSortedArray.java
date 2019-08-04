package easy;

public class RemoveDuplicatesFromSortedArray {

	public static void main(String[] args) {

		// int[] nums = {};
		// int[] nums = {1,1};
		// int[] nums = {1,2};
		// int[] nums = {0,0,0,0,0,0,0};
		int[] nums = {0,0,1,1,1,2,2,3,3,4};
		System.out.println(new RemoveDuplicatesFromSortedArray().removeDuplicates(nums));
	}

	public int removeDuplicates(int[] nums) {

		if(nums.length == 0) {
			return 0;
		}
		else {
			int lastCorrect = 0;

			for(int i=1; i<nums.length; ++i) {
				if(nums[i] == nums[lastCorrect]) {
					nums[i] = Integer.MIN_VALUE;
				}
				else {
					lastCorrect = i;
				}
			}

			boolean currentNegative = false;
			int negativeIndex = -1;
			int correctCounter = 1;

			for(int i=1; i<nums.length; ++i) {
				if(nums[i] == Integer.MIN_VALUE) {
					if(!currentNegative) {
						currentNegative = true;
						negativeIndex = i;
					}
				}
				else {
					if(currentNegative) {
						int t = nums[i];
						nums[i] = nums[negativeIndex];
						nums[negativeIndex] = t;
						++negativeIndex;
					}
					++correctCounter;
				}
			}

			return correctCounter;
		}
	}
}
