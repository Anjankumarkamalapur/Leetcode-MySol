class Solution {
    public int longestBeautifulSubstring(String word) {
        int cnt=1;
        int len=1;
        int maxlen=0;
        for(int i=1;i<word.length();i++)
        {
            if(word.charAt(i-1)==word.charAt(i)) len++;
            else if(word.charAt(i-1)<word.charAt(i))
            {
                len++;
                cnt++;
            } 
            else
            {
                cnt=1;
                len=1;
            }
            if(cnt==5) maxlen=Math.max(maxlen, len);
        }
        return maxlen;
    }
}