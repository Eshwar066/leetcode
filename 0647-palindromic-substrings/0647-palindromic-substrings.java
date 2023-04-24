// class Solution {
//     public int countSubstrings(String s) {
//         if(s.length()==0) return 0;
//         int n=s.length();
//         boolean[][] dp=new boolean[n][n];
//         int res=0;
        
//         //base case1: length=1 -->true
//         for(int i=0;i<n;i++){
//             dp[i][i]=true;
//             res++;
//         }
        
//         //base case2: length=2 -->char[i]==char[i+1];
//          for(int i=0;i<n-1;i++){
//             dp[i][i+1]=s.charAt(i)==s.charAt(i+1);
//             if(dp[i][i+1])  res++;
//         }
        
//         //general case: length>2 --> char[s]==cahr[e] && dp[i+1][j-1];
//         for(int len=3;len<=n;len++){
//             for(int i=0,j=i+len-1; j<n; i++,j++){
//                 dp[i][j]=s.charAt(i)==s.charAt(j) && dp[i+1][j-1];
//                 if(dp[i][j]) res++;
//             }
//         }
//         return res;
//     }
// }

class Solution {   
    public int countSubstrings(String s) {
        int count = 0;
        for(int i = 0; i < s.length(); i++) // at every possible center of a palindrome
            count += expandPalindrome(s, i, i) + expandPalindrome(s, i, i+1); // expand palindromes whose center is at index i for odd, or i and i+1 for even
        return count;
    }
    
    private int expandPalindrome(String s, int l, int r) {
        int count = 0;
        while(0 <= l && r < s.length() && s.charAt(l) == s.charAt(r)) { // is a palindrome while valid indexes and equal characters on both sides
            count++;
            l--;
            r++;
        }
        return count;
    }
}