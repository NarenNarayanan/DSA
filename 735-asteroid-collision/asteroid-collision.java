class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int as : asteroids){
            while(!stack.isEmpty() && stack.peek()>0 && as<0){
                if(stack.peek()<-as)stack.pop();
                else if(stack.peek()==-as){
                    as=0;
                    stack.pop();
                }
                else{
                    as=0;
                }
            }
            if(as!=0)stack.push(as);
        }
        int i=stack.size()-1;
        int[] ans=new int[stack.size()];
        while(!stack.isEmpty()){
            ans[i--]=stack.pop();
        }
        return ans;
    }
}