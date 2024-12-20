class Solution {
    
//     int result = min(minCost(n-1, cost, memo), minCost(n-2, cost, memo)) + (n == cost.size() ? 0 : cost[n]);
// return memo[n] = result;
      public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int DP[]=new int[n+1];
        Arrays.fill(DP,-1);
           return mincost(cost,n,DP);

    }
        
        
     public static int mincost(int cost[],int n,int DP[]){
        if(n==0||n==1) return DP[n]=0;
      if(DP[n]!=-1){
          return DP[n];
      }
      if(n==2){
          return DP[n]=Math.min(cost[0],cost[1]);
      }
         
         
     return DP[n]=Math.min(mincost(cost,n-1,DP)+cost[n-1] , mincost(cost,n-2,DP)+cost[n-2]);
         
    }
    
}