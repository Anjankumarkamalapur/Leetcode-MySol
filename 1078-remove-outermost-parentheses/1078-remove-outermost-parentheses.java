class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result = new StringBuilder();
        int cnt = 0; 
        int start = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                cnt++;
            } else {
                cnt--;
            }
            if (cnt == 0) {
                result.append(s.substring(start + 1, i));
                start = i + 1; 
            }
        }
        return result.toString();
    }
}