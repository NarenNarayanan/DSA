class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map=new HashMap<>();
        for(String s : strs){
            int [] freq=new int[26];
            for(char c : s.toCharArray()){
                freq[c-'a']++;
            }
            String key=Arrays.toString(freq);
            List<String> group=map.get(key);
            if(group==null){
                group=new ArrayList<>();
                map.put(key,group);
            }
            group.add(s);
        }
        return new ArrayList<>(map.values());
    }
}