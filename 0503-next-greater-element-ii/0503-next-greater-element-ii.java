class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        Stack<Integer> stack = new Stack();
        int arr[] = new int[nums.length];
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        for(int i=2*n-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek()<=nums[i%n]){
                    stack.pop();
            }               
            if(!stack.isEmpty() ){
                arr[i%n]=stack.peek();
            }
            stack.push(nums[i%n]);
        }
    return arr;
   }
}       