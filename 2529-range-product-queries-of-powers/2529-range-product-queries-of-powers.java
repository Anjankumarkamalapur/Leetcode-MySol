class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> ls=new ArrayList<>();
        for(int i=0;i<31;i++){
            if((n&(1<<i))!=0){
                ls.add(1<<i);
            }
        }
        int ls_arr[]=new int[ls.size()];
        for(int i=0;i<ls.size();i++)
        {
            ls_arr[i]=ls.get(i);
        }
        List<Integer> ans=new ArrayList<>();
        for(int i=0;i<queries.length;i++)
        {
            int left = queries[i][0];
            int right = queries[i][1];
            long num=1;
            for (int x=left;x<=right;x++) {
                num=(num*ls_arr[x])%1000000007;
            }
            ans.add((int)num);
        }
        int ans_arr[] =new int[ans.size()];
        for(int i=0;i<ans.size();i++)
        {
            ans_arr[i]=ans.get(i);
        }
        return ans_arr;
    }
}