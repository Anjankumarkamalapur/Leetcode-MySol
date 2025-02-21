class Solution {
    public int longestOnes(int[] nums, int k) {
        int maxlen=0;
        int left=0;
        int right =0;
        int zerocnt=0;
        while(right<nums.length)
        {
            if(nums[right]==0)
            {
                zerocnt++;
            }
            if(zerocnt>k)
            {
                if(nums[left]==0)
                {
                    zerocnt--;
                }
                left++;
            }
            if(zerocnt<=k)
            {
                maxlen=Math.max(maxlen,right-left+1);
            }
            right++;
        }
        return maxlen;
    }
}