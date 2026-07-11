class Solution {
    public int maxCount(int m, int n, int[][] ops) {
        if(ops.length==0)return m*n;
        int minrow=m;
        int mincol=n;
        for(int i=0;i<ops.length;i++){
            minrow=Math.min(minrow,ops[i][0]);
            mincol=Math.min(mincol,ops[i][1]);
        }
        return minrow*mincol;
    }
}