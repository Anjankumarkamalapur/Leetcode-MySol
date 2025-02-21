class Solution {
    public int maxProduct(int[] nums) {
        int psum = 1;
        int sufsum = 1;
        int max= Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++)
        {
            if(psum == 0) psum=1;
            if(sufsum == 0) sufsum=1;

            psum *= nums[i];
            sufsum *= nums[nums.length-i-1];
            max=Math.max(max,Math.max(psum, sufsum));
        }
        return max;
    }
}