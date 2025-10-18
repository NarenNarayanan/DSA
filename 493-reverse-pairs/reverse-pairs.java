class Solution {
    int count=0;
    public void countPair(int [] arr, int left, int mid, int right){
        int ptr=mid+1;
        for(int i=left;i<=mid;i++){
            while(ptr<=right && (long)arr[i] > 2L*arr[ptr])ptr++;
            count = count + (ptr-(mid+1));
        }
    }
    public void mergesort(int [] arr,int left, int right){
        if(left<right){
            int mid=(left+right)/2;

            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);
            countPair(arr,left,mid,right);
            merge(arr,left,mid,right);
        }
    }
    public void merge(int [] arr, int left, int mid, int right){
        int n1=mid-left+1;
        int n2=right-mid;

        int [] L = new int[n1];
        int [] R = new int[n2];

        for(int i=0;i<n1;i++){
            L[i]=arr[left+i];
        }
        for(int i=0;i<n2;i++){
            R[i]=arr[mid+1+i];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(L[i]>R[j]){
                arr[k++]=R[j++];
            }
            else{
                arr[k++]=L[i++];
            }
        }
        while(i<n1){
            arr[k++]=L[i++];
        }
        while(j<n2){
            arr[k++]=R[j++];
        }
    }
    public int reversePairs(int[] nums) {
        int left=0,right=nums.length-1;
        mergesort(nums,left,right);
        return count;
    }
}