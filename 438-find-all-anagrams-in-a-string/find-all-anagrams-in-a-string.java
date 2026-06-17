class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result=new ArrayList<>();
        int k=p.length();
        int left=0;
        int[] pfreq=new int[26];
        int[] win=new int[26];
        for(int i=0;i<k;i++){
            pfreq[p.charAt(i)-'a']++;
        }
        for(int right=0;right<s.length();right++){
            win[s.charAt(right)-'a']++;
            if(right-left+1 > k){
                win[s.charAt(left)-'a']--;
                left++;
            }
            if(right-left+1 ==k && Arrays.equals(win,pfreq)){
                result.add(left);
            }
        }
        return result;
    }
}