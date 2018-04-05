package com.algo.array.twod;

public class GridSum {
	public static void main(String[] args) {
		int row = 3;
		int col = 3;		
		int[][] grid = new int[row+2][col+2];
		
		//grid[1][1] = 9;	grid[1][2] = 2;	grid[1][3] = 1;
		//grid[2][1] = 1;	grid[2][2] = 2;	grid[2][3] = 2;
		//grid[3][1] = 1;	grid[3][2] = 6;	grid[3][3] = 9;

		
		grid[1][1] = 1;	grid[1][2] = 1;	grid[1][3] = 1;
		grid[2][1] = 1;	grid[2][2] = 9;	grid[2][3] = 1;
		grid[3][1] = 1;	grid[3][2] = 1;	grid[3][3] = 1;
		
		
		
		GridSum sol = new GridSum();		
		int result = sol.maxSum(grid);
		System.out.println(result);
		
	}

	
	private void print(int[][] grid) {
		/*for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				System.out.print (   grid[i][j]  + "  ");
			}
			System.out.println();
		}*/
		
		
		/*for (int i = 1; i < grid.length-1; i++) {
			for (int j = 1; j < grid[i].length-1; j++) {
				//System.out.print (   grid[i][j]  + "  ");
				//System.out.print(grid[i][j-1] + "  ");
				//System.out.print(grid[i][j+1]+ "  ");
				//System.out.print(grid[i][j]+ "  ");
				//System.out.print(grid[i][j]+ "  ");
				}
			System.out.println();
			}*/
	}
	
	public int maxSum(int[][] grid) {
		int maxSum = 0;
		for (int i = 1; i < grid.length-1; i++) {
			for (int j = 1; j < grid[i].length-1; j++) {				
				maxSum = Math.max(maxSum, sum(grid[i][j], grid[i][j-1], grid[i][j+1], grid[i-1][j], grid[i+1][j]));
			}
		}
		return maxSum;
	}

	private int sum(int current, int left, int right, int top, int bottom) {		
		int leftTop = left+top + current;
		int leftBottom= left+bottom+ current;
		int rightTop = right+top+ current;
		int rightBottom= right+bottom+ current;		
		
		return Math.max(leftTop, Math.max(leftBottom,Math.max(rightTop,rightBottom)));
		
	}
}
