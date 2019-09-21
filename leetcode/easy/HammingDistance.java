package easy;

public class HammingDistance {

	public static void main(String[] args) {
		
		HammingDistance hd = new HammingDistance();
		
		int[][] nums = {
				{8,16},
				{1,4},
				{5,10},
				{9,9},
				{1,0},
				{0,15},
				{2147483647,0}
		};
		
		for(int i=0; i<nums.length; ++i) {
			System.out.println(nums[i][0] + "\t" + nums[i][1] + "\t" + hd.hammingDistance(nums[i][0], nums[i][1]));
		}
	}

	public int hammingDistance(int x, int y) {

		int c = 0;
		int xor = x^y;
		
		while(xor != 0) {
			if(xor % 2 != 0) {
				++c;
			}
			xor /= 2;
		}
		
		return c;
	}
}
