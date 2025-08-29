class Solution {
    public int hammingWeight(int n) {
        int mask=n;
        int count=0;
        while(mask>0){
            count++;
            mask&=mask-1;
        }
        return count;
    }
}