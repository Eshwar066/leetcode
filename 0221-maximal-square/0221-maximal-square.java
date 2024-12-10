class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix==null || matrix.length==0 || matrix[0].length==0){
            return 0;
        }
         int m=matrix.length,n=matrix[0].length;
        int[][] dp=new int[m][n];
        int maxSide=0;
        
        for(int i=0;i<m;i++){
            dp[i][0]=matrix[i][0]-'0';
            maxSide=Math.max(maxSide,dp[i][0]);
        }
        
         for(int j=0;j<n;j++){
            dp[0][j]=matrix[0][j]-'0';
            maxSide=Math.max(maxSide,dp[0][j]);
        }
         for(int i=1;i<m;i++){
               for(int j=1;j<n;j++){
                   if(matrix[i][j]=='1'){
                   dp[i][j]=Math.min(dp[i - 1][j - 1], Math.min(dp[i - 1][j], dp[i][j - 1]))+1;
                    maxSide = Math.max(maxSide, dp[i][j]);
                   }
               }
         }
        
        return maxSide * maxSide;
    }
}