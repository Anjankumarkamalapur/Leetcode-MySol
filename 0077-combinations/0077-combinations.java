class Solution {
    void fun(List<List<Integer>> ans, List<Integer> ls, int n, int k, int start)
    {
        if(k==0)
        {
            ans.add(new ArrayList<>(ls));
            return;
        }
        for(int i=start;i<=n;i++)
        {
            ls.add(i);
            fun(ans, ls, n, k-1, i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ls= new ArrayList<>();
        fun(ans,ls,n,k,1);
        return ans;
    }
}