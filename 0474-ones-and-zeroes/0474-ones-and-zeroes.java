class Solution {
    private int[][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp=new int[strs.length+1][n+1][m+1];
        for(int i=0;i<=strs.length;i++){
            for(int j=0;j<=n;j++){
                for(int k=0;k<=m;k++){
                    dp[i][j][k]=-1;
                }
            }
        }
        
        int[][] counts=new int[strs.length][2];
        for(int i=0;i<strs.length;i++){
            int nZeros=0,nOnes=0;
            for(char c:strs[i].toCharArray()){
                if(c=='1'){
                    nOnes++;
                }else{
                    nZeros++;
                }
                
            }
            counts[i]=new int[]{nOnes,nZeros};
        }
        
        return sub(counts,0,n,m);
        
    }
    private int sub(int[][] counts,int index,int nOnes,int nZeros){
        if(index==counts.length || (nZeros==0 && nOnes==0)){
            return 0;
        }
        
        if(dp[index][nOnes][nZeros]!=-1){
            return dp[index][nOnes][nZeros];
        }
        
        if(counts[index][0]>nOnes || counts[index][1]>nZeros){
            return dp[index][nOnes][nZeros]=sub(counts,index+1,nOnes,nZeros);
        }
        
        int includes=1+sub(counts,index+1,nOnes-counts[index][0],nZeros-counts[index][1]);
        int excludes=sub(counts,index+1,nOnes,nZeros);
        
        return dp[index][nOnes][nZeros]=Math.max(includes,excludes);
    }
    
    
    
//     Recursion-TLE
//     public int findMaxForm(String[] strs, int m, int n) {
//         List<int[]> counts=new ArrayList<>();
//         for(String str:strs){
//             int zero=0,one=0;
//             for(char c:str.toCharArray()){
//                 if(c=='1'){
//                     one++;
//                 }else{
//                     zero++;
//                 }
                
//             }
//             counts.add(new int[]{zero,one});
//         }
//         return sub(counts,0,m,n);
//     }
//     public int sub(List<int[]> counts,int index,int nZero,int nOne){
//         if(index==counts.size() || (nZero==0 && nOne==0)){
//             return 0;
//         }
        
//         if(counts.get(index)[0]>nZero || counts.get(index)[1]>nOne){
//             return sub(counts,index+1,nZero,nOne);
//         }
        
//         int includes=1+sub(counts,index+1,nZero-counts.get(index)[0],nOne-counts.get(index)[1]);
//         int excludes=sub(counts,index+1,nZero,nOne);
        
//         return Math.max(includes,excludes);
//     } 
}