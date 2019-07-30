package medium;

public class JumpGame {

	public static void main(String[] args) {
		
		int[] nums = {2,3,1,1,4}; // true
		// int[] nums = {3,2,1,0,4}; // false
		// int[] nums = {2,5,0,0}; // true
		// int[] nums = {3,0,8,2,0,0,1}; // true
		// int[] nums = {0,1}; // false
		System.out.println(new JumpGame().canJump(nums));
	}

	public boolean canJump(int[] nums) {
		
		int n = nums.length - 1;
		int highest = -1;
		
		int i = 0;
		while(i < nums.length) {
			if(nums[i] > highest) {
				highest = nums[i];
			}
			
			if(nums[i] >= n) {
				return true;
			}
			else if(nums[i] == 0 && highest == 0) {
				return false;
			}
			
			++i;
			--highest;
			--n;
		}
		return true;
	}
}
