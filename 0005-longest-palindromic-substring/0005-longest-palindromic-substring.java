class Solution {
    public String longestPalindrome(String s) {
        // below code is, just traversing in digonally top-right-half 2d matrix of 's' will be giving our ans
        
        boolean[][] dp = new boolean[s.length()][s.length()];
        
        String lpss = "";
        for(int k = 0; k<dp.length; k++) {
            for(int i = 0, j = k; j<dp.length; i++, j++) {
                if(k == 0) {
                    dp[i][j] = true;
                }
                else if(k == 1) {
                    if(s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    }
                }
                else {
                    if(dp[i + 1][j - 1] == true && s.charAt(i) == s.charAt(j)) {
                        dp[i][j] = true;
                    }
                }
                
                if(dp[i][j] == true) {
                    lpss = s.substring(i, j + 1);
                }
            }
        }
        
        return lpss;
    }
}




// class Solution {
//     public String longestPalindrome(String s) {
//          if(s == null)   return null;
            
//         if(s.length()==0)  return "";
        

//         char[] input=new char[2*s.length()+1];
//         for(int i=s.length()-1;i>=0;i--){
//             input[2*i+1]=s.charAt(i);
//             input[2*i]= '#';
//         }
//         input[2*s.length()]='#';             // there is one position left in above case n it is filled here.

//         // now create an integer arr
//         int[] LPS=new int[2*s.length()+1];
//         int c=0; //center
//         int r=0; //right boundry
//         for(int x=1;x< LPS.length;x++){
//             int mirr=2*c-x;         // mirror element
//             if(x<r){
//                 LPS[x] = Math.min(r-x,LPS[mirr]);
//             }
//             while(x+LPS[x]+1<=2*s.length() && x-LPS[x]-1>=0 && input[x+LPS[x]+1]==input[x-LPS[x]-1]){
//                LPS[x]++;
//             }
//             if(x+LPS[x]>r){
//                 c=x;
//                 r=x+LPS[x];
//             }
//         }
//         int valueMax =0; // max palindromic length
//         int indexMax =0;  // index at which we get max length

//         for(int i=0;i< LPS.length;i++){
//             if(LPS[i]>valueMax){
//                 valueMax=LPS[i];
//                 indexMax=i;
//             }
//         }

//         int palindromicspan = valueMax/2;
//         if(indexMax%2==0){
//             return s.substring(indexMax/2-palindromicspan,indexMax/2+palindromicspan);
//         }else{
//             return s.substring(indexMax/2-palindromicspan,indexMax/2+palindromicspan+1);
//         }
//     }
// }