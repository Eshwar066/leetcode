class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int cnt=0,n=0,l=nums.length;
        
//        Set<Integer> set = new HashSet<Integer>();
//         for(int i:nums){
//             set.add(i);
//         }
//         for(int i=0;i<set.size();i++){
//             n=set.get(i);
//             if(n<k){
//                 cnt++;
//             }
//             for(int j=i+1;j<set.length;j++){
//                 if(n*set[j]<k){
//                     cnt++;
//                     n=n*set[j];
//                 }
//             }
//         }
//         return cnt;
         if (k <= 1) return 0;
        
        int prod=1,
        cnt=0,
        left=0;
         for(int right=0;right<nums.length;right++){
             prod*=nums[right];
             
             while(prod>=k && left<=right){
                 prod/=nums[left];
                 left++;
             }
             
             cnt+=right-left+1;
         }
        
        return cnt;
    }
}