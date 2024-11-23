class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int l=0,r=0;
        int TL= nums.length;
        int sum=0;
        int minLen = Integer.MAX_VALUE; 
        while(r<TL){
            sum+=nums[r];
            while(sum>=target){
               minLen = Math.min(minLen, r - l + 1);  
                sum-=nums[l];
                l++;
                
            }
            r++;
        }
        return minLen == Integer.MAX_VALUE ? 0 : minLen;
    }
}