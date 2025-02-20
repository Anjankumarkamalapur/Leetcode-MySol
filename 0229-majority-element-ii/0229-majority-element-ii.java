class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        int len = n/3;
        HashMap<Integer, Integer> freq = new HashMap<>();
        for(int it : nums) {
            freq.put(it, freq.getOrDefault(it, 0)+1);
        }

        List<Integer> list = new ArrayList<>();
        for (int i: freq.keySet()) {
            if(freq.get(i) > len) {
                list.add(i);
            }
        }
        return list;
    }
}