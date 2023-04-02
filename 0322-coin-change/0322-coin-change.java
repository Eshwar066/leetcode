// class Solution {                                 //recursion //dp-20
//     public int coinChange(int[] coins, int amount) {
      
//         int n=coins.length;
//           int[][] dp=new int[n][amount+1];
//         for(int[] row:dp)
//             Arrays.fill(row,-1);
        
//          int ans= f(n-1,amount,coins,dp);
//           if(ans >= (int)Math.pow(10,9)) return -1;
//           return ans;
//     }
//     public int f(int ind, int T,int[] nums,int[][] dp){
//         if(ind==0){
//             if(T%nums[ind]==0) return T/nums[ind];
//             else return (int) Math.pow(10,9);
//         }
        
//         if(dp[ind][T]!=-1) return dp[ind][T];
        // int not_take = 0 + f(ind-1,T,nums,dp);
        // int take=Integer.MAX_VALUE;
        // if(nums[ind]<=T){
        //     take = 1 + f(ind,T-nums[ind],nums,dp);
        // }
        
//         return dp[ind][T]=Math.min(not_take,take);
//     }
// }

class Solution {                                 //Tabulation //dp-20
    public int coinChange(int[] coins, int amount) {
      
      int[] arr=coins;
      int T=amount;  
      int n= arr.length;
    
    int dp[][]=new int[n][T+1];
    
    for(int i=0; i<=T; i++){
        if(i%arr[0] == 0)  
            dp[0][i] = i/arr[0];
        else dp[0][i] = (int)Math.pow(10,9);
    }
    
    for(int ind = 1; ind<n; ind++){
        for(int target = 0; target<=T; target++){
            
            int notTake = 0 + dp[ind-1][target];
            int take = (int)Math.pow(10,9);
            if(arr[ind]<=target)
                take = 1 + dp[ind][target - arr[ind]];
                
             dp[ind][target] = Math.min(notTake, take);
        }
    }
    
    int ans = dp[n-1][T];
    if(ans >=(int)Math.pow(10,9)) return -1;
    return ans;
    }
}