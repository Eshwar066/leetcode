class Solution {
    public boolean check(int[] nums) {
       int decCount = 0;
        int n = nums.length;
        for(int i=0; i<n; i++){
            if(nums[i] > nums[(i+1) % n])
                decCount++;
        }
        return decCount <= 1 ? true : false;
    }
}