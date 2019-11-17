package medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MergeIntervals {

	public static void main(String[] args) {
		
		// int[][] intervals = null;
		int[][] intervals = {};
		// int[][] intervals = {{},{}};
		// int[][] intervals = {{2,4},{1,5}};
		// int[][] intervals = {{1,5},{2,4}};
		// int[][] intervals = {{1,3},{2,6}};
		// int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
		// int[][] intervals = {{1,4},{4,5}};
		// int[][] intervals = {{-3,-2},{-11,5},{7,8},{11,15},{1,2}};

		int[][] newIntervals = new MergeIntervals().merge(intervals);
		for(int i=0; i<newIntervals.length; ++i) {
			System.out.println(newIntervals[i][0] + " " + newIntervals[i][1]);
		}
	}
	
	public int[][] merge(int[][] intervals) {
		if(intervals == null || intervals.length == 0) {
			return new int[0][2];
		}
		
		sort(intervals);
		
		int w = 0;
		for(int i=0; i<intervals.length; ++i) {
			if(intervals[i][0] <= intervals[w][1]) {
				intervals[w][0] = intervals[w][0] < intervals[i][0] ? intervals[w][0] : intervals[i][0];
				intervals[w][1] = intervals[w][1] > intervals[i][1] ? intervals[w][1] : intervals[i][1];
			}
			else {
				++w;
				intervals[w][0] = intervals[i][0];
				intervals[w][1] = intervals[i][1];
			}
		}
		
		int[][] newIntervals = new int[w+1][2];
		for(int i=0; i<=w; ++i) {
			newIntervals[i][0] = intervals[i][0];
			newIntervals[i][1] = intervals[i][1];
		}
		
		return newIntervals;
	}
	

	public int[][] merge_version1(int[][] intervals) {

		Map<Integer, Integer> keyValue = new HashMap<Integer, Integer>();
		Map<Integer, Integer> valueKey = new HashMap<Integer, Integer>();
		
		for(int i=0; i<intervals.length; ++i) {
			int newKey = intervals[i][0], newValue = intervals[i][1];
			
			boolean keyFlag = false, valueFlag = false;
			int oldKey = -1, oldValue = -1;
			int key = -1, value = -1;
			
			for(int j=newKey; j<=newValue; ++j) {
				if(keyValue.containsKey(j)) {
					keyFlag = true;
					oldKey = j;
					break;
				}
				else if(valueKey.containsKey(j)) {
					valueFlag = true;
					oldValue = j;
					break;
				}
			}
			
			if(keyFlag) {
				oldValue = keyValue.get(oldKey);
				keyValue.remove(oldKey);
				valueKey.remove(oldValue);
				
				key = newKey;
				value = newValue > oldValue ? newValue : oldValue;
				keyValue.put(key, value);
				valueKey.put(value, key);
			}
			else if(valueFlag) {
				oldKey = valueKey.get(oldValue);
				valueKey.remove(oldValue);
				
				key = newKey < oldKey ? newKey : oldKey;
				value = newValue;	
			}
			else {
				key = newKey;
				value = newValue;
			}
			
			keyValue.put(key, value);
			valueKey.put(value, key);
		}
		
		int [][] newIntervals = new int[keyValue.size()][2];
		int w = 0;
		
		for(Map.Entry<Integer, Integer> entry : keyValue.entrySet()) {
			newIntervals[w][0] = entry.getKey();
			newIntervals[w][1] = entry.getValue();
			++w;
		}
		
		return newIntervals;
	}
	
	public void sort(int[][] arr) {
		
		for(int i=1; i<arr.length; ++i) {
			if(arr[i][0] < arr[i-1][0]) {
				
				for(int j=i; j>0; --j) {
					if(arr[j][0] < arr[j-1][0]) {
						int leftTemp = arr[j][0];
						int rightTemp = arr[j][1];
						arr[j][0] = arr[j-1][0];
						arr[j][1] = arr[j-1][1];
						arr[j-1][0] = leftTemp;
						arr[j-1][1] = rightTemp;
					}
					else {
						break;
					}
				}
			}
		}
	}
}
