class Solution {
    public int scoreOfParentheses(String s) {
        int cnt=0;
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
            {
                st.push(cnt);
                cnt=0;
            }
            else
            {
                cnt=st.pop()+(cnt==0?1:2*cnt);
            }
        }
        return cnt;
    }
}