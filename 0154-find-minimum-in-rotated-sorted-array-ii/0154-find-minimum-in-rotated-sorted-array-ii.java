class Solution {
    public int findMin(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int min=Integer.MAX_VALUE;
        while(l<h)
        {
            int mid=l + (h - l) / 2;
            if(nums[l]==nums[mid] && nums[mid]==nums[h])
            {
                l++;
                h--;
            }
            else if(nums[mid]<=nums[h])
            {
                h=mid;
            }
            else
            {
                l=mid+1;
            }
        }
        return nums[l];
    }
}