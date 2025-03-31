class Solution {
    public int alternateDigitSum(int n) {
        int ans = 0;
        while (n != 0) 
        {
            String a = Integer.toString(n);
            int len = a.length();
            if (len % 2 == 0) 
            {
                int dig = n % 10;
                ans -= dig;
                n /= 10;
            }
            else
            {
                int dig = n % 10;
                ans += dig;
                n /= 10;
            }
        }
        return ans;
    }
}