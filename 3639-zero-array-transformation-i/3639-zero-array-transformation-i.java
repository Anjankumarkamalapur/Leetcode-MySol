class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n=nums.length;
        int[] freq=new int[n+1];

        for(int i=0;i<queries.length;i++) 
        {
            int l = queries[i][0];
            int r = queries[i][1];
            freq[l]++;
            if (r+1<n) 
            {
                freq[r+1]--;
            }
        }
        for(int i=1;i<n;i++) 
        {
            freq[i]+=freq[i-1];
        }
        for (int i=0;i<n;i++) 
        {
            if(freq[i]<nums[i]) 
            {
                return false;
            }
        }
        return true;
    }
}
