package arrays;

import java.util.ArrayList;

public class PascalTriangle {

	public static void main(String[] args) {
		
		// int A = 4;
		// int A = 10;
		// int A = 2;
		// int A = 1;
		int A = 0;
		
		ArrayList<ArrayList<Integer>> arrArr = new PascalTriangle().solve(A);
		
		for(int i=0; i<arrArr.size(); ++i) {
			ArrayList<Integer> arr = arrArr.get(i);
			for(int a : arr) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}
	
	public ArrayList<ArrayList<Integer>> solve(int A) {
		ArrayList<ArrayList<Integer>> arrArr = new ArrayList<ArrayList<Integer>>();
		
        if(A<1) {
            return arrArr;
        }
        
        for(int i=0; i<A; ++i) {
            ArrayList<Integer> arr = new ArrayList<Integer>();
            
            if(i==0) {
                arr.add(1);
            }
            else {
                for(int j=0; j<=i; ++j) {
                    if(j==0) {
                        arr.add(1);
                    }
                    else {
                        if(arrArr.get(i-1).size() <= j) {
                        	arr.add(1);
                        }
                        else {
                        	arr.add(arrArr.get(i-1).get(j) + arrArr.get(i-1).get(j-1));
                        }
                    }
                }
            }
            arrArr.add(arr);
        }
        
        return arrArr;
    }
}
