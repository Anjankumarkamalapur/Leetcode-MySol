class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        int k = set.size();

        int ans = 0;
        Map<Integer, Integer> freq = new HashMap<>();
        int left = 0;

        for (int right = 0; right < n; right++) {
            freq.put(nums[right], freq.getOrDefault(nums[right], 0) + 1);

            while (freq.size() == k) {
                // For current `left`, all subarrays [left, right], [left, right+1], ... [left, n-1]
                // will be complete, because they all include all distinct elements
                ans += (n - right);  // All subarrays from [left..right] to [left..n-1] will be complete

                // Move the window
                freq.put(nums[left], freq.get(nums[left]) - 1);
                if (freq.get(nums[left]) == 0) {
                    freq.remove(nums[left]);
                }
                left++;
            }
        }

        return ans;
    }
}
