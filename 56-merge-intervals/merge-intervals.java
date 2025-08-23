class Solution {
   public int[][] merge(int[][] intervals) {
    Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
    int n = intervals.length;
    int i = 0;
    List<int[]> result = new ArrayList<>();

   while(i<n-1){
    if(intervals[i+1][0]>intervals[i][1]){
        result.add(intervals[i]);
        i++;
    }
    else{
        intervals[i+1][0]=intervals[i][0];
        intervals[i+1][1]=Math.max(intervals[i][1],intervals[i+1][1]);
        i++;
    }
   }

    result.add(intervals[n - 1]); 
    return result.toArray(new int[result.size()][]);
}

}