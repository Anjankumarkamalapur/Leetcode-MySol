class Solution {
    long fun(int[] piles,long k)
    {
        long time=0;
        for(int i:piles) time+=(long)Math.ceil((double)i/k);
        return time;
    }
    public int minEatingSpeed(int[] piles, int h) {
        long max=Long.MIN_VALUE;
        for(long i:piles)
        {
            max=Math.max(i,max);
        }
        long low=1;
        long high=max;
        long mini=Long.MAX_VALUE;
        while(low<=high)
        {
            long mid=(low+high)/2;
            long time=fun(piles, mid);
            if(time<=h)
            {
                mini=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return (int)mini;
    }
}