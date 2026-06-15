class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int ans=0;
        int left=0,sum=0;
        double avg=0.0;
        for(int right=0;right<arr.length;right++){
            sum+=arr[right];
            if(right-left+1 > k){
                sum-=arr[left];
                left++;
            }
            if(right - left + 1 ==k){
                avg=(double)sum/k;
                if(avg>=threshold)ans++;
            }
        }
        return ans;
    }
}