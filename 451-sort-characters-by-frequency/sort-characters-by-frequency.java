class Solution {
    public String frequencySort(String s) {
        StringBuilder str=new StringBuilder();
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        PriorityQueue<Map.Entry<Character,Integer>> pq =new PriorityQueue<>(
            (a,b)->b.getValue()-a.getValue()
        );
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            pq.add(entry);
        }
        while(!pq.isEmpty()){
            int x=pq.peek().getValue();
            char ch=pq.poll().getKey();
            for(int i=0;i<x;i++)
                str.append(ch);
        }
        return str.toString();
    }
}