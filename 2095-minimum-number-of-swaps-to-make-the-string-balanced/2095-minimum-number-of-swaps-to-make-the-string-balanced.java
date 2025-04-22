class Solution {
    public int minSwaps(String s) {
        Stack<Character> st= new Stack();
        int ans=0;
        int unbalcnt=0;
        for(char ch: s.toCharArray())
        {
            if(ch=='[')
            {
                st.push('[');
            }
            else if(ch==']')
            {
                if(!st.isEmpty())
                {
                    st.pop();
                }
                else
                {
                    unbalcnt++;
                }
            }
        }
        unbalcnt=unbalcnt+st.size();
        int val=unbalcnt/2;  //unbalanced pair count
        return (val+1)/2;  //formula to count swaps to make them balanace
    }
}