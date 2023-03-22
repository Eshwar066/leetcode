class Solution {                                //striver dp-6
  private int maxRob(int[] nums, int start, int end) {
        int prev2 = 0, prev = 0, currHouse = 0;
        for(int i = start; i<end; i++) {
            currHouse = Math.max(prev2 + nums[i], prev);
            prev2 = prev;
            prev = currHouse;
        }
        return currHouse;
    }

    public int rob(int[] nums) {
        int n = nums.length;
        
        if(n == 0) {
            return 0;
        } else if(n == 1) {
            return nums[0];
        }
        
        int robWithoutLastHouse = maxRob(nums, 0, n-1);
        int robWithoutFirstHouse = maxRob(nums, 1, n);
        return Math.max(robWithoutFirstHouse, robWithoutLastHouse);
    }
}