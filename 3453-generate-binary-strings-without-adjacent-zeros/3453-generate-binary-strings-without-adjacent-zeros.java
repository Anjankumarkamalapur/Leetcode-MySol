class Solution {
    public List<String> validStrings(int n) {
        List<String> ans = new ArrayList<>();
        generateStrings(n, "", ans);
        return ans;
    }

    private void generateStrings(int n, String curr, List<String> ans) {
        if (curr.length() == n) {
            ans.add(curr);
            return;
        }

        // Add "1" in all cases
        generateStrings(n, curr + "1", ans);

        // Add "0" only if the last char is not "0"
        if (curr.length() == 0 || curr.charAt(curr.length() - 1) != '0') {
            generateStrings(n, curr + "0", ans);
        }
    }
}
