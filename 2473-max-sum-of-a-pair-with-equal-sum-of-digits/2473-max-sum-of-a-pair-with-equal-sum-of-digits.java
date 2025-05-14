class Solution {
    int fun(int num)
    {
        int ans=0;
        int temp=num;
        while(temp!=0)
        {
            int div=temp%10;
            ans+=div;
            temp/=10;
        }
        return ans;
    }
    public int maximumSum(int[] nums) {
        Map<Integer,Integer> hm=new HashMap<>();
        int ans=-1;
        for(int num:nums)
        {
            int sum=fun(num);
            if(hm.containsKey(sum))
            {
                ans=Math.max(ans,hm.get(sum)+num);
                hm.put(sum,Math.max(hm.get(sum),num));
            }
            else
            {
                hm.put(sum,num);
            }
        }
        return ans;
    }
}