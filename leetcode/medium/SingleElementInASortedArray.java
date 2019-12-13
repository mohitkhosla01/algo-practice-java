package medium;

public class SingleElementInASortedArray {

	public static void main(String[] args) {
		SingleElementInASortedArray obj = new SingleElementInASortedArray();
		
		int[][] numsArr = {
			null,
			{},
			{0,1,1},
			{4,5,5},
			{1,1,2,3,3,4,4,8,8},
			{3,3,7,7,10,11,11},
			{3,3,7,7,10,10,11,11,12},
			{1,3,3,7,7,10,10,11,11,12,12},
			{1,1,3,3,7,7,10,10,11,11,12,13,13,14,14}
		};

		for(int[] nums : numsArr) {
			System.out.println(obj.singleNonDuplicate(nums));
		}
	}
	
	public int singleNonDuplicate(int[] nums) {
		
		if(nums == null || nums.length == 0) {
			return -1;
		}
		else if(nums.length == 1) {
			return nums[0];
		}
		
		int start = 0, end = nums.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			
			if(mid != 0 && mid != nums.length-1 && nums[mid] != nums[mid-1] && nums[mid] != nums[mid+1]) {
				return nums[mid];
			}
			else if(mid == 0 && mid != nums.length-1 && nums[mid] != nums[mid+1]) {
				return nums[mid];
			}
			else if(mid != 0 && mid == nums.length-1 && nums[mid] != nums[mid-1]) {
				return nums[mid];
			}
			else {
				if(mid != 0 && nums[mid] == nums[mid-1]) {
					if((mid-1) % 2 != 0) {
						end = mid-2;
					}
					else {
						start = mid+1;
					}
				}
				else if(mid != nums.length-1 && nums[mid] == nums[mid+1]) {
					if(mid % 2 != 0) {
						end = mid-1;
					}
					else {
						start = mid+2;
					}
				}
			}
		}
		
		return -1;
	}
}
