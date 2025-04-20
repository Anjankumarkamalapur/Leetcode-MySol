class Solution {
    List<List<Integer>> ans = new ArrayList<>();
    void fun(List<Integer> ls, int[] nums, int start)
    {
        ans.add(new ArrayList<>(ls));
        for(int i=start;i<nums.length;i++)
        {
            if(i>start && nums[i]==nums[i-1]) continue;
            ls.add(nums[i]);
            fun(ls, nums, i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<Integer> ls = new ArrayList<>();
        fun(ls, nums, 0);
        return ans;
    }
}