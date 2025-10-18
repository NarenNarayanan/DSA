class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length())return false;
        String str=goal+goal;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(s.equals(str.substring(i,i+n)))return true;
        }
        return false;
    }
}