package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class minimumAbsoluteDifference {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);

		int n=sc.nextInt();

		ArrayList<Integer> arr=new ArrayList<Integer>();
		int c=Integer.MAX_VALUE;

		for(int i=0;i<n;++i){
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=1;i<arr.size();++i){
			if(Math.abs(arr.get(i)-arr.get(i-1))<c){
				c=Math.abs(arr.get(i)-arr.get(i-1));
			}
		}

		System.out.println(c);
		
		sc.close();
	}
}
