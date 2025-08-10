class Solution {
    public boolean reorderedPowerOf2(int n) {
        String in=Integer.toString(n);
        char a1[]=in.toCharArray();
        Arrays.sort(a1);
        String gi=new String(a1);
        for(int i=0;i<31;i++)
        {
            String curr=Integer.toString((int)Math.pow(2,i));
            char a2[]=curr.toCharArray();
            Arrays.sort(a2);
            String cme=new String(a2);
            if(gi.equals(cme)) return true;
        }
        return false;
    }
}