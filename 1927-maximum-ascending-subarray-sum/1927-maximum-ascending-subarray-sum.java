class Solution {
    public int maxAscendingSum(int[] nums) {
        int maxsum=nums[0];
        int mx=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i-1]<nums[i])
            {   
                mx+=nums[i];
            }
            else 
            {
                maxsum=Math.max(mx,maxsum);
                mx=nums[i];
            }
        }
        return Math.max(maxsum,mx);
    }
}