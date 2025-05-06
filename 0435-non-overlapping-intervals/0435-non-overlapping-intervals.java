class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int ans=0;
        Arrays.sort(intervals,(a,b)->a[1]-b[1]);
        int prevend=intervals[0][1];
        for(int i=1;i<intervals.length;i++)
        {
            if(prevend>intervals[i][0]) ans++;
            else prevend=intervals[i][1];
        }
        return ans;
    }
}