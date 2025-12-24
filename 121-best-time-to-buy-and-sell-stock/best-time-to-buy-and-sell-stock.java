class Solution {
    public int maxProfit(int[] prices) {
       int min=prices[0],profit=0,max2=0;
       for(int price: prices){
        min=Math.min(min,price);
        profit=price-min;
        max2=Math.max(max2,profit);
       }
       return max2;
    }
}