package general;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyQueries {
	
	static List<Integer> freqQuery(int[][] queries) {

    	List<Integer> output = new ArrayList<Integer>();
    	
    	Map<Integer, Integer> inputs = new HashMap<Integer, Integer>();
    	Map<Integer, Integer> counts = new HashMap<Integer, Integer>();
    	
    	for(int i=0; i<queries.length; ++i) {
    		int query = queries[i][0];
    		int num = queries[i][1];
    		
    		if(query == 1) {
    			if(inputs.get(num) != null) {
    				int oldCount = inputs.get(num);
    				int newCount = inputs.get(num) + 1;
    				
    				inputs.put(num, newCount);
    				
    				if(counts.get(oldCount) == 1) {
    					counts.remove(oldCount);
    				}
    				else {
    					counts.put(oldCount, counts.get(oldCount) - 1);
    				}
    				
    				counts.put(newCount, counts.get(newCount) != null ? counts.get(newCount) + 1 : 1);
    			}
    			else {
    				inputs.put(num, 1);
    				
    				counts.put(1, counts.containsKey(1) ? counts.get(1) + 1 : 1);
    			}
    		}
    		else if(query == 2) {
    			if(inputs.get(num) != null) {
    				int oldCount = inputs.get(num);
    				int newCount = inputs.get(num) - 1;
    				
    				if(inputs.get(num) == 1) {
    					inputs.remove(num);
    				}
    				else {
        				inputs.put(num, newCount);
        			}
    				
    				if(counts.get(oldCount) == 1) {
    					counts.remove(oldCount);
    				}
    				else {
    					counts.put(oldCount, counts.get(oldCount) - 1);
    				}
    				
    				counts.put(newCount, counts.get(newCount) != null ? counts.get(newCount) + 1 : 1);
    			}
    		}
    		else {
    			output.add(counts.containsKey(num) ? 1 : 0);
    		}
    	}

    	return output;
    }
}
