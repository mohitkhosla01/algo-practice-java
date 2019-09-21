package easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class IntersectionOfTwoArrays {

	public static void main(String[] args) {
		
//		int[] nums1 = {1,2,2,1};
//		int[] nums2 = {2,2};
		
//		int[] nums1 = {9,2,0,4,1,8};
//		int[] nums2 = {3,2,1};
		
//		int[] nums1 = {3,5,2,1};
//		int[] nums2 = {9,1};
		
//		int[] nums1 = {3,5,2,1};
//		int[] nums2 = {9,8};
		
//		int[] nums1 = {};
//		int[] nums2 = {};
		
//		int[] nums1 = {0};
//		int[] nums2 = {1};
		
		int[] nums1 = {0};
		int[] nums2 = {0};
		
		int[] ans = new IntersectionOfTwoArrays().intersection(nums1, nums2);
		for(int i=0; i<ans.length; ++i) {
			System.out.print(ans[i] + " ");
		}
		System.out.println();
	}

	public int[] intersection(int[] nums1, int[] nums2) {

		HashSet<Integer> nums1hs = new HashSet<Integer>();
		HashSet<Integer> nums2hs = new HashSet<Integer>();

		for(int i=0; i<nums1.length; ++i) {
			nums1hs.add(nums1[i]);
		}
		for(int i=0; i<nums2.length; ++i) {
			nums2hs.add(nums2[i]);
		}
		
		HashSet<Integer> smallerHs = nums1hs.size() > nums2hs.size() ? nums2hs : nums1hs;
		HashSet<Integer> biggerHs = nums1hs.size() > nums2hs.size() ? nums1hs : nums2hs;
		int[] ans = new int[smallerHs.size()];
		int c = 0;
		
		Iterator<Integer> it = smallerHs.iterator();
		while(it.hasNext()) {
			Integer i = it.next();
			if(biggerHs.contains(i)) {
				ans[c++] = i;
			}
		} 
		
		return Arrays.copyOf(ans, c);
	}
}
