class Solution {
    public int maxProfit(int[] prices) {
        int currsel = prices[prices.length-1];
        int maxprofit = 0;

        for(int i=prices.length-1;i>=0;i--){
            if(currsel-prices[i]<0){
                currsel = prices[i];
            }else{
                if(maxprofit<(currsel-prices[i]))
                maxprofit = currsel-prices[i];
            }
        }

        return maxprofit;
    }
}