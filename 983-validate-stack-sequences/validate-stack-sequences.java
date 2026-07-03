class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack=new Stack<>();
        boolean ans=false;
        int j=0;
        for(int n : pushed){
            stack.push(n);
            while(!stack.isEmpty() && stack.peek()==popped[j]){
                stack.pop();
                j++;
            }
        }
        if(j==popped.length)ans=true;
        return ans;
    }
}