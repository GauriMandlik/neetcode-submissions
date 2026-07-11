class Solution {
    public int maxProfit(int[] prices) {
        int minPrice=Integer.MAX_VALUE;
        int profit=0;

        for(int price:prices){
            if(price<minPrice) minPrice=Math.min(minPrice,price);
            else{
                int currprofit=price-minPrice;
                if(currprofit>profit) profit=currprofit;
            }
        }
        return profit;
    }
}
