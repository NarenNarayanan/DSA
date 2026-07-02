class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(String s: operations){
            if(s.equals("+")){
                int no1=stack.pop();
                int no2=stack.peek();
                stack.push(no1);
                stack.push(no1+no2);
            }
            else if(s.equals("D")){
                int no1=stack.peek();
                stack.push(no1*2);
            }
            else if(s.equals("C")){
                stack.pop();
            }
            else{
                stack.push(Integer.parseInt(s));
            }
        }
        int ans=0;
        while(!stack.isEmpty()){
            ans+=stack.pop();
        }
        return ans;
    }
}