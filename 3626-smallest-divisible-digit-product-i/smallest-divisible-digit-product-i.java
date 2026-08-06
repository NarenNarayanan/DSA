class Solution {
    public int smallestNumber(int n, int t) {
        for(int i=n;i<=100;i++){
            if(i==100)return 100;
            if(i<10){
                if(i%t==0)return i;
                continue;
            }
            int last=i%10;
            int first=i/10;
            if((last*first)%t==0)return i;
        }
        return -1;
    }
}