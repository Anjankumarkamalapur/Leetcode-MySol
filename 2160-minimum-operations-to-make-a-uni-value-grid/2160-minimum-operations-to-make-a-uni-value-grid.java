class Solution {
    public int minOperations(int[][] grid, int x) {
        int arr[]=new int[grid.length*grid[0].length];
        if(arr.length==1) return 0;
        int idx=0;
        for(int a[]:grid)
        {
            for(int i:a)
            {
                arr[idx]=i;
                idx++;
            }
        }
        Arrays.sort(arr);
        int midele=arr[arr.length/2];
        int cnt=0;
        for(int i:arr)
        {
            int diff=Math.abs(midele-i);
            if(diff%x!=0 )
            {
                return -1;
            }
            else cnt+=diff/x;
        }
        return cnt;
    }
}