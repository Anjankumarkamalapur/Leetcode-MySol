class Solution {
    boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public int beautifulSubstrings(String s, int k) {
        int ans = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            int vcnt = 0;
            int ccnt = 0;
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                if (isVowel(ch)) vcnt++;
                else ccnt++;
                if (vcnt==ccnt&&(vcnt*ccnt)%k==0) {
                    ans++;
                }
            }
        }
        return ans;
    }
}
