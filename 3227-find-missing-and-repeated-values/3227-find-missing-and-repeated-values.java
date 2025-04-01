class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int frq[]=new int[grid.length*grid[0].length+1];
        for(int a[]:grid)
        {
            for(int i:a)
            {
                frq[i]++;
            }
        }
        int rep=-1;
        int mis=-1;
        for(int i=0;i<frq.length;i++)
        {
            if(frq[i]==2) rep=i; 
            if(frq[i]==0) mis=i;
        }
        return new int[]{rep,mis};
    }
}