class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm= new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<s.length())
        {
            char ch = s.charAt(right);
            if(hm.containsKey(ch) && hm.get(ch)>=left)
            {
                left=hm.get(ch) +1;
            }
            maxlen=Math.max(maxlen,right-left+1);
            hm.put(ch,right);
            right++;
        }
        return maxlen;
    }
}