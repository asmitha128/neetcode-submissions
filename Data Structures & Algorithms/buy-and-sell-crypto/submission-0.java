class Solution {
    public int maxProfit(int[] prices) {
        int x=prices.length;
        int profit=0;
        int max=0;
        for(int i=0;i<x-1;i++){
            for(int j=i+1;j<x;j++){
                profit=prices[j]-prices[i];
               if(profit>max){
                max=profit;
               }
            }
        }
       
        return max;
    }
}
