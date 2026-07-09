class Solution {
    public int calculate(String s) {
        int curr=0;
        int ans=0;
        int sign=1;
        Stack<Integer> st=new Stack<>();
        for(char c : s.toCharArray()){
            if(Character.isDigit(c)){
                curr=curr*10+(c-'0');
            }
            else if(c=='+' || c=='-'){
                ans=ans+(sign * curr);
                curr=0;
                sign = c == '+' ? 1 : -1;
            }
            else if(c=='('){
                st.push(ans);
                st.push(sign);
                curr=0;
                ans=0;
                sign=1;
            }
            else if(c==')'){
                ans=ans+(sign*curr);
                curr=0;
                int prevSign=st.pop();
                int prevAns=st.pop();
                ans=ans*prevSign + prevAns;
            }
            else continue;
        }
        ans=ans+(sign*curr);
        return ans;
    }
}