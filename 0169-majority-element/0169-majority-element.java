class Solution {
    public int majorityElement(int[] nums) {
       int e1=0,c=0;
       for(int n:nums){
           if(c==0){
               e1=n;
               c++;
           }
           else if(n==e1){
               c++;
           }else{
               c--;
           }  
       } 
       c=0;
       for(int n:nums){
          if(n==e1){
              c++;
          }
       }

        int ans=0;
        if(c>nums.length/2){
           ans=e1;
       }
      

    return ans;


    }
}