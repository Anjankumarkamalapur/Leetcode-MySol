import java.util.*;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        int k = p.length();

        char[] pArr = p.toCharArray();
        Arrays.sort(pArr);
        String sortedP = new String(pArr);

        for (int i = 0; i <= s.length() - k; i++) {
            String sub = s.substring(i, i + k);
            char[] arr = sub.toCharArray();
            Arrays.sort(arr);

            if (sortedP.equals(new String(arr))) {
                res.add(i);
            }
        }
        return res;
    }
}