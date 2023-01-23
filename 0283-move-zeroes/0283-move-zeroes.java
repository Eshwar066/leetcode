class Solution {
    public void moveZeroes(int[] nums) {
         int j=0;

        for (int i=0; i<nums.length; i++) {

            if(nums[i]!=0){
             swap(nums,i,j);
                j++;
            }
        }
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+",");
        }
    }

    private static void swap(int[] nums, int i, int j) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
    }
}