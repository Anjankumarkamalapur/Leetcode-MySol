class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int leftsmall[]= new int[n];
        int rightsmall[] = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1;i>=0;i--)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) rightsmall[i]=n;
            else rightsmall[i]=st.peek();
            st.push(i);
        }

        // to use same stack just pop all elements and then use
        while(!st.isEmpty()) st.pop();

        for(int i=0;i<n;i++)
        {
            while(!st.isEmpty() && heights[st.peek()]>=heights[i])
            {
                st.pop();
            }
            if(st.isEmpty()) leftsmall[i]=-1;
            else leftsmall[i]=st.peek();
            st.push(i);
        }

        int ans=0;
        for(int i=0;i<n;i++)
        {
            int width=rightsmall[i]-leftsmall[i]-1;
            int area= heights[i]*width;
            ans=Math.max(ans,area);
        }
        return ans;
    }
}