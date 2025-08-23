class Solution {
    public int myAtoi(String s) {
        s=s.trim();
        int len=s.length();
        if(len==0)return 0;
        long n=0;
        boolean isNeg=false;int i=0;
        if(s.charAt(0)=='-'){isNeg=true;i=1;}
        else if(s.charAt(0)=='+'){isNeg=false;i=1;}
        for(;i<len;i++){
        if(!Character.isDigit(s.charAt(i))){
                break;
            }
            int l=s.charAt(i)-'0';
            n=n*10+l;
             if (!isNeg && n > Integer.MAX_VALUE) return Integer.MAX_VALUE;
            if (isNeg && -n < Integer.MIN_VALUE) return Integer.MIN_VALUE;
        }
        if(isNeg)n=n*-1;
           
    return (int)n;
    }
}