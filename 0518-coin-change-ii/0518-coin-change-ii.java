class Solution {                               //dp-21 //recursion
    public int change(int amount, int[] coins) {
        int T=amount;
        int n=coins.length;
        int[][] dp=new int[n][T+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        return f(n-1,T,coins,dp);
    }
    public int f(int ind,int T,int[] arr,int[][] dp){
        if(ind==0){
            if(T%arr[0]==0) return 1;
            else return 0;
        }
        
        if(dp[ind][T]!=-1) return dp[ind][T];
        int not_take=f(ind-1,T,arr,dp);
        int take=0;
        if(arr[ind]<=T)
            take= f(ind,T-arr[ind],arr,dp);
        
        return dp[ind][T]= not_take + take;
    }
}