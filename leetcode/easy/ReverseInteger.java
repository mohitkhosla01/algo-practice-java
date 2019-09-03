package easy;

public class ReverseInteger {

	public static void main(String[] args) {
		
		// int x = 123;
		// int x = -123;
		// int x = 120;
		// int x = 5000021;
		// int x = 0;
		// int x = 1;
		// int x = -1;
		int x = 1534236469;
		
		System.out.println(new ReverseInteger().reverse(x));
	}
	
    public int reverse(int x) {
        
    	long sum = 0;
    	
    	while(x != 0) {
    		sum = (sum * 10) + (x % 10);
    		x /= 10;
    	}
    	
    	if(sum > -2147483648 && sum < 2147483647) {
    		return (int) sum;
    	}
    	else {
    		return 0;
    	}
    }
}
