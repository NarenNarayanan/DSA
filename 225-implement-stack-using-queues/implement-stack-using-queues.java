class MyStack {
    Queue<Integer> q;
    Queue<Integer> help;
    public MyStack() {
        q=new LinkedList<>();
        help=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        int n=q.size();
        for(int i=0;i<n-1;i++){
            help.offer(q.poll());
        }
        int top=q.poll();
        while(!help.isEmpty()){
            q.offer(help.poll());
        }
        return top;
    }
    
    public int top() {
        int n=q.size();
        for(int i=0;i<n-1;i++){
            help.offer(q.poll());
        }
        int top=q.poll();
        while(!help.isEmpty()){
            q.offer(help.poll());
        }
        q.offer(top);
        return top;
    }
    
    public boolean empty() {
        return q.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */