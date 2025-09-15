class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] words = text.split(" ");
        int cnt = 0;
        for(String word:words){
            boolean brk = false;
            for(char c:word.toCharArray()){
                if(brokenLetters.contains(c+"")){
                    brk = true;
                    break;
                }
            }
            if(!brk){
                cnt++;
            }
        }
        return cnt;
    }
}