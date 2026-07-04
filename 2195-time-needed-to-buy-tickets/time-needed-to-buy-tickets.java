class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int time=0;
        Queue<Integer> queue=new LinkedList<>();
        for(int i=0;i<tickets.length;i++){
            queue.offer(i);
        }
        while(true){
            int person=queue.poll();
            tickets[person]--;
            time++;
            if(person==k && tickets[person]==0)return time;
            if(tickets[person]!=0)queue.offer(person);
        }
    }
}