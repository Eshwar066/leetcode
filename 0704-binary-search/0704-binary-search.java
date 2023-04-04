class Solution {
    public int search(int[] nums, int target) {
//         int i=0;
//         while(i<nums.length){
//             if(nums[i]==target) return i;
//             i++;
//         }
        
//         return -1;
        
        
         int a = 0 ;
        int b = nums.length-1;
        while(a <= b){
            int mid = a + (b - a)/2;
            if(nums[mid] == target){
                return mid;
            }else if(nums[mid] > target){
                b = mid - 1;
            }else{
                a = mid + 1;
            }
        }
        return -1;
    }
}