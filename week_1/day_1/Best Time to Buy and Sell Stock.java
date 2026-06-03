class Solution {
    public int maxProfit(int[] prices) {
        int max=0;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            
            if(min>prices[i]){
                min=prices[i];
            }
            else{
                int profit=prices[i]-min;
                max=Math.max(profit,max);
            }
        }
        return max;
    }
}
