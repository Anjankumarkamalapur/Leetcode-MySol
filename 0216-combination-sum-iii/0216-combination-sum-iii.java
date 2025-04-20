class Solution {
    Set<List<Integer>> set = new HashSet<>();
    void fun(List<Integer> ls, int k, int n, int start)
    {
        if(n==0 && k==0)
        {
            set.add(new ArrayList<>(ls));
            return;
        }
        if(n<0 || k==0) return;

        for(int i=start;i<=9;i++)
        {
            ls.add(i);
            fun(ls, k-1, n-i, i+1);
            ls.remove(ls.size()-1);
        }
    }
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> ls = new ArrayList<>();
        fun(ls, k, n, 1);
        return new ArrayList<>(set);
    }
}