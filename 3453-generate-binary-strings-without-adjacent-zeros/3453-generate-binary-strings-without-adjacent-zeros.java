class Solution {
    public List<String> validStrings(int n) {
        List<String> ans=new ArrayList<>();
        ans.add("0");
        ans.add("1");
        if(n==1) return ans;
        for(int i=2;i<=n;i++)
        {
            List<String> ls=new ArrayList<>();
            for(int j=0;j<ans.size();j++)
            {
                String temp=ans.get(j);
                if(temp.charAt(temp.length()-1)=='1')
                {
                    ls.add(temp+"1");
                    ls.add(temp+"0");
                }
                else
                {
                    ls.add(temp+"1");
                }
            }
            ans=ls;
        }
        return ans;
    }
}