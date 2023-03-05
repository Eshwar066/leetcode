class Solution {                              // Algo Made easy
    public int countVowelStrings(int n) {     //DP problem
        int[][]dp=new int[n+1][6];
        
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                dp[i][j]=(i>1?dp[i-1][j]:1)+dp[i][j-1];
            }
        }
        return dp[n][5];
    }
}

// Here we can use formula (n+k-1)!/n!(k-1)!
//                         (n+4)!/n! 4!
//     we can write directly return (n*4)(n*3)(n*2)(n*1)/24;