class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> st= new Stack();
        Set<Integer> ls = new HashSet<>();
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
            {
                st.push(i);
            }
            else if(ch==')')
            {
                if(!st.isEmpty()) st.pop();
                else ls.add(i);
            }
        }
        while (!st.isEmpty()) {
            ls.add(st.pop());
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!ls.contains(i)) {
                result.append(s.charAt(i));
            }
        }

        return result.toString();
    }
}
