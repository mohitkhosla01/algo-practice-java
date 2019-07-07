package general;

import java.util.Scanner;
import java.util.HashSet;

public class beautifulTriplets {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int d=sc.nextInt();
		
		int []arr=new int[n];
		HashSet<Integer> hs=new HashSet<Integer>();
		
		for(int i=0;i<n;++i){
			int x=sc.nextInt();
			arr[i]=x;
			hs.add(x);
		}
		
		int c=0;
		
		for(int i=0;i<n;++i){
			if(hs.contains((arr[i])+d) && hs.contains((arr[i])+(d*2))){
				++c;
			}
		}
		
		System.out.println(c);
		
		sc.close();
	}
}
