class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int k=p.length();
        int left=0;
        HashMap<Character, Integer> freq = new HashMap<>();
        for(int i=0;i<p.length();i++){
            freq.put(p.charAt(i),freq.getOrDefault(p.charAt(i),0)+1);
        }
        for(int right=0;right<s.length();right++){
            freq.put(s.charAt(right),freq.getOrDefault(s.charAt(right),0)-1);
            if (freq.get(s.charAt(right)) == 0) {
                    freq.remove(s.charAt(right));
            };
            while((right-left+1) > k){
                freq.put(s.charAt(left),freq.getOrDefault(s.charAt(left),0)+1);
                if (freq.get(s.charAt(left)) == 0) {
                    freq.remove(s.charAt(left));
                };
                left++;
            }
            if((right-left+1== k) && freq.isEmpty()){
                result.add(left);
            }
        }
        return result;
    }
}