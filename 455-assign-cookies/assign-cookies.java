class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int i=0;
        int ans=0;
        for(int j=0;j<s.length;j++){
            if(i<g.length && s[j]>=g[i]){
                ans++;
                i++;
            }
        }
        return ans;
    }
}