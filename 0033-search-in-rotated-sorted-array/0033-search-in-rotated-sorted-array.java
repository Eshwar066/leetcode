class Solution {
//     public int search(int[] nums, int target) {
//         for(int i=0;i<nums.length;i++){
//             if(nums[i]==target) return i;
            
//         }
//         return -1;
//     }
    
     public int search(int[] nums, int target) {
         int left = 0;
        int right = nums.length-1;

        while(left <= right){
            int mid = (left+right)/2;
            if(nums[mid] == target) return mid;
            
            int temp = nums[mid];
            if((target < nums[0] && nums[mid] < nums[0]) || (target >= nums[0] && nums[mid] >= nums[0])){
                
                if(nums[mid] < target) {
                    left += 1;
                }else{
                    right -= 1;
                }
            }else{
                
                if(target < nums[0]){
                    left += 1;
                }else{
               
                    right -= 1;
                }
            }
        }
        return -1;
}
}