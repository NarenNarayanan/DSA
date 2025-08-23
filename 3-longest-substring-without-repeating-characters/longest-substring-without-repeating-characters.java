class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.isEmpty()){
            return 0;
        }
        
        int max=1;
        for(int i=0;i<s.length();i++){
            boolean[] seen = new boolean[128];
            for(int j=i;j<s.length();j++){
                if(seen[s.charAt(j)])break;
                seen[s.charAt(j)]=true;
                int len=j-i+1;
                max=Math.max(max,len);
            }
        }
        return max;
    }
}