class Solution {
    public double myPow(double x, int n) {
        long power=n;
        if(n<0){
            power=-power;
            x=1/x;
        }
        return solve(x,power);
    }
    public double solve(double x,long n){
        if(n==0)return 1.0;
        if(n==1)return x;
        double half=solve(x,n/2);
        if(n%2==0)return half*half;
        return half*half*x;
    }
}