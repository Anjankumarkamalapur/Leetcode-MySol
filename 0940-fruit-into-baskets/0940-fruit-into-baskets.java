class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> hm= new HashMap<>();
        int left=0;
        int right=0;
        int maxlen=0;
        while(right<fruits.length)
        {
            hm.put(fruits[right],hm.getOrDefault(fruits[right],0)+1);
            if(hm.size()>2)
            {
                hm.put(fruits[left],hm.get(fruits[left])-1);
                if(hm.get(fruits[left])==0)
                {
                    hm.remove(fruits[left],0);
                }
                left++;
            }
                maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
}