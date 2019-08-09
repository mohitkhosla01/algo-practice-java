package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
public class ThreeSum {

	public static void main(String[] args) {

		int []nums = {-1, 0, 1, 2, -1, -4};
		Arrays.sort(nums);

		List<List<Integer>> solSets = new ThreeSum().threeSum(nums);
		
		for(int i=0; i<solSets.size(); ++i) {
			
			List<Integer> solSet = solSets.get(i);
			
			if(solSet.size()>1) {
				System.out.print("[");
				for(int j=0; j<solSet.size()-1; ++j) {
					System.out.print(solSet.get(j)+",");
				}
				System.out.println(solSet.get(solSet.size()-1)+"]");
			}
			else {
				System.out.println("[]");
			}
		}
	}

	public List<List<Integer>> threeSum(int[] nums) {
		
		List<List<Integer>> solSets = new ArrayList<List<Integer>>();

		if(nums.length >= 3) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for(int i=0; i<nums.length; ++i) {
				hs.add(nums[i]);
			}

			for(int i=0; i<nums.length; ++i) {
				for(int j=i+1; j<nums.length; ++j) {
					if(hs.contains((nums[i] + nums[j]) * -1)) {
						List<Integer> solSet = new ArrayList<Integer>();
						solSet.add(nums[i]);
						solSet.add(nums[j]);
						solSet.add((nums[i] + nums[j]) * -1);
						solSets.add(solSet);
						hs.remove(nums[i]);
						hs.remove(nums[j]);
						hs.remove((nums[i] + nums[j]) * -1);
					}
				}
			}
		}
		
		return solSets;
	}
}
