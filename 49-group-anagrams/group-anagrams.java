class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       List<List<String>> result=new ArrayList<>();
       Map<String,List<String>> map=new HashMap<>();
       for(String str : strs){
        int[] freq=new int[26];
        for(char c : str.toCharArray()){
            freq[c-'a']++;
        }
        String s=Arrays.toString(freq);
        List<String> list=map.get(s);
        if(list==null){
            list=new ArrayList<>();
            map.put(s,list);
        }
        list.add(str);
       }
       return new ArrayList<>(map.values());
    }
}