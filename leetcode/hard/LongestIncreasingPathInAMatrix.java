package hard;

public class LongestIncreasingPathInAMatrix {

	public static void main(String[] args) {
		
//		int[][] matrix = null;
		
//		int[][] matrix = {
//				{}
//		};
		
//		int[][] matrix = {
//				{},
//				{}
//		};
		
//		int[][] matrix = {
//				{9,9,4},
//				{6,6,8},
//				{2,1,1}
//		};
		
		int[][] matrix = {
				{3,4,5},
				{3,2,6},
				{2,2,1}
		};
		
//		int[][] matrix = {
//				{3,4,5,7,7,8},
//				{3,2,6,8,9,10},
//				{2,2,1,12,9,11},
//				{2,2,1,22,21,20}
//		};
		
//		int[][] matrix = {
//				{0,1,2,3,4,5,6,7,8,9},
//		 		{19,18,17,16,15,14,13,12,11,10},
//		 		{20,21,22,23,24,25,26,27,28,29},
//		 		{39,38,37,36,35,34,33,32,31,30},
//		 		{40,41,42,43,44,45,46,47,48,49},
//		 		{59,58,57,56,55,54,53,52,51,50},
//		 		{60,61,62,63,64,65,66,67,68,69},
//		 		{79,78,77,76,75,74,73,72,71,70},
//		 		{80,81,82,83,84,85,86,87,88,89},
//		 		{99,98,97,96,95,94,93,92,91,90},
//		 		{100,101,102,103,104,105,106,107,108,109},
//		 		{119,118,117,116,115,114,113,112,111,110},
//		 		{120,121,122,123,124,125,126,127,128,129},
//		 		{139,138,137,136,135,134,133,132,131,130},
//		 		{0,0,0,0,0,0,0,0,0,0}
//		};
		
		System.out.println(new LongestIncreasingPathInAMatrix().longestIncreasingPath(matrix));
	}

	public int longestIncreasingPath(int[][] matrix) {

		int maxLength = 0;
		
		if(matrix == null || matrix.length == 0) {
			return maxLength;
		}
		
		int [][] cache = new int[matrix.length][matrix[0].length];
		
		for(int i=0; i<matrix.length; ++i) {
			for(int j=0; j<matrix[0].length; ++j) {
				int currentLength = helper(matrix, cache, i, j);
				if(currentLength > maxLength) {
					maxLength = currentLength;
				}
			}
		}
		
		return maxLength;
	}
	
	public int helper(int[][] matrix, int[][] cache, int row, int column) {
		
		int leftLength = 0, rightLength = 0, upLength = 0, downLength = 0;
		
		if(column != 0 && matrix[row][column-1] > matrix[row][column]) {
			leftLength = cache[row][column-1] != 0 ? cache[row][column-1] : helper(matrix, cache, row, column-1);
		}
		if(column < matrix[0].length-1 && matrix[row][column+1] > matrix[row][column]) {
			rightLength = cache[row][column+1] != 0 ? cache[row][column+1] : helper(matrix, cache, row, column+1);
		}
		if(row != 0 && matrix[row-1][column] > matrix[row][column]) {
			upLength = cache[row-1][column] != 0 ? cache[row-1][column] : helper(matrix, cache, row-1, column);
		}
		if(row < matrix.length-1 && matrix[row+1][column] > matrix[row][column]) {
			downLength = cache[row+1][column] != 0 ? cache[row+1][column] : helper(matrix, cache, row+1, column);
		}
		
		cache[row][column] = Math.max(Math.max(leftLength, rightLength), Math.max(upLength, downLength)) + 1;
		return cache[row][column];
	}
}
