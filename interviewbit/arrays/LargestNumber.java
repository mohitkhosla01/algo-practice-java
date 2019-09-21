package arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {

		List<Integer> A = new ArrayList<Integer>();
//		A.add(3);
//		A.add(30);
//		A.add(34);
//		A.add(5);
//		A.add(9);
//		A.add(81);
		
//		A.add(8);
//		A.add(89);
		
//		A.add(0);
//		A.add(0);
//		A.add(0);
//		A.add(0);
//		A.add(0);
		
//		A.add(1);
//		A.add(0);
//		A.add(2);
//		A.add(3);
//		A.add(4);
		
		A.add(8);
		A.add(0);
		A.add(0);
		A.add(89);

		System.out.println(new LargestNumber().largestNumber(A));
	}

    public String largestNumber(final List<Integer> A) {
        
    	boolean nonZero = false;
        List<Integer> B = new ArrayList<Integer>();
        for(int a : A) {
        	if(a != 0) {
        		nonZero = true;
        	}
        	B.add(a);
        }
        if(!nonZero) {
        	B.clear();
        	B.add(0);
        }
        
        Collections.sort(B, new Comparator<Integer>(){
            
            @Override
            public int compare(Integer x, Integer y) {
                
                String s1 = ""+x+y;
                String s2 = ""+y+x;
                if(s1.compareTo(s2) > 0) {
                    return -1;
                }
                else {
                    return 1;
                }
            }
        });
        
        StringBuilder sb = new StringBuilder();
        for(int b : B) {
            sb.append(b);
        }
        
        return sb.toString();
    }
}
