package easy;

public class PlusOne {

	public static void main(String[] args) {
		
		int[][] digitsArray = {
				{9,9,9,9},
				{9,9,9,8},
				{1,0,0,0,0},
				{1,2,3,4},
				{1,2,9,9},
				{0},
				{1},
				{1,2,3},
				{4,3,2,1}
			};
		
		for(int[] digits : digitsArray) {
			int[] newDigits = new PlusOne().plusOne(digits);
			
			for(int i=0; i<newDigits.length; ++i) {
				System.out.print(newDigits[i]+",");
			}
			System.out.println();
		}
	}
	
    public int[] plusOne(int[] digits) {
    	
    	boolean only9 = true;
    	for(int i=0; i<digits.length; ++i) {
    		if(digits[i] != 9) {
    			only9 = false;
    			break;
    		}
    	}
    	
    	if(only9) {
    		int[] newDigits = new int[digits.length + 1];
    		newDigits[0] = 1;
    		return newDigits;
    	}
    	else {
    		for(int i=digits.length-1; i>=0; --i) {
        		if(digits[i] != 9) {
        			++digits[i];
        			break;
        		}
        		else {
        			digits[i] = 0;
        		}
        	}
    		
        	return digits;
    	}
    }
}
