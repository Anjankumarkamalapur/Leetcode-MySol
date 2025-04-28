class Solution {
    public long countSubarrays(int[] nums, long k) {
        long cnt=0;
        long winsum=0;
        int l=0;
        int r=0;
        while(l<nums.length)
        {
            while(r<nums.length && (winsum+nums[r])*(r-l+1)<k)
            {
                winsum+=nums[r];
                r++;
            }
            cnt+=r-l;
            if(l==r) r++;
            else winsum-=nums[l];
            l++;
        }
        return cnt;
    }
}