class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums);
        int count=0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>nums[count]) count++;
        }
        return count;
    }
}