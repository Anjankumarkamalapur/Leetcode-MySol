class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        int idx=-1;
        int cnt=-1;
        for(int i=0;i<mat.length;i++)
        {
            int c=0;
            for(int j=0;j<mat[0].length;j++)
            {
                if(mat[i][j]==1)
                {
                    c++;
                }
            }
            if(c>cnt)
            {
                cnt=c;
                idx=i;
            }
        }
        return new int[] {idx, cnt};
    }
}