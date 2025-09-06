class Solution {
    public void help(String digits,Map<Character,String> map,List<String> result,StringBuilder curr,int index){
        if(index==digits.length()){
            result.add(curr.toString());
            return;
        }
        char ch=digits.charAt(index);
        String letters=map.get(ch);
        for(char letter : letters.toCharArray()){
            curr.append(letter);
            help(digits,map,result,curr,index+1);
            curr.deleteCharAt(curr.length()-1);
        }
    }
    public List<String> letterCombinations(String digits) {
        List<String> result=new ArrayList<>();
        if(digits==null || digits.equals(""))return result;
        Map<Character, String> map = new HashMap<>();
        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");
        help(digits,map,result,new StringBuilder(),0);
        return result;
    }
}