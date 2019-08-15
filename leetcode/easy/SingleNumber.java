package easy;

public class SingleNumber {

	public static void main(String[] args) {
		
		// int[] nums = {2,2,1};
		// int[] nums = {4,1,2,1,2};
		// int[] nums = {-1,3,2,-1,3};
		int[] nums = {-1,5,0,-1,0};
		
		System.out.println(new SingleNumber().singleNumber(nums));
	}

	public int singleNumber(int[] nums) {

		int ans = nums[0];
		for(int i=1; i<nums.length; ++i) {
			ans = ans ^ nums[i];
		}
		
		return ans;
	}
}
