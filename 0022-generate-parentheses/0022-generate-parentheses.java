class Solution {
    void fun(List<String> ans,int n, int open, int close, String str)
    {
        if(open+close==2*n)
        {
            ans.add(str);
            return;
        }
        if(open<n)
        {
            fun(ans,n,open+1,close,str+"(");
        }
        if(close<open)
        {
            fun(ans,n,open,close+1,str+")");
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans= new ArrayList<>();
        fun(ans,n,0,0,"");
        return ans;
    }
}