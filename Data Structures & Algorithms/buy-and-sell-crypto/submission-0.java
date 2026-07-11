class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int n=prices.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                if(prices[j]>prices[i]){
                    int currentprofit=prices[j]-prices[i];
                    profit=Math.max(profit,currentprofit);
                }
            }
        } 
        return profit;
    }
}
