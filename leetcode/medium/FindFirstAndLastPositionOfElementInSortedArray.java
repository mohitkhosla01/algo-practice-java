package medium;

public class FindFirstAndLastPositionOfElementInSortedArray {

	public static void main(String[] args) {

		FindFirstAndLastPositionOfElementInSortedArray obj = new FindFirstAndLastPositionOfElementInSortedArray();

		int[][] nums = {
				{},
				null,
				{1,2,3},
				{1,2,3},
				{1,2,3},
				{1,2,3},
				{5,7,7,8,8,10},
				{5,7,7,8,8,8,8,8,10},
				{5,8,8,8,8,8,8,8,10},
				{5,7,7,8,8,10},
				{1,2,3,3,3,4,5},
				{1,2,3,3,3,4,5},
				{1,2,3,3,3,4,5},
				{1,2,3,3,4,4,4},
				{1,2,3,3,3,4,4},
				{1,2,3,3,3,3,4},
				{1,1},
				{1,2},
				{1,1},
				{1,2},
				{1},
				{2},
				{2}
		};

		int[] target = {
				1,
				1,
				1,
				2,
				3,
				4,
				8,
				8,
				8,
				6,
				4,
				5,
				1,
				4,
				4,
				4,
				1,
				1,
				2,
				2,
				1,
				1,
				2
		};

		for(int i=0; i<nums.length; ++i) {
			int[] range = obj.searchRange(nums[i], target[i]);
			System.out.println(range[0] + " " + range[1]);
		}
	}

	public int[] searchRange(int[] nums, int target) {

		int[] range = {-1, -1};

		if(nums != null && nums.length > 0) {
			int begin = 0, end = nums.length - 1;

			boolean leftExists = false;

			while(begin <= end) {
				int mid = (begin + end)/2;

				if(nums[mid] == target) {

					if(!leftExists) {
						if(mid == 0 || nums[mid-1] != target) {
							if(mid == 0) {
								range[0] = 0;
							}
							else {
								range[0] = mid;
							}
							begin = mid;
							end = nums.length - 1;
							leftExists = true;
						}
						else {
							end = mid;
						}
					}
					else {
						if(mid == nums.length - 1) {
							range[1] = nums.length - 1;
							break;
						}
						else if(nums[mid+1] != target) {
							range[1] = mid;
							break;
						}
						else {
							begin = mid + 1;
						}
					}
				}
				else if(nums[mid] > target) {
					end = mid - 1;
				}
				else {
					begin = mid + 1;
				}
			}
		}

		return range;
	}
}
