class Solution {
    public int findNumbers(int[] nums) {
        int lol=0;
        for(int i=0;i<nums.length;i++)
        {
            String a=Integer.toString(nums[i]);
            if(a.length()%2==0) lol++;
        }
        return lol;
    }
}