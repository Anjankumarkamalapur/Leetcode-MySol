class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxtrip=0;
        long maxdiff=0;
        long maxele=0;
        for(int num:nums)
        {
            maxtrip=Math.max(maxtrip,maxdiff*num);
            maxdiff=Math.max(maxdiff,maxele-num);
            maxele=Math.max(maxele,num);
        }
        return maxtrip;
    }
}