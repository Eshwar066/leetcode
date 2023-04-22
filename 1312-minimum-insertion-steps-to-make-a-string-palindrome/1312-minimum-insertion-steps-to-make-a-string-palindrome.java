class Solution {
    public int minInsertions(String a) {
        StringBuilder s = new StringBuilder(a);
        s.reverse();
        // Obtaining the reverse of original string
        String b = s.toString();
        
        int n = a.length();
        int t[][] = new int[n+1][n+1];
        
        // Top-down DP
        for(int i=1; i<=n; i++) 
            for(int j=1; j<=n; j++)
                if(a.charAt(i-1)==b.charAt(j-1)) t[i][j] = 1 + t[i-1][j-1];
                else t[i][j] = Math.max(t[i-1][j], t[i][j-1]);
        // Desired answer
        return n-t[n][n];
    }
}