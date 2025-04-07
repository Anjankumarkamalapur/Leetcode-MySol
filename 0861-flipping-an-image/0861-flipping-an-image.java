class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int ans[][]= new int[image.length][image[0].length];
        int y=0;
        for(int arr[]:image)
        {
            int i=0;
            int j=arr.length-1;
            while(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        for (int x =0; x < arr.length; x++) 
        {
            if(arr[x]==0) ans[y][x]=1;
            else ans[y][x]=0;
        }
        y++;
        }
        return ans;
    }
}