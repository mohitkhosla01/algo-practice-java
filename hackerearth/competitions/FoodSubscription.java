package competitions;

import java.util.ArrayList;
import java.util.Scanner;

public class FoodSubscription {
	
	// ** Rebel Foods **
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		for(int i=0; i<n; ++i) {
			arr.add(sc.nextInt());
		}
		
		if(n == 30) {
			System.out.println(2499);
		}
		else {
			int amount=0;
			int i=0;
			
			while(i < n) {
				boolean weekFlag = false;
				
				if((i+3) < n) {
					int j=6;
					inner : for(j=6; j>=3; --j) {
						if(arr.contains((arr.get(i))+j) && ((arr.indexOf((arr.get(i))+j)-i)>=3)) {
							amount += 699;
							i = arr.indexOf(arr.get(i)+j)+1;
							weekFlag = true;
							break inner;
						}
					}
				}
				
				if(weekFlag == false) {
					amount += 199;
					++i;
				}
			}
			
			System.out.println(amount);
		}
		
		sc.close();
	}
}
