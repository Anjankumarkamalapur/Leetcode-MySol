class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:arr)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        List<Integer> freq=new ArrayList<>(hm.values());
        Collections.sort(freq);
        int uni_cnt=freq.size();
        for(int f:freq)
        {
            if(k>=f)
            {
                k-=f;
                uni_cnt--;
            }
            else break;
        }
        return uni_cnt;
    }
}