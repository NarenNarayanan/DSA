class Solution {
    public void help(List<String> ans,int n,String curr,int open,int close){
        if(curr.length() == 2 * n){
            ans.add(curr);
            return;
        }
        if(open<n){
            help(ans,n,curr+"(",open+1,close);
        }
        if(open>close) help(ans,n,curr+")",open,close+1);
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans=new ArrayList<>();
        help(ans,n,"",0,0);
        return ans;
    }
}