class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length)
        {
            int cnt=0;
            char currch=chars[i];
            while(i<chars.length && chars[i]==currch)
            {
                cnt++;
                i++;
            }
            chars[idx++]=currch;
            if(cnt>1)
            {
                for(char c: String.valueOf(cnt).toCharArray())
                {
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}