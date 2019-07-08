package easy;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class MoveZeros {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		sc.nextLine();

		int[] arr = new int[n];

		for(int i=0; i<n; ++i) {
			arr[i] = sc.nextInt();
		}
		
		new MoveZeros().moveZeroes(arr);

		sc.close();
	}

	public void moveZeroes(int[] arr) {
		
		int n = arr.length;
		Queue<Integer> zeroPos = new LinkedList<Integer>();

		for(int i=0; i<n; ++i) {
			if(arr[i] == 0) {
				zeroPos.add(i);
			}
			else {
				if(zeroPos.size() > 0) {
					arr[zeroPos.peek()] = arr[i];
					arr[i] = 0;
					zeroPos.remove();
					--i;
				}
			}
		}
		
		for(int i=0; i<n; ++i) {
			System.out.print(arr[i]+" ");
		}
	}
}
