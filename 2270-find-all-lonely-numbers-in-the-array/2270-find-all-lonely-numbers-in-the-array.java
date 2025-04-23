class Solution {
    public List<Integer> findLonely(int[] nums) {
        List<Integer> ls= new ArrayList<>();
        Map<Integer,Integer> freq= new HashMap<>();
        for(int i:nums)
        {
            freq.put(i,freq.getOrDefault(i,0)+1);
        }
        for (int num : freq.keySet()) {
            if (freq.get(num) == 1 && !freq.containsKey(num - 1) && !freq.containsKey(num + 1)) {
                ls.add(num);
            }
        }
        
        return ls;
    }
}