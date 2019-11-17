package definition;

import java.util.HashMap;
import java.util.Map;

public class TimeMap {
	
	Map<String, Map<Integer, String>> map;
	
    public TimeMap() {
        map = new HashMap<String, Map<Integer, String>>();
    }
    
    public void set(String key, String value, int timestamp) {
    	Map<Integer, String> innerMap = null;
    	
        if(map.containsKey(key)) {
        	innerMap = map.get(key);
        }
        else {
        	innerMap = new HashMap<Integer, String>();
        }
        innerMap.put(timestamp, value);
        map.put(key, innerMap);
    }
    
    public String get(String key, int timestamp) {
        
    	if(!map.containsKey(key)) {
    		return "";
    	}
    	else {
    		Map<Integer, String> innerMap = map.get(key);
    		
    		for(int i=timestamp; i>=1; --i) {
    			if(innerMap.containsKey(i)) {
    				return innerMap.get(i);
    			}
    		}
    		
    		return "";
    	}
    }
    
    public static void main(String[] args) {
    	
    	TimeMap obj = new TimeMap();
    	
//    	obj.set("foo","bar",1);
//    	System.out.println(obj.get("foo",1));
//    	System.out.println(obj.get("foo",3));
//    	obj.set("foo","bar2",4);
//    	System.out.println(obj.get("foo",4));
//    	System.out.println(obj.get("foo",5));
    	
    	obj.set("love","high",10);
    	obj.set("love","low",20);
    	System.out.println(obj.get("love",5));
    	System.out.println(obj.get("love",10));
    	System.out.println(obj.get("love",15));
    	System.out.println(obj.get("love",20));
    	System.out.println(obj.get("love",25));
    }
}
