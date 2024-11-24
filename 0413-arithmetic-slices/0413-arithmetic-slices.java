class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
         int r = 0, cnt = 0, totalSlices = 0;
        int l = nums.length;

   
        if (l < 3) return 0;

        while (r < l - 2) {
            if (nums[r + 1] - nums[r] == nums[r + 2] - nums[r + 1]) {
                cnt++;
                totalSlices += cnt; 
            } else {
                cnt = 0; 
            }
            r++;
        }

        return totalSlices;
    }
}