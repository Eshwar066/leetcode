class Solution {                          //striver dp-10
    public int minPathSum(int[][] grid) { //recursion, memorization
        int n=grid.length;
        int m=grid[0].length;
        int[][] dp=new int[n][m];
         for(int row[]: dp)
        Arrays.fill(row,-1);
       return path(n-1,m-1,grid,dp);
    }
    static int path(int i, int j,int[][]grid,int[][] dp){
        if(i==0 && j==0)return grid[0][0];
        if(i<0 || j<0) return (int)Math.pow(10,9);
        
        if(dp[i][j]!=-1) return dp[i][j];
        int up = grid[i][j]+path(i-1,j,grid,dp);
        int left= grid[i][j]+path(i,j-1,grid,dp);
        
        return dp[i][j]=Math.min(up,left);
    }
}