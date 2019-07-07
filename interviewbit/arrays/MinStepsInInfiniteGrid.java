package arrays;

import java.util.ArrayList;

public class MinStepsInInfiniteGrid {

	public static void main(String[] args) {
		
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(0);
		A.add(1);
		A.add(1);
		
		ArrayList<Integer> B = new ArrayList<Integer>();
		B.add(0);
		B.add(1);
		B.add(2);
		
		int count = new MinStepsInInfiniteGrid().coverPoints(A, B);
		System.out.println(count);
	}
	
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
    	
    	int count = 0;
    	
    	for(int i=0; i<A.size()-1; ++i) {
    		int x1 = Math.abs(A.get(i+1) - A.get(i));
    		int y1 = Math.abs(B.get(i+1) - B.get(i));
    		
    		if(x1 == y1) {
    			count += x1;
    		}
    		else {
    			count += Math.max(x1, y1);
    		}
    	}
    	
    	return count;
    }
}
