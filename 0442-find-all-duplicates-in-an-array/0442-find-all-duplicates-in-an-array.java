class Solution {
    public List<Integer> findDuplicates(int[] nums) {
     List<Integer> res=new ArrayList<>();
     Arrays.sort(nums);
     int i=0;
     while(i<nums.length-1){
         if(nums[i]==nums[i+1]){
             res.add(nums[i]);
             i=i+2;

         }else{
             i=i+1;
         }
     }
     return res;
    }
}