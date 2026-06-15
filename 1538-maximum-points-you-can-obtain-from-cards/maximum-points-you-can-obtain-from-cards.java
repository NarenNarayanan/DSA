class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int left=0,sum=0,max=0;
        int n=cardPoints.length;
        for(int right=0;right<k;right++){
            sum+=cardPoints[right];
        }
        max=sum;
        for(int i=1;i<=k;i++){
            sum=sum-cardPoints[k-i];
            sum=sum+cardPoints[n-i];
            max=Math.max(max,sum);
        }
        return max;
    }
}