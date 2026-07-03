class MyCircularQueue {
    int[] q;
    int front;
    int rear;
    int size;
    public MyCircularQueue(int k) {
        q=new int[k];
        size=k;
        front=-1;
        rear=-1;
    }
    
    public boolean enQueue(int value) {
        if(front==(rear+1)%size)return false;
        if(isEmpty())front=0;
        rear=(rear+1)%size;
        q[rear]=value;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty())return false;
        if(front==rear)front=rear=-1;
        else front=(front+1)%size;
        return true;
    }
    
    public int Front() {
        if(isEmpty())return -1;
        return q[front];
    }
    
    public int Rear() {
        if(isEmpty())return -1;
        return q[rear];
    }
    
    public boolean isEmpty() {
        return front==-1;
    }
    
    public boolean isFull() {
        return front==(rear+1)%size;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */