package easy;

public class RotateArray {

	public static void main(String[] args) {
		
//		int[] nums = {1,2,3,4,5,6,7};
//		int k = 3;
		
		int[] nums = {-1,-100,3,99};
		int k = 2;
		
		new RotateArray().rotate(nums, k);
		
		for(int i=0; i<nums.length; ++i) {
			System.out.print(nums[i] + " ");
		}
	}

	public void rotate(int[] nums, int k) {
		
		int l = nums.length;
		int[] nums2 = new int[l];
		
		for(int i=0; i<l; ++i) {
			nums2[i] = nums[i];
		}
		
		for(int i=0; i<l; ++i) {
			nums[(i+k)%l] = nums2[i];
		}
	}
}
