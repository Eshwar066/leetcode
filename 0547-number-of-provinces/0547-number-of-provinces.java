class Solution {
    public int findCircleNum(int[][] isConnected) {
        if(isConnected.length==0) return 0;
        
        int n=isConnected.length;
        int count=0;
        boolean[][] visted=new boolean[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1 && !visted[i][j]){
                    count++;
                    helper(isConnected,visted,i,j);
                }
            }
        }
        return count;
    }
    private void helper(int[][] matrix,boolean[][] visted,int i, int j){
        int n=matrix.length;
        visted[i][j]=true;
        for(int col=0;col<n;col++){
            if(matrix[i][col]==1 && !visted[i][col]){
                helper(matrix,visted,i,col);
            }
            if(matrix[j][col]==1 && !visted[j][col]){
                helper(matrix,visted,j,col);
            }
        }
    }
}