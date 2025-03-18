class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String w[]=s.split("\\s+");
        String ans="";
        for(int i=w.length-1;i>=0;i--)
        {
            ans+=w[i]+" ";
        }
        return ans.trim();
    }
}