class Solution {
    public int maxProfit(int[] prices) {
        int n= prices.length;
        if(n==0){
            return 0;
        }

        int i=0,ans =0,peak=prices[0],valley=prices[0];
        while(i<n-1){
            //valley
            if(i<n-1 && prices[i]>=prices[i+1]){
                i++;
            }
            valley =prices[i];

            //peak
             if(i<n-1 && prices[i]<=prices[i+1]){
                i++;
            }
            peak=prices[i];
            ans=ans+(peak-valley);
        }
        return ans;
    }
}