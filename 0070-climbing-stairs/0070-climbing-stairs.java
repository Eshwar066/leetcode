class Solution {                        //Striver DP-2
    public int climbStairs(int n) {
        if(n==0)return 1;
        if(n==1)return 1; 
       int prev2 = 1;
       int prev = 1;
  
      for(int i=2; i<=n; i++){
      int cur_i = prev2+ prev;
      prev2 = prev;
      prev= cur_i;
      }
        return prev;
    }
}