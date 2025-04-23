class Solution {
    public int longestPalindrome(String s) {
        int ans=0;
        Map<Character, Integer> hm = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        boolean hasodd=false;
        for(char ch:hm.keySet())
        {
            if(hm.get(ch)%2==0)
            {
                ans+=hm.get(ch);
            }
            else
            {
                ans+=hm.get(ch)-1;
                hasodd=true;
            }
        }
        return hasodd?ans+1:ans;
    }
}