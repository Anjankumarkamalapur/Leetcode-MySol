class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer,Integer> s = new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(s.containsKey(nums[i]) && Math.abs(i-s.get(nums[i]))<=k)
            {
                return true;
            }
            s.put(nums[i],i);
        }
        return false;
    }
}