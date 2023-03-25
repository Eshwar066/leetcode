class Solution {                               //striver Dp-12 [recursion-memoization]
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
		int m=matrix[0].length;

		int[][] dp=new int[n][m];
		for(int row[]:dp)
		Arrays.fill(row,-1);
		
	    int mini = Integer.MAX_VALUE;      //if destination is not fixed, we should check for every element in [n-1][j] column
    
        for(int j=0; j<m;j++){
        int ans = minSum(n-1,j,m,matrix,dp);
        mini = Math.min(mini,ans);
        }
        return mini;

	}
	public static int minSum(int i,int j,int m,int[][] matrix,int[][] dp){
		//base case
		if(j<0 || j>=m)
        return (int)Math.pow(10,9);
		if(i==0) return matrix[0][j];

		if(dp[i][j]!=-1) return dp[i][j];
		int s=matrix[i][j]+ minSum(i-1,j,m,matrix,dp);
		int ld=matrix[i][j]+ minSum(i-1,j-1,m,matrix,dp);
		int rd=matrix[i][j]+ minSum(i-1,j+1,m,matrix,dp);

		return dp[i][j]=Math.min(s,Math.min(ld,rd));
    }
}