package easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
	
	public static void main(String[] args) {
		
		HappyNumber happyNumber = new HappyNumber();
		
		System.out.println(happyNumber.isHappy(19));
		System.out.println(happyNumber.isHappy(25));
		System.out.println(happyNumber.isHappy(31));
		System.out.println(happyNumber.isHappy(-31));
	}
	
    public boolean isHappy(int n) {
    	Set<Integer> hs = new HashSet<Integer>();
    	
    	while(true) {
    		int t = 0;
    		
    		while(n != 0) {
    			int r = n%10;
    			t += (r*r);
    			n /= 10;
    		}
    		
    		if(t == 1) {
    			return true;
    		}
    		else if(hs.contains(t)) {
    			return false;
    		}
    		else {
    			hs.add(t);
    			n = t;
    		}
    	}
    }
}
