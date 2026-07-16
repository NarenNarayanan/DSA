class Solution {
    public int help(List<List<Integer>> triangle,int row,int col,List<List<Integer>> dp){
        int m=triangle.size();
        if(row>=m)return Integer.MAX_VALUE;
        if(row==m-1){
            return triangle.get(row).get(col);
        }
        if(dp.get(row).get(col)!=Integer.MAX_VALUE)return dp.get(row).get(col);
        int same=help(triangle,row+1,col,dp);
        int plusone=help(triangle,row+1,col+1,dp);
        dp.get(row).set(col,triangle.get(row).get(col) + Math.min(same,plusone));
        return dp.get(row).get(col);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        List<List<Integer>> dp = new ArrayList<>();

        for (List<Integer> row : triangle) {
        List<Integer> temp = new ArrayList<>();
            for (int i = 0; i < row.size(); i++) {
                temp.add(Integer.MAX_VALUE);
            }
            dp.add(temp);
        }
        return help(triangle,0,0,dp);
    }
}