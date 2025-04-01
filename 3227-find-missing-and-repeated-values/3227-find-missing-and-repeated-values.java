class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int totalNumbers = n * n;
        int[] arr = new int[totalNumbers];
        int idx = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[idx++] = grid[i][j];
            }
        }
        Arrays.sort(arr);
        int[] ans = new int[2];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                ans[0] = arr[i];
                break;
            }
        }
        int expected = 1;
        for (int num : arr) {
            if (num == expected) {
                expected++;
            } else if (num > expected) {
                ans[1] = expected;
                return ans;
            }
        }
        ans[1] = expected;
        return ans;
    }
}