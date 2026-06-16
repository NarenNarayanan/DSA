class Solution {
    public int characterReplacement(String s, int k) {
        int left=0,max_length=0,max_count=0;
        int[] freq=new int[26];
        for(int right=0;right<s.length();right++){
            freq[s.charAt(right)-'A']++;
            int curr=freq[s.charAt(right)-'A'];
            max_count=Math.max(max_count,curr);
            while((right-left+1)-max_count > k){
                freq[s.charAt(left)-'A']--;
                left++;
            }
            max_length=Math.max(max_length,right-left+1);
        }
        return max_length;
    }
}