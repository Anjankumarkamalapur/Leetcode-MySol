class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm= new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer>[] bucket=new List[nums.length+1];
        for(int i:hm.keySet())
        {
            int frq=hm.get(i);
            if(bucket[frq]==null)
            {
                bucket[frq]=new ArrayList<>();
            }
            bucket[frq].add(i);
        }
        List<Integer> res=new ArrayList<>();
        for(int i=nums.length; i>=0 && res.size()<k; i--)
        {
            if(bucket[i]!=null)
            {
                res.addAll(bucket[i]);
            }
        }
        int[] top=new int[k];
        for(int i=0;i<k;i++)
        {
            top[i]=res.get(i);
        }
        return top;
    }
}