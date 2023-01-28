class Solution {
    public int findMin(int[] nums) {
        int mini=100;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        return mini;
    }
}