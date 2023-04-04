/*
class Solution {                               //dp-21 //recursion-memoization
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
*/

class Solution {                               //dp-21 //Tabulation
    public int change(int amount, int[] coins) {
        int T=amount;
        int n=coins.length;
        int[][] dp=new int[n][T+1];
         
        for(int i=0;i<=T;i++){
            if(i%coins[0]==0)  dp[0][i]=1;
        }
        
        for(int ind=1;ind<n;ind++){
            for(int t=0;t<=T;t++){
                int not_take=dp[ind-1][t];
                int take=0;
                if(coins[ind]<=t)
                     take= dp[ind][t-coins[ind]];
                
                dp[ind][t]=not_take+take;
            }
        }
        return dp[n-1][T];
    }
}


    
    
