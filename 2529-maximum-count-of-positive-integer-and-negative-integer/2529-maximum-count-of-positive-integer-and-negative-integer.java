class Solution {
    public int maximumCount(int[] nums) {
        int count1=0,count2=0,ans=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                count1++;
            }else if(nums[i]<0){
                count2++;
            }
        }
        ans=Math.max(count1,count2);
        return ans;
    }
}