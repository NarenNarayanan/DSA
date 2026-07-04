class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int n=sandwiches.length;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<n;i++){
            queue.offer(students[i]);
        }
        int cnt=0;int j=0;int rotations=0;
        while(j<n && rotations<queue.size()){
            if(sandwiches[j]==queue.peek()){
                j++;
                queue.poll();
                cnt++;
                rotations=0;
            }
            else{
                queue.offer(queue.poll());
                rotations++;
            }
        }   
        return n-cnt;
    }
}