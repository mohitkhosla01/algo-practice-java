package easy;

public class MissingNumber {

	public static void main(String[] args) {
		
		// int[] nums = {3,0,1};
		// int[] nums = {9,6,4,2,3,5,7,0,1};
		// int[] nums = {0};
		// int[] nums = {1};
		int[] nums = {1,2,3};
		
		System.out.println(new MissingNumber().missingNumber(nums));
	}

	public int missingNumber(int[] nums) {
		
		int expectedSum = (nums.length * (nums.length + 1))/2;
		int actualSum = 0;
		
		for(int i=0; i<nums.length; ++i) {
			actualSum += nums[i];
		}
		
		return expectedSum - actualSum;
	}
}
