package greedy;

import java.util.ArrayList;
import java.util.Scanner;

public class beautifulPairs {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		ArrayList<Integer> brr = new ArrayList<Integer>();
		
		for(int i=0;i<n;++i){
			arr.add(sc.nextInt());
		}
		
		for(int i=0;i<n;++i){
			brr.add(sc.nextInt());
		}
		
		int c=0;
		
		for(int i=0;i<arr.size();){
			if(brr.contains(arr.get(i))){
				brr.remove(arr.get(i));
				arr.remove(i);
				++c;
			}
			else{
				++i;
			}
		}
		
		if(!arr.isEmpty()){
			++c;
		}
		else{
            --c;
        }
		
		System.out.println(c);
		
		sc.close();
	}
}
