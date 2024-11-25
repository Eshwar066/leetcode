class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0; int sum=0,max=Integer.MIN_VALUE;
        while( r<nums.length){
            sum+=nums[r];
            if(r-l+1==k){
                     max=Math.max(max,sum);
                sum-=nums[l];
                 // max=Math.max(max,sum);
                l++;
               
            }
             r++;
            
        }
        return max/(double)k;
    }
}