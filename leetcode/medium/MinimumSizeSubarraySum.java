package medium;

public class MinimumSizeSubarraySum {

	public static void main(String[] args) {
		
		int [][] numsArr = {
				null,
				{},
				{2,3,1,2,4,3},
				{2,3,1,2,3},
				{8,2,3,1,2,3},
				{2,3,1}
		};

		int s = 7;
		
		for(int[] nums : numsArr) {
			System.out.println(new MinimumSizeSubarraySum().minSubArrayLen(s, nums));
		}
	}

	public int minSubArrayLen_Sol1(int s, int[] nums) {

		int minSumLength = 0;
		
		if(nums == null) {
			return minSumLength;
		}
		
		for(int i=0; i<nums.length; ++i) {
			int localSum = 0;
			
			inner: for(int j=i; j<nums.length; ++j) {
				localSum += nums[j];
				if(localSum >= s && (minSumLength == 0 || (minSumLength > (j-i+1)))) {
					minSumLength = j-i+1;
					break inner;
				}
			}
		}
		
		return minSumLength;
	}
	
	public int minSubArrayLen(int s, int[] nums) {

		int minSumLength = 0;
		
		if(nums == null) {
			return minSumLength;
		}
		
		int sum = 0;
		int left = 0, right = 0;
		
		while(right < nums.length) {
			sum += nums[right];
			
			if(sum >= s) {
				for(int pos=left; pos<right; ++pos) {
					if(sum - nums[pos] >= s) {
						sum -= nums[pos];
						left = pos+1;
					}
					else {
						break;
					}
				}
				
				int sumLength = right - left + 1;
				if(minSumLength == 0 || minSumLength > sumLength) {
					minSumLength = sumLength;
				}
			}
			
			++right;
		}
		
		return minSumLength;
	}
}
