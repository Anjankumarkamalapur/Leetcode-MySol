class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return fun(nums,goal)-fun(nums,goal-1);
    }
    int fun(int nums[], int goal)
    {
        int l=0;
        int r=0;
        int cnt=0;
        int sum=0;
        while(r<=nums.length-1)
        {
            sum+=nums[r];
            while(sum>goal && l<=r)
            {
                sum-=nums[l];
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}