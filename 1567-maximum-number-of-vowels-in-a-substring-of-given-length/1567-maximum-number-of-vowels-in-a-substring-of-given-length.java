class Solution {
    boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
    public int maxVowels(String s, int k) {
        int currcnt = 0;
        int maxcnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isVowel(s.charAt(i))) 
                currcnt++;
            if (i >= k && isVowel(s.charAt(i - k))) 
                currcnt--;
            maxcnt = Math.max(maxcnt, currcnt);
        }
        return maxcnt;
    }

}