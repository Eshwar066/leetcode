class Solution {                                 //recursion
    public int coinChange(int[] coins, int amount) {
      
        int n=coins.length;
          int[][] dp=new int[n][amount+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        
         int ans= f(n-1,amount,coins,dp);
          if(ans >= (int)Math.pow(10,9)) return -1;
          return ans;
    }
    public int f(int ind, int T,int[] nums,int[][] dp){
        if(ind==0){
            if(T%nums[ind]==0) return T/nums[ind];
            else return (int) Math.pow(10,9);
        }
        
        if(dp[ind][T]!=-1) return dp[ind][T];
        int not_take = 0 + f(ind-1,T,nums,dp);
        int take=Integer.MAX_VALUE;
        if(nums[ind]<=T){
            take = 1 + f(ind,T-nums[ind],nums,dp);
        }
        
        return dp[ind][T]=Math.min(not_take,take);
    }
}