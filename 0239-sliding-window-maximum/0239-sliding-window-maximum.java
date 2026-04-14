import java.util.*;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>(); // stores indices
        int n = nums.length;
        int[] res = new int[n - k + 1];
        int idx = 0;

        for (int i = 0; i < n; i++) {

            // 1. Remove indices out of window
            if (!dq.isEmpty() && dq.peekFirst() == i - k) {
                dq.pollFirst();
            }

            // 2. Remove smaller elements (useless ones)
            while (!dq.isEmpty() && nums[dq.peekLast()] < nums[i]) {
                dq.pollLast();
            }

            // 3. Add current index
            dq.offerLast(i);

            // 4. Store answer (when window is valid)
            if (i >= k - 1) {
                res[idx++] = nums[dq.peekFirst()];
            }
        }

        return res;
    }
}