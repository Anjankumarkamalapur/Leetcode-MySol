class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return fun(nums,k)-fun(nums,k-1);
    }
    int fun(int[] nums, int k)
    {
        int cnt=0;
        int tempcnt=0;
        int l=0;
        int r=0;
        while(r<nums.length)
        {
            if(nums[r]%2==1)
            {
                tempcnt++;
            }
            while(tempcnt>k)
            {
                if(nums[l]%2==1) 
                {
                    tempcnt--;
                }
                l++;
            }
            cnt+=r-l+1;
            r++;
        }
        return cnt;
    }
}