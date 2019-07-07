package general;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class birthdayCandles {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		
		for(int i=0;i<n;++i){
			arr.add(sc.nextInt());
		}
		
		System.out.println(Collections.frequency(arr, Collections.max(arr)));
		
		sc.close();
	}
}
