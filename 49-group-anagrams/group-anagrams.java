class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs==null || strs.length==0)return null;
        List<List<String>> result=new ArrayList<>();
        int[] arr={2,3,5,7,11,13,17,19,23,29,31,37,41,43,47,53,59,61,67,71,73,79,83,89,97,101};
        Map<String,List<String>> map=new HashMap<>();
        for(String word : strs){
            char[] charr=word.toCharArray();
            Arrays.sort(charr);
            String str=new String(charr);           
            if(map.containsKey(str)){
                map.get(str).add(word);
            }
            else{
                map.put(str,new ArrayList<>());
                map.get(str).add(word);
            }
        }
        for(List<String> val : map.values()){
            result.add(val);
        }
        return result;
    }
}