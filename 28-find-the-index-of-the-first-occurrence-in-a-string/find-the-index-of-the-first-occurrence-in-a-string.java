class Solution {
    public int strStr(String haystack, String needle) {
       int n=needle.length();
       int m=haystack.length();
       for(int i=0;i<=m-n;i++){
        String s=haystack.substring(i,i+n);
        if(s.equals(needle))return i;
       }
       return -1;
    }
}