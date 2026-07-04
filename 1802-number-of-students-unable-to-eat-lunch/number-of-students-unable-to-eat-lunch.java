class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=sandwiches.length;
        Stack<Integer> stack=new Stack<>();
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            stack.push(sandwiches[n-1-i]);
            queue.offer(students[i]);
        }
        int cnt=0;int j=0;
        while(!stack.isEmpty()){
            if(stack.peek()==queue.peek()){
                stack.pop();
                queue.poll();
                cnt++;
            }
            else{
                queue.offer(queue.poll());
            }
            j++;
            if(j==n*n)break;
        }   
        return n-cnt;
    }
}