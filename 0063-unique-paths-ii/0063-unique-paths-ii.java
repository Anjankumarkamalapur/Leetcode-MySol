class Solution {
    int fun(int r, int c,int[][] obstackleGrid,int[][] dp)
    {
        if(r>=0 &&c>=0 && obstackleGrid[r][c]==1 ) return 0;
        if(r==0 && c==0) return 1;
        if(r==-1||c==-1) return 0;
        if(dp[r][c]!=-1) return dp[r][c];
        int left=fun(r-1,c,obstackleGrid,dp);
        int top=fun(r,c-1,obstackleGrid,dp);
        return dp[r][c]=left+top;
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int r=obstacleGrid.length;
        int c=obstacleGrid[0].length;
        int dp[][]=new int[r][c];
        for(int[] row:dp) Arrays.fill(row,-1);
        return fun(r-1,c-1,obstacleGrid,dp);
    }
}