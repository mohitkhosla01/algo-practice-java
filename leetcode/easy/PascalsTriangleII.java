package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangleII {

	public static void main(String[] args) {
		
		int[] nums = {0,1,2,3,4,5,10,20,30,33};
		for(int num : nums) {

			List<Integer> list = new PascalsTriangleII().getRow(num);
			for(int j=0; j<list.size(); ++j) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}

	public List<Integer> getRow(int rowIndex) {
		
		if(rowIndex >= 0) {
			List<Integer> prevList = new ArrayList<Integer>();
			List<Integer> currentList = null;
			
			for(int i=0; i<=rowIndex; ++i) {
				currentList = new ArrayList<Integer>();
				
				for(int j=0; j<=i; ++j) {
					if(j == 0 || j == i) {
						currentList.add(1);
					}
					else {
						currentList.add(prevList.get(j-1) + prevList.get(j));
					}
				}
				
				prevList = currentList;
			}
			
			return currentList;
		}
		else {
			return null;
		}
	}
}
