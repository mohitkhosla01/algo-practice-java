package strings;

import java.util.ArrayList;
import java.util.Scanner;

public class password {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		
		for(int i=0;i<n;++i){
			arr.add(sc.next());
		}
		
		for(int i=0;i<n;++i){
			StringBuilder sb=new StringBuilder(arr.get(i));
			sb=sb.reverse();
			if(arr.contains(sb.toString())){
				System.out.println(sb.length());
				System.out.println(sb.charAt(sb.length()/2));
				break;
			}
		}
		
		sc.close();
	}
}
