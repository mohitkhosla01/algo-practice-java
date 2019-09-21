package math;

public class PalindromeInteger {

	public static void main(String[] args) {
		
		int A = 5551;

		System.out.println(new PalindromeInteger().isPalindrome(A));
	}
	
    public int isPalindrome(int A) {
        if(A<0) {
            return 0;
        }
        
        int B = A;
        int c = 0;
        while(B != 0) {
            B = B/10;
            ++c;
        }
        
        for(int i=0; i<c; i+=2) {
        	int a = A / ((int)(Math.pow(10,(c-i-1))));
            int b = A % 10;
            if(a!=b) {
                return 0;
            }
            A %= ((int)(Math.pow(10,(c-i-1))));
            A /= 10;
        }
        
        return 1;
    }
}
