class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int sum=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && height[i]>height[stack.peek()]){
                int bottom=stack.pop();
                if(stack.isEmpty())break;
                int left=stack.peek();
                int width=i-left-1;
                int bound=Math.min(height[left],height[i])-height[bottom];
                sum+=bound*width;
            }
            stack.push(i);
        }
        return sum;
    }
}