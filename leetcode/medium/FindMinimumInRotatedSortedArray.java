package medium;

public class FindMinimumInRotatedSortedArray {

	public static void main(String[] args) {

		FindMinimumInRotatedSortedArray obj = new FindMinimumInRotatedSortedArray();

		int[][] numsArr = {
				null,
				{4,5,6,7,0,1,2},
				{6,7,0,1,2,3,4},
				{1,2,3,4,5,6,7,0},
				{25,35,40,50,10,15},
				{100,200,300,400,70,80,90,91,92,93,94,95,96,97,98,99},
				{6},
				{1},
				{1,2},
				{2,1},
				{2,3,4,5,1},
				{3,4,5,1,2},
				{1,2,3,4,5}
		};

		for(int[] nums : numsArr) {
			System.out.println(obj.findMin(nums));
		}
	}

	public int findMin(int[] nums) {
		if(nums == null) {
			return -1;
		}
		else if(nums.length == 1) {
			return nums[0];
		}
		int min = helper(nums, 0, nums.length - 1);
		return min != -1 ? min : nums[0];
	}

	public int helper(int[] arr, int begin, int end) {
		
		if(begin > end) {
			return -1;
		}

		int mid = (begin + end) / 2;

		if(mid == 0) {
			if(arr[0] > arr[1]) {
				return arr[1];
			}
		}
		else if(mid == arr.length-1) {
			if(arr[mid-1] > arr[mid]) {
				return arr[mid];
			}
		}
		else if(arr[mid-1] > arr[mid]) {
			return arr[mid];
		}
		else if(arr[mid] > arr[mid+1]){
			return arr[mid+1];
		}
		else {
			if(begin != mid-1) {
				int minL = helper(arr, begin, mid-1);
				if(minL != -1) {
					return minL;
				}
			}
			if(end != mid+1) {
				int minR = helper(arr, mid+1, end);
				if(minR != -1) {
					return minR;
				}
			}
		}

		return -1;
	}
}
