package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class NextPermutation {

	public static void main(String[] args) {

		int[][] arrArr = {
				{1,3,3,6},
				{1,3,7,6},
				{1,3,4,2},
				{1,3,4,6},
				{1,3,3,2},
				{2,3,3,5},
				{2,3,3,1},
				{2,3,5,1},
				{4,3,2,1},
				{1,2},
				{1}
		};

		for(int[] arr : arrArr) {
			ArrayList<Integer> A = new ArrayList<Integer>();
			for(int a : arr) {
				A.add(a);
			}

			ArrayList<Integer> B = new ArrayList<Integer>();
			for(int a : arr) {
				B.add(a);
			}

			for(int b : B) {
				System.out.print(b + " ");
			}
			System.out.print("\t");
			ArrayList<Integer> nextPerm = new NextPermutation().nextPermutation(A);
			for(int a : nextPerm) {
				System.out.print(a + " ");
			}
			System.out.println();
		}
	}

	public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(A.get(A.size()-1));

		int smallerNumPos = -1;

		for(int i=A.size()-2; i>=0; --i) {
			if(A.get(i) < A.get(i+1)) {
				smallerNumPos = i;
				break;
			}
			else {
				arr.add(A.get(i));
			}
		}

		if(smallerNumPos == -1) {
			Collections.sort(A);
		}
		else {
			int smallestNum = Integer.MAX_VALUE;
			int smallestNumIndex = -1;
			for(int i=0; i<arr.size(); ++i) {
				if(arr.get(i) > A.get(smallerNumPos) && smallestNum > arr.get(i)) {
					smallestNum = arr.get(i);
					smallestNumIndex = i;
				}
			}
			
			arr.remove(smallestNumIndex);
			arr.add(A.get(smallerNumPos));
			A.set(smallerNumPos, smallestNum);
			
			Collections.sort(arr);
			int c=0;
			
			for(int i=smallerNumPos+1; i<A.size(); ++i) {
				A.set(i, arr.get(c++));
			}
		}
		return A;
	}
}
