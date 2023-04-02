class Solution {
    public int removeElement(int[] nums, int val) {
        int left_most_index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[left_most_index] = nums[i];
                left_most_index++;
            }
        }
        return left_most_index;    
    }
}