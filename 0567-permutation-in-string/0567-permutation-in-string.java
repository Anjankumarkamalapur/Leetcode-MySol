class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k = s1.length();
        char[] s1Arr = s1.toCharArray();
        Arrays.sort(s1Arr);
        String sortedS1 = new String(s1Arr);

        for (int i = 0; i <= s2.length() - k; i++) {
            String sub = s2.substring(i, i + k);
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);

            if (sortedS1.equals(new String(arr))) {
                return true;
            }
        }
        return false;
    }
}