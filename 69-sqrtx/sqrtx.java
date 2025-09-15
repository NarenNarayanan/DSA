class Solution {
    public int mySqrt(int x) {
        if(x==0)return 0;
        if(x<=3)return 1;
        int left=2,right=x/2;
        while(left<=right){
            int mid=left+(right-left)/2;
            long midsquare=(long)mid*mid;
            if(midsquare==x)return mid ;
            else if(midsquare<x)left=mid+1;
            else right=mid-1;
        }
        return right;
    }
}