package easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		
		// String s = "A man, a plan, a canal: Panama"; // true
		// String s = "race a car"; // false
		// String s = "mohit"; // false
		// String s = "tomamot"; // true
		// String s = "to Mamo,t"; // true
		// String s = "t3o Mamo,2t"; // false
		// String s = "t2o Mamo,2t"; // true
		// String s = ""; // true
		// String s = null; // true
		// String s = "a."; // true
		String s = "0P"; // false
		
		System.out.println(new ValidPalindrome().isPalindrome(s));
	}
	
    public boolean isPalindrome(String s) {
    	
    	if(s == null) {
    		return true;
    	}
    	
    	int i=0;
    	int j=s.length()-1;
    	
    	while(i<s.length() && j>=0) {
    		char chi = s.charAt(i);
    		char chj = s.charAt(j);
    		
    		boolean flag = true;
    		
    		if(!((chi >= 48 && chi <= 57) || (chi >= 65 && chi <= 90) || (chi >= 97 && chi <= 122))) {
    			++i;
    			flag = false;
    		}
    		if(!((chj >= 48 && chj <= 57) || (chj >= 65 && chj <= 90) || (chj >= 97 && chj <= 122))) {
    			--j;
    			flag = false;
    		}
    		
    		if(flag == true) {
    			if((chi >= 48 && chi <= 57) && (chj >= 48 && chj <= 57)) {
    				if(chi != chj) {
    					return false;
    				}
    			}
    			if((chi >= 48 && chi <= 57) && !(chj >= 48 && chj <= 57)) {
    				return false;
    			}
    			if(!(chi >= 48 && chi <= 57) && (chj >= 48 && chj <= 57)) {
    				return false;
    			}
    			else if((chi >= 65 && chi <= 90) && (chj >= 65 && chj <= 90)) {
    				if(chi != chj) {
    					return false;
    				}
    			}
    			else if((chi >= 97 && chi <= 122) && (chj >= 97 && chj <= 122)) {
    				if(chi != chj) {
    					return false;
    				}
    			}
    			else if((chi >= 65 && chi <= 90) && (chj >= 97 && chj <= 122)) {
    				if((char)((int)chi + 32) != chj) {
    					return false;
    				}
    			}
    			else if((chi >= 97 && chi <= 122) && (chj >= 65 && chj <= 90)) {
    				if(chi != (char)((int)chj + 32)) {
    					return false;
    				}
    			}
    			++i;
    			--j;
    		}
    	}
    	
    	return true;
    }
}
