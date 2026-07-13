class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> list=new ArrayList<>();
        String seq="123456789";
        for(int i=0;i<seq.length();i++){
            for(int j=i+1;j<seq.length();j++){
                String sub=seq.substring(i,j+1);
                int no=Integer.parseInt(sub);
                if(no>=low && no<=high)list.add(no);
            }
        }
        Collections.sort(list);
        return list;
    }
}