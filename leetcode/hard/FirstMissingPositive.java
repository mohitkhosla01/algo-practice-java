package hard;

public class FirstMissingPositive {

	public static void main(String[] args) {
		
		// int[] nums = {1,2,0};
		// int[] nums = {3,4,-1,1};
		// int[] nums = {7,8,9,11,12};
		// int[] nums = {1,2,3,4,5};
		// int[] nums = {3,4,1,90,-1};
		// int[] nums = {3,7,-1,0,0};
		// int[] nums = {};
		// int[] nums = {-1,-2,3,1,5};
		// int[] nums = {1};
		int[] nums = {2};

		System.out.println(new FirstMissingPositive().firstMissingPositive(nums));
	}

	public int firstMissingPositive(int[] nums) {
		
		for(int i=0; i<nums.length; ++i) {
			if(nums[i] > nums.length || nums[i] < 0) {
				nums[i] = 0;
			}
		}
		
		for(int i=0; i<nums.length; ++i) {
			if(nums[i] != 0) {
				int index = Math.abs(nums[i]) -1;
				if(nums[index] == 0) {
					nums[index] = (index+1) * -1;
				}
				else if(nums[index] > 0) {
					nums[index] = nums[index] * -1;
				}
			}
		}
		
		boolean numberFound = false;
		int missingPositive = 1;
		
		for(int i=0; i<nums.length; ++i) {
			if(nums[i] >= 0) {
				numberFound = true;
				missingPositive = i+1;
				break;
			}
		}
		
		if(numberFound) {
			return missingPositive;
		}
		else {
			return nums.length + 1;
		}
	}
}
