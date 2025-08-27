class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        int ans=0,count=0;
        boolean hasOdd=false;
        for(int num : map.values()){
            if(num%2==0){
                ans+=num;
            }
            else{
                ans+=num-1;
                hasOdd=true;
            }
        }
        if(hasOdd)ans++;
        return ans;
    }
}