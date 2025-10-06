class Solution {
    public List<Integer> generateRow(int row){
        List<Integer> result=new ArrayList<>();
        result.add(1);
        int res=1;
        for(int col=1;col<row;col++){
            res=res*(row-col);
            res=res/col;
            result.add(res);
        }
        return result;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            result.add(generateRow(i));
        }
        return result;
    }
}