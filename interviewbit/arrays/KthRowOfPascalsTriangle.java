package arrays;

import java.util.ArrayList;

public class KthRowOfPascalsTriangle {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4,5};
		for(int num : nums) {

			ArrayList<Integer> list = new KthRowOfPascalsTriangle().getRow(num);
			for(int j=0; j<list.size(); ++j) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}

	public ArrayList<Integer> getRow(int A) {
		
		if(A >= 0) {
			ArrayList<ArrayList<Integer>> lists = new ArrayList<ArrayList<Integer>>();
			
			for(int i=0; i<=A; ++i) {
				ArrayList<Integer> list = new ArrayList<Integer>();
				
				for(int j=0; j<=i; ++j) {
					if(j == 0 || j == i) {
						list.add(1);
					}
					else {
						list.add(lists.get(i-1).get(j-1) + lists.get(i-1).get(j));
					}
				}
				
				lists.add(list);
			}
			
			return lists.get(lists.size()-1);
		}
		else {
			return null;
		}
	}
}
