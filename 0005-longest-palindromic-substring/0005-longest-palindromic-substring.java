class Solution {
    static boolean ispal(String check)
    {
        int l=0;
        int h=check.length()-1;
        while(l<=h)
        {
            if(check.charAt(l)!=check.charAt(h))
            {
                return false;
            }
            l++;
            h--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int maxlen=0;
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(j-i+1>maxlen && ispal(s.substring(i,j+1)))
                {
                    maxlen=j-i+1;
                    ans=s.substring(i,j+1);
                }
            }
        }
        return ans;
    }
}