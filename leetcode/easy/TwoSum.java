package easy;

import java.util.Scanner;

public class TwoSum {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int []nums = new int[n];
		for(int i=0; i<n; ++i) {
			nums[i] = sc.nextInt();
		}
		
		int target = sc.nextInt();
		int [] ans = new TwoSum().twoSum(nums, target);
		System.out.println(ans[0] + " " + ans[1]);
		
		sc.close();
	}
	
	public int[] twoSum(int[] nums, int target) {
        
		int []arr = new int[2];
		
		o: for(int i=0; i<nums.length; ++i) {
			for(int j=0; j<nums.length; ++j) {
				if(i != j){
					if(target == (nums[i]+nums[j])) {
						arr[0] = i;
						arr[1] = j;
						break o;
					}
				}
			}
		}
        
        return arr;
    }
}
