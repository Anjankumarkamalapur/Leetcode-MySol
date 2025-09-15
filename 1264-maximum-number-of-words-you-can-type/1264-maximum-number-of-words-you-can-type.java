class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        Set<Character> s= new HashSet<>();
        for(int i=0;i<brokenLetters.length();i++){
            s.add(brokenLetters.charAt(i));
        }
        String[] arr=text.split(" ");
        int cnt=0;
        for(String ss: arr){
            int flag=0;
            for(int i=0;i<ss.length();i++){
                if(s.contains(ss.charAt(i))){
                    flag=1;
                    break;
                }
            }
            if(flag==0) cnt++;
        }
        return cnt;
    }
}