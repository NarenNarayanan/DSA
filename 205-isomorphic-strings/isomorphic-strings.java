class Solution {
    public boolean isIsomorphic(String s, String t) {
        int m=s.length(),n=t.length();
        if(m!=n)return false;
        Map<Character,Character> map=new HashMap<>();
        for(int i=0;i<m;i++){
            if(map.getOrDefault(s.charAt(i),t.charAt(i))!=t.charAt(i))return false;
            map.put(s.charAt(i),t.charAt(i));
        }
        map.clear();
        for(int i=0;i<m;i++){
            if(map.getOrDefault(t.charAt(i),s.charAt(i))!=s.charAt(i))return false;
            map.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}