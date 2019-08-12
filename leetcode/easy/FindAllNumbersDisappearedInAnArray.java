package easy;

import java.util.ArrayList;
import java.util.List;

public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {

		// int[] nums = {4,3,2,7,8,2,3,1};
		// int[] nums = {};
		int[] nums = {2,3,4,3};
		
		List<Integer> missingNumList = new FindAllNumbersDisappearedInAnArray().findDisappearedNumbers(nums);
		for(Integer missingNumber : missingNumList) {
			System.out.print(missingNumber + " ");
		}
	}

	public List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> missingNumberList = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; ++i) {
			int index = Math.abs(nums[i]) - 1;
			nums[index] = nums[index] > 0 ? (nums[index] * - 1) : nums[index];
		}

		for(int i=0; i<nums.length; ++i) {
			if(nums[i] > 0) {
				missingNumberList.add(i+1);
			}
		}

		return missingNumberList;
	}
}