class MinStack {
    Stack<Integer> stack;
    Stack<Integer> minstack;
    int min=Integer.MAX_VALUE;
    public MinStack() {
        stack=new Stack<>();
        minstack=new Stack<>();
    }

    public void push(int value) {
        min=Math.min(min,value);
        minstack.push(min);
        stack.push(value);
    }
    
    public void pop() {
        int no=stack.pop();
        minstack.pop();
        if(!minstack.isEmpty())min=minstack.peek();
        else min=Integer.MAX_VALUE;
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return minstack.peek();
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