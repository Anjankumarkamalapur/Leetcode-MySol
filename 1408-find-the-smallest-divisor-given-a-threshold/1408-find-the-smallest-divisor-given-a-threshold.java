class Solution {
    int fun(int arr[], int mid)
    {
        int tempans=0;
        for(int i:arr)
        {
            tempans += (int) Math.ceil((double) i / mid);
        }
        return tempans;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int ans=-1;
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int i:nums)
        {
            high=Math.max(high,i);
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(fun(nums, mid)<=threshold)
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}