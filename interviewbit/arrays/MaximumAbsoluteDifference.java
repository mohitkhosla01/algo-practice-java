package arrays;

import java.util.ArrayList;

public class MaximumAbsoluteDifference {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();	
//		A.add(5);
//		A.add(8);
//		A.add(-3);
//		A.add(1);
		A.add(3);
		A.add(-1);
		
		System.out.print(new MaximumAbsoluteDifference().maxArr(A));
	}
	
    public int maxArr(ArrayList<Integer> A) {
    	
    	int sum = Integer.MIN_VALUE;
    	
    	for(int i=0; i<A.size(); ++i) {
    		for(int j=i+1; j<A.size(); ++j) {
    			int t = Math.abs(A.get(i)-A.get(j)) + Math.abs((i+1)-(j+1));
    			if(t > sum) {
    				sum = t;
    			}
    		}
    	}
    	
    	return sum;
    }
}
