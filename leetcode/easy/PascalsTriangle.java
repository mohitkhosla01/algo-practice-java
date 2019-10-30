package easy;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {

	public static void main(String[] args) {
		
		// int numRows = 5;
		// int numRows = 2;
		// int numRows = 0;
		// int numRows = 1;
		// int numRows = 20;
		int numRows = 33;
		
		List<List<Integer>> lists = new PascalsTriangle().generate(numRows);
		for(int i=0; i<lists.size(); ++i) {
			
			List<Integer> list = lists.get(i);
			for(int j=0; j<list.size(); ++j) {
				System.out.print(list.get(j) + " ");
			}
			System.out.println();
		}
	}

	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> lists = new ArrayList<List<Integer>>();
		
		if(numRows != 0) {
			for(int i=1; i<=numRows; ++i) {
				List<Integer> list = new ArrayList<Integer>();
				
				for(int j=1; j<=i; ++j) {
					if(j == 1 || j == i) {
						list.add(1);
					}
					else {
						list.add(lists.get(i-2).get(j-2) + lists.get(i-2).get(j-1));
					}
				}
				
				lists.add(list);
			}
		}
		
		return lists;
	}
}
