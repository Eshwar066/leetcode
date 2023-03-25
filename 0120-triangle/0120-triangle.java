class Solution {                                         //striver dp-11 memoization
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
         int dp[][]=new int[n][n];
        for(int row[]: dp)
         Arrays.fill(row,-1);
        return minimumPathSumUtil(0,0,triangle,n,dp);
    }
    public int minimumPathSumUtil(int i, int j,List<List<Integer>> triangle,int n,int[][] dp){
        if(i==n-1) return triangle.get(n-1).get(j); //base case
        
        if(dp[i][j]!=-1) return dp[i][j];
        int d=triangle.get(i).get(j) +  minimumPathSumUtil(i+1,j,triangle,n,dp);
        int dia=triangle.get(i).get(j) +  minimumPathSumUtil(i+1,j+1,triangle,n,dp);

        return dp[i][j]=Math.min(d,dia);

        
        
        
    }
}