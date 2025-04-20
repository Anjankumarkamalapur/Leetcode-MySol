class Solution {
    void fun(List<List<Integer>> ans, List<Integer> ls, int[] candidates, int target, int index)
    {
        if(target==0)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target) break;
            ls.add(candidates[i]);
            fun(ans, ls, candidates, target-candidates[i], i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        fun(ans, ls, candidates, target, 0);
        return ans;
    }
}