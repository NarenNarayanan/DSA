class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if (digits=="" || digits==null){
            return result;
        }
        Map<Character,String> map=new HashMap<>();
        map.put('2',"abc");
        map.put('3',"def");
        map.put('4',"ghi");
        map.put('5',"jkl");
        map.put('6',"mno");
        map.put('7',"pqrs");
        map.put('8',"tuv");
        map.put('9',"wxyz");
        backtrack(0,digits,map,new StringBuilder(),result);
        return result;
    }
    public void backtrack(int i,String digits,Map<Character,String> map,StringBuilder curr,List<String> result){
        if(i==digits.length()){
            result.add(curr.toString());
            return;
        }
        String letters=map.get(digits.charAt(i));
        for(char c: letters.toCharArray()){
            curr.append(c);
            backtrack(i+1,digits,map,curr,result);
            curr.deleteCharAt(curr.length()-1);
        }
    }
}