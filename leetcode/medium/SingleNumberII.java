package medium;

public class SingleNumberII {

	public static void main(String[] args) {
		
		// int[] nums = {2,2,3,2};
		int[] nums = {0,1,0,1,0,1,99};
		System.out.println(new SingleNumberII().singleNumber(nums));
	}
	
	public int singleNumber(int[] arr) {
        int ones = 0;
        int twos = 0;
        for (int value : arr) {
            ones = (ones ^ value) & ~twos;
            twos = (twos ^ value) & ~ones;
            System.out.println(ones + " " + twos);
        }
        return ones;
    }
}
