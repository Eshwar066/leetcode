class Solution {
    public int countSubstrings(String s) {
        if(s.length()==0) return 0;
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int res=0;
        
        //base case1: length=1 -->true
        for(int i=0;i<n;i++){
            dp[i][i]=true;
            res++;
        }
        
        //base case2: length=2 -->char[i]==char[i+1];
         for(int i=0;i<n-1;i++){
            dp[i][i+1]=s.charAt(i)==s.charAt(i+1);
            if(dp[i][i+1])  res++;
        }
        
        //general case: length>2 --> char[s]==cahr[e] && dp[i+1][j-1];
        for(int len=3;len<=n;len++){
            for(int i=0,j=i+len-1; j<n; i++,j++){
                dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
                if(dp[i][j]) res++;
            }
        }
        return res;
    }
}