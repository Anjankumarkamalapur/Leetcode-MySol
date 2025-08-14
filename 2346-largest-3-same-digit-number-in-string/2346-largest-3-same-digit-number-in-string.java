class Solution {
    public String largestGoodInteger(String num) {
        int good=Integer.MIN_VALUE;
        for(int i=0;i<num.length()-2;i++)
        {
            if(num.charAt(i)==num.charAt(i+1) && num.charAt(i+2)==num.charAt(i+1))
            {
                good=Math.max((int)num.charAt(i), good);
            }
        }
        if(good !=Integer.MIN_VALUE){
            char ch=(char)good;
            return new String(new char[]{ch, ch, ch});
        }   
        return "";
    }
}