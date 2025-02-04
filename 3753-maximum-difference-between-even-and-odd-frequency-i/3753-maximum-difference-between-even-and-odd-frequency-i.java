class Solution {
    public int maxDifference(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(char a: s.toCharArray())
            {
                hm.put(a,hm.getOrDefault(a,0)+1);
            }
        int om=Integer.MIN_VALUE;
        int em=Integer.MAX_VALUE;
        for(int i: hm.values())
            {
                if(i%2!=0)
                {
                    om=Math.max(i,om);
                }
                else
                {
                    em=Math.min(i,em);
                }
            }
        return om-em;
    }
}