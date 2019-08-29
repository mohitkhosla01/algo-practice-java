package easy;

public class PowerOfThree {

	public static void main(String[] args) {
		
		// int n = 27;
		// int n = 5;
		// int n = 9;
		// int n = 0;
		// int n = -81;
		// int n = 81;
		// int n = 45;
		// int n = -27;
		// int n = 729;
		int n = 1;
		
		System.out.println(new PowerOfThree().isPowerOfThree(n));
	}

	public boolean isPowerOfThree(int n) {
		
		if(n == 0) {
			return false;
		}
		else if(n == 1) {
			return true;
		}
		else {
			boolean flag = true;
			
			while(true) {
				if(n % 3 != 0) {
					flag = false;
					break;
				}
				n /= 3;
				if(n == 1) {
					break;
				}
			}
			
			return flag;
		}
	}
}
