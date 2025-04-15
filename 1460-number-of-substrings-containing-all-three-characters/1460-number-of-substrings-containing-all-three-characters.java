class Solution {
    public int numberOfSubstrings(String s) {
        int count = 0;
        int left = 0;
        int right=0;
        int[] chcnt = new int[3];

        while(right<s.length()) 
        {
            chcnt[s.charAt(right) - 'a']++;
            while (chcnt[0] > 0 && chcnt[1] > 0 && chcnt[2] > 0) 
            {
                count += s.length()-right;
                chcnt[s.charAt(left) - 'a']--;
                left++;
            }
            right++;
        }

        return count;
    }
}