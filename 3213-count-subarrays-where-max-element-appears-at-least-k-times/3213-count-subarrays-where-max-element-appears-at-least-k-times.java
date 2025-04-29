class Solution {
    public long countSubarrays(int[] nums, int k) {
        long cnt=0;
        int maxele=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
            maxele=Math.max(maxele, nums[i]);
        }
        int l=0;
        int r=0;
        int c=0;
        while(r<nums.length)
        {
            if(nums[r]==maxele) c++;
            while(c>=k) 
            {
                cnt+=nums.length-r;
                if(nums[l]==maxele) c--;
                l++;
            }
            r++;
        }
        return cnt;
    }
}