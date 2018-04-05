package com.algo.array.twod;

public class GridSum2 {
	public static void main(String[] args) {
		int row = 3;
		int col = 3;		
		//int[][] grid = new int[row+2][col+2];
		int[][] grid = new int[row][col];
		
		//grid[1][1] = 9;	grid[1][2] = 2;	grid[1][3] = 1;
		//grid[2][1] = 1;	grid[2][2] = 2;	grid[2][3] = 2;
		//grid[3][1] = 1;	grid[3][2] = 6;	grid[3][3] = 9;

		
//		grid[1][1] = 9;	grid[1][2] = 8;	grid[1][3] = 7;
//		grid[2][1] = 9;	grid[2][2] = 5;	grid[2][3] = 9;
//		grid[3][1] = 9;	grid[3][2] = 3;	grid[3][3] = 2;
		
		
//		grid[1][1] = 9;	grid[1][2] = 9;	grid[1][3] = 9;
//		grid[2][1] = 9;	grid[2][2] = 5;	grid[2][3] = 9;
//		grid[3][1] = 1;	grid[3][2] = 3;	grid[3][3] = 2;		
		
		grid[0][0] = 9;	grid[0][1] = 9;	grid[0][2] = 9;
		grid[1][0] = 9;	grid[1][1] = 5;	grid[1][2] = 9;
		grid[2][0] = 1;	grid[2][1] = 3;	grid[2][2] = 2;		
		
		GridSum2 sol = new GridSum2();		
		int result = sol.maxSum(grid);
		System.out.println(result);
		
	}	
	
	public int maxSum(int[][] grid) {
		int maxSum = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				//maxSum = Math.max(maxSum, sum(grid[i][j], grid[i][j-1], grid[i][j+1], grid[i-1][j], grid[i+1][j]));				
				int current = grid[i][j];
				int left = (j-1<0)?0:grid[i][j-1];
				int right = (j+1)>=grid.length?0:grid[i][j+1];
				int top = (i-1<0)?0:grid[i-1][j];
				int bottom = (i+1>=grid.length)?0:grid[i+1][j];
				maxSum = Math.max(maxSum, sum(	current,left,right,top,bottom));
			}
		}
		return maxSum;
	}

	private int sum(int current, int left, int right, int top, int bottom) {		
		int leftTop = left+top + current;
		int leftBottom= left+bottom+ current;
		int rightTop = right+top+ current;
		int rightBottom= right+bottom+ current;
		
		int vertical= top+bottom+ current;		
		int horizontal= left+right+ current;		
		
		return Math.max(vertical, Math.max(horizontal, Math.max(leftTop, Math.max(leftBottom,Math.max(rightTop,rightBottom)))));
		
	}
}
