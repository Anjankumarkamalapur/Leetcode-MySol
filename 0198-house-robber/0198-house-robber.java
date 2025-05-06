class Solution {
    int fun(int[] nums, int i, int[] dp)
    {
        if(i<0) return 0;
        if(dp[i]!=-1) return dp[i];
        int rob=fun(nums,i-2,dp)+nums[i]; //take
        int skip=fun(nums,i-1,dp);  //not take
        dp[i]=Math.max(rob,skip);
        return dp[i];
    }
    public int rob(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,-1);
        return fun(nums,n-1,dp);
    }
}