class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans=new ArrayList<>();
        dfs(new StringBuilder(s), 0, ans);
        return ans;
    }
    void dfs(StringBuilder sb, int i, List<String> list)
    {
        if(i==sb.length())
        {
            list.add(sb.toString());
            return;
        }
        char c=sb.charAt(i);
        if(Character.isDigit(c)){
            dfs(sb, i+1, list);
        }
        else
        {
            sb.setCharAt(i, Character.toLowerCase(c));
            dfs(sb, i+1,list);
            sb.setCharAt(i, Character.toUpperCase(c));
            dfs(sb, i+1,list);
        }
    }
}