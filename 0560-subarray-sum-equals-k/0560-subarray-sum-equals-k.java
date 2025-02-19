class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        hm.put(0, 1);
        int c=0;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
            if(hm.containsKey(sum-k))
            {
                c+=hm.get(sum-k);
            }
            hm.put(sum, hm.getOrDefault(sum, 0) + 1);
        }
        return c;
    }
}