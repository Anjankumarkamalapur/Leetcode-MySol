class Solution {
    void fun(List<List<Integer>> ans, List<Integer> ls, int start, int[] candidates, int target)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        if(target < 0 ||start==candidates.length) return;
        ls.add(candidates[start]); //take
        // fun(ans,ls,start+1,candidates,target-candidates[start]);  //for single ele selection
        fun(ans,ls,start,candidates,target-candidates[start]);  //for same ele repeatedly
        ls.remove(ls.size()-1); //not-take
        fun(ans,ls,start+1,candidates,target);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        fun(ans, ls, 0, candidates, target);
        return ans;
    }
}