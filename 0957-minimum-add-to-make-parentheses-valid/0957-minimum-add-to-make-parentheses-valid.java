class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int cou=0;
        for(char c:s.toCharArray())
        {
            if(c=='(') st.push('(');
            else if(c==')')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                else
                {
                    cou++;
                }
            }
            
        }
        cou=cou+st.size();
        return cou;
    }
}