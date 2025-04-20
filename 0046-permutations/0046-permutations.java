class Solution {
    void permutations(int ind, int[] nums, List<List<Integer>> ans) 
    {
        if (ind == nums.length) 
        {
            List<Integer> temp = new ArrayList<>();
            for (int num : nums) 
            {
                temp.add(num);
            }
            ans.add(temp);
            return;
        }

        for (int i = ind; i < nums.length; i++) 
        {
            swap(nums, ind, i);
            permutations(ind + 1, nums, ans);
            swap(nums, ind, i); // Backtrack
        }
    }
    void swap(int[] nums, int i, int j) 
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        permutations(0, nums, ans);
        return ans;
    }
}