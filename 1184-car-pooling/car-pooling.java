class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        int n=trips.length;
        int m=trips[n-1][2];
        int maxStop=0;
        for(int[] trip : trips)
            maxStop = Math.max(maxStop, trip[2]);
        int[] diff=new int[maxStop+1];
        for(int i=0;i<trips.length;i++){
            int start=trips[i][1];
            int end=trips[i][2];
            int nei=trips[i][0];
            diff[start]+=nei;
            diff[end]-=nei;
        }
        for(int i=1;i<diff.length;i++){
            diff[i]+=diff[i-1];
        }
        for(int i=0;i<diff.length;i++){
            if(diff[i]>capacity)return false;
        }
        return true;
    }
}