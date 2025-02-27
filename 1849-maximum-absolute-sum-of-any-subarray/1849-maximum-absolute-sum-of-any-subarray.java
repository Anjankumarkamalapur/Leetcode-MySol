class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int sum=0;
        int minsum=0;
        int maxsum=0;
        for(int i: nums)
        {
            sum+=i;
            if(sum>maxsum)
            {
                maxsum=Math.max(maxsum,sum);
            }
            else
            {
                minsum=Math.min(minsum,sum);
            }
        }
        return maxsum-minsum;
    }
}