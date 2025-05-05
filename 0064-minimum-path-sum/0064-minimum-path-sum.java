class Solution {
    int fun(int n, int m, int[][] dp,int[][] grid )
    {
        if(n==0 &&m==0) return grid[0][0];
        if(n==-1||m==-1) return Integer.MAX_VALUE;
        if(dp[n][m]!=-1) return dp[n][m];
        int top=fun(n-1,m,dp,grid);
        int left=fun(n,m-1,dp,grid);
        return dp[n][m]=grid[n][m]+Math.min(top,left);
    }
    public int minPathSum(int[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] row:dp) Arrays.fill(row,-1);
        return fun(n-1,m-1,dp,grid);
    }
}