class Solution {
    public int divisorSubstrings(int num, int k) {
        int ans=0;
        String s=String.valueOf(num);
        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            int substr=Integer.parseInt(sub);
            if(substr!=0 && num%substr==0)ans++;
        }
        return ans;
    }
}