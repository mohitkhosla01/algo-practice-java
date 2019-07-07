package arrays;

import java.util.ArrayList;

public class MergeIntervals {

	public static void main(String[] args) {
		ArrayList<Interval> intervals = new ArrayList<Interval>();
		
//		intervals.add(new Interval(1, 3));
//		intervals.add(new Interval(6, 9));
//		Interval newInterval = new Interval(2, 5);
		
//		intervals.add(new Interval(1, 2));
//		intervals.add(new Interval(3, 5));
//		intervals.add(new Interval(6, 7));
//		intervals.add(new Interval(8, 10));
//		intervals.add(new Interval(12, 16));
//		Interval newInterval = new Interval(4, 9);
		
		intervals.add(new Interval(1, 2));
		intervals.add(new Interval(3, 7));
		Interval newInterval = new Interval(7, 8);
		
		ArrayList<Interval> arr = new MergeIntervals().insert(intervals, newInterval);
		for(int i=0; i<arr.size(); ++i) {
			System.out.print(arr.get(i).start + " " + arr.get(i).end + " ");
		}
	}
	
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        
    	ArrayList<Interval> arr = new ArrayList<Interval>();
    	boolean intervalMerged = false;
        
    	for(int i=0; i<intervals.size(); ++i) {
    		if(arr.size() == 0 && intervals.get(i).start >= newInterval.start && intervals.get(i).end >= newInterval.end) {
                arr.add(newInterval);
            }
            if(intervals.get(i).start <= newInterval.start && intervals.get(i).end <= newInterval.end) {
                arr.add(intervals.get(i));
            }
            else if(intervals.get(i).start <= newInterval.start && intervals.get(i).end >= newInterval.end) {
                arr.add(intervals.get(i));
                intervalMerged = true;
            }
            else if(intervalMerged && intervals.get(i).start >= newInterval.start && intervals.get(i).end >= newInterval.end) {
                arr.add(intervals.get(i));
            }
            else if(!intervalMerged && intervals.get(i).end >= newInterval.end) {
            	if(intervals.get(i).start > newInterval.end) {
            		if(arr.size() == 0) {
                		Interval tempInterval = new Interval(newInterval.start, newInterval.end);
                		arr.add(tempInterval);
                	}
                	else {
                		Interval tempInterval = new Interval(arr.get(arr.size()-1).start, newInterval.end);
                		arr.set(arr.size()-1, tempInterval);
                		arr.add(intervals.get(i));
                	}
            	}
            	else {
            		if(arr.size() == 0) {
                		Interval tempInterval = new Interval(newInterval.start, intervals.get(i).end);
                		arr.add(tempInterval);
                	}
                	else {
                		int tempEnd = newInterval.end > intervals.get(i).end ? newInterval.end : intervals.get(i).end;
                		Interval tempInterval = new Interval(arr.get(arr.size()-1).start, tempEnd);
                		arr.set(arr.size()-1, tempInterval);
                	}
            	}
            	intervalMerged = true;
            }
        }
    	
    	return arr;
    }
}
