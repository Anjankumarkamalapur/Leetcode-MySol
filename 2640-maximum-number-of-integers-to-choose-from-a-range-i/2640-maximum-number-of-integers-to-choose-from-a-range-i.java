class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int ans=0;
        Set<Integer> s= new HashSet<>();
        for(int i:banned)
        {
            s.add(i);
        }
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            if(!s.contains(i) && sum+i<=maxSum)
            {
                sum+=i;
                ans++;
            }
        }
        return ans;
    }
}