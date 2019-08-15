package easy;

public class SingleNumber {

	public static void main(String[] args) {
		
		int[] nums = {2,2,1};
		// int[] nums = {4,1,2,1,2};
		
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
