class Solution {
    public long countSubarrays(int[] nums, int minK, int maxK) {
        long ans=0;
        int minpos=-1;
        int maxpos=-1;
        int leftbound=-1;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]<minK || nums[i]>maxK) leftbound=i;
            if(nums[i]==minK) minpos=i;
            if(nums[i]==maxK) maxpos=i;
            ans+=Math.max(0,Math.min(maxpos,minpos)-leftbound);
        }
        return ans;
    }
}