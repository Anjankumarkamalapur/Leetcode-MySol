class Solution {
    public int numRabbits(int[] answers) {
        int ans=0;
        Map<Integer,Integer> hm= new HashMap<>();
        for(int i : answers)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        for(int i:hm.keySet())
        {
            int grpsize=i+1;
            int frq=hm.get(i);
            int grpcnt=(int)Math.ceil((double)frq/grpsize); //when we have same frq many times
            ans+=grpcnt*grpsize;
        }
        return ans;
    }
}