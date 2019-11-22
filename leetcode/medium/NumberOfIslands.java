package medium;

public class NumberOfIslands {

	public static void main(String[] args) {
		
//		char[][] grid = null;
		
//		char[][] grid = {};
		
//		char[][] grid = {
//				{},
//				{}
//		};

		char[][] grid = {
				{'1','1','0','0'},
				{'0','1','1','0'},
				{'0','0','1','0'},
				{'1','0','0','0'},
		};
		
//		char[][] grid = {
//				{'1','1','1','1','0'},
//				{'1','1','0','1','0'},
//				{'1','1','0','0','0'},
//				{'0','0','0','0','0'},
//		};
		
//		char[][] grid = {
//				{'1','1','0','0','0'},
//				{'1','1','0','0','0'},
//				{'0','0','1','0','0'},
//				{'0','0','0','1','1'},
//		};

//		char[][] grid = {
//				{'0','0','0','1','1','0','0'},
//				{'0','1','0','0','1','1','0'},
//				{'1','1','0','1','0','0','1'},
//				{'0','0','0','0','0','1','0'},
//				{'1','1','0','0','0','1','0'},
//				{'0','0','0','1','0','0','0'}
//		};
		
		System.out.println(new NumberOfIslands().numIslands(grid));
	}

	public int numIslands(char[][] grid) {

		int islandCount = 0;
		
		if(grid == null || grid.length == 0) {
			return islandCount;
		}

		for(int i=0; i<grid.length; ++i) {
			for(int j=0; j<grid[0].length; ++j) {

				if(grid[i][j] == '1') {
					++islandCount;
					grid[i][j] = '0';
					helper(grid, i, j);
				}
			}
		}

		return islandCount;
	}

	public void helper(char[][] grid, int row, int column) {

		if(column != 0 && grid[row][column-1] == '1') {
			grid[row][column-1] = '0';
			helper(grid, row, column-1);
		}
		if(row != grid.length && column != grid[0].length-1 && grid[row][column+1] == '1') {
			grid[row][column+1] = '0';
			helper(grid, row, column+1);
		}
		if(row != 0 && grid[row-1][column] == '1') {
			grid[row-1][column] = '0';
			helper(grid, row-1, column);
		}
		if(row != grid.length-1 && column != grid[0].length && grid[row+1][column] == '1') {
			grid[row+1][column] = '0';
			helper(grid, row+1, column);
		}
	}
}
