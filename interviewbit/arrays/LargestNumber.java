package arrays;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LargestNumber {

	public static void main(String[] args) {
		
		List<Integer> arr = new ArrayList<Integer>();
		arr.add(3);
		arr.add(30);
		arr.add(34);
		arr.add(5);
		arr.add(9);
		arr.add(81);
		
		new LargestNumber().largestNumber(arr);
		System.out.println("AAA");
	}
	
    public String largestNumber(final List<Integer> A) {
    	
    	LinkedList<String> li = new LinkedList<String>();
    	li.add(""+A.get(0));
    	
    	for(int i=1; i<A.size(); ++i) {
    		String t = ""+A.get(i);
    		
    		for(int j=i-1; j>=0; ++j) {
    			if(li.get(j).charAt(0) > t.charAt(0)) {
    				li.add(j+1, t);
    			}
    			else if(li.get(j).charAt(0) < t.charAt(0)) {
    				li.add(j, t);
    			}
    			else if(li.get(j).charAt(0) == t.charAt(0)) {
        			boolean breakFlag = false;
        			for(int k=1; k<Math.max(li.get(j).length(), t.length()); ++k) {
        				if(li.get(j).length() <= (k+1)) {
        					li.add(j+1, t);
        					breakFlag = true;
        					break;
        				}
        				else if(t.length() <= (k+1)) {
        					li.add(j, t);
        					breakFlag = true;
        					break;
        				}
        				else if(li.get(j).charAt(j) > t.charAt(j)) {
        					li.add(j+1, t);
        					breakFlag = true;
        					break;
        				}
        				else if(t.charAt(j) > li.get(j).charAt(j)) {
        					li.add(j, t);
        					breakFlag = true;
        					break;
        				}
        			} 
        			if(!breakFlag) {
        				li.add(j+1, t);
        			}
        		}
    		}
    	}
		
		for(int i=0; i<li.size(); ++i) {
			System.out.println(li.get(i));
		}
    	
    	return null;
    }
}
