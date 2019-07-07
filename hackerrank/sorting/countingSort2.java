package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class countingSort2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<n;++i){
			arr.add(sc.nextInt());
		}
		
		Collections.sort(arr);
		
		for(int i=0;i<n;++i){
			System.out.print(arr.get(i)+" ");
		}
		
		sc.close();
	}
}
