class Solution {
    void fun(List<List<Integer>> ans, int[] nums, List<Integer> ls, int start)
    {
        if(start==nums.length)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        ls.add(nums[start]);
        fun(ans, nums, ls, start+1);
        ls.remove(ls.size()-1);
        fun(ans, nums, ls, start+1);

    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans= new ArrayList<>();
        fun(ans, nums, new ArrayList<>(), 0);
        return ans;
    }
}