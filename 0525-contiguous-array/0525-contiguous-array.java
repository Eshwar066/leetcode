class Solution {
    public int findMaxLength(int[] nums) {
      int sum=0, ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();        // creating hashmap
        map.put(0,-1);                                       //inserting into hashmap
        for(int i=0;i<nums.length;i++){
            int item=nums[i];
            if(item==0){
                sum++;
            }else{
                sum--;
            }
            if(map.containsKey(sum)){
                ans=Math.max(ans,i-map.get(sum));           //useing haspmap
            }else{
                map.put(sum,i);                             //inserting into hashmap
            }
        }
        return ans;
    }
}