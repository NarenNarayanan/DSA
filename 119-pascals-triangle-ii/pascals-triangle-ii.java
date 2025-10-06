class Solution {
    public List<Integer> getRow(int rowIndex) {
        rowIndex++;
        List<Integer> result=new ArrayList<>();
        long res=1;
        result.add(1);
        for(int i=1;i<rowIndex;i++){
            res=res*(rowIndex-i);
            res=res/i;
            result.add((int)res);
        }
        return result;
    }
}