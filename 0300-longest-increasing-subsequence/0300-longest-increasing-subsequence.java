
  class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length+1];
        int lis=0;

        for(int curr:nums){
            int i=0,j=lis;
            while(i!=j){
                int m=(i+j)/2;
                if(dp[m+1]<curr) i=m+1;
                else j=m;
            }
        dp[i+1]=curr;
        lis=Math.max(lis,i+1);
        }
        return lis;
    }
}
