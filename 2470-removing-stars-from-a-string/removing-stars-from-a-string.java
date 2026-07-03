class Solution {
    public String removeStars(String s) {
        Stack<Character> stack=new Stack<>();
        for(char c :s.toCharArray()){
            if(c=='*')stack.pop();
            else stack.push(c);
        }
        char[] c=new char[stack.size()];
        int i=stack.size()-1;
        while(!stack.isEmpty()){
            c[i--]=stack.pop();
        }
        return String.valueOf(c);
    }
}