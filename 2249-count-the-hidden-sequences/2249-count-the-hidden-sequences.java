class Solution {
    public int numberOfArrays(int[] differences, int lower, int upper) {
        long max=0;
        long min=0;
        long sum=0;
        for(int i: differences)
        {
            sum+=i;
            max=Math.max(max,sum);
            min=Math.min(min,sum);
        }
        return (int)Math.max(0,upper-lower-max+min+1);
    }
}