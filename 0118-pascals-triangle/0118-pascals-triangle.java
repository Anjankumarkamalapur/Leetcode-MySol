class Solution {
    List<Integer> fun(int row)
    {
        List<Integer> temp = new ArrayList<>();
        int ans=1;
        temp.add(ans);
        for(int col=1;col<=row;col++)
        {
            ans=ans*(row- col+1);
            ans=ans/col;
            temp.add(ans);
        }
        return temp;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
        for(int i=0;i<numRows;i++)
        {
            ans.add(fun(i));
        }
        return ans;
    }
}