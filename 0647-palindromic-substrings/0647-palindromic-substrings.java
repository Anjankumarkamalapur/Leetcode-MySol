class Solution {
    public int countSubstrings(String s) {
        int ans=0;
        for(int i=0;i<s.length();i++)
        {
            int even=pal(s, i, i+1);
            int odd=pal(s, i-1, i+1);
            ans+=even+odd+1;
        }
        return ans;
    }
    int pal(String s, int left, int right)
    {
        int cnt=0;
        while(left>=0 && right<=s.length()-1 && s.charAt(left)==s.charAt(right))
        {
            cnt++;
            left--;
            right++;
        }
        return cnt;
    }
}