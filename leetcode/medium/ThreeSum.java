package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ThreeSum {

	public static void main(String[] args) {

		// int[] nums = {-1, 0, 1, 2, -1, -4};
		// int[] nums = {5,9,-5,8,-4,2,1,0,-1,-9,-4};
		// int[] nums = {-2,0,0,2,2};
		int[] nums = {-5,-1,-1,6,6};
		
		List<List<Integer>> lists = new ThreeSum().threeSum(nums);
		for(List<Integer> list : lists) {
			for(Integer val : list) {
				System.out.print(val + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		if(nums == null || nums.length < 3) {
			return lists;
		}
		
		Arrays.sort(nums);
		
		for(int i=0; i<nums.length-2; ++i) {
			
			if(nums[i] > 0) {
				break;
			}
			if(i != 0 && nums[i] == nums[i-1]) {
				continue;
			}
			
			int left = i+1;
			int right = nums.length-1;
			
			while(left < right) {
				
				if(right != nums.length-1 && nums[right] == nums[right+1]) {
					--right;
				}
				else {
					int sum = nums[i] + nums[left] + nums[right];
					if(sum == 0) {
						List<Integer> list = new ArrayList<Integer>();
						list.add(nums[i]);
						list.add(nums[left]);
						list.add(nums[right]);
						lists.add(list);
						++left;
						--right;
					}
					else if(sum < 0) {
						++left;
					}
					else {
						--right;
					}
				}
			}
		}
		
		return lists;
	}
}