class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        int currsum=0;
        for(int i=nums.length-1;i>=0;i--)
        {
            currsum+=nums[i];
            ls.add(nums[i]);
            if(currsum>sum-currsum)
            {
                break;
            }
        }
        return ls;
    }
}