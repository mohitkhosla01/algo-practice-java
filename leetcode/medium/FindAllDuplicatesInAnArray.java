package medium;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInAnArray {

	public static void main(String[] args) {
		
		int[] nums = {2,2};
		List<Integer> repeatingNums = new FindAllDuplicatesInAnArray().findDuplicates(nums);
		
		for(int i=0; i<repeatingNums.size(); ++i) {
			System.out.print(repeatingNums.get(i) + " ");
		}
	}

	public List<Integer> findDuplicates(int[] nums) {
		
		List<Integer> repeatingNums = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; ++i) {
			int index = Math.abs(nums[i]) - 1;
			if(nums[index] < 0) {
				repeatingNums.add(Math.abs(nums[i]));
			}
			else {
				nums[index] = nums[index] * - 1;
			}
		}
		
		return repeatingNums;
	}
}
