class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        //performing next greater element (monotonic stack) on nums2 and storing the corressponding value in HashMap
        HashMap<Integer,Integer> hm= new HashMap<>();
        int n=nums1.length;
        int m=nums2.length;
        Stack<Integer> st = new Stack<>();
        for(int i=m-1;i>=0;i--)
        {
            while(!st.isEmpty() && nums2[i]>=st.peek())
            {
                st.pop();
            }
            if(!st.isEmpty())
            {
                hm.put(nums2[i],st.peek());
            }
            else
            {
                hm.put(nums2[i],-1);
            }
            st.push(nums2[i]);
        }
        int ans[] =new int[n];
        for(int i=0;i<n;i++)
        {
            ans[i]=hm.get(nums1[i]);
        }
        return ans;
    }
}