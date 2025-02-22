class Solution {
    public int characterReplacement(String s, int k) {
        int left=0;
        int right=0;
        int maxlen=0;
        int maxFreq=0;
        HashMap<Character,Integer> hm = new HashMap<>();
        while(right<s.length())
        {
            hm.put(s.charAt(right),hm.getOrDefault(s.charAt(right),0)+1);
            maxFreq = Math.max(maxFreq, hm.get(s.charAt(right)));
            if ((right - left + 1) - maxFreq > k) {
                char leftChar = s.charAt(left);
                hm.put(leftChar, hm.get(leftChar) - 1);
                if (hm.get(leftChar) == 0) {
                    hm.remove(leftChar);
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}