class Solution {
    long fun(int[] nums, int val)
    {
        long ans=0;
        int l=0;
        int r=nums.length-1;
        while(l<r)
        {
            long sum=nums[l]+nums[r];
            if(sum<=val)
            {
                ans+=r-l;
                l++;
            }
            else r--;
        }
        return ans;
    }
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        return fun(nums, upper)-fun(nums, lower-1);
        //its similar to 2824 problem
    }
}