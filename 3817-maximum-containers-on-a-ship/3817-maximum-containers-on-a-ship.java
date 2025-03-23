class Solution {
    public int maxContainers(int n, int w, int maxWeight) {
        int no=n*n;
        while(no*w >maxWeight)
        {
            no--;
        }
        return no;
    }
}