class Solution {
    long MOD=1000000007;
    public int countGoodNumbers(long n) {
        long odd=n/2;
        long even=n-odd;
        long ans=1;
        return (int)((power(4,odd)*power(5,even))%MOD);
    }
    public long power(long x,long n){
        if(n==0)return 1;
        if(n==1)return x;
        long half=power(x,n/2);
        long ans=(half*half);
        if(n%2==0)return (ans)%MOD;
        return (ans*x)%MOD;
    }
}