package easy;

public class MaximumProductOfThreeNumbers {

	public static void main(String[] args) {
		
		MaximumProductOfThreeNumbers obj = new MaximumProductOfThreeNumbers();
		
		int[][] numsArr = {
				null,
				{},
				{1,2,3},
				{1,2,3,4},
				{0,1,5,6,8},
				{5,9,2,3,4},
				{9,4,3,80,4},
				{-4,-3,-2,-1,60}
		};

		for(int[] nums : numsArr) {
			System.out.println(obj.maximumProduct(nums));
		}
	}
	
	public int maximumProduct(int[] nums) {
		
		if(nums == null || nums.length < 3) {
			return 0;
		}
		
		int largest = Math.max(nums[0], Math.max(nums[1], nums[2]));
		int largest3 = Math.min(nums[0], Math.min(nums[1], nums[2]));
		int largest2 = (nums[0] + nums[1] + nums[2]) - largest - largest3;
		
		int min = largest2, min2 = largest3;
		
		for(int i=3; i<nums.length; ++i) {
			if(nums[i] > largest) {
				largest3 = largest2;
				largest2 = largest;
				largest = nums[i];
			}
			else if(nums[i] > largest2) {
				largest3 = largest2;
				largest2 = nums[i];
			}
			else if(nums[i] > largest3) {
				largest3 = nums[i];
			}
			
			if(nums[i] < min) {
				min2 = min;
				min = nums[i];
			}
			else if(nums[i] < min2) {
				min2 = nums[i];
			}
		}
		
		return largest * (((largest2 * largest3) > (min * min2)) ? (largest2 * largest3) : (min * min2));
	}
}
