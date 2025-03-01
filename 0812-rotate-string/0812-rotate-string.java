class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()) return false;
        String lol=s+s;
        return lol.contains(goal);
    }
}