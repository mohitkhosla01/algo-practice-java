package medium;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		
		SearchInRotatedSortedArray obj = new SearchInRotatedSortedArray();
		
		int[][] numsArr = {
				null,
				{},
				{4,5,6,7,0,1,2},
				{4,5,6,7,0,1,2},
				{4,5,6,7,0,1,2},
				{4,5,6,7,0,1,2},
				{4,5,6,7,0,1,2},
				{4,5,6,7,0,1,2},
				{5,1,3},
				{5,1,3},
				{5,1,3},
				{3,1},
				{5,1,2,3,4}
		};
		
		int[] targetArr = {
				1,
				1,
				0,
				1,
				2,
				4,
				5,
				3,
				5,
				1,
				3,
				1,
				1
		};
		
		int[] expectedArr = {
				-1,
				-1,
				4,
				5,
				6,
				0,
				1,
				-1,
				0,
				1,
				2,
				1,
				1
		};

		for(int i=0; i<numsArr.length; ++i) {
			System.out.println(obj.search(numsArr[i], targetArr[i]) == expectedArr[i] ? true : false);
		}
	}

	public int search(int[] nums, int target) {
		
		if(nums == null || nums.length == 0) {
			return -1;
		}
		
		int start = 0, end = nums.length-1;
		
		while(start <= end) {
			int mid = (start+end)/2;
			// System.out.println(nums[mid]);
			
			if(nums[mid] == target) {
				return mid;
			}
			else {
				if(nums[mid] > nums[start]) {
					if(mid != 0 && nums[start] <= target && nums[mid-1] >= target) {
						end = mid - 1;
					}
					else {
						start = mid + 1;
					}
				}
				else {
					if(mid != nums.length-1 && nums[end] >= target && nums[mid+1] <= target) {
						start = mid + 1;
					}
					else {
						end = mid - 1;
					}
				}
			}
		}
		
		return -1;
	}
}
