class Solution {
    public static boolean subsetSumToK(int n, int k, int arr[]){
        // Write your code here.
        int dp[][]=new int[n][k+1];
        for(int row[]: dp)
        Arrays.fill(row,-1);
        return subSet(n-1,k,arr,dp);
    }
    public static boolean subSet(int ind, int target,int[] a,int[][] dp){
        if(target==0) return true;
        if(ind==0) return (a[0]==target);
        
        if(dp[ind][target]!=-1) return dp[ind][target]==0?false:true;
        boolean not_take=subSet(ind-1,target,a,dp);
        boolean take=false;
        if(target>=a[ind])
            take=subSet(ind-1,target-a[ind],a,dp);
            dp[ind][target]=take || not_take?1:0;
        return take || not_take;
    } 
    public boolean canPartition(int[] nums) {
        int totSum=0;
        int n=nums.length;
		for (int i=0;i<n; i++) totSum+=nums[i];
		if(totSum % 2!=0)return false;
		int target=totSum/2;

		return subsetSumToK(n,target,nums);
    }
}