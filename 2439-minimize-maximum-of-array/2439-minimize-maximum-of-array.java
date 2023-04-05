class Solution {
    public int minimizeArrayValue(int[] nums) {
        //   long sum=0;                            ////greedy
        // int min=0;
        // for(int i=0;i<nums.length;i++) {
        //     int n=nums[i];
        //     sum+=n;
        //     if(n>min) min=Math.max(min,(int)((sum+i)/(i+1)));
        // }
        // return min;
        
        long sum = 0;
        int result  = 0;
        int min;
        long sum2;
        
        for (int i = 0; i < nums.length; ++i){
            sum += nums[i];
            
            if (result >= nums[i]) continue;
            
            min = (int)( (sum + i) / (i + 1));
            result = Math.max(min, result);
        }
        
        return result;
    }
}