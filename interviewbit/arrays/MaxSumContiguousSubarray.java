package arrays;

import java.util.ArrayList;
import java.util.List;

public class MaxSumContiguousSubarray {

	public static void main(String[] args) {

		List<Integer> A = new ArrayList<Integer>();
//		A.add(-2);
//		A.add(1);
//		A.add(-3);
//		A.add(4);
//		A.add(-1);
//		A.add(2);
//		A.add(1);
//		A.add(-5);
//		A.add(4);
		
		A.add(11);
		A.add(13);
		A.add(-3);
		A.add(-35);
		A.add(5);
		A.add(2);
		A.add(9);
		A.add(10);
		A.add(-4);

		int sum = new MaxSumContiguousSubarray().maxSubArray(A);
		System.out.println(sum);
	}
	
    public int maxSubArray(final List<Integer> A) {
    	
    	int seriesMax = A.get(0);
    	int max = A.get(0);
    	
    	for(int i=1; i<A.size(); ++i) {
    		
    		seriesMax += A.get(i);
    		
    		if(A.get(i) > seriesMax) {
    			seriesMax = A.get(i);
    		}
    		
    		if(seriesMax > max) {
    			max = seriesMax;
    		}
    	}
    	
    	return max;
    }
}
