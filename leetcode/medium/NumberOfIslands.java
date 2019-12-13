package medium;

public class NumberOfIslands {

	public static void main(String[] args) {
		
//		char[][] grid = null;
		
//		char[][] grid = {};
		
//		char[][] grid = {
//				{},
//				{}
//		};

//		char[][] grid = {
//				{'1','1','0','0'},
//				{'0','1','1','0'},
//				{'0','0','1','0'},
//				{'1','0','0','0'},
//		};
		
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

		char[][] grid = {
				{'0','0','0','1','1','0','0'},
				{'0','1','0','0','1','1','0'},
				{'1','1','0','1','0','0','1'},
				{'0','0','0','0','0','1','0'},
				{'1','1','0','0','0','1','0'},
				{'0','0','0','1','0','0','0'}
		};
		
		System.out.println(new NumberOfIslands().numIslands(grid));
	}
	
	public int numIslands(char[][] grid) {

        int count = 0;
        
		if(grid == null) {
			return count;
		}
        
        for(int i=0; i<grid.length; ++i) {
            for(int j=0; j<grid[0].length; ++j) {
                if(grid[i][j] == '1') {
                    ++count;
                    grid[i][j] = '0';
                    helper(grid, i, j);
                }
            }
        }
        
        return count;
	}
    
    public void helper(char[][] grid, int i, int j) {
    	if(i != grid.length && j != 0 && grid[i][j-1] == '1') {
            grid[i][j-1] = '0';
            helper(grid, i, j-1);
        }
        if(i != grid.length && j != grid[0].length-1 && grid[i][j+1] == '1') {
            grid[i][j+1] = '0';
            helper(grid, i, j+1);
        }
        if(j != grid[0].length && i != 0 && grid[i-1][j] == '1') {
            grid[i-1][j] = '0';
            helper(grid, i-1, j);
        }
        if(j != grid[0].length && i != grid.length-1 && grid[i+1][j] == '1') {
            grid[i+1][j] = '0';
            helper(grid, i+1, j);
        }
    }
}
