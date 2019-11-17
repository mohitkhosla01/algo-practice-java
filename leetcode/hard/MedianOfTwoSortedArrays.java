package hard;

public class MedianOfTwoSortedArrays {

	public static void main(String[] args) {
		
		int[][] nums1Arr = {
				null,
				{},
				null,
				{},
				{1,4,6,8},
				{1,4,6,8},
				{1,3},
				{1,2},
				{1,3,5,6,7,8},
				{1,3,5,6,7,8,9}
		};
		
		int[][] nums2Arr = {
				null,
				{},
				{1,4,6,8},
				{1,4,6,8},
				null,
				{},
				{2},
				{3,4},
				{1,4,6,8},
				{12,13,15,16,17}
		};
		
		for(int i=0; i<nums1Arr.length; ++i) {
			System.out.println(new MedianOfTwoSortedArrays().findMedianSortedArrays(nums1Arr[i], nums2Arr[i]));
		}
	}

	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		
		if(nums1 == null && nums2 == null) {
			return 0;
		}
		else if(nums1 == null) {
			return (nums2.length % 2 != 0) ? 
					nums2[nums2.length/2] : ((double)(nums2[nums2.length/2] + nums2[(nums2.length/2) - 1]))/2;
		}
		else if(nums2 == null) {
			return (nums1.length % 2 != 0) ? 
					nums1[nums1.length/2] : ((double)(nums1[nums1.length/2] + nums1[(nums1.length/2) - 1]))/2;
		}
		else if (nums1.length == 0 && nums2.length == 0) {
			return 0;
		}

		int[] arr = new int[nums1.length + nums2.length];
		
		int cutoff = arr.length/2;
		
		for(int i=0, j=0, k=0; i<nums1.length || j<nums2.length; ++k) {
			if(i == nums1.length) {
				arr[k] = nums2[j];
				++j;
			}
			else if(j == nums2.length) {
				arr[k] = nums1[i];
				++i;
			}
			else {
				if(nums1[i] < nums2[j]) {
					arr[k] = nums1[i];
					++i;
				}
				else {
					arr[k] = nums2[j];
					++j;
				}
			}
			
			if(k == cutoff) {
				break;
			}
		}
		
		return (arr.length % 2 != 0) ? arr[cutoff] : ((double)(arr[cutoff-1] + arr[cutoff]))/2;
	}
}
