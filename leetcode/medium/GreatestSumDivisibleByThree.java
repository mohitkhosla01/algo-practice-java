package medium;

public class GreatestSumDivisibleByThree {

	public static void main(String[] args) {
		
		GreatestSumDivisibleByThree obj = new GreatestSumDivisibleByThree();

		int [][] numsArr = {
				null,
				{},
				{3,6,5,1,8},
				{4},
				{1,2,3,3,4},
				{1,2,3,4,4},
				{2,6,2,2,7}
		};
		
		for(int[] nums : numsArr) {
			System.out.println(obj.maxSumDivThree(nums));
		}
	}
	
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        
        if(nums == null) {
        	return sum;
        }
        
        int smallSum1 = Integer.MAX_VALUE, smallSum2 = Integer.MAX_VALUE;
        
        for(int n : nums) {
            sum += n;
            
            if(n % 3 == 1) {
                smallSum2 = Math.min(smallSum2, smallSum1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : smallSum1 + n);
                smallSum1 = Math.min(smallSum1, n);
            }
            else if(n % 3 == 2) {
                smallSum1 = Math.min(smallSum1, smallSum2 == Integer.MAX_VALUE ? Integer.MAX_VALUE : smallSum2 + n);
                smallSum2 = Math.min(smallSum2, n);
            }
        }
        
        if(sum % 3 == 1) {
            return sum - smallSum1;
        }
        else if(sum % 3 == 2) {
            return sum - smallSum2;
        }
        return sum;
    }
}
