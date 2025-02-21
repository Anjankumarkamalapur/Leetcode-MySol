class Solution {
    public int maxProfit(int[] prices) {
        int maxpro=0;
        for(int i=0;i<prices.length-1;i++)
        {
            if(prices[i+1]>prices[i])
            {
                maxpro+=(prices[i+1]-prices[i]);
            }
        }
        return maxpro;
    }
}