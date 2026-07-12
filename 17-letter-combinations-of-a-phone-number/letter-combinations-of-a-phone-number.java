class Solution {
    public void help(String digits,String[] phone,List<String> ans,String str,int index){
        if(index==digits.length()){
            ans.add(str);
            return;
        }
        String temp=phone[digits.charAt(index)-'0'];
        for(int i=0;i<temp.length();i++){
            help(digits,phone,ans,str+temp.charAt(i),index+1);
        }
    }
    public List<String> letterCombinations(String digits) {
        String[] phone = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> ans=new ArrayList<>();
        help(digits,phone,ans,"",0);
        return ans;
    }
}