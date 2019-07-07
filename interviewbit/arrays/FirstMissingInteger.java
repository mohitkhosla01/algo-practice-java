package arrays;

import java.util.ArrayList;

public class FirstMissingInteger {

	public static void main(String[] args) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		A.add(1);
		
		System.out.println(new FirstMissingInteger().firstMissingPositive(A));
	}
	
    public int firstMissingPositive(ArrayList<Integer> A) {
    	
    	int n = A.size();
    	int[] B = new int[n];
    	
    	for(int i=0; i<n; ++i) {
    		if(A.get(i) > 0 && A.get(i) <= n) {
    			B[A.get(i)-1] = 1;
    		}
    	}
    	
    	for(int i=0; i<n; ++i) {
    		if(B[i] == 0) {
    			return (i+1);
    		}
    	}
    	
    	return (n+1);
    }
}
