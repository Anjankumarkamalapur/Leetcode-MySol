class Solution {
    int fun(int frq[])
    {
        int least=Integer.MAX_VALUE;
        int most=0;
        for(int i:frq)
        {
            if(i>0)
            {
                least=Math.min(i,least);
                most=Math.max(i,most);
            }
        }
        return most-least;
    }
    public int beautySum(String s) {
        int cnt=0;
        for(int i=0;i<s.length();i++)
        {
            int frq[]=new int[26];
            for(int j=i;j<s.length();j++)
            {
                frq[s.charAt(j)-'a']++;
                cnt+=fun(frq);
            }
        }
        return cnt;
    }
}