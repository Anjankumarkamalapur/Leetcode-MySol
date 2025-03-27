class Solution {
    public int minimumIndex(List<Integer> nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i:nums)
        {
            hm.put(i,hm.getOrDefault(i,0)+1);
        }
        int maxcnt=0;
        int num=0;
        for(int i : hm.keySet())
        {
            if(hm.get(i)>maxcnt)
            {
                maxcnt=hm.get(i);
                num=i;
            }
        }
        int cnt=0;
        for(int i=0;i<nums.size();i++)
        {
            if(num==nums.get(i))
            {
                cnt++;
            }
            int leftsize=i+1;
            int rightsize=nums.size()-leftsize;
            int rightcnt=maxcnt-cnt;
            if(cnt*2>leftsize && rightcnt*2>rightsize) return i;
        }
        return -1;
    }
}
