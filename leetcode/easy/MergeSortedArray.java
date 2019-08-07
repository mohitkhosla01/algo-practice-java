package easy;

public class MergeSortedArray {

	public static void main(String[] args) {
		
//		int[] nums1 = {1,2,3,0,0,0};
//		int m = 3;
//		int[] nums2 = {2,5,6};
//		int n = 3;
		
//		int[] nums1 = {2,6,8,12,0,0,0,0};
//		int m = 4;
//		int[] nums2 = {1,4,8,11};
//		int n = 4;
		
//		int[] nums1 = {1,0,0,0,0,0};
//		int m = 1;
//		int[] nums2 = {1,2,3,4,5};
//		int n = 5;
		
//		int[] nums1 = {-5,-3,3,0,0};
//		int m = 3;
//		int[] nums2 = {-1,1};
//		int n = 2;
		
//		int[] nums1 = {0,0,0};
//		int m = 0;
//		int[] nums2 = {1,2,3};
//		int n = 3;
		
//		int[] nums1 = {1,0};
//		int m = 1;
//		int[] nums2 = {-1};
//		int n = 1;
		
//		int[] nums1 = {};
//		int m = 0;
//		int[] nums2 = {};
//		int n = 0;
		
		int[] nums1 = {-1,0,0,3,3,3,0,0,0};
		int m = 6;
		int[] nums2 = {1,2,2};
		int n = 3;
		
		new MergeSortedArray().merge(nums1, m, nums2, n);
	}

	public void merge(int[] nums1, int m, int[] nums2, int n) {
		
		int mi = 0;
		int ni = 0;
		
		while(ni != n) {
			if(nums1[mi] >= nums2[ni]) {
				for(int i = (m + ni); i > mi; --i) {
					nums1[i] = nums1[i-1];
				}
				nums1[mi] = nums2[ni];
				++ni;
			}
			else if(m == 0 || ((nums1.length - mi) == (n - ni))) {
				nums1[mi] = nums2[ni];
				++ni;
			}
			++mi;
		}
	}
}
