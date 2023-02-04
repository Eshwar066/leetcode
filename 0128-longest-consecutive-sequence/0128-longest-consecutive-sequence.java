class Solution {
    public int longestConsecutive(int[] nums) {
       Set<Integer> hashset= new HashSet<Integer>();
       for(int num:nums){
            hashset.add(num);
       }

       int longestStreak=0;
       for(int num:nums){
           if(!hashset.contains(num-1)){
               int currentNum=num;
               int currentStreak=1;

               while(hashset.contains(currentNum+1)){
                  currentNum=currentNum+1;
                  currentStreak=currentStreak+1;  
               }
               longestStreak=Math.max(longestStreak,currentStreak);
              
           }
       } 
       return longestStreak;
    }
}