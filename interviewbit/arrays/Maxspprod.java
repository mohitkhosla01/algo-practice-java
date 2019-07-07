package arrays;

import java.util.ArrayList;

public class Maxspprod {
	
	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(6);
		A.add(7);
		A.add(9);
		A.add(5);
		A.add(5);
		A.add(8);
		
		System.out.println(new Maxspprod().maxSpecialProduct(A));
	}
	
    public int maxSpecialProduct(ArrayList<Integer> A) {
        
    	if(A.size() < 3) {
    		return 0;
    	}
    	else {
    		int sum = 0;
    		
    		for(int i=A.size()-2; i>0; --i) {
    			
    			int rightLargestIndex = 0;
    			for(int j=i+1; j<A.size(); ++j) {
    				if(A.get(j) > A.get(i)) {
    					rightLargestIndex = j;
    					break;
    				}
    			}
    			
    			int leftLargestIndex = 0;
    			for(int j=i-1; j>=0; --j) {
    				if(A.get(j) > A.get(i)) {
    					leftLargestIndex = j;
    					break;
    				}
    			}
    			
    			int tempSum = leftLargestIndex * rightLargestIndex;
    			// System.out.println(leftLargestIndex + " " + rightLargestIndex + " " + tempSum);
    			if(tempSum > sum) {
    				sum = tempSum;
    			}
    		}
    		return sum;
    	}
    }
}
