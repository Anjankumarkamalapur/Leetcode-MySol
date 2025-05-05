class Solution {
    int fun(int i, int j, int[][] dp)
    {
        if(i==-1 || j==-1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int a=fun(i,j-1,dp);
        int b=fun(i-1,j,dp);
        return dp[i][j]=a+b;
    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        for(int[] row: dp) Arrays.fill(row,-1);
        return fun(m-1,n-1,dp);
    }
}