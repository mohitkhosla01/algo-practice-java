package algorithms;

public class SortAnArrayOf0s1s2s {

	public static void main(String[] args) {
		
		int[][] arrArr = {
				{2,0,1,1,0,1,2,1,2,0,0,0,2},
				{0,1,2,0,1,2},
				{0,1,1,0,1,2,1,2,0,0,0,1}
		};
		
		for(int[] arr : arrArr) {
			sortArray(arr);
			
			for(int i=0; i<arr.length; ++i) {
				System.out.print(arr[i] + " ");
			}
			System.out.println();
		}
	}
	
	public static void sortArray(int[] arr) {
		
		int left = 0;
		int mid = 0;
		int right = arr.length - 1;
		
		while(mid <= right) {
			if(arr[mid] == 2) {
				int temp = arr[mid];
				arr[mid] = arr[right];
				arr[right] = temp;
				--right;
			}
			else if(arr[mid] == 0) {
				int temp = arr[mid];
				arr[mid] = arr[left];
				arr[left] = temp;
				++left;
				++mid;
			}
			else {
				++mid;
			}
		}
	}
}
