class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        // Count frequency of each number
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        // Create buckets: index is frequency, each bucket stores list of numbers
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            if (bucket[freq] == null) {
                bucket[freq] = new ArrayList<>();
            }
            bucket[freq].add(key);
        }

        // Collect top K frequent elements from the bucket
        List<Integer> result = new ArrayList<>();
        for (int i = nums.length; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }

        // Convert result to int array
        int[] topK = new int[k];
        for (int i = 0; i < k; i++) {
            topK[i] = result.get(i);
        }

        return topK;
    }
}
