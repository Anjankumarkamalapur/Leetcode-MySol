class Solution {
    int fun(int[] arr,int mid, int k)
    {
        int c=0;
        int tempans=0;
        for(int a=0;a<arr.length;a++)
        {
            if(arr[a]<=mid)
            {
                c++;
            }
            else
            {
                tempans+=c/k;
                c=0;
            }
        }
        tempans+=c/k;
        return tempans;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        if(bloomDay.length<(long)m*k) return -1;
        int ans=0;
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int i:bloomDay)
        {
            low=Math.min(low,i);
            high=Math.max(high,i);
        }
        int result=-1;
        while(low<=high)
        {
            int mid = low+(high-low)/2;
            if (fun(bloomDay, mid, k) >= m) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return result;
    }
}