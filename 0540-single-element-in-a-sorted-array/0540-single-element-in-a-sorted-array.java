class Solution {
    public int singleNonDuplicate(int[] nums) {
        if(nums.length==1) return nums[0];
        int l=0,r=nums.length;
        while(l<=r){
            int mid=(l+r)/2;
            if(single(nums,mid)) return nums[mid];
            if(mid+1<nums.length && nums[mid]==nums[mid+1]){
                if(mid%2==0) l=mid+1;
                else r=mid-1;
            }
            if(mid>=1 && nums[mid]==nums[mid-1]){
                if(mid%2==1) l=mid+1;
                else r=mid-1;
            }
        }
        return nums[l];
    }
    public static boolean single(int nums[], int mid){
        if(mid==0 && nums[0]!=nums[1]) return true;
        if(mid==nums.length-1 && nums[mid]!=nums[mid-1]) return true;
        if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1] ) return true;
        return false;
    }
}