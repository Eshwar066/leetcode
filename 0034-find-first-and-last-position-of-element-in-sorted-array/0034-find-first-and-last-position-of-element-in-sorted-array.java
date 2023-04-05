class Solution {
    public int[] searchRange(int[] nums, int target) {
//     int l=0,h=nums.length-1,f=0;
   
//     while(l<=h){
//         int mid=l+(h-l)/2;
//         if(nums[mid]==target){
//             h=mid-1;
//             f=1;
//         }else if(nums[mid]>target){
//             h=mid-1;
//         }else{
//             l=mid+1;
//         }
//     }
//     int[] ans=new int[2];
//     ans[0]=(f==0) ?-1:l;
//     l=0;h=nums.length-1;
//     while(l<=h){
//         int mid=l+(h-l)/2;
//         if(nums[mid]==target){
//             l=mid+1;
//             f=1;
//         }else if(nums[mid]>target){
//             h=mid-1;
//         }else{
//             l=mid+1;
//         }
//     }
//     ans[1]=(f==0) ?-1:h;  
//     return ans;
        
         int n = nums.length;
        int[] ans = new int[2];
        ans[0] = lhBound(nums, 0, n-1, target, true);
        ans[1] = lhBound(nums, 0, n-1, target, false);
        return ans;
    }
    public int lhBound(int[] nums, int s, int e, int tar, boolean flag){
        int ans = -1;
        if(flag){
            while(s<=e){
                int mid = s+(e-s)/2;
                if(nums[mid] == tar) ans = mid;
                if(nums[mid] >= tar){
                    e = mid-1;
                }else {
                    s = mid+1;
                }
            }
            return ans;
        }else{
            
            while(s<=e){
                int mid = s+(e-s)/2;
                if(nums[mid] == tar) ans = mid;
                if(nums[mid] <= tar){
                    s = mid+1;
                }else {
                    e = mid-1;
                }
            }
            return ans;
        }
    }
}
