class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        Map<Integer,Integer> s= new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            s.put(nums[i],i);
        }
         for(int i=0;i<operations.length;i++) {
            int oldval=operations[i][0];
            int newval=operations[i][1];
            if (s.containsKey(oldval))
            {
                int idx=s.get(oldval);
                nums[idx]=newval;
                s.remove(oldval);
                s.put(newval,idx);
            }
        }
        
        return nums;
    }
}