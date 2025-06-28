class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        ArrayList<Integer> dif=new ArrayList<>();
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)!=s2.charAt(i))
            {
                dif.add(i);
            }
        }
        if(dif.size()!=2) return false;
        return s1.charAt(dif.get(0))==s2.charAt(dif.get(1)) && s1.charAt(dif.get(1))==s2.charAt(dif.get(0));
    }
}