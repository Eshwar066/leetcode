class Solution {                              //takeUforward
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> pos=new ArrayList<>();
         ArrayList<Integer> neg=new ArrayList<>();
       
        
        for(int i=0;i<n;i++){
            if(nums[i]>0) {
                pos.add(nums[i]);
            }else{
             neg.add(nums[i]);   
            }
        }
        int[] res=new int[n];
        int k=0;
        for(int i=0;i<pos.size();i++){
            res[k++]=pos.get(i);
            res[k++]=neg.get(i);
        }
        return res;
    }
}