class Solution {
    public int[] twoSum(int[] nums, int target) {
        int ans[] = new int[2];
        Map<Integer,Integer> h =  new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            int dif=target-nums[i];
            if(h.containsKey(dif))
            {
                ans[0]=i;
                ans[1]=h.get(dif);
            }
            else
            {
                h.put(nums[i],i);
            }
        }
        return ans;
    }
}