package algorithms;

public class MergeSort {

	public static void main(String[] args) {
	
		int[][] arrArr = {
				{},
				{5},
				{8,7,6,9,2,1},
				{3,7,1,2,8,6},
				{3,7,1,2,3,6},
				{3,7,1,2,3,6,9,0},
				{0,0,0,1,1,1},
				{9,2},
				{9}
		};
		
		for(int[] arr : arrArr) {
			mergeSort(arr, 0, arr.length-1);
			if(arr != null) {
				for(int i=0; i<arr.length; ++i) {
					System.out.print(arr[i] + " ");
				}
			}
			System.out.println();
		}
	}
	
	public static void mergeSort(int[] arr, int begin, int end) {
		
		if(begin < end) {
			int mid = (begin + end)/2;
			mergeSort(arr, begin, mid);
			mergeSort(arr, mid+1, end);
			
			int[] arr2 = merge(arr, begin, mid, end);
			for(int i=begin, j=0; i<=end; ++i, ++j) {
				arr[i] = arr2[j];
			}
		}
	}
	
	public static int[] merge(int[] arr, int begin, int mid, int end) {
		
		int[] arr2 = new int[end - begin + 1];
		int c=0;
		
		int begin1 = begin;
		int begin2 = mid+1;
		
		while(begin1 <= mid && begin2 <= end) {
			if(arr[begin1] < arr[begin2]) {
				arr2[c] = arr[begin1];
				++begin1;
			}
			else if(arr[begin1] >= arr[begin2]) {
				arr2[c] = arr[begin2];
				++begin2;
			}
			++c;
		}
		
		while(begin1 <= mid) {
			arr2[c] = arr[begin1];
			++begin1;
			++c;
		}
		
		while(begin2 <= end) {
			arr2[c] = arr[begin2];
			++begin2;
			++c;
		}
		
		return arr2;
	}
}
