class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();    
        for (int a : asteroids) {
            //adding all +ve elements 
            if (a > 0) {
                stack.push(a);
            } 
            else {
                //poping if collision occurs
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() < Math.abs(a)) {
                    stack.pop();
                }
                // adding all -ve elements
                if (stack.isEmpty() || stack.peek() < 0)  {
                    stack.push(a);
                }
                //poping if we are geting same numeber from leftside and rightside(collsion)
                else if (stack.peek() == Math.abs(a)) {
                    stack.pop();
                }
            }
        }

        int[] res = new int[stack.size()];
        int i = stack.size() - 1;
        while(!stack.isEmpty()) {
            res[i--] = stack.pop();
        }
        return res;   
    }
}
