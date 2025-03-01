class Solution {
    public int[][] merge(int[][] arr) {
        List<int[]> res = new ArrayList<>();
        Arrays.sort(arr, (a,b) -> Integer.compare(a[0], b[0]));
        int start = arr[0][0], prev_end = arr[0][1];

        for(int i=1; i<arr.length; i++){
            if( arr[i][0]<=prev_end ){
                prev_end = Math.max(prev_end, arr[i][1]);
            } 
            else {
                res.add(new int[]{start, prev_end});
                start = arr[i][0];
                prev_end = arr[i][1];
            }
        }
        res.add(new int[]{start, prev_end});

        return res.toArray(new int[res.size()][]);
    }
}
