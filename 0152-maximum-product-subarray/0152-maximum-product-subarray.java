class Solution {
    public int maxProduct(int[] nums) {
         if(nums.length==0){
            return -1;
        }
        int choice1;
        int choice2;
        int maxp= nums[0];
        int minp= nums[0];
        int ans = nums[0];
        for(int i=1;i<nums.length;i++){
            choice1 = maxp * nums[i];
            choice2 = minp * nums[i];
            maxp = Math.max(nums[i],Math.max(choice1,choice2));
            minp = Math.min(nums[i],Math.min(choice1,choice2));
            ans = Math.max(maxp,ans); 
        }
        return ans;
    }       
        
}


      
    
