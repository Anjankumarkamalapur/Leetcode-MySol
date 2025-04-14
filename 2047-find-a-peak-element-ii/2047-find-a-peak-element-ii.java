class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int curr=mat[i][j];
                boolean ispeak=true;    
                if(i>0 && curr<=mat[i-1][j])
                {
                    ispeak=false;
                }
                if(i<n-1 && curr<=mat[i+1][j])
                {
                    ispeak=false;
                }
                if(j>0 && curr<=mat[i][j-1])
                {
                    ispeak=false;
                }
                if(j<m-1 && curr<=mat[i][j+1])
                {
                    ispeak=false;
                }
                if(ispeak)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {-1,-1};
    }
}