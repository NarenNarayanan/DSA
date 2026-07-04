class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans=new int[prices.length];
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<prices.length;i++){
            while(!stack.isEmpty() && prices[i]<=prices[stack.peek()]){
                int n=stack.pop();
                ans[n]=prices[i];
            }
            stack.push(i);
        }
        for(int i=0;i<prices.length;i++){
            prices[i]-=ans[i];
        }
        return prices;
    }
}