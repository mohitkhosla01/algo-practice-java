package arrays;

public class Sort0s1s2s {

	public static void main(String[] args) {
		
		// int[] arr = {0, 1, 2, 0, 1};
		// int[] arr = {2, 2, 2, 0, 1, 0, 0, 0, 2, 2, 2, 1, 1};
		int[] arr = {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
		
		new Sort0s1s2s().sortNumbers(arr);
		
		for(int v=0; v<arr.length; ++v) {
			System.out.print(arr[v] + " ");
		}
		System.out.println();
	}
	
	public void sortNumbers(int[] arr) {
		
		int lp = 0, mp = 0, rp = arr.length-1;
		
		while(mp <= rp) {
			if(arr[mp] == 0) {
				int temp = arr[lp];
				arr[lp] = arr[mp];
				arr[mp] = temp;
				++lp;
				++mp;
			}
			else if(arr[mp] == 2) {
				int temp2 = arr[rp];
				arr[rp] = arr[mp];
				arr[mp] = temp2;
				--rp;
			}
			else {
				++mp;
			}
		}
	}
}
