class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i: tasks)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int ans=0;
        for(int i: hm.keySet())
        {
            int k=hm.get(i);
            if(k==1) return -1;
            if(k%3==0)
            {
                ans+=k/3;
            }
            else
            {
                ans+=(k/3)+1;
            }
        }
        return ans;
    }
}