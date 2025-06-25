class Solution {
    public int maxProfit(int[] prices) {
        
        int sellprice = prices[prices.length-1];
        int maxprofit = 0;

        for(int i=prices.length-2;i>=0;i--){
            if(sellprice-prices[i]>maxprofit)
            maxprofit = sellprice-prices[i];
            else{
                if(sellprice<prices[i])
                sellprice = prices[i];
            }
        }
        return maxprofit;
    }
}