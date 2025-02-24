class MinStack {

    private Stack<Long> stack;
    private long min; // Stores the current minimum

    public MinStack() {
        stack = new Stack<>();
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            min = val;
            stack.push((long) val);
        } else {
            if (val < min) {
                stack.push(2L * val - min); // Encoded value
                min = val;
            } else {
                stack.push((long) val);
            }
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            if (stack.peek() < min) { // Encoded min value found
                min = 2 * min - stack.pop(); // Restore previous min
            } else {
                stack.pop();
            }
        }
    }

    public int top() {
        if (stack.isEmpty()) return -1; // Edge case handling
        long top = stack.peek();
        return (top < min) ? (int) min : (int) top;
    }

    public int getMin() {
        return (int) min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */