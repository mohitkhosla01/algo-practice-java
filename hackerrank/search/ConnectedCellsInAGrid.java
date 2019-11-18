package search;

public class ConnectedCellsInAGrid {
	
	public static void main(String[] args) {
		
		int[][] matrix = {
				{1,1,0,0},
				{0,1,1,0},
				{0,0,1,0},
				{1,0,0,0},
		};
		
//		int[][] matrix = {
//				{0,0,0,1,1,0,0},
//				{0,1,0,0,1,1,0},
//				{1,1,0,1,0,0,1},
//				{0,0,0,0,0,1,0},
//				{1,1,0,0,0,1,0},
//				{0,0,0,1,0,0,0}
//		};
		
		System.out.println(connectedCell(matrix));
	}
	
    static int connectedCell(int[][] matrix) {

    	int maxRegion = 0;
    	
    	for(int i=0; i<matrix.length; ++i) {
    		for(int j=0; j<matrix[i].length; ++j) {
    			
    			if(matrix[i][j] == 1) {
    				int region = getRegionSize(matrix, i, j);
        			if(region > maxRegion) {
        				maxRegion = region;
        			}
    			}
    		}
    	}

    	return maxRegion;
    }
    
    static int getRegionSize(int[][] matrix, int row, int column) {
    	
    	if(row < 0 || column < 0 || row >= matrix.length || column >= matrix[row].length) {
    		return 0;
    	}
    	else if(matrix[row][column] == 0) {
    		return 0;
    	}
    	
    	matrix[row][column] = 0;
    	int size = 1;
    	
    	for(int i=row-1; i<=row+1; ++i) {
    		for(int j=column-1; j<=column+1; ++j) {
    			if(i != row || j != column) {
    				size += getRegionSize(matrix, i, j);
    			}
    		}
    	}
    	
    	return size;
    }
}
