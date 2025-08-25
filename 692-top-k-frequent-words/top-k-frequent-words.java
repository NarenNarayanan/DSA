class Solution {
    public List<String> topKFrequent(String[] words, int k) {
       Map<String,Integer> map=new HashMap<>();
       List<String> result=new ArrayList<>();
       PriorityQueue<Map.Entry<String,Integer>> pq=new PriorityQueue<>(
        (a,b)->{
            if(!a.getValue().equals(b.getValue())){
                return a.getValue()-b.getValue();
            }
            else{
                return b.getKey().compareTo(a.getKey());
            }
        }
       );
       for(String word : words){
        map.put(word,map.getOrDefault(word,0)+1);
       }
       for(Map.Entry<String,Integer> entry : map.entrySet()){
        pq.add(entry);
        if(pq.size()>k)pq.poll();
       }
       while(!pq.isEmpty()){
        result.add(pq.poll().getKey());
       }
       Collections.reverse(result);
       return result;
    }
}