class Solution {
    public boolean isIsomorphic(String s, String t) {
        int h1[]=new int[127];
        int h2[]=new int[127];
        Arrays.fill(h1,-1);
        Arrays.fill(h2,-1);
        if(s.length()!=t.length()) return false;

        for(int i=0;i<s.length();i++)
        {
            char c1=s.charAt(i);
            char c2=t.charAt(i);
            if(h1[c1]!=-1 )
            {
                if(h1[c1]!=c2) return false;
            } 
            if(h2[c2]!=-1)
            {
                if(h2[c2]!=c1) return false;
            }
           
            h1[s.charAt(i)]=t.charAt(i);
            h2[t.charAt(i)]=s.charAt(i);
        }
        return true;
    }
}