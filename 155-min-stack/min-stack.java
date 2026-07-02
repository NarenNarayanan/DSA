class MinStack {
    Stack<Integer> stack;
    PriorityQueue<Integer> min;
    public MinStack() {
        stack=new Stack<>();
        min=new PriorityQueue<>();
    }

    public void push(int value) {
        stack.push(value);
        min.offer(value);
    }
    
    public void pop() {
        int no=stack.pop();
        min.remove(no);
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return min.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */