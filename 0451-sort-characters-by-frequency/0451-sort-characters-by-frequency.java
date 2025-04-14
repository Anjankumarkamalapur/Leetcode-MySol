class Solution {
    public String frequencySort(String s) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for (char c : s.toCharArray()) 
        {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        HashSet<Integer> set=new HashSet<>();
        for(char ch:freqMap.keySet())
        {
            set.add(freqMap.get(ch));
        }
        
        List<Integer> freqList = new ArrayList<>();
        for(int i:set)
        {
            freqList.add(i);
        }
        Collections.sort(freqList, Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        for (int freq : freqList) {
            for (Iterator<Map.Entry<Character, Integer>> it = freqMap.entrySet().iterator(); it.hasNext();) 
            {
                Map.Entry<Character, Integer> entry = it.next();
                if (entry.getValue() == freq) 
                {
                    for (int i = 0; i < freq; i++) 
                    {
                        result.append(entry.getKey());
                    }
                    it.remove(); 
                }
            }
        }
        return result.toString();
    }
}