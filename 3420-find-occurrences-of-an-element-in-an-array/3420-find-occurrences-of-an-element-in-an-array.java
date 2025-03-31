class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            if(x==nums[i])
            {
                ls.add(i);
            }
        }
        int ans[]=new int[queries.length];
        for(int i=0;i<queries.length;i++)
        {
            int val=queries[i];
            if(val>ls.size())
            {
                ans[i]=-1;
            }
            else
            {
                ans[i]=ls.get(val-1);
            }
        }
        return ans;
    }
}