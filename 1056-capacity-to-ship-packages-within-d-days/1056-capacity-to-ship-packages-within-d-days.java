class Solution {
    int fun(int weights[], int mid)
    {
        int days = 1; 
        int currentLoad = 0;
        for (int weight : weights) 
        {
            if (currentLoad + weight > mid) 
            {
                days++;
                currentLoad = 0;
            }
            currentLoad += weight;
        }
        return days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int i: weights)
        {
            low=Math.max(low,i);
            high+=i;
        }
        int ans=high;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(fun(weights, mid)<=days)
            {
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
}