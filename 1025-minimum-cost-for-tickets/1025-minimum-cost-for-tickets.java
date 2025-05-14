class Solution {
    int moveidx(int[] days,int idx,int val)
    {
        while(idx < days.length && days[idx] < val)
        {
            idx+=1;
        }
        return idx;
    }

    int rec(int[] days, int[] costs, int idx, int[] dp)
    {
        if(idx==days.length) return 0;
        if(dp[idx]!=-1) return dp[idx];
        int one=costs[0]+rec(days,costs,moveidx(days,idx,days[idx]+1),dp);
        int seven=costs[1]+rec(days,costs,moveidx(days,idx,days[idx]+7),dp);
        int th=costs[2]+rec(days,costs,moveidx(days,idx,days[idx]+30),dp);
        dp[idx]=Math.min(Math.min(one,seven),th);
        return dp[idx];
    }
    public int mincostTickets(int[] days, int[] costs) {
        int dp[]=new int[days.length];
        Arrays.fill(dp,-1);
        return rec(days, costs, 0, dp);
    }
}