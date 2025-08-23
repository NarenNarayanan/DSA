class Solution {
    public int maxArea(int[] height) {
        int max=Integer.MIN_VALUE,low=0,high=height.length-1;
        while(low<high){
            int area=Math.min(height[low],height[high])*(high-low);
            if(height[low]<height[high])low++;
            else{high--;}
            max=Math.max(max,area);
        }
        return max;
    }
}